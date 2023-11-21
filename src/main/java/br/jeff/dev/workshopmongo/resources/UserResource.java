package br.jeff.dev.workshopmongo.resources;

import br.jeff.dev.workshopmongo.domain.User;
import br.jeff.dev.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping
//    public List<User> findAll(){
    public ResponseEntity<List<User>> findAll(){

       List<User> usersList = service.findAll();
       return ResponseEntity.ok().body(usersList);
    }
}
