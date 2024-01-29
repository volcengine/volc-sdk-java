package com.volcengine.model.imagex;


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

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
