package br.edu.infnet.jobhunter.model.domain;

import br.edu.infnet.jobhunter.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

@Component
public class UserLoader implements ApplicationRunner {

    private final UserService userService;
    @Autowired
    public UserLoader(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        FileReader file = new FileReader("files/users.txt");
        BufferedReader bufferedReader = new BufferedReader(file);

        String line = bufferedReader.readLine();
        String[] fields = null;

        while(line != null) {
            fields = line.split(";");

            User user = new User();
            user.setName(fields[0]);
            user.setEmail(fields[1]);
            user.setAuth(AuthMethod.valueOf(fields[2]));

            userService.include(user);
            line = bufferedReader.readLine();
        }

        for(User user : userService.list()) {
            System.out.println("User loaded: " + user);
        }

        bufferedReader.close();
    }
}
