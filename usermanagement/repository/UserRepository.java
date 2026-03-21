package t7.usermanagement.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public String getUser() {
        return "User from Database";
    }
}