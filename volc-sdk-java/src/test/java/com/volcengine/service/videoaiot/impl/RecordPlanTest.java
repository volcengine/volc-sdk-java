package com.volcengine.service.videoaiot.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.video_aiot.common;
import com.volcengine.model.video_aiot.request.CreateRecordPlanRequest;
import com.volcengine.model.video_aiot.request.ListRecordPlansRequest;
import com.volcengine.model.video_aiot.request.UpdateRecordPlanRequest;
import com.volcengine.model.video_aiot.response.IDResponse;
import com.volcengine.model.video_aiot.response.ListRecordPlanChannelsResponse;
import com.volcengine.model.video_aiot.response.ListRecordPlansResponse;
import com.volcengine.model.video_aiot.response.RecordPlanResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.volcengine.service.videoaiot.impl.BaseTest.setTest;
import static com.volcengine.service.videoaiot.impl.BaseTest.videoAIoTService;

public class RecordPlanTest {
    private String planID = "d97fc331-d37a-4f1c-8d59-115a7a968ebc";
    @Test
    public void testCreateRecordPlan() {
        setTest();
        CreateRecordPlanRequest createRecordPlanRequest = new CreateRecordPlanRequest();
        createRecordPlanRequest.setPlanName("java-sdk-test-plan");
        createRecordPlanRequest.setBindTemplate("f341db35-207c-427f-bf9d-3ce20fb937e0");
        createRecordPlanRequest.setMainStreams(new ArrayList<String>() {
            {
                add("0f144bd6-6be1-4a11-9b1a-4b0f36b82277");
            }
        });
        createRecordPlanRequest.setResolution("2");
        createRecordPlanRequest.setDescription("javasdktest");
        createRecordPlanRequest.setStatus("enabled");
        try {
            IDResponse recordPlan = videoAIoTService.createRecordPlan(createRecordPlanRequest);
            System.out.println(recordPlan);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testGetRecordPlan() {
        setTest();
        try {
            RecordPlanResponse recordPlan = videoAIoTService.getRecordPlan(planID);
            System.out.println(JSON.toJSONString(recordPlan));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Test
    public void testUpdateRecordPlan() {
        setTest();
        UpdateRecordPlanRequest updateRecordPlanRequest = new UpdateRecordPlanRequest();
        updateRecordPlanRequest.setPlanName("1024-sdk-update");
        updateRecordPlanRequest.setPlanID(planID);
//        updateRecordPlanRequest.setBindTemplate("5b96fd8b-bf42-4950-9194-5efd11453e89");
        updateRecordPlanRequest.setStatus("enabled");
        UpdateRecordPlanRequest.ModifyList delList = new UpdateRecordPlanRequest.ModifyList();
        delList.setMainStreams(new ArrayList<String>(){
            {add("0f144bd6-6be1-4a11-9b1a-4b0f36b82277");}
        });
        updateRecordPlanRequest.setAddList(delList);
//        UpdateRecordPlanRequest.ModifyList addList = new UpdateRecordPlanRequest.ModifyList();

        updateRecordPlanRequest.setResolution("2");
//        updateRecordPlanRequest.setAddList(addList);
        try {
            IDResponse recordPlan = videoAIoTService.updateRecordPlan(updateRecordPlanRequest);
            System.out.println(JSON.toJSONString(recordPlan));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testListRecordPlan() {
        setTest();
        ListRecordPlansRequest listRecordPlansRequest = new ListRecordPlansRequest();
//        listRecordPlansRequest.setFilterName("test");
        try {
            ListRecordPlansResponse recordPlan = videoAIoTService.listRecordPlans(listRecordPlansRequest);
            System.out.println(JSON.toJSONString(recordPlan));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testListRecordPlanChannel() {
        setTest();
        try {
            ListRecordPlanChannelsResponse recordPlan = videoAIoTService.listRecordPlanChannels(planID);
            System.out.println(JSON.toJSONString(recordPlan));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testDeleteRecordPlan() {
        setTest();
        try {
            IDResponse recordPlan = videoAIoTService.deleteRecordPlan(planID);
            System.out.println(JSON.toJSONString(recordPlan));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
