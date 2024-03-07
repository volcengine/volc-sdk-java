package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetMessagesReadReceiptResResult
 */
@lombok.Data
public final class GetMessagesReadReceiptResResult  {

    /**
     * <p>已读回执详情</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ReadReceipt")
    private List<GetMessagesReadReceiptResResultReadReceiptItem> readReceipt;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
