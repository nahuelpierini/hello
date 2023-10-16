package com.example.deploy.service;

import com.example.deploy.entity.Map;

public interface MapService {

    Map getMapById(int id);
    Map createMap(Map map);
}
