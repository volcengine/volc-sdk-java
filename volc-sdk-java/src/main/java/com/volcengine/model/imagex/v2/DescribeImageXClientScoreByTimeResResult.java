package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXClientScoreByTimeResResult
 */
@lombok.Data
public final class DescribeImageXClientScoreByTimeResResult  {

    /**
     * <p>画质打分数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ScoreData")
    private List<DescribeImageXClientScoreByTimeResResultScoreDataItem> scoreData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
