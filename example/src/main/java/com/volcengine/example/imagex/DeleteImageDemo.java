package com.volcengine.example.imagex;

import com.volcengine.model.request.DeleteImageReq;
import com.volcengine.model.response.DeleteImageResp;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class DeleteImageDemo {
    public static void main(String[] args) {
        // default region cn-north-1, for other region, call ImageXServiceImpl.getInstance(region)
        IImageXService service = ImageXServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.volc/config
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        List<String> uris = new ArrayList<>();
        uris.add("image uri 1");
        uris.add("image uri 2");
        DeleteImageReq req = new DeleteImageReq();
        req.setServiceId("imagex service id");
        req.setStoreUris(uris);

        try {
            DeleteImageResp resp = service.deleteImages(req);
            System.out.println(resp);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
