package com.volcengine.service.vms.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.*;

import java.util.Date;

/**
 * @author huangxing
 * @Date 2023/1/9
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ResourceResult {
    @JSONField(name = "ID")
    private Long id;

    @JSONField(name = "ResourceKey")
    private String resourceKey;

    @JSONField(name = "Suffix")
    private String suffix;

    @JSONField(name = "Name")
    private String name;

    @JSONField(name = "Duration")
    private Integer duration;

    @JSONField(name = "State")
    private Integer state;

    @JSONField(name = "CreateTime")
    private Date createTime;

    @JSONField(name = "Type")
    private Integer type;

    @JSONField(name = "Remark")
    private String remark;
}
