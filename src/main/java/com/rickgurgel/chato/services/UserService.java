package com.rickgurgel.chato.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rickgurgel.chato.domain.User;
import com.rickgurgel.chato.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }
}
