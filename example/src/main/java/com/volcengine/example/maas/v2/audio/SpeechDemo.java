package com.volcengine.example.maas.v2.audio;

import com.volcengine.model.maas.api.v2.SpeechReq;
import com.volcengine.service.maas.MaasException;
import com.volcengine.service.maas.response.BinaryResponseContent;
import com.volcengine.service.maas.v2.MaasService;
import com.volcengine.service.maas.v2.impl.MaasServiceImpl;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class SpeechDemo {
    public static void main(String[] args) {
        MaasService maasService = new MaasServiceImpl("maas-api.ml-platform-cn-beijing.volces.com", "cn-beijing");

        // fetch ak&sk from environmental variables
        maasService.setAccessKey(System.getenv("VOLC_ACCESSKEY"));
        maasService.setSecretKey(System.getenv("VOLC_SECRETKEY"));

        SpeechReq tReq = new SpeechReq()
                .withInput("你好欢迎光临")
                .withVoice("zh_male_rap")
                .withResponseFormat("mp3")
                .withSpeed(1.0f);

        String endpointId = "${YOUR_ENDPOINT_ID}";
        String path = "${YOUR_FILE}";
        testSpeech(maasService, endpointId, tReq, path);
    }

    private static void testSpeech(MaasService maasService, String endpointId, SpeechReq req, String path) {
        BinaryResponseContent brc;
        try {
            brc = maasService.audio().speech.create(endpointId, req);
        } catch (MaasException e) {
            System.out.println("req_id: " + e.getRequestId());
            System.out.println("code: " + e.getCode());
            System.out.println("code_n: " + e.getCodeN());
            System.out.println("message: " + e.getMsg());
            e.printStackTrace();
            return;
        }

        int index;
        try (
                FileOutputStream fos = new FileOutputStream(path);
                InputStream resp = brc.getResponse();
        ) {
            byte[] b = new byte[4*1024];
            while ((index = resp.read(b)) != -1) {
                fos.write(b, 0, index);
                fos.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("finish create audio file.");
        System.out.println("req_id: " + brc.getRequestId());
    }
}