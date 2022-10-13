package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.*;
import com.volcengine.service.visual.model.response.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class NormalOCRDemo {
    
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");
        String base64="";

//        通用OCR
//        OCRNormalRequest req = new OCRNormalRequest();
//        req.setImageBase64(base64);
//        try {
//            OCRNormalResponse response = visualService.ocrNormal(req);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        多语种OCR
//        MultilangOCRRequest req = new MultilangOCRRequest();
//        req.setImageBase64(base64);
//        try {
//            MultilangOCRResponse response = visualService.multilangOCR(req);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}