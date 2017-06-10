package com.wy.study.mapper;

import com.wy.study.entity.Area;

import java.util.List;

/**
 * Created by wy_ms on 2017/06/10.
 */
public interface AreaMapper {

    Area getById(int id);
    List<Area> getAll();
}
