package info.zhirong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.DiscoveryClient;

/**
 * @author wrong
 * Created on 2019-04-21
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/")
    String getUserInfo() {
        return "UserController.userInfo";
    }
}
