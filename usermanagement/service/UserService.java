package t7.usermanagement.service;

import org.springframework.stereotype.Service;
import t7.usermanagement.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUserService() {
        return "Service Layer -> " + userRepository.getUser();
    }
}