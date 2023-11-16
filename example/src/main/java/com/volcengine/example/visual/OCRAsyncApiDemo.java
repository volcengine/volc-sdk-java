package com.volcengine.example.visual;

import com.alibaba.fastjson.JSONObject;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;

import java.io.IOException;

public class OCRAsyncApiDemo {

    public static void main(String[] args) throws IOException {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");
        String base64 = "";

        // 注意：请根据文档修改相应接口的请求字段名
        JSONObject request = new JSONObject();
        request.put("image_base64", base64);

        request.put("req_key", "ocr_pdf");
        request.put("task_id","12345678");

        String action;
        action = "OCRPdfSubmitTask";
        action = "OCRPdfQueryTask";

        try {
            String jsonStri = visualService.ocrAsyncApi(action, request);
            System.out.println(jsonStri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}