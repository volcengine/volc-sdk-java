package com.volcengine.example.imagex;

import com.volcengine.model.request.GetImageEraseModelsRequest;
import com.volcengine.model.request.GetImageEraseResultRequest;
import com.volcengine.model.response.GetImageEraseModelsResponse;
import com.volcengine.model.response.GetImageEraseResultResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

public class GetImageEraseResultDemo {
    public static void main(String[] args) {
        IImageXService service = ImageXServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.volc/config
        service.setAccessKey("ak");
        service.setSecretKey("sk");
        GetImageEraseResultRequest request = new GetImageEraseResultRequest();
        request.setServiceId("your service id");
        request.setStoreUri("store uri");
        request.setModel("model");

        try {
            GetImageEraseResultResponse response = service.getImageEraseResult(request);
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
