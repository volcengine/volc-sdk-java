package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;

import java.util.ArrayList;

public class VisualCommonRequestDemo {
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        visualService.setAccessKey("your ak");
        visualService.setSecretKey("your sk");

         //json方式,按照接口文档组装参数
        JSONObject req = new JSONObject();
        req.put("req_key", "");
        ArrayList<String> binaryDataBase64 = new ArrayList<String>();
        binaryDataBase64.add("");
        req.put("image_urls", binaryDataBase64);
        try {
            Object response = visualService.visualCommonRequestForJson(req, "", "");
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
        //form方式,按照接口文档组装参数
//        JSONObject req = new JSONObject();
//        req.put("image_url", "");
//        req.put("return_foreground_image", 1);
//        try {
//            Object response = visualService.visualCommonRequestForForm(req, "", "");
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
