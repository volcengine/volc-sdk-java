package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageTranscodeQueuesQuery
 */
@lombok.Data
public final class GetImageTranscodeQueuesQuery  {

    /**
     * <p>队列所在地区。默认当前地区。ToB取值枚举：cn、va、sg。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>返回队列名称或队列描述中包含该值的队列。默认为空，不传则返回所有队列。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SearchPtn")
    private String searchPtn;

    /**
     * <p>分页条数，取值范围为(0,100]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Limit")
    private Integer limit;

    /**
     * <p>分页偏移量，默认为 0。取值为 1 时，表示跳过第一条数据，从第二条数据取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Offset")
    private Integer offset;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
