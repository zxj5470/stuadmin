package top.cuggis.javaservlet.stuadmin.controller;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Async {
    @RequestMapping("/asyncT")
    @ResponseBody
    public Object contentjson() throws JSONException {
        JSONObject json = new JSONObject();
        json.put("content", "局部刷新返回json后拼凑html");
        String detailOk = "ok";
        json.put("detailOk", detailOk);
        return json.toString();
    }
}