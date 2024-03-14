package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageQualityResResult
 */
@lombok.Data
public final class GetImageQualityResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VqType")
    private String vqType;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NrScores")
    private GetImageQualityResResultNrScores nrScores;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FrScoreResult")
    private GetImageQualityResResultFrScoreResult frScoreResult;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FrScores")
    private GetImageQualityResResultFrScores frScores;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NrScoreResult")
    private GetImageQualityResResultNrScoreResult nrScoreResult;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
