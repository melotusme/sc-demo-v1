package info.zhirong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import info.zhirong.feign.UserServiceClient;

/**
 *@author wrong
 * Created on 2019-04-21
 */
@RestController
public class LoginController {

    @Autowired
    private UserServiceClient userServiceClient;

    @GetMapping("/login")
    public String tryLogin() {
        System.out.println(">>>> I'm in login action of LoginController");
        String userInfo = userServiceClient.getUserInfo();
        return userInfo;
    }
}
