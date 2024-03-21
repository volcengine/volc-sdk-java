package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateLiveStreamRecordIndexFilesRes
 */
@lombok.Data
public final class CreateLiveStreamRecordIndexFilesRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateLiveStreamRecordIndexFilesResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateLiveStreamRecordIndexFilesResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
