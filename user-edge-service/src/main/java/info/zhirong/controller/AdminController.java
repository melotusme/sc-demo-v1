package info.zhirong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import info.zhirong.config.AdminConfig;

/**
 * @author wrong big@brother.watch
 * Created on 2019-04-25
 */
@RestController
public class AdminController {

    @Autowired
    private AdminConfig adminConfig;

    @GetMapping("/admin")
    public String admin() {
        return adminConfig.getName();
    }
}
