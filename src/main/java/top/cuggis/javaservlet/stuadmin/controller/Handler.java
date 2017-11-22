package top.cuggis.javaservlet.stuadmin.controller;

import top.cuggis.javaservlet.stuadmin.jdbc.JDBCUtils;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.sql.ResultSet;


public class Handler {
    public static String handle(HttpServletRequest req){
        String name=req.getParameter("name");
        String password=req.getParameter("password");
        System.out.println();
        StringBuilder resp=new StringBuilder();
        resp.append(name);

        new Thread(()->{
            try {
                JDBCUtils jdbcUtils=JDBCUtils.getInstance();
                Connection s=jdbcUtils.getConnection();
                ResultSet rs=s.createStatement().executeQuery("SELECT * FROM help");
                int i=3;
                while(i-->0){
                    rs.next();
                    System.out.println(rs.getString(3));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        ).start();

        return resp.toString();
    }
}
