package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListPullToPushTaskResResultListItemVodSrcAddrsItem
 */
@lombok.Data
public final class ListPullToPushTaskResResultListItemVodSrcAddrsItem  {

    /**
     * <p>当前点播文件开始播放的时间偏移值，单位为秒。默认为空时表示开始播放时间不进行偏移。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartOffset")
    private Float startOffset;

    /**
     * <p>当前点播文件结束播放的时间偏移值，单位为秒，默认为空时表示结束播放时间不进行偏移。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndOffset")
    private Float endOffset;

    /**
     * <p>点播文件地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SrcAddr")
    private String srcAddr;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
