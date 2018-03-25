package system.dao;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import system.model.User;

import java.util.Arrays;
import java.util.List;


@Repository
public class UserDao {

    private List<User> users = Arrays.asList(new User("admin","admin"));
    public List<User> getAllUsers(){
        return users;
    }



}

