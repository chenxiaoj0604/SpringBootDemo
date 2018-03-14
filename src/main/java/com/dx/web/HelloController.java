package com.dx.web;

import com.dx.entity.User;
import com.dx.service.IHelloService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by windows on 2018-03-07.
 */

@Controller
public class HelloController {
    /*@GetMapping(value = "sayHello")
    public String sayHello(){
        return "Hello springboot!!!!";
    }*/
    @Autowired
    private IHelloService helloService;

    @GetMapping(value = "hello")
    public String hello(Model model, @RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn){
        PageHelper.startPage(pn,3);
        List<User> uList = helloService.getAllUser();
        PageInfo pageInfo = new PageInfo<>(uList,5);
        model.addAttribute("title","hello");
        //model.addAttribute("uList",uList);
        model.addAttribute("pageInfo",pageInfo);
        return "index";
    }

    @PostMapping(value = "addUser")
    public String addUser(HttpServletRequest request){
        User user = new User();
        user.setName(request.getParameter("name"));
        user.setAge(Integer.valueOf(request.getParameter("age")));
        helloService.addUser(user);
        return "redirect:/hello";
    }

    @GetMapping(value = "deleteUser")
    public String deleteUser(HttpServletRequest request){
        helloService.deleteUserById(Integer.valueOf(request.getParameter("id")));
        return "redirect:/hello";
    }

    @PostMapping(value = "updateUser")
    public String updateUser(HttpServletRequest request){
        User user = new User();
        user.setId(Integer.valueOf(request.getParameter("id")));
        user.setName(request.getParameter("name"));
        user.setAge(Integer.valueOf(request.getParameter("age")));
        helloService.updateUserById(user);
        return "redirect:/hello";
    }


}