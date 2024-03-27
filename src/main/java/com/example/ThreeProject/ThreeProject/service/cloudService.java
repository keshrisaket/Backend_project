package com.example.ThreeProject.ThreeProject.service;

import com.example.ThreeProject.ThreeProject.modal.cloudModal;

import java.util.List;

public interface cloudService
{
     String createCloud(cloudModal cloudModal);
     String deleteCloud(int cloudId);
     String updateCloud(cloudModal cloudModal);
     cloudModal getCloud(int cloudId);
     List<cloudModal> getAllCloud();


}




