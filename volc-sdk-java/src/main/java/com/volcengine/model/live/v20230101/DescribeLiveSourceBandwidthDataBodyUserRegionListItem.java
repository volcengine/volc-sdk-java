package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveSourceBandwidthDataBodyUserRegionListItem
 */
@lombok.Data
public final class DescribeLiveSourceBandwidthDataBodyUserRegionListItem  {

    /**
     * <p>区域信息的大区标识符，如何获取请参见[查询区域标识符](https://www.volcengine.com/docs/6469/1133973)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Area")
    private String area;

    /**
     * <p>区域信息的国家标识符，如何获取请参见[查询区域标识符](https://www.volcengine.com/docs/6469/1133973)。如果按国家筛选，需要同时传入 `Area` 和 `Country`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Country")
    private String country;

    /**
     * <p>区域信息的省份标识符，国外暂不支持该参数，如何获取请参见[查询区域标识符](https://www.volcengine.com/docs/6469/1133973)。如果按省筛选，需要同时传入 `Area`、`Country` 和 `Province`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Province")
    private String province;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
