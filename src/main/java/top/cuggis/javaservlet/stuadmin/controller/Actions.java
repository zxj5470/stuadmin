package top.cuggis.javaservlet.stuadmin.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Actions {
    @RequestMapping("/index")
    public String index(){
        return "index.jsp";
    }
    @RequestMapping("/login")
    public String login(){
        return "login.jsp";
    }
}
