package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualEmoticonEditRequest;
import com.volcengine.service.visual.model.response.VisualEmoticonEditResponse;

public class EmoticonEditDemo {
    
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");
        
        VisualEmoticonEditRequest req = new VisualEmoticonEditRequest();
        req.setImageBase64("image_base64");
        
        /**
         *  表情类型。
            0代表张嘴笑(默认)
            1代表嘟嘟嘴
            2代表不高兴
            3代表闭嘴笑
         */
        // req.setServiceChoice(0);

        try {
            VisualEmoticonEditResponse response = visualService.emotionEdit(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}