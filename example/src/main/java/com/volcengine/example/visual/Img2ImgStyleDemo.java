package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualImg2ImgStyleRequest;
import com.volcengine.service.visual.model.response.VisualImg2ImgStyleResponse;

import java.util.ArrayList;

public class Img2ImgStyleDemo {
    
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you don't set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");

        VisualImg2ImgStyleRequest req = new VisualImg2ImgStyleRequest();
        req.setReqKey("img2img_style");
        req.setPrompt("A beautiful girl,(extremely detailed CG unity 8k wallpaper, best quality, best illustration, an extremely delicate and beautiful, Delicate background,purple star, purple background, upper body shot，fantasy，snow-white skin，flat chest，solo,gradient hair,silver hair,long hair,disheveled hair,floating hair,beautiful detailed hair,diamond eyes,purple eyes,lighting pupil,beautiful eyes, off shoulder top sleeve，detailed dress,white dress,white thighhighs , combat boots, standing，blank stare, flowing gold and silver, everything flowing and melt,flowing iron, flowing silver,(lace flowing and melt), in the style of Chawin Choosrirat");
//        req.setStrength(0.5F);
//        req.setSeed(-1);
//        ArrayList<String> binaryData = new ArrayList<>();
//        binaryData.add("image_base64");
//        req.setBinaryDataBase64(binaryData);
        req.setImageUrl("https://xxx");


        try {
            VisualImg2ImgStyleResponse response = visualService.img2ImgStyle(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}