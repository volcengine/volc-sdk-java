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
public class SearchLogsResponse extends CommonResponse {

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
    List<Map<String, String>> logs;
    @JSONField(name = ANALYSIS_RESULT)
    AnalysisResult analysisResult;
    @JSONField(name = HIGH_LIGHT)
    List<Map<String, Object>> highLight;
    @JSONField(name = ELAPSED_MILLISECOND)
    Integer elapsedMillisecond;


    public SearchLogsResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public SearchLogsResponse deSerialize(byte[] data, Class clazz) throws LogException {
        SearchLogsResponse response = (SearchLogsResponse) super.deSerialize(data, clazz);
        this.resultStatus = response.resultStatus;
        this.hitCount = response.hitCount;
        this.listOver = response.listOver;
        this.analysis = response.analysis;
        this.count = response.count;
        this.limit = response.limit;
        this.context = response.context;
        this.logs = response.logs;
        this.analysisResult = response.analysisResult;
        this.highLight = response.highLight;
        this.elapsedMillisecond = response.elapsedMillisecond;
        return this;
    }

}
