package com.example.ThreeProject.ThreeProject.modal;

import jakarta.persistence.*;

@Entity
@Table(name = "cloud_info")
public class cloudModal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int cloudId;
    private String name;
    private String adress;
    private int phnum;

    public cloudModal(){
    }

    public cloudModal(int cloudId,String name,String adress,int phnum)
    {
        this.cloudId=cloudId;
        this.name=name;
        this.adress=adress;
        this.phnum=phnum;
    }

    public void setCloudId(int cloudId){
        this.cloudId=cloudId;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAdress(String adress){
        this.adress=adress;
    }

    public void setPhnum(int phnum){
        this.phnum=phnum;
    }

    public int getCloudId(){
        return cloudId;
    }

    public String getName(){
        return name;
    }

    public String getAdress(){
        return adress;
    }

    public int getPhnum(){
        return phnum;
    }



}
