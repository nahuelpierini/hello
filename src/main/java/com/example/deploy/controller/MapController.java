package com.example.deploy.controller;

import com.example.deploy.entity.Map;
import com.example.deploy.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MapController {

    @Autowired
    MapService mapService;

    @GetMapping("/map/{id}")
    public Map getMap(@PathVariable int id){

        return mapService.getMapById(id);
    }

    @PostMapping("/map")
    public Map createMap(@RequestBody Map map){

        return  mapService.createMap(map);
    }
}
