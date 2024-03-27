package com.example.ThreeProject.ThreeProject.controller;


import org.springframework.web.bind.annotation.*;
import com.example.ThreeProject.ThreeProject.service.cloudService;
import com.example.ThreeProject.ThreeProject.modal.cloudModal;

import java.util.List;

@RestController
@RequestMapping("/cloudService")
public class cloudController  {


    cloudService cloudService;



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
    public String createCloud(@RequestBody  cloudModal cloudModal){
        return cloudService.createCloud(cloudModal);
    }

    @PutMapping
    public String updateCloud(@RequestBody cloudModal cloudModal){
        return cloudService.updateCloud(cloudModal);
    }


    @DeleteMapping("/{cloudId}")
    public String deleteMapping(@PathVariable("cloudId")int cloudId){
        return cloudService.deleteCloud(cloudId);
    }

}
