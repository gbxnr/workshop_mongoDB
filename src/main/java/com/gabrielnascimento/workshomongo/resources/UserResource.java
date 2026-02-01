package com.gabrielnascimento.workshomongo.resources;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gabrielnascimento.workshomongo.domain.User;


import java.util.Arrays;




@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
   
    public ResponseEntity <List<User>> findAll() {
        User maria = new User("1", "Maria", "maria@gmail.com");
        User alex = new User("2", "Alex Green", "alex@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(maria, alex));
        return ResponseEntity.ok(list);
    }

}
