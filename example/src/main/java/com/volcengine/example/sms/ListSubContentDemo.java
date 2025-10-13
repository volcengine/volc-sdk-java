package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.ApplySignatureIdentRequest;
import com.volcengine.model.request.sms.ListSubContentRequest;
import com.volcengine.model.response.ApplySignatureIdentResponse;
import com.volcengine.model.response.sms.ListSubContentResponse;
import com.volcengine.model.sms.DocType;
import com.volcengine.model.sms.ImageType;
import com.volcengine.model.sms.SignAuthFile;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.SmsServiceInfoConfig;
import com.volcengine.service.sms.impl.SmsServiceImpl;

import java.io.DataInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.List;

public class ListSubContentDemo {
    private static SmsService smsService = SmsServiceImpl.getInstance(new SmsServiceInfoConfig("ak", "sk"));

    public static void main(String[] args) {

        ListSubContentRequest listSubReq = new ListSubContentRequest();
        // 设置二级模板ID
        listSubReq.setSecondTemplateId("secondTemplateId");
        // 设置分页页码
        listSubReq.setPage(1);
        // 设置每页大小
        listSubReq.setPageSize(10);
        // 设置子内容ID（可选，精确查询时使用）
        listSubReq.setSubContentId("");

        try {
            ListSubContentResponse listSubResp = smsService.listSubContent(listSubReq);
            System.out.println("listSubContent 响应: " + JSON.toJSONString(listSubResp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
