package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualImg2Video3DRequest;
import com.volcengine.service.visual.model.response.VisualImg2Video3DResponse;

import java.util.ArrayList;

public class Img2Video3DDemo {
    
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");
        
        VisualImg2Video3DRequest req = new VisualImg2Video3DRequest();
        req.setReqKey("img2video3d");
        ArrayList<String> binaryData = new ArrayList<>();
        binaryData.add("image_base64");
        req.setBinaryDataBase64(binaryData);

/*
        //  渲染参数，可选
        VisualImg2Video3DRequest.RenderSpec render = new VisualImg2Video3DRequest.RenderSpec();

        render.setMode(0);
        render.setLongSide(960);
        render.setFrameNum(90);
        render.setFps(30);
        render.setUseFlow(-1);

        ArrayList<Float> speed = new ArrayList<>();
        speed.add(0F);
        speed.add(1F);
        render.setSpeedShift(speed);
*/

        try {
            VisualImg2Video3DResponse response = visualService.img2Video3D(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}