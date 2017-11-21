package top.cuggis.javaservlet.stuadmin.controller;

import javax.servlet.http.HttpServletRequest;


public class Handler {
    public static String handle(HttpServletRequest req){
        String name=req.getParameter("name");
        String password=req.getParameter("password");
        System.out.println();
        StringBuilder resp=new StringBuilder();
        resp.append(name);

        return resp.toString();
    }
}
