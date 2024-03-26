package com.example.ThreeProject.ThreeProject.service;

import com.example.ThreeProject.ThreeProject.modal.cloudModal;

import java.util.List;

public interface cloudService
{
    public String createCloud(cloudModal cloudModal);
    public String deleteCloud(int cloudId);
    public String updateCloud(cloudModal cloudModal);
    public cloudModal getCloud(int cloudId);
    public List<cloudModal> getAllCloud();


}
