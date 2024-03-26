package com.example.ThreeProject.ThreeProject.controller;


import org.springframework.web.bind.annotation.*;
import com.example.ThreeProject.ThreeProject.service.cloudService;
import com.example.ThreeProject.ThreeProject.modal.cloudModal;

import java.util.List;

@RestController
@RequestMapping({"/cloudService"})
public class cloudController  {


    cloudService cloudService;

    cloudModal cloudModal;


    public cloudController(cloudService cloudService){
        this.cloudService=cloudService;
    }


    @GetMapping("/{cloudId}")
    public cloudModal  getCloud(@PathVariable("cloudId") int cloudId){
       return cloudService.getCloud(cloudId);
    }


    @GetMapping()
    public List<cloudModal> getAllCloud(){
        return cloudService.getAllCloud();
    }

    @PostMapping
    public String createCloud(cloudModal cloudModal){
        return cloudService.createCloud(cloudModal);
    }

    @PutMapping
    public String updateCloud(cloudModal cloudModal){
        return cloudService.updateCloud(cloudModal);
    }


    @DeleteMapping
    public String deleteMapping(int cloudId){
        return cloudService.deleteCloud(cloudId);
    }

}
