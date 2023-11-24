package br.edu.infnet.jobhunter.model.service;

import br.edu.infnet.jobhunter.model.domain.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    private Map<String, User> userMap = new HashMap<String,User>();

    public void include(User user) {
        userMap.put(user.getId(),user);
    }

    public Collection<User> list() {
        return userMap.values();
    }
}
