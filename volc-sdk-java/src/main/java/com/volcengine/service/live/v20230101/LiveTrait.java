package com.volcengine.service.live.v20230101;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.response.ResponseMetadata;
import com.alibaba.fastjson.JSON;
import com.volcengine.model.live.v20230101.*;
import com.volcengine.service.BaseServiceImpl;
import lombok.Data;
import org.apache.http.HttpHost;

/**
 * Live Trait
 */
public class LiveTrait extends BaseServiceImpl {
    protected LiveTrait() {
        super(LiveConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), LiveConfig.apiInfoList);
    }

    protected LiveTrait(ServiceInfo serviceInfo) {
        super(serviceInfo, LiveConfig.apiInfoList);
    }
    
    protected LiveTrait(HttpHost proxy) {
        super(LiveConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), proxy, LiveConfig.apiInfoList);
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
     * <p>deleteTranscodePreset</p>
     * <p>删除转码配置</p>
     *
     * <p>调用 `DeleteTranscodePreset` 接口，删除已创建的转码配置。   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteTranscodePresetRes deleteTranscodePreset(DeleteTranscodePresetBody body) throws Exception {
        RawResponse rawResponse = json("DeleteTranscodePreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteTranscodePresetRes.class);
    }

    /**
     * <p>updateTranscodePreset</p>
     * <p>更新转码配置</p>
     *
     * <p>调用 `UpdateTranscodePreset` 接口，更新已添加的转码配置。   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateTranscodePresetRes updateTranscodePreset(UpdateTranscodePresetBody body) throws Exception {
        RawResponse rawResponse = json("UpdateTranscodePreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateTranscodePresetRes.class);
    }

    /**
     * <p>listCommonTransPresetDetail</p>
     * <p>查询内置转码档位的详细配置</p>
     *
     * <p>调用 `ListCommonTransPresetDetail` 接口，查询内置转码档位的详细配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListCommonTransPresetDetailRes listCommonTransPresetDetail(ListCommonTransPresetDetailBody body) throws Exception {
        RawResponse rawResponse = json("ListCommonTransPresetDetail", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListCommonTransPresetDetailRes.class);
    }

    /**
     * <p>transcodingJobStatus</p>
     * <p>查询转码任务</p>
     *
     * <p>调用 `TranscodingJobStatus` 接口，查询直播流在近 3 天的转码记录和当前转码任务的状态。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public TranscodingJobStatusRes transcodingJobStatus(TranscodingJobStatusQuery query) throws Exception {
        RawResponse rawResponse = json("TranscodingJobStatus", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, TranscodingJobStatusRes.class);
    }

    /**
     * <p>listVhostTransCodePreset</p>
     * <p>查询转码配置列表</p>
     *
     * <p>调用 `ListVhostTransCodePreset` 接口，查询转码配置列表。   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListVhostTransCodePresetRes listVhostTransCodePreset(ListVhostTransCodePresetBody body) throws Exception {
        RawResponse rawResponse = json("ListVhostTransCodePreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListVhostTransCodePresetRes.class);
    }

    /**
     * <p>createTranscodePreset</p>
     * <p>添加转码配置</p>
     *
     * <p>调用 `CreateTranscodePreset` 接口创建一个转码配置，在直播流传输的过程中，系统将根据您的转码配置，对直播流进行实时转码。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateTranscodePresetRes createTranscodePreset(CreateTranscodePresetBody body) throws Exception {
        RawResponse rawResponse = json("CreateTranscodePreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateTranscodePresetRes.class);
    }

    /**
     * <p>restartTranscodingJob</p>
     * <p>重启转码任务</p>
     *
     * <p>调用 `RestartTranscodingJob` 接口，重启状态异常的转码任务。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public RestartTranscodingJobRes restartTranscodingJob(RestartTranscodingJobQuery query) throws Exception {
        RawResponse rawResponse = json("RestartTranscodingJob", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, RestartTranscodingJobRes.class);
    }

    /**
     * <p>createWatermarkPreset</p>
     * <p>添加水印配置</p>
     *
     * <p>调用 `CreateWatermarkPreset` 接口，为转码流添加水印配置。   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateWatermarkPresetRes createWatermarkPreset(CreateWatermarkPresetBody body) throws Exception {
        RawResponse rawResponse = json("CreateWatermarkPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateWatermarkPresetRes.class);
    }

    /**
     * <p>updateWatermarkPreset</p>
     * <p>更新水印配置</p>
     *
     * <p>调用 `UpdateWatermarkPreset` 接口，更新已添加的水印配置。   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateWatermarkPresetRes updateWatermarkPreset(UpdateWatermarkPresetBody body) throws Exception {
        RawResponse rawResponse = json("UpdateWatermarkPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateWatermarkPresetRes.class);
    }

    /**
     * <p>deleteWatermarkPreset</p>
     * <p>删除水印配置</p>
     *
     * <p>调用 `DeleteWatermarkPreset` 接口，删除已添加的水印配置。   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteWatermarkPresetRes deleteWatermarkPreset(DeleteWatermarkPresetBody body) throws Exception {
        RawResponse rawResponse = json("DeleteWatermarkPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteWatermarkPresetRes.class);
    }

    /**
     * <p>listWatermarkPreset</p>
     * <p>查询水印配置</p>
     *
     * <p>调用 `ListWatermarkPreset` 接口，查询单个水印配置的信息。   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListWatermarkPresetRes listWatermarkPreset(ListWatermarkPresetBody body) throws Exception {
        RawResponse rawResponse = json("ListWatermarkPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListWatermarkPresetRes.class);
    }

    /**
     * <p>listVhostWatermarkPreset</p>
     * <p>查询水印配置列表</p>
     *
     * <p>调用 `ListVhostWatermarkPreset` 接口，查询指定域名空间的所有水印配置。   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListVhostWatermarkPresetRes listVhostWatermarkPreset(ListVhostWatermarkPresetBody body) throws Exception {
        RawResponse rawResponse = json("ListVhostWatermarkPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListVhostWatermarkPresetRes.class);
    }

    /**
     * <p>stopPullRecordTask</p>
     * <p>停止直播录制任务</p>
     *
     * <p>调用 `StopPullRecordTask` 接口，终止未开始或生效中的录制任务。停止生效中的录制任务会生成录制文件。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public StopPullRecordTaskRes stopPullRecordTask(StopPullRecordTaskBody body) throws Exception {
        RawResponse rawResponse = json("StopPullRecordTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, StopPullRecordTaskRes.class);
    }

    /**
     * <p>createLiveStreamRecordIndexFiles</p>
     * <p>创建录制索引文件</p>
     *
     * <p>调用 `CreateLiveStreamRecordIndexFiles` 接口，通过已存在的录制文件重新生成指定开始时间和结束时间的 M3U8 格式录制文件，并将新生成的录制文件存储在指定的 TOS Bucket 中。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateLiveStreamRecordIndexFilesRes createLiveStreamRecordIndexFiles(CreateLiveStreamRecordIndexFilesBody body) throws Exception {
        RawResponse rawResponse = json("CreateLiveStreamRecordIndexFiles", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateLiveStreamRecordIndexFilesRes.class);
    }

    /**
     * <p>createPullRecordTask</p>
     * <p>创建直播录制任务</p>
     *
     * <p>调用 `CreatePullRecordTask` 接口，创建一个在指定时间启动和结束的直播拉流录制任务，创建成功后，可以在直播过程中录制任意时长单路直播流并保存为视频文件。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreatePullRecordTaskRes createPullRecordTask(CreatePullRecordTaskBody body) throws Exception {
        RawResponse rawResponse = json("CreatePullRecordTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreatePullRecordTaskRes.class);
    }

    /**
     * <p>deleteRecordPreset</p>
     * <p>删除录制配置</p>
     *
     * <p>调用 `DeleteRecordPreset` 接口，删除已创建的录制配置。  </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteRecordPresetRes deleteRecordPreset(DeleteRecordPresetBody body) throws Exception {
        RawResponse rawResponse = json("DeleteRecordPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteRecordPresetRes.class);
    }

    /**
     * <p>updateRecordPresetV2</p>
     * <p>更新录制配置</p>
     *
     * <p>调用 `UpdateRecordPresetV2` 接口，更新已添加的录制配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateRecordPresetV2Res updateRecordPresetV2(UpdateRecordPresetV2Body body) throws Exception {
        RawResponse rawResponse = json("UpdateRecordPresetV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateRecordPresetV2Res.class);
    }

    /**
     * <p>getPullRecordTask</p>
     * <p>查询单个直播录制任务</p>
     *
     * <p>调用 `GetPullRecordTask` 接口，查询单个直播录制任务信息。   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetPullRecordTaskRes getPullRecordTask(GetPullRecordTaskBody body) throws Exception {
        RawResponse rawResponse = json("GetPullRecordTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetPullRecordTaskRes.class);
    }

    /**
     * <p>describeRecordTaskFileHistory</p>
     * <p>查询录制历史详情</p>
     *
     * <p>调用 `DescribeRecordTaskFileHistory` 接口查询指定 `Vhost` 下的直播录制历史信息。包括但不限于录制时长、文件格式、开始时间、结束时间。   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeRecordTaskFileHistoryRes describeRecordTaskFileHistory(DescribeRecordTaskFileHistoryBody body) throws Exception {
        RawResponse rawResponse = json("DescribeRecordTaskFileHistory", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeRecordTaskFileHistoryRes.class);
    }

    /**
     * <p>listVhostRecordPresetV2</p>
     * <p>查询录制配置列表</p>
     *
     * <p>调用 `ListVhostRecordPresetV2` 接口，查询 Vhost 下的所有录制配置，包含 Vhost、Vhost + App、Vhost + App + Stream 三个级别的所有配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListVhostRecordPresetV2Res listVhostRecordPresetV2(ListVhostRecordPresetV2Body body) throws Exception {
        RawResponse rawResponse = json("ListVhostRecordPresetV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListVhostRecordPresetV2Res.class);
    }

    /**
     * <p>listPullRecordTask</p>
     * <p>查询直播录制任务</p>
     *
     * <p>调用 `ListPullRecordTask` 接口，查询当前账号下，已经创建的直播录制任务列表。   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListPullRecordTaskRes listPullRecordTask(ListPullRecordTaskBody body) throws Exception {
        RawResponse rawResponse = json("ListPullRecordTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListPullRecordTaskRes.class);
    }

    /**
     * <p>createRecordPresetV2</p>
     * <p>添加录制配置</p>
     *
     * <p>调用 `CreateRecordPresetV2` 接口创建一个录制配置，在直播流传输过程中，视频直播服务端将根据您直播流地址参数匹配录制配置，对直播流进行录制。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateRecordPresetV2Res createRecordPresetV2(CreateRecordPresetV2Body body) throws Exception {
        RawResponse rawResponse = json("CreateRecordPresetV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateRecordPresetV2Res.class);
    }

    /**
     * <p>deleteSnapshotPreset</p>
     * <p>删除截图配置</p>
     *
     * <p>调用 `DeleteSnapshotPreset` 接口，删除已添加的截图配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteSnapshotPresetRes deleteSnapshotPreset(DeleteSnapshotPresetBody body) throws Exception {
        RawResponse rawResponse = json("DeleteSnapshotPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteSnapshotPresetRes.class);
    }

    /**
     * <p>updateSnapshotPresetV2</p>
     * <p>更新截图配置</p>
     *
     * <p>调用 `UpdateSnapshotPresetV2` 接口，更新已添加的截图配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateSnapshotPresetV2Res updateSnapshotPresetV2(UpdateSnapshotPresetV2Body body) throws Exception {
        RawResponse rawResponse = json("UpdateSnapshotPresetV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateSnapshotPresetV2Res.class);
    }

    /**
     * <p>updateSnapshotPreset</p>
     * <p>更新截图配置 V1</p>
     *
     * <p>查询域名和应用关联的直播截图模版，并更新某截图模版的配置项。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>该接口属于历史版本 API，我们计划于 2024 年 04 月 25 日**停止对其进行维护**，并于 2024 年 07 月 25 日**下线文档**，建议您使用新版[UpdateSnapshotPresetV2](https://www.volcengine.com/docs/6469/1208857)接口。</p>
     *
     * <p>:::   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateSnapshotPresetRes updateSnapshotPreset(UpdateSnapshotPresetBody body) throws Exception {
        RawResponse rawResponse = json("UpdateSnapshotPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateSnapshotPresetRes.class);
    }

    /**
     * <p>describeCDNSnapshotHistory</p>
     * <p>查询截图历史详情</p>
     *
     * <p>调用 `DescribeCDNSnapshotHistory` 接口，查询直播流的截图文件信息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeCDNSnapshotHistoryRes describeCDNSnapshotHistory(DescribeCDNSnapshotHistoryBody body) throws Exception {
        RawResponse rawResponse = json("DescribeCDNSnapshotHistory", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeCDNSnapshotHistoryRes.class);
    }

    /**
     * <p>listVhostSnapshotPresetV2</p>
     * <p>查询截图配置列表</p>
     *
     * <p>调用 `ListVhostSnapshotPresetV2` 接口，查询指定 Vhost 下的所有截图配置信息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListVhostSnapshotPresetV2Res listVhostSnapshotPresetV2(ListVhostSnapshotPresetV2Body body) throws Exception {
        RawResponse rawResponse = json("ListVhostSnapshotPresetV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListVhostSnapshotPresetV2Res.class);
    }

    /**
     * <p>listVhostSnapshotPreset</p>
     * <p>查询截图配置列表 V1</p>
     *
     * <p>查询域名维度下所有的 App 名称，以及 App 关联的截图模板。   </p>
     *
     * <p>:::tip</p>
     *
     * <p>该接口属于历史版本 API，我们计划于 2024 年 04 月 25 日**停止对其进行维护**，并于 2024 年 07 月 25 日**下线文档**，建议您使用新版[ListVhostSnapshotPresetV2](https://www.volcengine.com/docs/6469/1208858)接口。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListVhostSnapshotPresetRes listVhostSnapshotPreset(ListVhostSnapshotPresetBody body) throws Exception {
        RawResponse rawResponse = json("ListVhostSnapshotPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListVhostSnapshotPresetRes.class);
    }

    /**
     * <p>createSnapshotPresetV2</p>
     * <p>添加截图配置</p>
     *
     * <p>调用 `CreateSnapshotPresetV2` 接口，添加截图配置，当直播流在截图配置生效范围内时，将对直播流进行截图保存。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateSnapshotPresetV2Res createSnapshotPresetV2(CreateSnapshotPresetV2Body body) throws Exception {
        RawResponse rawResponse = json("CreateSnapshotPresetV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateSnapshotPresetV2Res.class);
    }

    /**
     * <p>createSnapshotPreset</p>
     * <p>添加截图配置 V1</p>
     *
     * <p>调用接口添加视频直播截图配置。调用后会先增加截图模版，将新建模版加入模版库中，再将该模版绑定到对应的 App 上。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>该接口属于历史版本 API，我们计划于 2024 年 04 月 25 日**停止对其进行维护**，并于 2024 年 7 月 25 日**下线文档**，建议您使用新版[CreateSnapshotPresetV2](https://www.volcengine.com/docs/6469/1208856)接口。</p>
     *
     * <p>:::   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateSnapshotPresetRes createSnapshotPreset(CreateSnapshotPresetBody body) throws Exception {
        RawResponse rawResponse = json("CreateSnapshotPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateSnapshotPresetRes.class);
    }

    /**
     * <p>deleteTimeShiftPresetV3</p>
     * <p>删除直播时移配置</p>
     *
     * <p>调用 `DeleteTimeShiftPresetV3` 接口，删除指定的时移配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteTimeShiftPresetV3Res deleteTimeShiftPresetV3(DeleteTimeShiftPresetV3Body body) throws Exception {
        RawResponse rawResponse = json("DeleteTimeShiftPresetV3", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteTimeShiftPresetV3Res.class);
    }

    /**
     * <p>updateTimeShiftPresetV3</p>
     * <p>更新直播时移配置</p>
     *
     * <p>调用 `UpdateTimeShiftPresetV3` 接口，更新已添加的时移配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateTimeShiftPresetV3Res updateTimeShiftPresetV3(UpdateTimeShiftPresetV3Body body) throws Exception {
        RawResponse rawResponse = json("UpdateTimeShiftPresetV3", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateTimeShiftPresetV3Res.class);
    }

    /**
     * <p>listTimeShiftPresetV2</p>
     * <p>查询直播时移配置列表</p>
     *
     * <p>调用 `ListTimeShiftPresetV2` 接口，查询 vhost 下指定存储类型的时移配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListTimeShiftPresetV2Res listTimeShiftPresetV2(ListTimeShiftPresetV2Body body) throws Exception {
        RawResponse rawResponse = json("ListTimeShiftPresetV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListTimeShiftPresetV2Res.class);
    }

    /**
     * <p>createTimeShiftPresetV3</p>
     * <p>添加直播时移配置</p>
     *
     * <p>调用 `CreateTimeShiftPresetV3` 接口，添加直播时移配置，直播流配置时移后用户能够在直播过程会看已经播出的内容。   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateTimeShiftPresetV3Res createTimeShiftPresetV3(CreateTimeShiftPresetV3Body body) throws Exception {
        RawResponse rawResponse = json("CreateTimeShiftPresetV3", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateTimeShiftPresetV3Res.class);
    }

    /**
     * <p>deleteCallback</p>
     * <p>删除回调配置</p>
     *
     * <p>调用 `DeleteCallback` 接口，删除已创建的回调配置。   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteCallbackRes deleteCallback(DeleteCallbackBody body) throws Exception {
        RawResponse rawResponse = json("DeleteCallback", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteCallbackRes.class);
    }

    /**
     * <p>describeCallback</p>
     * <p>查询回调配置</p>
     *
     * <p>调用 `DescribeCallback` 接口，查询已添加的回调配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeCallbackRes describeCallback(DescribeCallbackBody body) throws Exception {
        RawResponse rawResponse = json("DescribeCallback", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeCallbackRes.class);
    }

    /**
     * <p>updateCallback</p>
     * <p>添加或更新回调配置</p>
     *
     * <p>调用 `UpdateCallback` 接口，添加或更新直播推流、直播断流、录制和截图的回调。使用此接口更新回调配置时，调用成功后，会对全部回调配置的参数做全量更新。   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateCallbackRes updateCallback(UpdateCallbackBody body) throws Exception {
        RawResponse rawResponse = json("UpdateCallback", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateCallbackRes.class);
    }

    /**
     * <p>deleteCert</p>
     * <p>删除证书</p>
     *
     * <p>调用 `DeleteCert` 接口，通过证书链 ID 删除一个已添加的证书。   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteCertRes deleteCert(DeleteCertBody body) throws Exception {
        RawResponse rawResponse = json("DeleteCert", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteCertRes.class);
    }

    /**
     * <p>describeCertDetailSecretV2</p>
     * <p>查看证书详情</p>
     *
     * <p>调用 `DescribeCertDetailSecretV2` 接口，通过证书 ID 或证书链 ID 查询证书详情。   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeCertDetailSecretV2Res describeCertDetailSecretV2(DescribeCertDetailSecretV2Body body) throws Exception {
        RawResponse rawResponse = json("DescribeCertDetailSecretV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeCertDetailSecretV2Res.class);
    }

    /**
     * <p>listCertV2</p>
     * <p>查询证书列表</p>
     *
     * <p>调用 `ListCertV2` 接口，查看当前账号下的证书列表。   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListCertV2Res listCertV2(ListCertV2Body body) throws Exception {
        RawResponse rawResponse = json("ListCertV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListCertV2Res.class);
    }

    /**
     * <p>createCert</p>
     * <p>添加证书</p>
     *
     * <p>调用 `CreateCert` 接口，添加一个证书，需要填写证书名称和证书内容等参数。   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateCertRes createCert(CreateCertBody body) throws Exception {
        RawResponse rawResponse = json("CreateCert", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateCertRes.class);
    }

    /**
     * <p>bindCert</p>
     * <p>绑定证书</p>
     *
     * <p>调用 `BindCert` 接口，为域名绑定 HTTPS 证书并启用 HTTPS 协议。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public BindCertRes bindCert(BindCertBody body) throws Exception {
        RawResponse rawResponse = json("BindCert", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, BindCertRes.class);
    }

    /**
     * <p>unbindCert</p>
     * <p>解绑证书</p>
     *
     * <p>调用 `UnbindCert` 接口，解绑域名的 HTTPS 证书。   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UnbindCertRes unbindCert(UnbindCertBody body) throws Exception {
        RawResponse rawResponse = json("UnbindCert", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UnbindCertRes.class);
    }

    /**
     * <p>deleteDomain</p>
     * <p>删除域名</p>
     *
     * <p>调用 `DeleteDomain` 接口，从视频直播服务中删除已添加的推/拉流域名，删除后无法使用此域名进行推拉流。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteDomainRes deleteDomain(DeleteDomainBody body) throws Exception {
        RawResponse rawResponse = json("DeleteDomain", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteDomainRes.class);
    }

    /**
     * <p>enableDomain</p>
     * <p>启用域名</p>
     *
     * <p>调用 `EnableDomain` 接口，启用指定的已被禁用的直播域名。启用后，您可以继续使用此域名进行推拉流，域名状态从`2-禁用状态`变为`0-正常状态`。   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public EnableDomainRes enableDomain(EnableDomainBody body) throws Exception {
        RawResponse rawResponse = json("EnableDomain", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, EnableDomainRes.class);
    }

    /**
     * <p>createDomainV2</p>
     * <p>批量添加域名</p>
     *
     * <p>调用 `CreateDomainV2` 接口，批量添加域名到视频直播服务，并配置加速区域。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateDomainV2Res createDomainV2(CreateDomainV2Body body) throws Exception {
        RawResponse rawResponse = json("CreateDomainV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateDomainV2Res.class);
    }

    /**
     * <p>updateDomainVhost</p>
     * <p>更新域名的域名空间</p>
     *
     * <p>调用 `UpdateDomainVhost` 接口，修改推流域名或拉流域名所属的域名空间。   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateDomainVhostRes updateDomainVhost(UpdateDomainVhostBody body) throws Exception {
        RawResponse rawResponse = json("UpdateDomainVhost", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateDomainVhostRes.class);
    }

    /**
     * <p>describeDomain</p>
     * <p>查询域名信息</p>
     *
     * <p>调用 `DescribeDomain` 接口，查询域名的详细信息，包括但不限于域名所属域名空间、CNAME、类型、域名状态。   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeDomainRes describeDomain(DescribeDomainBody body) throws Exception {
        RawResponse rawResponse = json("DescribeDomain", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeDomainRes.class);
    }

    /**
     * <p>listDomainDetail</p>
     * <p>查询域名列表</p>
     *
     * <p>调用 `ListDomainDetail` 接口，根据域名状态、类别等信息，查询当前账号下的的域名列表信息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListDomainDetailRes listDomainDetail(ListDomainDetailBody body) throws Exception {
        RawResponse rawResponse = json("ListDomainDetail", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListDomainDetailRes.class);
    }

    /**
     * <p>createDomain</p>
     * <p>添加域名</p>
     *
     * <p>调用 `CreateDomain` 接口，将待使用的推拉流域名添加到视频直播服务，并为域名选择加速区域。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateDomainRes createDomain(CreateDomainBody body) throws Exception {
        RawResponse rawResponse = json("CreateDomain", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateDomainRes.class);
    }

    /**
     * <p>disableDomain</p>
     * <p>禁用域名</p>
     *
     * <p>调用 `DisableDomain` 接口，禁用指定的直播域名。禁用后，无法使用此域名进行推拉流，且域名状态从 `0-正常状态`变为 `2-禁用状态`。   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DisableDomainRes disableDomain(DisableDomainBody body) throws Exception {
        RawResponse rawResponse = json("DisableDomain", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DisableDomainRes.class);
    }

    /**
     * <p>createLiveVideoQualityAnalysisTask</p>
     * <p>创建画质测评任务</p>
     *
     * <p>调用 `CreateLiveVideoQualityAnalysisTask` 接口，创建一个指定时长的画质测评任务。任务将根据您设置的测评间隔获取每个测评点的实时码率，并对测评点的画面画质进行评分，您可以使用查询单个画质测评任务详情接口来查看测评结果。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateLiveVideoQualityAnalysisTaskRes createLiveVideoQualityAnalysisTask(CreateLiveVideoQualityAnalysisTaskBody body) throws Exception {
        RawResponse rawResponse = json("CreateLiveVideoQualityAnalysisTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateLiveVideoQualityAnalysisTaskRes.class);
    }

    /**
     * <p>deleteLiveVideoQualityAnalysisTask</p>
     * <p>删除画质测评任务</p>
     *
     * <p>调用 `DeleteLiveVideoQualityAnalysisTask` 接口，删除画质测评任务，您可以删除已完成的和进行中的任务。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteLiveVideoQualityAnalysisTaskRes deleteLiveVideoQualityAnalysisTask(DeleteLiveVideoQualityAnalysisTaskBody body) throws Exception {
        RawResponse rawResponse = json("DeleteLiveVideoQualityAnalysisTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteLiveVideoQualityAnalysisTaskRes.class);
    }

    /**
     * <p>getLiveVideoQualityAnalysisTaskDetail</p>
     * <p>查询单个画质测评任务详情</p>
     *
     * <p>调用 `GetLiveVideoQualityAnalysisTaskDetail` 接口，查询单个画质测评任务的测评详情，包含指定截图时间获取的视频码率和画质测试分数。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetLiveVideoQualityAnalysisTaskDetailRes getLiveVideoQualityAnalysisTaskDetail(GetLiveVideoQualityAnalysisTaskDetailBody body) throws Exception {
        RawResponse rawResponse = json("GetLiveVideoQualityAnalysisTaskDetail", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetLiveVideoQualityAnalysisTaskDetailRes.class);
    }

    /**
     * <p>listLiveVideoQualityAnalysisTasks</p>
     * <p>查询画质测评任务列表</p>
     *
     * <p>调用 `ListLiveVideoQualityAnalysisTasks` 接口，查询画质测评任务列表信息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListLiveVideoQualityAnalysisTasksRes listLiveVideoQualityAnalysisTasks(ListLiveVideoQualityAnalysisTasksBody body) throws Exception {
        RawResponse rawResponse = json("ListLiveVideoQualityAnalysisTasks", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListLiveVideoQualityAnalysisTasksRes.class);
    }

    /**
     * <p>stopPullToPushTask</p>
     * <p>停用拉流转推任务</p>
     *
     * <p>调用 `StopPullToPushTask` 接口，停用状态为未开始或生效中的拉流转推任务。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public StopPullToPushTaskRes stopPullToPushTask(StopPullToPushTaskBody body) throws Exception {
        RawResponse rawResponse = json("StopPullToPushTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, StopPullToPushTaskRes.class);
    }

    /**
     * <p>createPullToPushTask</p>
     * <p>创建拉流转推任务</p>
     *
     * <p>调用 `CreatePullToPushTask` 接口，创建拉流转推任务，将其他直播源或点播视频以直播形式推送到指定地址，同时支持为转推视频添加水印。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreatePullToPushTaskRes createPullToPushTask(CreatePullToPushTaskBody body) throws Exception {
        RawResponse rawResponse = json("CreatePullToPushTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreatePullToPushTaskRes.class);
    }

    /**
     * <p>deletePullToPushTask</p>
     * <p>删除拉流转推任务</p>
     *
     * <p>调用 `DeletePullToPushTask` 接口，删除已创建的拉流转推任务。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeletePullToPushTaskRes deletePullToPushTask(DeletePullToPushTaskBody body) throws Exception {
        RawResponse rawResponse = json("DeletePullToPushTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeletePullToPushTaskRes.class);
    }

    /**
     * <p>restartPullToPushTask</p>
     * <p>启用拉流转推任务</p>
     *
     * <p>调用 `RestartPullToPushTask` 接口，启用任务状态为已停用的拉流转推任务。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public RestartPullToPushTaskRes restartPullToPushTask(RestartPullToPushTaskBody body) throws Exception {
        RawResponse rawResponse = json("RestartPullToPushTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, RestartPullToPushTaskRes.class);
    }

    /**
     * <p>updatePullToPushTask</p>
     * <p>更新拉流转推任务</p>
     *
     * <p>调用 `UpdatePullToPushTask` 接口，更新拉流转推任务信息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdatePullToPushTaskRes updatePullToPushTask(UpdatePullToPushTaskBody body) throws Exception {
        RawResponse rawResponse = json("UpdatePullToPushTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdatePullToPushTaskRes.class);
    }

    /**
     * <p>listPullToPushTask</p>
     * <p>获取拉流转推任务列表</p>
     *
     * <p>调用 `ListPullToPushTask` 接口，分页查询拉流转推任务列表，支持以任务名称进行模糊查询。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public ListPullToPushTaskRes listPullToPushTask(ListPullToPushTaskQuery query) throws Exception {
        RawResponse rawResponse = json("ListPullToPushTask", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, ListPullToPushTaskRes.class);
    }

    /**
     * <p>deleteRelaySourceV4</p>
     * <p>删除固定回源配置</p>
     *
     * <p>调用 `DeleteRelaySourceV4` 接口，删除已添加的固定回源配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteRelaySourceV4Res deleteRelaySourceV4(DeleteRelaySourceV4Body body) throws Exception {
        RawResponse rawResponse = json("DeleteRelaySourceV4", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteRelaySourceV4Res.class);
    }

    /**
     * <p>deleteRelaySourceV3</p>
     * <p>删除播放触发回源配置</p>
     *
     * <p>调用 `DeleteRelaySourceV3` 接口，删除播放触发回源配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteRelaySourceV3Res deleteRelaySourceV3(DeleteRelaySourceV3Body body) throws Exception {
        RawResponse rawResponse = json("DeleteRelaySourceV3", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteRelaySourceV3Res.class);
    }

    /**
     * <p>updateRelaySourceV4</p>
     * <p>更新固定回源配置</p>
     *
     * <p>调用 `UpdateRelaySourceV4` 接口，更新已添加的固定回源配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateRelaySourceV4Res updateRelaySourceV4(UpdateRelaySourceV4Body body) throws Exception {
        RawResponse rawResponse = json("UpdateRelaySourceV4", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateRelaySourceV4Res.class);
    }

    /**
     * <p>listRelaySourceV4</p>
     * <p>查询固定回源配置列表</p>
     *
     * <p>调用 `ListRelaySourceV4` 接口，查询固定回源配置列表。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListRelaySourceV4Res listRelaySourceV4(ListRelaySourceV4Body body) throws Exception {
        RawResponse rawResponse = json("ListRelaySourceV4", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListRelaySourceV4Res.class);
    }

    /**
     * <p>describeRelaySourceV3</p>
     * <p>查询播放触发回源配置</p>
     *
     * <p>调用 `DescribeRelaySourceV3` 接口，查询播放触发回源配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeRelaySourceV3Res describeRelaySourceV3(DescribeRelaySourceV3Body body) throws Exception {
        RawResponse rawResponse = json("DescribeRelaySourceV3", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeRelaySourceV3Res.class);
    }

    /**
     * <p>createRelaySourceV4</p>
     * <p>添加固定回源配置</p>
     *
     * <p>调用 `CreateRelaySourceV4` 接口，添加固定触发回源配置，固定触发指根据您设置的回源时间定时从源服务器拉取直播流数据，不论是否有观众观看；这种方式可以确保 CDN 节点始终拥有最新的直播流数据，降低观众在观看时的等待时间，提高观看体验。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateRelaySourceV4Res createRelaySourceV4(CreateRelaySourceV4Body body) throws Exception {
        RawResponse rawResponse = json("CreateRelaySourceV4", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateRelaySourceV4Res.class);
    }

    /**
     * <p>updateRelaySourceV3</p>
     * <p>添加或更新播放触发回源配置</p>
     *
     * <p>调用 `UpdateRelaySourceV3` 接口，添加或更新播放触发回源配置，播放触发指回源仅在有观众观看时才会触发，可以节省源服务器的带宽资源，提高系统的整体效率。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateRelaySourceV3Res updateRelaySourceV3(UpdateRelaySourceV3Body body) throws Exception {
        RawResponse rawResponse = json("UpdateRelaySourceV3", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateRelaySourceV3Res.class);
    }

    /**
     * <p>killStream</p>
     * <p>断开直播流</p>
     *
     * <p>调用接口断开指定的在线流。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public KillStreamRes killStream(KillStreamBody body) throws Exception {
        RawResponse rawResponse = json("KillStream", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, KillStreamRes.class);
    }

    /**
     * <p>describeClosedStreamInfoByPage</p>
     * <p>查询历史流列表</p>
     *
     * <p>调用 `DescribeClosedStreamInfoByPage` 接口，分页查询历史流信息。   </p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeClosedStreamInfoByPageRes describeClosedStreamInfoByPage(DescribeClosedStreamInfoByPageQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeClosedStreamInfoByPage", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeClosedStreamInfoByPageRes.class);
    }

    /**
     * <p>describeLiveStreamInfoByPage</p>
     * <p>查询在线流列表</p>
     *
     * <p>调用 `DescribeLiveStreamInfoByPage` 接口，分页查询在线流信息。   </p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveStreamInfoByPageRes describeLiveStreamInfoByPage(DescribeLiveStreamInfoByPageQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeLiveStreamInfoByPage", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeLiveStreamInfoByPageRes.class);
    }

    /**
     * <p>describeLiveStreamState</p>
     * <p>查询流状态</p>
     *
     * <p>调用 `DescribeLiveStreamState` 接口，查询直播流类型和状态。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveStreamStateRes describeLiveStreamState(DescribeLiveStreamStateQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeLiveStreamState", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeLiveStreamStateRes.class);
    }

    /**
     * <p>describeForbiddenStreamInfoByPage</p>
     * <p>查询禁推流列表</p>
     *
     * <p>调用 `DescribeForbiddenStreamInfoByPage` 接口，分页查询禁推流信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeForbiddenStreamInfoByPageRes describeForbiddenStreamInfoByPage(DescribeForbiddenStreamInfoByPageQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeForbiddenStreamInfoByPage", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeForbiddenStreamInfoByPageRes.class);
    }

    /**
     * <p>forbidStream</p>
     * <p>禁推直播流</p>
     *
     * <p>调用 `ForbidStream` 接口，禁止直推流的推送或禁止回源流的拉流播放，支持设置禁推结束时间。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ForbidStreamRes forbidStream(ForbidStreamBody body) throws Exception {
        RawResponse rawResponse = json("ForbidStream", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ForbidStreamRes.class);
    }

    /**
     * <p>resumeStream</p>
     * <p>解禁直播流</p>
     *
     * <p>调用接口指定某个被禁推的直播流，恢复该直播流的推流。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ResumeStreamRes resumeStream(ResumeStreamBody body) throws Exception {
        RawResponse rawResponse = json("ResumeStream", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ResumeStreamRes.class);
    }

    /**
     * <p>generatePlayURL</p>
     * <p>生成拉流地址</p>
     *
     * <p>调用 `GeneratePlayURL` 接口，生成直播拉流地址。   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GeneratePlayURLRes generatePlayURL(GeneratePlayURLBody body) throws Exception {
        RawResponse rawResponse = json("GeneratePlayURL", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GeneratePlayURLRes.class);
    }

    /**
     * <p>generatePushURL</p>
     * <p>生成推流地址</p>
     *
     * <p>调用 `GeneratePushURL` 接口，生成直播推流地址。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GeneratePushURLRes generatePushURL(GeneratePushURLBody body) throws Exception {
        RawResponse rawResponse = json("GeneratePushURL", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GeneratePushURLRes.class);
    }

    /**
     * <p>deleteStreamQuotaConfig</p>
     * <p>删除推拉流限额配置</p>
     *
     * <p>调用 `DeleteStreamQuotaConfig` 接口，删除指定推流域名的推流路数限额配置或删除指定拉流域名的拉流带宽限额配置。      </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteStreamQuotaConfigRes deleteStreamQuotaConfig(DeleteStreamQuotaConfigBody body) throws Exception {
        RawResponse rawResponse = json("DeleteStreamQuotaConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteStreamQuotaConfigRes.class);
    }

    /**
     * <p>describeStreamQuotaConfig</p>
     * <p>查询推拉流限流配置</p>
     *
     * <p>调用 `DescribeStreamQuotaConfig` 接口，查询指定推流域名的推流路数限额配置或查询指定拉流域名的拉流带宽限额配置。   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeStreamQuotaConfigRes describeStreamQuotaConfig(DescribeStreamQuotaConfigBody body) throws Exception {
        RawResponse rawResponse = json("DescribeStreamQuotaConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeStreamQuotaConfigRes.class);
    }

    /**
     * <p>updateStreamQuotaConfig</p>
     * <p>添加或更新推拉流限额配置</p>
     *
     * <p>调用 `UpdateStreamQuotaConfig` 接口，为域名设置限额。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateStreamQuotaConfigRes updateStreamQuotaConfig(UpdateStreamQuotaConfigBody body) throws Exception {
        RawResponse rawResponse = json("UpdateStreamQuotaConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateStreamQuotaConfigRes.class);
    }

    /**
     * <p>deleteSnapshotAuditPreset</p>
     * <p>删除截图审核配置</p>
     *
     * <p>调用 `DeleteSnapshotAuditPreset` 接口，删除已添加的截图审核配置。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteSnapshotAuditPresetRes deleteSnapshotAuditPreset(DeleteSnapshotAuditPresetBody body) throws Exception {
        RawResponse rawResponse = json("DeleteSnapshotAuditPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteSnapshotAuditPresetRes.class);
    }

    /**
     * <p>updateSnapshotAuditPreset</p>
     * <p>更新截图审核配置</p>
     *
     * <p>调用 `UpdateSnapshotAuditPreset` 接口，更新已添加的截图审核配置。  </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateSnapshotAuditPresetRes updateSnapshotAuditPreset(UpdateSnapshotAuditPresetBody body) throws Exception {
        RawResponse rawResponse = json("UpdateSnapshotAuditPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateSnapshotAuditPresetRes.class);
    }

    /**
     * <p>listVhostSnapshotAuditPreset</p>
     * <p>查询截图审核配置列表</p>
     *
     * <p>调用 `ListVhostSnapshotAuditPreset` 接口，查询截图审核配置列表。  </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListVhostSnapshotAuditPresetRes listVhostSnapshotAuditPreset(ListVhostSnapshotAuditPresetBody body) throws Exception {
        RawResponse rawResponse = json("ListVhostSnapshotAuditPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListVhostSnapshotAuditPresetRes.class);
    }

    /**
     * <p>createSnapshotAuditPreset</p>
     * <p>添加截图审核配置</p>
     *
     * <p>调用 `CreateSnapshotAuditPreset` 接口，添加截图审核配置，当直播流在截图审核配置生效范围内时，将对直播流进行截图审核。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateSnapshotAuditPresetRes createSnapshotAuditPreset(CreateSnapshotAuditPresetBody body) throws Exception {
        RawResponse rawResponse = json("CreateSnapshotAuditPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateSnapshotAuditPresetRes.class);
    }

    /**
     * <p>describeIpInfo</p>
     * <p>查询 IP 地址归属的 CDN 节点</p>
     *
     * <p>调用 `DescribeIpInfo` 接口，查询 IP 地址是否为火山引擎归属的 CDN 节点，以及节点的区域和运营商信息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeIpInfoRes describeIpInfo(DescribeIpInfoBody body) throws Exception {
        RawResponse rawResponse = json("DescribeIpInfo", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeIpInfoRes.class);
    }

    /**
     * <p>describeLiveRegionData</p>
     * <p>查询区域标识符</p>
     *
     * <p>调用 `DescribeLiveRegionData` 接口，查询火山引擎视频直播服务覆盖的区域标识符。获取区域标识符后您可以在支持以区域为查询维度的接口中使用区域标识符查询指定区域的维度数据。</p>
     *
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveRegionDataRes describeLiveRegionData() throws Exception {
        RawResponse rawResponse = json("DescribeLiveRegionData", null, "");
        return parseRawResponse(rawResponse, DescribeLiveRegionDataRes.class);
    }

    /**
     * <p>describeLiveSourceStreamMetrics</p>
     * <p>查询单路回源流监控数据</p>
     *
     * <p>调用 `DescribeLiveSourceStreamMetrics` 接口，查询指定时间范围内单路回源流的音视频帧率、码率等监控数据，用于判断回源流的健康程度。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveSourceStreamMetricsRes describeLiveSourceStreamMetrics(DescribeLiveSourceStreamMetricsBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveSourceStreamMetrics", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveSourceStreamMetricsRes.class);
    }

    /**
     * <p>describeLivePushStreamMetrics</p>
     * <p>查询单路推流监控数据</p>
     *
     * <p>调用 `DescribeLivePushStreamMetrics` 接口，查询指定时间范围内单路直推流的音视频帧率、码率等监控数据，用于判断直播流的健康程度。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLivePushStreamMetricsRes describeLivePushStreamMetrics(DescribeLivePushStreamMetricsBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLivePushStreamMetrics", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLivePushStreamMetricsRes.class);
    }

    /**
     * <p>describeLiveBatchStreamSessionData</p>
     * <p>查询域名下所有直播流的拉流数据</p>
     *
     * <p>调用 `DescribeLiveBatchStreamSessionData` 接口，查询指定时间范围内域名下所有直播流的请求数和最大在线人数。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveBatchStreamSessionDataRes describeLiveBatchStreamSessionData(DescribeLiveBatchStreamSessionDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveBatchStreamSessionData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveBatchStreamSessionDataRes.class);
    }

    /**
     * <p>describeLiveStreamSessionData</p>
     * <p>查询域名或单个直播流的拉流数据</p>
     *
     * <p>调用 `DescribeLiveStreamSessionData` 接口，查询指定时间范围内域名下所有直播流或指定直播流的请求数和最大在线人数。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveStreamSessionDataRes describeLiveStreamSessionData(DescribeLiveStreamSessionDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveStreamSessionData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveStreamSessionDataRes.class);
    }

    /**
     * <p>describeLivePlayStatusCodeData</p>
     * <p>查询域名状态码占比</p>
     *
     * <p>调用 `DescribeLivePlayStatusCodeData` 接口，查询指定时间范围内域名请求的状态码占比数据，包含推流请求、拉流请求和回源请求。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLivePlayStatusCodeDataRes describeLivePlayStatusCodeData(DescribeLivePlayStatusCodeDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLivePlayStatusCodeData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLivePlayStatusCodeDataRes.class);
    }

    /**
     * <p>describeLiveBatchSourceStreamMetrics</p>
     * <p>查询多路回源流监控数据</p>
     *
     * <p>调用 `DescribeLiveBatchSourceStreamMetrics` 接口，查询指定时间范围内指定拉流域名下所有回源流或指定回源流的音视频帧率、码率等监控数据，用于判断回源流的健康程度。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveBatchSourceStreamMetricsRes describeLiveBatchSourceStreamMetrics(DescribeLiveBatchSourceStreamMetricsBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveBatchSourceStreamMetrics", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveBatchSourceStreamMetricsRes.class);
    }

    /**
     * <p>describeLiveBatchSourceStreamAvgMetrics</p>
     * <p>查询多路回源流监控数据平均值指标</p>
     *
     * <p>调用 `DescribeLiveBatchSourceStreamAvgMetrics` 接口，查询指定时间范围内指定拉流域名下所有回源流或指定回源流的音视频帧率、码率等监控数据的平均值，用于判断回源流的健康程度。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveBatchSourceStreamAvgMetricsRes describeLiveBatchSourceStreamAvgMetrics(DescribeLiveBatchSourceStreamAvgMetricsBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveBatchSourceStreamAvgMetrics", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveBatchSourceStreamAvgMetricsRes.class);
    }

    /**
     * <p>describeLiveBatchPushStreamMetrics</p>
     * <p>查询多路推流监控数据</p>
     *
     * <p>调用 `DescribeLiveBatchPushStreamMetrics` 接口，查询指定时间范围内指定推流域名下所有直推流或指定直推流的音视频帧率、码率等监控数据，用于判断直播流的健康程度。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveBatchPushStreamMetricsRes describeLiveBatchPushStreamMetrics(DescribeLiveBatchPushStreamMetricsBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveBatchPushStreamMetrics", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveBatchPushStreamMetricsRes.class);
    }

    /**
     * <p>describeLiveBatchPushStreamAvgMetrics</p>
     * <p>查询多路推流监控数据平均值</p>
     *
     * <p>调用 `DescribeLiveBatchPushStreamAvgMetrics` 接口，查询指定时间范围内指定推流域名下所有直推流或指定直推流的音视频帧率、码率等监控数据的平均值，用于判断直播流的健康程度。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveBatchPushStreamAvgMetricsRes describeLiveBatchPushStreamAvgMetrics(DescribeLiveBatchPushStreamAvgMetricsBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveBatchPushStreamAvgMetrics", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveBatchPushStreamAvgMetricsRes.class);
    }

    /**
     * <p>describeLiveStreamCountData</p>
     * <p>查询峰值流数</p>
     *
     * <p>调用 `DescribeLiveStreamCountData` 接口，查询时间范围内指定推流、回源流或转码流的峰值数量。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveStreamCountDataRes describeLiveStreamCountData(DescribeLiveStreamCountDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveStreamCountData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveStreamCountDataRes.class);
    }

    /**
     * <p>describeLivePushStreamCountData</p>
     * <p>查询推流峰值流数</p>
     *
     * <p>调用 `DescribeLivePushStreamCountData` 接口，查询指定时间范围内推流域名下推流数量的峰值。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLivePushStreamCountDataRes describeLivePushStreamCountData(DescribeLivePushStreamCountDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLivePushStreamCountData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLivePushStreamCountDataRes.class);
    }

    /**
     * <p>describeLivePushStreamInfoData</p>
     * <p>查询推流流信息</p>
     *
     * <p>调用 `DescribeLivePushStreamInfoData` 接口，查询已断开的推流流信息以及推流断开的原因。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLivePushStreamInfoDataRes describeLivePushStreamInfoData(DescribeLivePushStreamInfoDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLivePushStreamInfoData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLivePushStreamInfoDataRes.class);
    }

    /**
     * <p>describeLiveTranscodeInfoData</p>
     * <p>查询直播域名转码数据明细</p>
     *
     * <p>调用 `DescribeLiveTranscodeInfoData` 接口，查询指定时间范围内直播域名或直播流的转码任务 ID、流名称、转码后缀、转码开始时间和结束时间数据等明细数据。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveTranscodeInfoDataRes describeLiveTranscodeInfoData(DescribeLiveTranscodeInfoDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveTranscodeInfoData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveTranscodeInfoDataRes.class);
    }

    /**
     * <p>describeLiveSourceBandwidthData</p>
     * <p>查询直播流或域名的回源带宽监控数据</p>
     *
     * <p>调用 `DescribeLiveSourceBandwidthData` 接口，查询指定时间范围内拉流域名或回源流产生的回源带宽监控数据。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveSourceBandwidthDataRes describeLiveSourceBandwidthData(DescribeLiveSourceBandwidthDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveSourceBandwidthData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveSourceBandwidthDataRes.class);
    }

    /**
     * <p>describeLiveSourceTrafficData</p>
     * <p>查询直播流或域名的回源流量监控数据</p>
     *
     * <p>调用 `DescribeLiveSourceTrafficData` 接口，查询指定时间范围内拉流域名或回源流产生的回源流量监控数据。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveSourceTrafficDataRes describeLiveSourceTrafficData(DescribeLiveSourceTrafficDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveSourceTrafficData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveSourceTrafficDataRes.class);
    }

    /**
     * <p>describeLiveMetricBandwidthData</p>
     * <p>查询直播流或域名的带宽监控数据</p>
     *
     * <p>调用 `DescribeLiveMetricBandwidthData` 接口，查询指定时间范围内直播域名或直播流的带宽监控数据。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveMetricBandwidthDataRes describeLiveMetricBandwidthData(DescribeLiveMetricBandwidthDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveMetricBandwidthData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveMetricBandwidthDataRes.class);
    }

    /**
     * <p>describeLiveMetricTrafficData</p>
     * <p>查询直播流或域名的流量监控数据</p>
     *
     * <p>调用 `DescribeLiveMetricTrafficData` 接口，查询指定时间范围内直播域名或直播流的流量监控数据。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveMetricTrafficDataRes describeLiveMetricTrafficData(DescribeLiveMetricTrafficDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveMetricTrafficData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveMetricTrafficDataRes.class);
    }

    /**
     * <p>describeLiveBatchStreamTrafficData</p>
     * <p>查询直播流的流量数据</p>
     *
     * <p>调用 `DescribeLiveBatchStreamTrafficData` 接口，查询指定时间范围内的上下行流量数据及其详细数据。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveBatchStreamTrafficDataRes describeLiveBatchStreamTrafficData(DescribeLiveBatchStreamTrafficDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveBatchStreamTrafficData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveBatchStreamTrafficDataRes.class);
    }

    /**
     * <p>describeLiveISPData</p>
     * <p>查询运营商标识符</p>
     *
     * <p>调用 `DescribeLiveISPData` 接口，查询所有为火山引擎视频直播提供网络接入服务的运营商标识符。获取运营商标识符后您可以在支持以运营商为查询维度的接口中使用运营商标识符查询指定运营商的维度数据。</p>
     *
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveISPDataRes describeLiveISPData() throws Exception {
        RawResponse rawResponse = json("DescribeLiveISPData", null, "");
        return parseRawResponse(rawResponse, DescribeLiveISPDataRes.class);
    }

    /**
     * <p>describeLiveP95PeakBandwidthData</p>
     * <p>查询 95 带宽峰值</p>
     *
     * <p>调用 `DescribeLiveP95PeakBandwidthData` 接口，查询指定时间范围内直播域名产生的 95 峰值带宽用量，包含推流域名的上行 95 峰值带宽和拉流域名的下行 95 峰值带宽。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveP95PeakBandwidthDataRes describeLiveP95PeakBandwidthData(DescribeLiveP95PeakBandwidthDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveP95PeakBandwidthData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveP95PeakBandwidthDataRes.class);
    }

    /**
     * <p>describeLiveAuditData</p>
     * <p>查询截图审核用量</p>
     *
     * <p>调用 `DescribeLiveAuditData` 接口，查询指定时间内直播域名产生的截图审核张数用量。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveAuditDataRes describeLiveAuditData(DescribeLiveAuditDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveAuditData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveAuditDataRes.class);
    }

    /**
     * <p>describeLivePullToPushBandwidthData</p>
     * <p>查询拉流转推带宽用量</p>
     *
     * <p>调用 `DescribeLivePullToPushBandwidthData` 接口，查询指定时间范围内拉流转推至第三方域名时产生的拉流转推带宽用量。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLivePullToPushBandwidthDataRes describeLivePullToPushBandwidthData(DescribeLivePullToPushBandwidthDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLivePullToPushBandwidthData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLivePullToPushBandwidthDataRes.class);
    }

    /**
     * <p>describeLivePullToPushData</p>
     * <p>查询拉流转推时长用量</p>
     *
     * <p>调用 `DescribeLivePullToPushData` 接口，查询指定时间范围内产生的所有拉流转推任务进行时长用量。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLivePullToPushDataRes describeLivePullToPushData(DescribeLivePullToPushDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLivePullToPushData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLivePullToPushDataRes.class);
    }

    /**
     * <p>describeLiveBandwidthData</p>
     * <p>查询直播域名带宽用量</p>
     *
     * <p>调用 `DescribeLiveBandwidthData` 接口，查询指定时间范围内直播域名带宽用量，包含推流域名的上行峰值带宽和拉流域名的下行峰值带宽。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveBandwidthDataRes describeLiveBandwidthData(DescribeLiveBandwidthDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveBandwidthData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveBandwidthDataRes.class);
    }

    /**
     * <p>describeLiveRecordData</p>
     * <p>查询直播域名录制用量</p>
     *
     * <p>调用 `DescribeLiveRecordData` 接口，查询指定时间范围内直播域名录制用量即录制并发路数的最大值。</p>
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
     * <p>describeLiveSnapshotData</p>
     * <p>查询直播域名截图张数</p>
     *
     * <p>调用 `DescribeLiveSnapshotData` 接口，查询指定时间范围内直播域名使用截图功能产生的截图张数。</p>
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
     * <p>describeLiveTrafficData</p>
     * <p>查询直播域名流量用量</p>
     *
     * <p>调用 `DescribeLiveTrafficData` 接口，查询指定时间范围内直播域名流量用量，包含推流域名的上行流量数据和拉流域名的下行流量数据。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveTrafficDataRes describeLiveTrafficData(DescribeLiveTrafficDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveTrafficData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveTrafficDataRes.class);
    }

    /**
     * <p>describeLiveTranscodeData</p>
     * <p>查询直播域名转码用量</p>
     *
     * <p>调用 `DescribeLiveTranscodeData` 接口，查询指定时间范围内直播域名的转码时长用量。</p>
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
     * <p>describeLiveTimeShiftData</p>
     * <p>查询直播时移存储用量</p>
     *
     * <p>调用 `DescribeLiveTimeShiftData` 接口，查询指定时间范围内直播时移功能产生的存储用量。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveTimeShiftDataRes describeLiveTimeShiftData(DescribeLiveTimeShiftDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveTimeShiftData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveTimeShiftDataRes.class);
    }

    /**
     * <p>describeLiveLogData</p>
     * <p>查询日志文件信息</p>
     *
     * <p>调用 `DescribeLiveLogData` 接口，查询指定时间范围内指定日志类型的离线日志文件及下载信息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveLogDataRes describeLiveLogData(DescribeLiveLogDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveLogData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveLogDataRes.class);
    }

    /**
     * <p>deleteReferer</p>
     * <p>删除 Referer 黑白名单</p>
     *
     * <p>调用 `DeleteReferer` 接口，删除 Referer 防盗链配置。   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteRefererRes deleteReferer(DeleteRefererBody body) throws Exception {
        RawResponse rawResponse = json("DeleteReferer", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteRefererRes.class);
    }

    /**
     * <p>describeDenyConfig</p>
     * <p>查询 IP 黑白名单</p>
     *
     * <p>调用接口查询 IP 黑白名单配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeDenyConfigRes describeDenyConfig(DescribeDenyConfigBody body) throws Exception {
        RawResponse rawResponse = json("DescribeDenyConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeDenyConfigRes.class);
    }

    /**
     * <p>describeReferer</p>
     * <p>查询 Referer 黑白名单</p>
     *
     * <p>调用 `DescribeReferer` 接口，查看 Referer 防盗链配置。   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeRefererRes describeReferer(DescribeRefererBody body) throws Exception {
        RawResponse rawResponse = json("DescribeReferer", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeRefererRes.class);
    }

    /**
     * <p>describeAuth</p>
     * <p>查询推拉流鉴权</p>
     *
     * <p>调用 `DescribeAuth` 接口，查询推拉流域名的 URL 鉴权配置。   </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeAuthRes describeAuth(DescribeAuthBody body) throws Exception {
        RawResponse rawResponse = json("DescribeAuth", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeAuthRes.class);
    }

    /**
     * <p>updateDenyConfig</p>
     * <p>添加或更新 IP 黑白名单</p>
     *
     * <p>如果设置黑名单，黑名单中外 IP 会被允许访问。如果设置白名单，白名单中内 IP 允许访问。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateDenyConfigRes updateDenyConfig(UpdateDenyConfigBody body) throws Exception {
        RawResponse rawResponse = json("UpdateDenyConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateDenyConfigRes.class);
    }

    /**
     * <p>updateReferer</p>
     * <p>添加或更新 Referer 黑白名单</p>
     *
     * <p>调用 `UpdateReferer` 接口，添加或更新 Referer 防盗链配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateRefererRes updateReferer(UpdateRefererBody body) throws Exception {
        RawResponse rawResponse = json("UpdateReferer", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateRefererRes.class);
    }

    /**
     * <p>updateAuthKey</p>
     * <p>添加或更新推拉流鉴权</p>
     *
     * <p>调用 `UpdateAuthKey` 接口，为推拉流域名创建或更新 URL 鉴权配置。使用此接口更新鉴权配置时，调用成功后，会对全部鉴权参数做全量更新。  </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateAuthKeyRes updateAuthKey(UpdateAuthKeyBody body) throws Exception {
        RawResponse rawResponse = json("UpdateAuthKey", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateAuthKeyRes.class);
    }

    /**
     * <p>deleteHTTPHeaderConfig</p>
     * <p>删除 HTTP Header 配置</p>
     *
     * <p>调用 `DeleteHTTPHeaderConfig` 接口，删除拉流域名的 HTTP Header 配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteHTTPHeaderConfigRes deleteHTTPHeaderConfig(DeleteHTTPHeaderConfigBody body) throws Exception {
        RawResponse rawResponse = json("DeleteHTTPHeaderConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteHTTPHeaderConfigRes.class);
    }

    /**
     * <p>enableHTTPHeaderConfig</p>
     * <p>启用或禁用 HTTP Header 配置</p>
     *
     * <p>调用 `EnableHTTPHeaderConfig` 接口，启用或禁用拉流域名的 HTTP Header 配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public EnableHTTPHeaderConfigRes enableHTTPHeaderConfig(EnableHTTPHeaderConfigBody body) throws Exception {
        RawResponse rawResponse = json("EnableHTTPHeaderConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, EnableHTTPHeaderConfigRes.class);
    }

    /**
     * <p>describeHTTPHeaderConfig</p>
     * <p>查询 HTTP Header 配置</p>
     *
     * <p>调用 `DescribeHTTPHeaderConfig` 接口，查询拉流域名的 HTTP Header 配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeHTTPHeaderConfigRes describeHTTPHeaderConfig(DescribeHTTPHeaderConfigBody body) throws Exception {
        RawResponse rawResponse = json("DescribeHTTPHeaderConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeHTTPHeaderConfigRes.class);
    }

    /**
     * <p>updateHTTPHeaderConfig</p>
     * <p>添加或更新 HTTP header 配置</p>
     *
     * <p>调用 `UpdateHTTPHeaderConfig` 接口，为拉流域名添加或更新 HTTP Header 配置。HTTP Header 配置包括在响应拉流请求时的响应 Header 配置和在请求回源服务器时的请求头 Header 配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateHTTPHeaderConfigRes updateHTTPHeaderConfig(UpdateHTTPHeaderConfigBody body) throws Exception {
        RawResponse rawResponse = json("UpdateHTTPHeaderConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateHTTPHeaderConfigRes.class);
    }

    /**
     * <p>updateEncryptDRM</p>
     * <p>更新 DRM 证书管理平台访问密钥和 FairPlay 证书</p>
     *
     * <p>调用 `UpdateEncryptDRM` 接口，更新 DRM 证书管理平台访问密钥和 FairPlay 证书。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateEncryptDRMRes updateEncryptDRM(UpdateEncryptDRMBody body) throws Exception {
        RawResponse rawResponse = json("UpdateEncryptDRM", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateEncryptDRMRes.class);
    }

    /**
     * <p>updateEncryptHLS</p>
     * <p>更新 HLS 密钥获取配置</p>
     *
     * <p>调用 `UpdateEncryptHLS` 接口，添加或更新 HLS 标准加密使用的自建密钥管理服务地址和视频直播更新密钥的周期。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateEncryptHLSRes updateEncryptHLS(UpdateEncryptHLSBody body) throws Exception {
        RawResponse rawResponse = json("UpdateEncryptHLS", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateEncryptHLSRes.class);
    }

    /**
     * <p>getHLSEncryptDataKey</p>
     * <p>查询 HLS 加密密钥</p>
     *
     * <p>调用 `GetHLSEncryptDataKey` 接口，查询视频直播服务端生成的用于 HLS 标准加密使用的密钥。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetHLSEncryptDataKeyRes getHLSEncryptDataKey(GetHLSEncryptDataKeyQuery query) throws Exception {
        RawResponse rawResponse = json("GetHLSEncryptDataKey", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetHLSEncryptDataKeyRes.class);
    }

    /**
     * <p>describeEncryptHLS</p>
     * <p>查询 HLS 密钥获取配置</p>
     *
     * <p>调用 `DescribeEncryptHLS` 接口，查询 HLS 标准加密使用的自建密钥管理服务地址和视频直播更新密钥的周期。</p>
     *
     * @return response data
     * @throws Exception error during request
     */
    public DescribeEncryptHLSRes describeEncryptHLS() throws Exception {
        RawResponse rawResponse = json("DescribeEncryptHLS", null, "");
        return parseRawResponse(rawResponse, DescribeEncryptHLSRes.class);
    }

    /**
     * <p>describeLicenseDRM</p>
     * <p>获取 DRM  授权许可文件</p>
     *
     * <p>调用 `DescribeLicenseDRM` 接口，视频直播服务向 DRM 证书管理平台发起请求获取 DRM 授权许可文件。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLicenseDRMRes describeLicenseDRM(DescribeLicenseDRMQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeLicenseDRM", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeLicenseDRMRes.class);
    }

    /**
     * <p>describeCertDRM</p>
     * <p>获取 FairPlay 证书文件</p>
     *
     * <p>调用 `DescribeCertDRM` 接口，获取 FairPlay 证书文件。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeCertDRMRes describeCertDRM(DescribeCertDRMQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeCertDRM", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeCertDRMRes.class);
    }

    /**
     * <p>describeEncryptDRM</p>
     * <p>查看 DRM 证书管理平台访问密钥和 FairPlay 证书</p>
     *
     * <p>调用 `DescribeEncryptDRM` 接口，查看已配置的 DRM 证书管理平台访问密钥和 FairPlay 证书信息。</p>
     *
     * @return response data
     * @throws Exception error during request
     */
    public DescribeEncryptDRMRes describeEncryptDRM() throws Exception {
        RawResponse rawResponse = json("DescribeEncryptDRM", null, "");
        return parseRawResponse(rawResponse, DescribeEncryptDRMRes.class);
    }

    /**
     * <p>bindEncryptDRM</p>
     * <p>添加或更新加密配置</p>
     *
     * <p>调用 `BindEncryptDRM` 接口，添加或更新直播加密配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public BindEncryptDRMRes bindEncryptDRM(BindEncryptDRMBody body) throws Exception {
        RawResponse rawResponse = json("BindEncryptDRM", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, BindEncryptDRMRes.class);
    }

    /**
     * <p>unBindEncryptDRM</p>
     * <p>删除加密配置</p>
     *
     * <p>调用 `UnBindEncryptDRM` 接口，删除已创建的加密配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UnBindEncryptDRMRes unBindEncryptDRM(UnBindEncryptDRMBody body) throws Exception {
        RawResponse rawResponse = json("UnBindEncryptDRM", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UnBindEncryptDRMRes.class);
    }

    /**
     * <p>listBindEncryptDRM</p>
     * <p>查询加密配置</p>
     *
     * <p>调用 `ListBindEncryptDRM` 接口，查询指定域名空间和应用名称的加密配置或查看指定域名空间下所有加密配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListBindEncryptDRMRes listBindEncryptDRM(ListBindEncryptDRMBody body) throws Exception {
        RawResponse rawResponse = json("ListBindEncryptDRM", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListBindEncryptDRMRes.class);
    }

    /**
     * <p>deleteIPAccessRule</p>
     * <p>删除ip访问限制</p>
     *
     * <p>调用 `DeleteIPAccessRule` 接口，删除域名的 IP 访问限制。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteIPAccessRuleRes deleteIPAccessRule(DeleteIPAccessRuleBody body) throws Exception {
        RawResponse rawResponse = json("DeleteIPAccessRule", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteIPAccessRuleRes.class);
    }

    /**
     * <p>updateIPAccessRule</p>
     * <p>更新ip访问限制</p>
     *
     * <p>调用 `UpdateIPAccessRule` 接口，创建或更新域名的 IP 访问限制。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateIPAccessRuleRes updateIPAccessRule(UpdateIPAccessRuleBody body) throws Exception {
        RawResponse rawResponse = json("UpdateIPAccessRule", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateIPAccessRuleRes.class);
    }

    /**
     * <p>describeIPAccessRule</p>
     * <p>查询ip访问限制</p>
     *
     * <p>调用 `DescribeIPAccessRule` 接口，查询域名的 IP 访问限制配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeIPAccessRuleRes describeIPAccessRule(DescribeIPAccessRuleBody body) throws Exception {
        RawResponse rawResponse = json("DescribeIPAccessRule", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeIPAccessRuleRes.class);
    }

    /**
     * <p>deleteSubtitleTranscodePreset</p>
     * <p>删除字幕配置</p>
     *
     * <p>调用 `DeleteSubtitleTranscodePreset` 接口，删除已添加的字幕配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteSubtitleTranscodePresetRes deleteSubtitleTranscodePreset(DeleteSubtitleTranscodePresetBody body) throws Exception {
        RawResponse rawResponse = json("DeleteSubtitleTranscodePreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteSubtitleTranscodePresetRes.class);
    }

    /**
     * <p>updateSubtitleTranscodePreset</p>
     * <p>更新字幕配置</p>
     *
     * <p>调用 `UpdateSubtitleTranscodePreset` 接口，更新已添加的字幕配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateSubtitleTranscodePresetRes updateSubtitleTranscodePreset(UpdateSubtitleTranscodePresetBody body) throws Exception {
        RawResponse rawResponse = json("UpdateSubtitleTranscodePreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateSubtitleTranscodePresetRes.class);
    }

    /**
     * <p>listVhostSubtitleTranscodePreset</p>
     * <p>查询字幕配置列表</p>
     *
     * <p>调用 `ListVhostSubtitleTranscodePreset` 接口，查询指定域名空下所有字幕配置列表。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListVhostSubtitleTranscodePresetRes listVhostSubtitleTranscodePreset(ListVhostSubtitleTranscodePresetBody body) throws Exception {
        RawResponse rawResponse = json("ListVhostSubtitleTranscodePreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListVhostSubtitleTranscodePresetRes.class);
    }

    /**
     * <p>createSubtitleTranscodePreset</p>
     * <p>添加字幕配置</p>
     *
     * <p>调用 `CreateSubtitleTranscodePreset` 接口，为转码流添加字幕配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateSubtitleTranscodePresetRes createSubtitleTranscodePreset(CreateSubtitleTranscodePresetBody body) throws Exception {
        RawResponse rawResponse = json("CreateSubtitleTranscodePreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateSubtitleTranscodePresetRes.class);
    }

}
