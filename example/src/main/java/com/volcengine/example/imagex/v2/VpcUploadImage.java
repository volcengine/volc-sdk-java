package com.volcengine.example.imagex.v2;

import com.volcengine.model.request.ApplyImageUploadRequest;
import com.volcengine.model.request.VpcUploadRequest;
import com.volcengine.model.response.CommitImageUploadResponse;
import com.volcengine.service.imagex.v2.ImagexService;

import java.io.ByteArrayInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class VpcUploadImage {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        ImagexService service = ImagexService.getInstance();
//        service.setHost("open.volcengineapi.com");
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        VpcUploadRequest request = new VpcUploadRequest();
        request.setServiceId("service id");     // 服务 ID
        request.setFilePath("your file path");  // 文件路径，与Data二选一
        request.setData(null);                  // 文件数据，与FilePath二选一
        request.setStoreKey("your store key");  // 文件存储名
        request.setPrefix("your prefix");       // 文件前缀
        request.setFileExtension("your file extension");  // 文件后缀
        request.setContentType("your content type");      //文件Content-Type
        request.setStorageClass("your storage class");  //文件存储类型
        request.setPartSize(0L);        // 偏好分片大小，单位为字节(0表示按照默认规则分片)
        request.setOverwrite(false);    // 是否进行上传覆盖
        request.setSkipMeta(false);     // 是否跳过元信息

        try {
            // 上传文件
            CommitImageUploadResponse response = service.vpcUploadImage(request);
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
