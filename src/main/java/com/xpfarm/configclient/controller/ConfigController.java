package com.xpfarm.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConfigController {

    @Value("${rate}")
    String rate;

    @Value("${lanecount}")
    String lanecount;

    @Value("${tollstart}")
    String tollstart;

    @Value("${connstring}")
    String connstring;

    @RequestMapping("/rate")
    public String getRate(Model m){
        m.addAttribute("rateamount", rate);
        m.addAttribute("lanes", lanecount);
        m.addAttribute("tollstart",tollstart);
        m.addAttribute("connstring", connstring);

        return "rateview";
    }
}
