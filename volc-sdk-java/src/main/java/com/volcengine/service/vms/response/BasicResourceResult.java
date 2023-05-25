package com.volcengine.service.vms.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BasicResourceResult {

    @JSONField(name = "ResourceKey")
    private String resourceKey;


    @JSONField(name = "Suffix")
    private String suffix;


    @JSONField(name = "Name")
    private String name;


    @JSONField(name = "UploadUrl")
    private String uploadUrl;
}
