package com.controller;

import com.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author 10574
 */
@Controller
public class UserController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String toLogin() {
        return "login";
    }

    @RequestMapping( value ="/login", method = RequestMethod.POST)
    public String login(User user, Model model, HttpSession session) {
        String username = user.getUsername();
        String password = user.getPassword();
        if (username != null && username.equals("admin") && password != null && password.equals("1234")) {
            session.setAttribute("USER_SESSION", user);
            return "redirect:main";
        }
        model.addAttribute("msg", "用户名或密码错误,请重新登录");
        return "login";
    }

    @RequestMapping( "/main")
    public String toMain() {
        return "main";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:login";
    }
}
