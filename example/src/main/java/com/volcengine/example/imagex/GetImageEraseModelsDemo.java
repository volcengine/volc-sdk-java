package com.volcengine.example.imagex;

import com.volcengine.model.request.GetImageEraseModelsRequest;
import com.volcengine.model.response.GetImageEraseModelsResponse;
import com.volcengine.model.response.GetImageOCRResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

public class GetImageEraseModelsDemo {
    public static void main(String[] args) {
        IImageXService service = ImageXServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.volc/config
        service.setAccessKey("ak");
        service.setSecretKey("sk");
        GetImageEraseModelsRequest request = new GetImageEraseModelsRequest();
        request.setType(1);
        try {
            GetImageEraseModelsResponse response = service.getImageEraseModels(request);
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
