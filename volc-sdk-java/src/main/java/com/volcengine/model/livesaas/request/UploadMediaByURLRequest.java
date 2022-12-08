package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.URLSet;
import lombok.Data;

import java.util.List;

@Data
public class UploadMediaByURLRequest {
    @JSONField(name = "URLSets")
    List<URLSet> URLSets;
}