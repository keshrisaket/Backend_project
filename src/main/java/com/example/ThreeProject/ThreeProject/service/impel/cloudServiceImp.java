package com.example.ThreeProject.ThreeProject.service.impel;

import com.example.ThreeProject.ThreeProject.service.cloudService;
import com.example.ThreeProject.ThreeProject.modal.cloudModal;
import com.example.ThreeProject.ThreeProject.repositery.cloudRepositery;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class cloudServiceImp implements cloudService {

    cloudRepositery cloudRepositery;

    public cloudServiceImp(cloudRepositery cloudRepositery){
        this.cloudRepositery=cloudRepositery;
    }

    @Override
 public String createCloud(cloudModal cloudModal){
     cloudRepositery.save(cloudModal);
     return "sucess";
 }

    @Override
 public String updateCloud(cloudModal cloudModal){
     cloudRepositery.save(cloudModal);
     return "Sucess";
 }
    @Override
 public String deleteCloud(int cloudId){
     cloudRepositery.deleteById(cloudId);
     return "Sucess";
 }
    @Override
 public cloudModal getCloud(int cloudId){
     return cloudRepositery.findById(cloudId).get();
 }
    @Override
 public List<cloudModal> getAllCloud(){
     return cloudRepositery.findAll();
 }




}
