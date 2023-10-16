package com.example.deploy.service;

import com.example.deploy.entity.Map;
import com.example.deploy.repoistory.MapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MapServiceImpl implements MapService{

    @Autowired
    MapRepository mapRepository;

    @Override
    public Map getMapById(int id) {
        return mapRepository.findById(id).orElseThrow(()-> new RuntimeException("Map not found"));
    }

    @Override
    public Map createMap(Map map) {
        Map newMap = new Map();
        newMap.setWidth(map.getWidth());
        newMap.setHeight(map.getHeight());

        return mapRepository.save(newMap);
    }
}
