package com.wy.study.controller;

import com.wy.study.entity.Area;
import com.wy.study.service.AreaService;
import com.wy.study.service.iml.AreaServiceIml;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wy_ms on 2017/06/10.
 */
@RestController
@RequestMapping("/area")
public class AreaController {

    Logger logger = LoggerFactory.getLogger(AreaServiceIml.class);
    @Autowired
    AreaService service;

    @RequestMapping("/{id}/info")
    public Area getAreaInfo(@PathVariable int id) {
        logger.info("id:{}",id);
        return service.getAreaById(id);
    }

}
