package com.volcengine.example.imagex;

import com.volcengine.model.request.ExtractImageHmRequest;
import com.volcengine.model.request.GetImageSegmentRequest;
import com.volcengine.model.response.ExtractImageHmResponse;
import com.volcengine.model.response.GetImageSegmentResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class GetImageSegment {
    public static void main(String[] args) {
        // default region cn-north-1, for other region, call ImageXServiceImpl.getInstance(region)
        IImageXService service = ImageXServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.volc/config
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        Map<String, String> params = new HashMap<>();
        params.put("ServiceId", "xx");

        GetImageSegmentRequest request = new GetImageSegmentRequest();
        request.setStoreUri("uri");
        request.setClassify("xx");
        request.setRefine(true);
        request.setOutFormat("xx");
        request.setTransBg(true);


        GetImageSegmentRequest.Contour contour = new GetImageSegmentRequest.Contour();
        contour.setColor("#000000");
        contour.setSize(0);

        request.setContour(contour);

        try {
            GetImageSegmentResponse resp = service.getImageSegment(params, request);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
