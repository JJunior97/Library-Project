package OnlineLibrary.Library.RestApi;

import OnlineLibrary.Library.Domain.User;
import OnlineLibrary.Library.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getAllUser(){
        return userService.findAllUser();
    }

    @GetMapping("{id}")
    public User getUser(@PathVariable long id){
        return userService.findUser(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.addUser(user);
    }
}
