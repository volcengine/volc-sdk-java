package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.*;
import com.volcengine.service.visual.model.response.*;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class CardOCRDemo {
    
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");

        String base64="";
//        银行卡
//         OCRBankCardRequest req = new OCRBankCardRequest();
//         req.setImageBase64(base64);
//         req.setVersion("v2")
//         try {
//             OCRBankCardV2Response response = visualService.bankCardV2(req);
//             System.out.println(JSON.toJSONString(response));
//         } catch (Exception e) {
//             e.printStackTrace();
//         }

//        身份证
//         OCRIDCardRequest req = new OCRIDCardRequest();
//         req.setImageBase64(base64);
//         req.setVersion("v2");
//         try {
//             OCRIDCardResponse response = visualService.idCard(req);
//             System.out.println(JSON.toJSONString(response));
//         } catch (Exception e) {
//             e.printStackTrace();
//         }

    }
}