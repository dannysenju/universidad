package com.seratic.universidad.persist.repo;

import com.seratic.universidad.persist.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User, Long> {
    User findByLogin(String login);
    
    User findByLoginAndPassword(String login, String password);

}
