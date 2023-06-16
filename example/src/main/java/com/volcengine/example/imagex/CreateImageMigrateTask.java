package com.volcengine.example.imagex;

import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

/**
 * 智能移除背景
 */
public class CreateImageMigrateTask {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("");
        service.setSecretKey("");

        CreateImageMigrateTaskReq request = new CreateImageMigrateTaskReq();

        CreateImageMigrateTaskReqTaskDst dst = new CreateImageMigrateTaskReqTaskDst();
        CreateImageMigrateTaskReqTaskTranscode tsc = new CreateImageMigrateTaskReqTaskTranscode();
        CreateImageMigrateTaskReqTaskSource source = new CreateImageMigrateTaskReqTaskSource();
        CreateImageMigrateTaskReqTaskRunStrategy rs = new CreateImageMigrateTaskReqTaskRunStrategy();


        CreateImageMigrateTaskReqTask task = new CreateImageMigrateTaskReqTask();
        task.setName("");
        task.setDst(dst);
        task.setTranscode(tsc);
        task.setSource(source);
        task.setRunStrategy(rs);




        try {
            CreateImageMigrateTaskResp resp = service.createImageMigrateTask(request);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
