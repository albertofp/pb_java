package br.edu.infnet.jobhunter.model.domain;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

@Component
public class UserLoader implements ApplicationRunner {

    private Map<String, User> userMap = new HashMap<String,User>();
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

            userMap.put(user.id, user);
            line = bufferedReader.readLine();
        }

        for(User user : userMap.values()) {
            System.out.println("User loaded: " + user);
        }

        bufferedReader.close();
    }
}
