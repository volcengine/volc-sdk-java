package com.volcengine.service.videoaiot.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.volcengine.model.video_aiot.request.*;
import com.volcengine.model.video_aiot.response.*;
import org.junit.Assert;
import org.junit.Test;

import static com.volcengine.service.videoaiot.impl.BaseTest.setTest;
import static com.volcengine.service.videoaiot.impl.BaseTest.videoAIoTService;

public class DeviceTest {
    /**
     * device test
     */
    public void testCreateDevice() {
        String deviceNSID = "";
        try {
            IDResponse ipc = videoAIoTService.genSipIDBySpaceID("", "IPC");
            deviceNSID = ipc.getId().getId();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if ("".equalsIgnoreCase(deviceNSID)) {
            throw new RuntimeException("deviceNSID is empty");
        }
        CreateDeviceRequest createDeviceRequest = new CreateDeviceRequest();
        createDeviceRequest.setDeviceName("java-sdk-create0");
        createDeviceRequest.setDeviceNSID(deviceNSID);
        createDeviceRequest.setSpaceID("");
        createDeviceRequest.setDescription("java-sdk-create");
        createDeviceRequest.setPassword("0p@la123T10psa+=");
        createDeviceRequest.setType("IPC");
        createDeviceRequest.setUserName(deviceNSID);
        try {
            CreateDeviceResponse device = videoAIoTService.createDevice(createDeviceRequest);
            System.out.printf(JSON.toJSONString(device));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testUpdateDevice() {
        do_testUpdateDevice("3c207531-6c25-43bf-a192-0011e742e4e1", "43932980-f513-4aae-bc4c-c14eaec040b5");
    }

    public void do_testUpdateDevice(String spaceID, String deviceID) {
        UpdateDeviceRequest updateDeviceRequest = new UpdateDeviceRequest();
        updateDeviceRequest.setDeviceID(deviceID);
        updateDeviceRequest.setUserName("user-name");
        updateDeviceRequest.setDeviceName("java-sdk-update" + System.currentTimeMillis());
        updateDeviceRequest.setDescription("desc" + System.currentTimeMillis());
        updateDeviceRequest.setSpaceID(spaceID);
        updateDeviceRequest.setAutoPullAfterRegister(false);
        Device.Coordinates co = new Device.Coordinates();
        co.setLatitude(10.1);
        co.setLongitude(10.2);
        updateDeviceRequest.setLocation("test-location");
        updateDeviceRequest.setCoordinates(co);
        try {
            IDResponse idResponse = videoAIoTService.updateDevice(updateDeviceRequest);
            System.out.printf(JSON.toJSONString(idResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testGetDevice() {
        setTest();
        GetDeviceRequest getDeviceRequest = new GetDeviceRequest();
        getDeviceRequest.setDeviceID("3ee26913-9ac8-4fab-ab83-f47c629dd7011");//
        try {
            GetDeviceResponse device = videoAIoTService.getDevice(getDeviceRequest);
            System.out.printf(JSON.toJSONString(device));
        } catch (Exception e) {
            JSONObject jsonObject = JSON.parseObject(e.getMessage());
            JSONObject responseMetadata = jsonObject.getJSONObject("ResponseMetadata");
            JSONObject error = responseMetadata.getJSONObject("Error");
            String code = error.getString("Code");
            if (code != null) {
                Assert.assertEquals("NotFound.DeviceData", code);
            }
        }
    }


    public void testListDevice() {
        ListDeviceRequest listDeviceRequest = new ListDeviceRequest();
        listDeviceRequest.setPageSize(10);
        listDeviceRequest.setPageNumber(1);
        listDeviceRequest.setSpaceID("");
        try {
            ListDeviceResponse listDeviceResponse = videoAIoTService.listDevice(listDeviceRequest);
            System.out.println(JSON.toJSONString(listDeviceResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testStartDevice() {
        do_TestStartDevice("a0c97103-f019-42b4-b60a-f0976744d546", "925ca8e1-11cc-4473-aace-d9d91301b002");
    }

    public void do_TestStartDevice(String spaceID, String deviceID) {
        DeviceRequest deviceRequest = new DeviceRequest();
        deviceRequest.setSpaceID(spaceID);
        deviceRequest.setDeviceID(deviceID);
        try {
            IDResponse idResponse = videoAIoTService.startDevice(deviceRequest);
            System.out.println(JSON.toJSONString(idResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testGetDeviceChannels() {
        setTest();
        GetDeviceChannelRequest request = new GetDeviceChannelRequest();
        request.setDeviceID("34571879-8fc2-433d-9ad0-ee1d71bf16b6");
        try {
            GetDeviceChannelResponse resp = videoAIoTService.getDeviceChannels(request);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        request.setQueryMode(GetDeviceChannelRequest.QueryMode.BRIEF);
        try {
            GetDeviceChannelResponse resp = videoAIoTService.getDeviceChannels(request);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
