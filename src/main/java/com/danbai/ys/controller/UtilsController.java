package com.danbai.ys.controller;

import com.danbai.ys.service.impl.RegisterValidateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author danbai
 * @date 2019/10/13
 */
@Controller
public class UtilsController {
    @Autowired
    RegisterValidateServiceImpl registerValidateService;
    static Map yzb;
    static {
        yzb=new HashMap();
    }
    @RequestMapping(value = "/getvalidate",produces = "text/plain;charset=UTF-8",method= RequestMethod.GET)
    @ResponseBody
    public String getValidate(String username,String email){
        if(username==null){
            return "err";
        }
        String s = registerValidateService.senValidate(email);
        yzb.put(username,s);
        return "ok";
    }
}
