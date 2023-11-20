package br.jeff.dev.workshopmongo.resources;

import br.jeff.dev.workshopmongo.domain.User;
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

    @GetMapping
//    public List<User> findAll(){
    public ResponseEntity<List<User>> findAll(){

        User jefferson = new User("1", "Jefferson Santos", "jeff.hco@gmail.com");
        User jessica = new User("2", "Jéssica Izidoro", "jessi@gmail.com");

       List<User> usersList = new ArrayList<>(Arrays.asList(jefferson, jessica));

       return ResponseEntity.ok().body(usersList);
    }
}
