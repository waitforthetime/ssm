package com.wy.study.service;

import com.wy.study.entity.Area;

import java.util.List;

/**
 * Created by wy_ms on 2017/06/10.
 */
public interface AreaService {
    Area getAreaById(int id);

    List<Area> getAll();
}
