package com.dockerise.dockerise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dockerise.dockerise.model.personBean;
import com.dockerise.dockerise.repository.users;
import com.dockerise.dockerise.service.docService;

@RestController
@RequestMapping("/api/users")
public class contDocker {

    @Autowired
	private docService UserService ;


    private personBean p1;

    @PostMapping("/createuser")
    public ResponseEntity<users> createUser(@RequestBody users users) {
        users newUser = UserService.saveUser(users);
        return ResponseEntity.ok(newUser);
    }

    @GetMapping("/{email}")
    public ResponseEntity<users> getUserByEmail(@PathVariable String email) {
        users users = UserService.getUserByEmail(email);
        if (users != null) {
            return ResponseEntity.ok(users);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<users>> getAllUsers() {
        List<users> users = UserService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @DeleteMapping("/delete/id")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
    	UserService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
    
    @GetMapping("/list")
    public ResponseEntity<?> list(){
    	return new ResponseEntity<String> ("List", HttpStatus.OK);
    }
    
    @GetMapping("/test")
    public String test(){
    	p1= new personBean();
    	p1.setName("name");
    	p1.setSurname("surname");
    	return "test" + p1.toString();
    }
}