package com.blue.controller;

import com.blue.domain.User;
import com.blue.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by BlueBreeze on 2017/12/9.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @RequestMapping("/showName")
    public String showUserName(@RequestParam("uid") int uid, HttpServletRequest request, Model model) {
        User user = userService.getUserById(uid);
        if (user != null) {
            request.setAttribute("name", user.getUserName());
            model.addAttribute("name", user.getUserName());
            return "showName";
        }
        request.setAttribute("error", "没有找到！");
        return "error";
    }

}
