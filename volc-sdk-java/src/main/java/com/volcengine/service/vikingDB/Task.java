package com.volcengine.service.vikingDB;

import lombok.Data;

import java.util.HashMap;

@Data
public class Task {
    private String collectionName = "";
    private String createTime = "";
    private HashMap<String, Object> processInfo = null;
    private String taskId = "";
    private HashMap<String, Object> taskParams = null;
    private String taskStatus = "";
    private String taskType = "";
    private String updatePerson = "";
    private String updateTime = "";

    public Task(String collectionName, String createTime, HashMap<String, Object> processInfo, String taskId, HashMap<String, Object> taskParams, String taskStatus, String taskType, String updatePerson, String updateTime) {
        this.collectionName = collectionName;
        this.createTime = createTime;
        this.processInfo = processInfo;
        this.taskId = taskId;
        this.taskParams = taskParams;
        this.taskStatus = taskStatus;
        this.taskType = taskType;
        this.updatePerson = updatePerson;
        this.updateTime = updateTime;
    }

    public Task() {
    }
}   
