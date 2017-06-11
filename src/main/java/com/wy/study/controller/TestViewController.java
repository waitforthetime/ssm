package com.wy.study.controller;

import com.wy.study.entity.Area;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wy_ms on 2017/06/11.
 */
@Controller
@RequestMapping("/view")
public class TestViewController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/model/index")
    public ModelAndView model() {
        return new ModelAndView("index");
    }

    @RequestMapping("/area")
    public ModelAndView area() {
        Area area = new Area();
        area.setId(1);
        area.setArea("洪山区");
        ModelAndView modelAndView = new ModelAndView("area");
//        modelAndView.addObject("area",area);
        return modelAndView;
    }

}
