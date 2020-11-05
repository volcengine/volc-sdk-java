package com.bytedanceapi.model.beans;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class FunctionsOptionInfo {
    @JSONField(name = "Title")
    String title;
    @JSONField(name = "Tags")
    String tags;
    @JSONField(name = "Description")
    String description;
    @JSONField(name = "Category")
    String category;
}
