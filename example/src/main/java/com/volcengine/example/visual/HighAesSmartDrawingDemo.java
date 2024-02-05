package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.response.VisualHighAesSmartDrawingResponse;

import java.util.ArrayList;

public class HighAesSmartDrawingDemo {
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("your ak");
        visualService.setSecretKey("your sk");
        //高美感通用v1.1-图生图
        JSONObject req=new JSONObject();
        req.put("req_key","high_aes_i2i");
        req.put("prompt","");
        ArrayList<String> binaryDataBase64 = new ArrayList<String>();
        binaryDataBase64.add("");
        req.put("binary_data_base64",binaryDataBase64);
        try {
            VisualHighAesSmartDrawingResponse response = visualService.visualHighAesSmartDrawing(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //高美感通用v1.2-文生图
//        JSONObject req=new JSONObject();
//        req.put("req_key","high_aes_t2i");
//        req.put("prompt","");
//        try {
//            VisualHighAesSmartDrawingResponse response = visualService.visualHighAesSmartDrawing(req);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //高美感动漫v1.3-文生图/图生图
//        JSONObject req=new JSONObject();
//        req.put("req_key","high_aes");
//        req.put("prompt","");
//        req.put("model_version","anime_v1.3");
//        //图生图必选该字段
//        ArrayList<String> binaryDataBase64 = new ArrayList<String>();
//        binaryDataBase64.add("");
//        req.put("binary_data_base64",binaryDataBase64);
//        try {
//            VisualHighAesSmartDrawingResponse response = visualService.visualHighAesSmartDrawing(req);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //高美感通用V1.3-文生图
//        JSONObject req=new JSONObject();
//        req.put("req_key","high_aes");
//        req.put("prompt","");
//        req.put("model_version","general_v1.3");
//        try {
//            VisualHighAesSmartDrawingResponse response = visualService.visualHighAesSmartDrawing(req);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }









}
