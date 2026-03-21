package t7.usermanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import t7.usermanagement.service.UserService;

@RestController
public class UserController {

    private final UserService userService;

    // Constructor Injection (DI)
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public String getUser() {
        return userService.getUserService();
    }
}