package com.jwtsecurity.jwtdemo.services;


import com.jwtsecurity.jwtdemo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"akankshya ","akankshya@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"ayush ","ayush@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"ashu ","ashu@gmail.com"));
    }

    public List<User> getUser() {
        return this.store;
    }
}
