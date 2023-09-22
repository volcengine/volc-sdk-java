package com.volcengine.service.live;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.helper.Const;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.live.*;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.response.ResponseMetadata;
import com.volcengine.service.BaseServiceImpl;
import lombok.Data;

public class LiveTrait extends BaseServiceImpl {
    protected LiveTrait() {
        super(LiveConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), LiveConfig.apiInfoList);
    }

    protected LiveTrait(ServiceInfo serviceInfo) {
        super(serviceInfo, LiveConfig.apiInfoList);
    }

    @Data
    static public class ResponseModel {
        @JSONField(name = "ResponseMetadata")
        private ResponseMetadata responseMetadata;
    }

    private <T> T parseRawResponse(RawResponse rawResponse, Class<T> type) throws Exception {
        Exception ex = (rawResponse.getException());
        if (ex != null) {
            throw ex;
        }
        byte[] data = rawResponse.getData();
        if (data == null) {
            throw new Exception("null response body got, rawResponse:" + JSON.toJSONString(rawResponse));
        }

        ResponseModel resp = JSON.parseObject(data, ResponseModel.class);
        ResponseMetadata responseMetadata = resp.getResponseMetadata();
        if (responseMetadata == null) {
            return JSON.parseObject(data, type);
        }
        ResponseMetadata.Error err = responseMetadata.getError();
        if (err != null) {
            throw new Exception(String.format("API Error: LogID:%s ErrorCode:%s(%d) %s, rawResponse:%s",
                    resp.getResponseMetadata().getRequestId(),
                    err.getCode(), err.getCodeN(),
                    err.getMessage(),
                    JSON.toJSONString(rawResponse)
            ));
        }

        return JSON.parseObject(data, type);
    }

    /**
     * <p>describeLiveSnapshotData</p>
     * <p>查询直播域名截图张数</p>
     *
     * <p>支持查询用户直播截图计量数据。支持按照域名维度（含删除域名）查询，数据按天粒度聚合。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveSnapshotDataRes describeLiveSnapshotData(DescribeLiveSnapshotDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveSnapshotData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveSnapshotDataRes.class);
    }

    /**
     * <p>describeLiveRecordData</p>
     * <p>查询直播域名录制用量</p>
     *
     * <p>支持按照域名维度（含删除域名）查询录制用量，日录制用量为一个自然日内的录制并发路数峰值。录制用量查询支持 5 分钟、1 小时、1 天和 1 月的粒度聚合。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveRecordDataRes describeLiveRecordData(DescribeLiveRecordDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveRecordData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveRecordDataRes.class);
    }

    /**
     * <p>describeLiveTranscodeData</p>
     * <p>查询直播域名转码用量</p>
     *
     * <p>支持查询用户直播转码时长数据。支持按照域名维度（含删除域名）查询，按天粒度聚合。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveTranscodeDataRes describeLiveTranscodeData(DescribeLiveTranscodeDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveTranscodeData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveTranscodeDataRes.class);
    }

    /**
     * <p>describeLivePullToPushData</p>
     * <p>查询拉流转推时长用量</p>
     *
     * <p>创建拉流转推任务成功后，调用该接口查询拉流转推任务详细，如任务时长等。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLivePullToPushDataRes describeLivePullToPushData(DescribeLivePullToPushDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLivePullToPushData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLivePullToPushDataRes.class);
    }
}
