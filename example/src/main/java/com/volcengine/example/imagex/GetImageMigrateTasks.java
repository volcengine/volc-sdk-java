package com.volcengine.example.imagex;

import com.volcengine.model.imagex.GetImageMigrateTasksReq;
import com.volcengine.model.imagex.GetImageMigrateTasksResp;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

/**
 * 智能移除背景
 */
public class GetImageMigrateTasks {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("");
        service.setSecretKey("");

        GetImageMigrateTasksReq request = new GetImageMigrateTasksReq();


        request.setTaskId("");


        try {
            GetImageMigrateTasksResp resp = service.getImageMigrateTask(request);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
