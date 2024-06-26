package com.volcengine.example.maas.v2.images;

import com.volcengine.model.maas.api.v2.*;
import com.volcengine.service.maas.MaasException;
import com.volcengine.service.maas.v2.MaasService;
import com.volcengine.service.maas.v2.impl.MaasServiceImpl;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;

public class ImagesQuickGenDemo {
    public static void main(String[] args) {
        MaasService maasService = new MaasServiceImpl("maas-api.ml-platform-cn-beijing.volces.com", "cn-beijing");

        // fetch ak&sk from environmental variables
        maasService.setAccessKey(System.getenv("VOLC_ACCESSKEY"));
        maasService.setSecretKey(System.getenv("VOLC_SECRETKEY"));

        byte[] controlImage = loadImage("{YOUR_CONTROL_PICTURE_PATH}");
        ImagesQuickGenRequest tReq = new ImagesQuickGenRequest()
                .withPrompt("(sfw:1.0),(masterpiece,best quality,ultra highres),(realistic:1.15),(3D:1.0)")
                .withNegativePrompt("(embedding:EasyNegative:0.9),(embedding:badhandv4:1.3),terrible,injured,(nsfw:1.0),(nude:1.0)")
                .withControlImageList(new ArrayList<byte[]>(){{
                    add(controlImage);
                }})
                .withParameters(new ImagesParameters()
                        .withStrength(0.75f)
                        .withHeight(512)
                        .withWidth(512)
                        .withNumInferenceSteps(20)
                );

        String endpointId = "${YOUR_ENDPOINT_ID}";
        testImagesQuickGen(maasService, endpointId, tReq);
    }

    private static void testImagesQuickGen(MaasService maasService, String endpointId, ImagesQuickGenRequest req) {
        try {
            ImagesQuickGenResponse resp = maasService.images().ImagesQuickGen(endpointId, req);
            System.out.println(resp.getData());
        } catch (MaasException e) {
            System.out.println("req_id: " + e.getRequestId());
            System.out.println("code: " + e.getCode());
            System.out.println("code_n: " + e.getCodeN());
            System.out.println("message: " + e.getMsg());
            e.printStackTrace();
        }
    }

    public static byte[] loadImage(String fileName) {
        try {
            File f = new File(fileName);
            return Files.readAllBytes(f.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}