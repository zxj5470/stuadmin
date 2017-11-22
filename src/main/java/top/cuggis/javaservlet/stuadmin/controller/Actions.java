package top.cuggis.javaservlet.stuadmin.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.cuggis.javaservlet.stuadmin.jdbc.JDBCUtils;

@Controller
public class Actions {
    @Value("${ojdbc.driver}")
    String driver;
    @Value("${ojdbc.url}")
    String url;
    @Value("${ojdbc.user}")
    String user;
    @Value("${ojdbc.password}")
    String password;

    @RequestMapping("/index")
    public String index() {
        return "index.jsp";
    }

    @RequestMapping("/login")
    public String login() {
        JDBCUtils.config(driver,url,user,password);
        return "login.jsp";
    }
}
