package com.volcengine.example.maas.v2.images;

import com.volcengine.model.maas.api.v2.*;
import com.volcengine.service.maas.MaasException;
import com.volcengine.service.maas.v2.MaasService;
import com.volcengine.service.maas.v2.impl.MaasServiceImpl;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;

public class ImagesQuickGenDemo {
    public static void main(String[] args) {
        MaasService maasService = new MaasServiceImpl("maas-api.ml-platform-cn-beijing.volces.com", "cn-beijing");

        // fetch ak&sk from environmental variables
        maasService.setAccessKey(System.getenv("VOLC_ACCESSKEY"));
        maasService.setSecretKey(System.getenv("VOLC_SECRETKEY"));

        byte[] controlImage = loadImage("{YOUR_CONTROL_PICTURE_PATH}");
        ImagesQuickGenRequest tReq = new ImagesQuickGenRequest()
                .withPrompt("(sfw:1.0),(masterpiece,best quality,ultra highres),(realistic:1.15),(3D:1.0),8k wallpaper,ultra detailed,beautiful and aesthetic,official art,real,(tech city background:1.3),(depth of field:1.1),(colorful:1),wind,(sky:1.25),chinese (high quality:1.3) ((golden:1.3) dragon:1.3),glowing,(1girl:1.1),portrait,(bright face:1.2),bangs,light smile,hair,(look at viewer1.2),(young:1.0),(big eyes:1),solo,Brilliant,face to viewer,(future architecture:1.1),(milk print hanfu:1.2),(liquid:1.1),(bubble:1.2),pvc texture,(building:1.2),(detailed skin:1.2),(science fiction:1.3),(machinery:1.2),anmuxi,(iridescent film coat:1.3),(iridescent (blue:0.15) film hanfu:1.30),(red lantern:1.3),")
                .withNegativePrompt("(embedding:EasyNegative:0.9),(embedding:badhandv4:1.3),terrible,injured,(nsfw:1.0),(nude:1.0),naked,small eyes,Sleepy,big small eyes,(breasts:1.0),lowres,text,log,signature,symbol-shaped pupils,heterochromia,multicolored eyes,no pupils,slit pupils,asymmetrical pupils,asymmetrical eyes,asymmetrical eyebrows,streaked hair,colored inner hair,two-tone hair,multicolored hair,gradient hair,earrings,hair ornaments,asymmetrical breasts,multiple views,reference sheet,simple background,room,indoors,japan,blue arm,(old:1.2),sad,asian face,blue skin,monster,bone,europa,american,(facial tattoo:1),tattoo,(hat:1.1),blue face,blue skin,white lantern,western dargon,Cross-eyed,curls hai,flower on head,skin blemish,tongue out,(sky:1.1),(yellow skin:1.3),white lantern,centre parting,fog,(facepaint:1.2),")
                .withControlImage(controlImage)
                .withParameters(new ImagesParameters()
                        .withSeed(38)
                        .withStrength(0.75)
                        .withNumInferenceSteps(20)
                );

        String endpointId = "${YOUR_ENDPOINT_ID}";
        testImagesQuickGen(maasService, endpointId, tReq);
    }

    private static void testImagesQuickGen(MaasService maasService, String endpointId, ImagesQuickGenRequest req) {
        try {
            ImagesQuickGenResponse resp = maasService.images().ImagesQuickGen(endpointId, req);
            System.out.println(resp.getData().get(0).getUrl());
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