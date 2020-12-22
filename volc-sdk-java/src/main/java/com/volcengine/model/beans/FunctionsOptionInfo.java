package com.volcengine.model.beans;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
