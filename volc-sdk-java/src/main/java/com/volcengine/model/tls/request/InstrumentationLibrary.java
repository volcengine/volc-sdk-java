package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InstrumentationLibrary {

    /**
     * Name.
     */
    @JSONField(name = "Name")
    private String name;

    /**
     * Version.
     */
    @JSONField(name = "Version")
    private String version;
}
