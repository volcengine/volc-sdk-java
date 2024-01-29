package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class GetImageAnalyzeTasksExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetImageAnalyzeTasksQuery query = new GetImageAnalyzeTasksQuery();

        try {
            GetImageAnalyzeTasksRes resp = service.getImageAnalyzeTasks(query);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
