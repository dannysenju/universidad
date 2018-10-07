package com.seratic.universidad.web.controller;

import com.seratic.universidad.persist.entity.User;
import com.seratic.universidad.persist.repo.UserRepo;
import io.swagger.annotations.Api;
import java.lang.reflect.InvocationTargetException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import javassist.NotFoundException;
import org.apache.commons.beanutils.BeanUtils;

@RestController
@Api(description = "Users management API")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepo userRepo;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public @ResponseBody
    List<User> usersList() {
        logger.debug("get users list");
        return userRepo.findAll();
    }

    @RequestMapping(value = "/users/{userId}", method = RequestMethod.GET)
    public @ResponseBody
    User getUser(@PathVariable Long userId) {
        logger.debug("get user");
        return userRepo.findOne(userId);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public @ResponseBody
    User saveUser(@RequestBody User user) {
        logger.debug("save user");
        userRepo.save(user);
        return user;
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
    public @ResponseBody
    User updateUser(@PathVariable Long userId, @RequestBody User user) throws NotFoundException {
        logger.debug("update user");

        User currentUser = userRepo.findOne(userId);

        if (currentUser == null) {
            throw new NotFoundException("No encontrado");
        }

        try {
            BeanUtils.copyProperties(currentUser, user);
        } catch (IllegalAccessException | InvocationTargetException ex) {

        }
        userRepo.saveAndFlush(currentUser);

        return currentUser;
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public @ResponseBody
    User deleteUser(@PathVariable Long userId) throws NotFoundException {
        logger.debug("delete user");

        User currentUser = userRepo.findOne(userId);

        if (currentUser == null) {
            throw new NotFoundException("No encontrado");
        }

        userRepo.delete(currentUser);

        return currentUser;
    }

}
