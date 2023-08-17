package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class DeleteImageTranscodeDetailReq {
    @JSONField(name = "EntryId")
    String entryId;

    @JSONField(name = "Entries")
    List<String> entries;
}
