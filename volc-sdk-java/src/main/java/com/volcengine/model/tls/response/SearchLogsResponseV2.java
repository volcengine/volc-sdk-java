package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.AnalysisResult;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import java.util.List;
import java.util.Map;

import static com.volcengine.model.tls.Const.*;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class SearchLogsResponseV2 extends CommonResponse {

    @JSONField(name = RESULT_STATUS)
    String resultStatus;
    @JSONField(name = HIT_COUNT)
    int hitCount;
    @JSONField(name = LIST_OVER)
    boolean listOver;
    @JSONField(name = ANALYSIS)
    boolean analysis;
    @JSONField(name = COUNT)
    int count;
    @JSONField(name = LIMIT)
    int limit;
    @JSONField(name = CONTEXT)
    String context;
    @JSONField(name = LOGS)
    List<Map<String, Object>> logs;
    @JSONField(name = ANALYSIS_RESULT)
    AnalysisResult analysisResult;
    @JSONField(name = HIGH_LIGHT)
    List<Map<String, Object>> highLight;
    @JSONField(name = ELAPSED_MILLISECOND)
    Integer elapsedMillisecond;


    public SearchLogsResponseV2(Header[] headers) {
        super(headers);
    }

    @Override
    public SearchLogsResponseV2 deSerialize(byte[] data, Class clazz) throws LogException {
        SearchLogsResponseV2 response = (SearchLogsResponseV2) super.deSerialize(data, clazz);
        this.setResultStatus(response.getResultStatus());
        this.setHitCount(response.getHitCount());
        this.setListOver(response.isListOver());
        this.setAnalysis(response.isAnalysis());
        this.setCount(response.getCount());
        this.setLimit(response.getLimit());
        this.setContext(response.getContext());
        this.setLogs(response.getLogs());
        this.setAnalysisResult(response.getAnalysisResult());
        this.setHighLight(response.getHighLight());
        this.setElapsedMillisecond(response.getElapsedMillisecond());
        return this;
    }

}
