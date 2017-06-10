package com.wy.study.service.iml;

import com.wy.study.entity.Area;
import com.wy.study.mapper.AreaMapper;
import com.wy.study.service.AreaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wy_ms on 2017/06/10.
 */
@Service
public class AreaServiceIml implements AreaService {

    @Resource
    AreaMapper areaMapper;

    @Override
    public Area getAreaById(int id) {
        Area area = new Area();
        area.setId(1);
        area.setArea("武昌区");
        area = areaMapper.getById(id);
        return area;
    }

    @Override
    public List<Area> getAll() {
        return areaMapper.getAll();
    }
}
