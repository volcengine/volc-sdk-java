package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveISPDataResResult
 */
@lombok.Data
public final class DescribeLiveISPDataResResult  {

    /**
     * <p>运营商信息，视频直播提供的网络运营商标识，支持的运营商如下所示。</p>
     *
     * <p>- `unicom`：联通；</p>
     *
     * <p>- `railcom`：铁通；</p>
     *
     * <p>- `telecom`：电信；</p>
     *
     * <p>- `mobile`：移动；</p>
     *
     * <p>- `cernet`：教育网；</p>
     *
     * <p>- `tianwei`：天威；</p>
     *
     * <p>- `alibaba`：阿里巴巴；</p>
     *
     * <p>- `tencent`：腾讯；</p>
     *
     * <p>- `drpeng`：鹏博士；</p>
     *
     * <p>- `btvn`：广电；</p>
     *
     * <p>- `huashu`：华数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ISPList")
    private List<DescribeLiveISPDataResResultISPListItem> iSPList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
