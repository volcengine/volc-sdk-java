package com.volcengine.example.imagex.v1;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.sts2.SecurityToken2;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 获取 STS2 的上传密钥（离线的）
 */
public class GetUploadSts2 {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        List<String> serviceIds = new ArrayList<>(0);
        serviceIds.add("service id"); // 生成的 STS2 密钥可以用于哪些 ImageX 服务

        try {
            // 默认超时时间为 1小时，如果有需要，请调用 imagex.getUploadSts2WithExpire() 来设置超时时间
            // 您可以使用 imagex.getUploadSts2WithKeyPtn("表达式") 来限制上传的存储名格式
            //     如: "test/*" 表示上传的文件必须包含 "test/" 前缀
            HashMap<String, String> tag =  new HashMap<>();
            // tag 可如下配置
//    Map<String, String> tag = new HashMap<>();
        Map<String, Object> policy = new HashMap<>();
        policy.put("FileSizeUpLimit","xxx");
        policy.put("FileSizeBottomLimit","xxx");
        policy.put("ContentTypeBlackList",new ArrayList<String>(){
        {
            add("xxx");
            add("yyy");
        }
    });
        policy.put("ContentTypeWhiteList",new ArrayList<String>(){
        {
            add("xxx");
            add("yyy");
        }
    });
        tag.put("UploadPolicy",JSON.toJSONString(policy));
        tag.put("UploadOverwrite","True");
//            tag.put("UploadOverwrite", "False");
            System.out.println(tag);
            SecurityToken2 sts2 = service.getUploadSts2(serviceIds, tag);
            System.out.println(JSON.toJSONString(sts2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
