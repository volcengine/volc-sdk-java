package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageDetectResultResResultFacesItem
 */
@lombok.Data
public final class GetImageDetectResultResResultFacesItem  {

    /**
     * <p>人脸坐标位置。</p>
     *
     * <p>:::tip</p>
     *
     * <p>例如`[11,22,33,44]`，表示人脸的左上角和右下角坐标。其中`11`为左上角横坐标，`22`为左上角纵坐标，`33`为右下角横坐标，`44`为右下角纵坐标。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Box")
    private List<Long> box;

    /**
     * <p>坐标置信度，表示识别内容可信程度。</p>
     *
     * <p>值越大，代表可信程度越高。置信度高于 90% 表示高可信，60%～90% 建议人工二次确认，低于 60% 表示不可信。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Score")
    private Double score;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
