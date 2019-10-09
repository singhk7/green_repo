package com.db.greenLinkedIn.controller;

import com.db.greenLinkedIn.impl.TestImpl;
import com.db.greenLinkedIn.impl.UserDetailsImpl;
import com.db.greenLinkedIn.middleware.userLogin;
import com.db.greenLinkedIn.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class UserDetailsController {
    @Autowired
    UserDetailsImpl userDetailsImpl;

    @Autowired
    TestImpl test;

//    @CrossOrigin(allowedHeaders = {"Origin","X-Requested-With","Content-Type","Accept","Authorization"},
//            methods = {RequestMethod.GET,RequestMethod.DELETE,RequestMethod.POST,RequestMethod.PUT})

    @PostMapping(value = "/login")
    String login(@RequestBody userLogin loginuser, HttpServletRequest request) {
        System.out.print(request.toString()+"hdsfjhsk");
        return userDetailsImpl.loginCheck(loginuser);
    }

    @RequestMapping(value = "/signup")
    public String signup() {
        System.out.print("fadfsdfsd");
        return userDetailsImpl.signUp();
    }

    @GetMapping("/test")
    public String testALot() {
        System.out.print(test.bhakk());
        return test.bhakk();
    }

}
