package br.edu.infnet.jobhunter.model.service;

import br.edu.infnet.jobhunter.model.domain.User;
import br.edu.infnet.jobhunter.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void include(User user) {
        userRepository.save(user);
    }

    public Collection<User> list() {
        return userRepository.findAll();
    }
}
