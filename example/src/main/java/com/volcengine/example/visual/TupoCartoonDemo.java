package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.TupoCartoonRequest;
import com.volcengine.service.visual.model.response.TupoCartoonResponse;

import java.util.ArrayList;

public class TupoCartoonDemo {
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("your ak");
        visualService.setSecretKey("your sk");
        TupoCartoonRequest req = new TupoCartoonRequest();
        req.setReqKey("tupo_cartoon");
        ArrayList<String> list=new ArrayList<>();
        list.add("imageUrl");
        req.setImageUrls(list);
        try {
            TupoCartoonResponse tupoCartoonResponse = visualService.tupoCartoon(req);
            System.out.println(JSON.toJSONString(tupoCartoonResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
