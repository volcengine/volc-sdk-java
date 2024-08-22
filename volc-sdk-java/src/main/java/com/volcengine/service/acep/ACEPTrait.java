package com.volcengine.service.acep;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.acep.*;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.response.ResponseMetadata;
import com.volcengine.service.BaseServiceImpl;
import lombok.Data;

/**
 * ACEP Trait
 */
public class ACEPTrait extends BaseServiceImpl {
    protected ACEPTrait() {
        super(ACEPConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), ACEPConfig.apiInfoList);
    }

    protected ACEPTrait(ServiceInfo serviceInfo) {
        super(serviceInfo, ACEPConfig.apiInfoList);
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
     * <p>pullFile</p>
     * <p>下载文件或文件夹到对象存储</p>
     *
     * <p>从指定云手机实例下载文件或文件夹到对象存储（异步任务）。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public PullFileRes pullFile(PullFileBody body) throws Exception {
        RawResponse rawResponse = json("PullFile", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, PullFileRes.class);
    }

    /**
     * <p>updatePodProperty</p>
     * <p>修改实例属性</p>
     *
     * <p>修改指定实例的属性信息，包括系统属性（SystemProperties）和设置（Settings）。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdatePodPropertyRes updatePodProperty(UpdatePodPropertyBody body) throws Exception {
        RawResponse rawResponse = json("UpdatePodProperty", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdatePodPropertyRes.class);
    }

    /**
     * <p>closeApp</p>
     * <p>关闭应用</p>
     *
     * <p>在一个或多个云实例中关闭指定应用（异步任务）。</p>
     *
     * <p>关闭应用的结果通过任务执行回调返回，详请参考 [回调服务接入指南](https://www.volcengine.com/docs/6394/138583)。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CloseAppRes closeApp(CloseAppBody body) throws Exception {
        RawResponse rawResponse = json("CloseApp", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CloseAppRes.class);
    }

    /**
     * <p>createPod</p>
     * <p>创建实例</p>
     *
     * <p>创建指定套餐规格配置的实例，支持单个实例创建及批量实例创建：</p>
     *
     *
     *
     * <p>- 如不指定 `PodSpecList` 参数，则创建单个实例。</p>
     *
     * <p>- 如指定 `PodSpecList` 参数，则批量创建多个实例，且 `PodSpecList` 中指定的实例配置参数优先级高于外部参数。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreatePodRes createPod(CreatePodBody body) throws Exception {
        RawResponse rawResponse = json("CreatePod", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreatePodRes.class);
    }

    /**
     * <p>createPodOneStep</p>
     * <p>创建实例并部署应用</p>
     *
     * <p>一键快速创建实例、启动实例，并完成应用部署（异步任务）。实例创建结果通过任务执行回调返回，详细信息，参考 [云手机回调服务接入指南](https://www.volcengine.com/docs/6394/138583)。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreatePodOneStepRes createPodOneStep(CreatePodOneStepBody body) throws Exception {
        RawResponse rawResponse = json("CreatePodOneStep", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreatePodOneStepRes.class);
    }

    /**
     * <p>deletePod</p>
     * <p>删除实例</p>
     *
     * <p>删除实例。删除后，实例上的所有用户数据将直接被清除，并且无法还原，请谨慎操作。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeletePodRes deletePod(DeletePodBody body) throws Exception {
        RawResponse rawResponse = json("DeletePod", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeletePodRes.class);
    }

    /**
     * <p>runSyncCommand</p>
     * <p>同步执行命令</p>
     *
     * <p>在一个或多个云手机实例中同步执行命令，执行结果同步返回。</p>
     *
     * <p>该接口适用于执行时间小于 10s 的命令，超过 10s 的命令建议使用异步执行命令 [`RunCommand`](https://www.volcengine.com/docs/6394/1262358) 接口。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public RunSyncCommandRes runSyncCommand(RunSyncCommandBody body) throws Exception {
        RawResponse rawResponse = json("RunSyncCommand", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, RunSyncCommandRes.class);
    }

    /**
     * <p>launchApp</p>
     * <p>启动应用</p>
     *
     * <p>在一个或多个云实例中启动指定应用（异步任务）。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public LaunchAppRes launchApp(LaunchAppBody body) throws Exception {
        RawResponse rawResponse = json("LaunchApp", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, LaunchAppRes.class);
    }

    /**
     * <p>launchApps</p>
     * <p>启动应用</p>
     *
     * <p>此接口用于启动应用，可在一个实例中实现批量启动多个 App。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public LaunchAppsRes launchApps(LaunchAppsBody body) throws Exception {
        RawResponse rawResponse = json("LaunchApps", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, LaunchAppsRes.class);
    }

    /**
     * <p>powerOffPod</p>
     * <p>实例停机</p>
     *
     * <p>对指定实例执行关机操作，释放 CPU 算力。返回结果包含对每个实例的关机操作执行结果。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public PowerOffPodRes powerOffPod(PowerOffPodBody body) throws Exception {
        RawResponse rawResponse = json("PowerOffPod", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, PowerOffPodRes.class);
    }

    /**
     * <p>podStop</p>
     * <p>实例停止推流</p>
     *
     * <p>停止指定实例推流，释放实例资源。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public PodStopRes podStop(PodStopBody body) throws Exception {
        RawResponse rawResponse = json("PodStop", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, PodStopRes.class);
    }

    /**
     * <p>powerOnPod</p>
     * <p>实例开机</p>
     *
     * <p>对指定实例执行开机操作，占用 CPU 算力。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public PowerOnPodRes powerOnPod(PowerOnPodBody body) throws Exception {
        RawResponse rawResponse = json("PowerOnPod", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, PowerOnPodRes.class);
    }

    /**
     * <p>copyPod</p>
     * <p>实例拷贝</p>
     *
     * <p>拷贝指定实例的信息，得到若干个实例；同时支持同机房实例拷贝。仅适用于云盘存储资源类型。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CopyPodRes copyPod(CopyPodBody body) throws Exception {
        RawResponse rawResponse = json("CopyPod", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CopyPodRes.class);
    }

    /**
     * <p>podDataTransfer</p>
     * <p>实例迁移</p>
     *
     * <p>将指定实例的数据迁移到已经存在的其他实例上（异步任务）。仅适用于云盘存储资源类型。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public PodDataTransferRes podDataTransfer(PodDataTransferBody body) throws Exception {
        RawResponse rawResponse = json("PodDataTransfer", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, PodDataTransferRes.class);
    }

    /**
     * <p>rebootPod</p>
     * <p>实例重启</p>
     *
     * <p>对指定实例执行重启操作，用以解决系统无响应、卡死等问题。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public RebootPodRes rebootPod(RebootPodBody body) throws Exception {
        RawResponse rawResponse = json("RebootPod", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, RebootPodRes.class);
    }

    /**
     * <p>resetPod</p>
     * <p>实例重置</p>
     *
     * <p>此接口用于对指定实例执行重置操作，清理应用和文件（异步任务）。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ResetPodRes resetPod(ResetPodBody body) throws Exception {
        RawResponse rawResponse = json("ResetPod", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ResetPodRes.class);
    }

    /**
     * <p>banUser</p>
     * <p>封禁用户</p>
     *
     * <p>*封禁或断开指定客户端用户连接云手机实例*。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public BanUserRes banUser(BanUserBody body) throws Exception {
        RawResponse rawResponse = json("BanUser", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, BanUserRes.class);
    }

    /**
     * <p>pushFile</p>
     * <p>将TOS文件上传至Pod</p>
     *
     * <p>从对象存储或下载链接推送文件到一个或多个云手机实例（异步任务）。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public PushFileRes pushFile(PushFileBody body) throws Exception {
        RawResponse rawResponse = json("PushFile", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, PushFileRes.class);
    }

    /**
     * <p>distributeFile</p>
     * <p>将文件分发至Pod</p>
     *
     * <p>该接口用于将文件或应用快速分发至云手机实例指定目录下。支持跨区域、跨集群的多实例文件分发。</p>
     *
     * <p>你可以通过 [`GetTaskInfo`](https://www.volcengine.com/docs/6394/1262190) 接口查询分发任务执行结果详细信息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DistributeFileRes distributeFile(DistributeFileBody body) throws Exception {
        RawResponse rawResponse = json("DistributeFile", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DistributeFileRes.class);
    }

    /**
     * <p>startRecording</p>
     * <p>开始录屏</p>
     *
     * <p>对当前云手机画面发起录屏请求（异步任务）。录屏请求结果通过回调返回，详请参考 [回调服务接入指南](https://www.volcengine.com/docs/6394/138583)。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public StartRecordingRes startRecording(StartRecordingBody body) throws Exception {
        RawResponse rawResponse = json("StartRecording", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, StartRecordingRes.class);
    }

    /**
     * <p>screenShot</p>
     * <p>截图</p>
     *
     * <p>对云手机实例的画面发起批量截图请求（异步任务）。截图请求结果通过回调返回，详细信息，参考 [回调服务接入指南](https://www.volcengine.com/docs/6394/138583)。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ScreenShotRes screenShot(ScreenShotBody body) throws Exception {
        RawResponse rawResponse = json("ScreenShot", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ScreenShotRes.class);
    }

    /**
     * <p>podAdb</p>
     * <p>打开/关闭实例adb</p>
     *
     * <p>打开/关闭指定实例的 ADB 连接功能。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public PodAdbRes podAdb(PodAdbBody body) throws Exception {
        RawResponse rawResponse = json("PodAdb", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, PodAdbRes.class);
    }

    /**
     * <p>runCommand</p>
     * <p>执行命令</p>
     *
     * <p>在一个或多个云手机实例中执行命令（异步任务）。命令执行的结果通过回调返回，详细信息，参考 [回调服务接入指南](https://www.volcengine.com/docs/6394/138583)。</p>
     *
     * <p>该接口适用于执行时间大于 10s 的命令，小于 10s 的命令建议使用同步执行命令 [`RunSyncCommand`](https://www.volcengine.com/docs/6394/1262359) 接口。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public RunCommandRes runCommand(RunCommandBody body) throws Exception {
        RawResponse rawResponse = json("RunCommand", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, RunCommandRes.class);
    }

    /**
     * <p>batchScreenShot</p>
     * <p>批量截图</p>
     *
     * <p>对多个云手机实例的画面发起批量截图请求（异步任务）。截图请求结果通过回调返回，详请参考 [回调服务接入指南](https://www.volcengine.com/docs/6394/138583)。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public BatchScreenShotRes batchScreenShot(BatchScreenShotBody body) throws Exception {
        RawResponse rawResponse = json("BatchScreenShot", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, BatchScreenShotRes.class);
    }

    /**
     * <p>podMute</p>
     * <p>暂停/恢复推流</p>
     *
     * <p>暂停或恢复指定实例推流。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public PodMuteRes podMute(PodMuteBody body) throws Exception {
        RawResponse rawResponse = json("PodMute", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, PodMuteRes.class);
    }

    /**
     * <p>updatePod</p>
     * <p>更新实例</p>
     *
     * <p>此接口用于更新指定实例的属性信息，包括：</p>
     *
     *
     *
     * <p>- 更改实例名称</p>
     *
     *
     *
     * <p>- 实例镜像升级，暂不支持从高版本镜像更配为低版本镜像。</p>
     *
     *
     *
     * <p>- 更改实例的套餐配置，需要在关机状态下更配，实例重启后生效。</p>
     *
     *
     *
     * <p>- 更改实例的屏幕布局，需要在关机状态下更配，实例重启后生效。</p>
     *
     *
     *
     * <p>- 套餐规格更配支持 12G 变更到 16G 算力，16G 变更到 12G 算力。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdatePodRes updatePod(UpdatePodBody body) throws Exception {
        RawResponse rawResponse = json("UpdatePod", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdatePodRes.class);
    }

    /**
     * <p>listDc</p>
     * <p>机房列表</p>
     *
     * <p>此接口用于查询当前业务已订购的机房列表信息。仅适用于本地存储资源类型。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public ListDcRes listDc(ListDcQuery query) throws Exception {
        RawResponse rawResponse = json("ListDc", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, ListDcRes.class);
    }

    /**
     * <p>getPodMetric</p>
     * <p>查询实例云机资源状态</p>
     *
     * <p>此接口用于查询指定实例的资源状态。例如，指定实例所属业务 ID 和实例 ID，获取实例资源状态。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetPodMetricRes getPodMetric(GetPodMetricQuery query) throws Exception {
        RawResponse rawResponse = json("GetPodMetric", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetPodMetricRes.class);
    }

    /**
     * <p>detailPod</p>
     * <p>查询实例信息</p>
     *
     * <p>此接口用于查询指定实例的详细信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DetailPodRes detailPod(DetailPodQuery query) throws Exception {
        RawResponse rawResponse = json("DetailPod", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DetailPodRes.class);
    }

    /**
     * <p>listPod</p>
     * <p>查询实例列表</p>
     *
     * <p>此接口用于查询指定业务的实例列表信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public ListPodRes listPod(ListPodQuery query) throws Exception {
        RawResponse rawResponse = json("ListPod", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, ListPodRes.class);
    }

    /**
     * <p>getPodProperty</p>
     * <p>查询实例属性列表</p>
     *
     * <p>查询指定实例的属性信息，包括系统属性信息（SystemProperties）和设置信息（Settings）。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetPodPropertyRes getPodProperty(GetPodPropertyQuery query) throws Exception {
        RawResponse rawResponse = json("GetPodProperty", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetPodPropertyRes.class);
    }

    /**
     * <p>podDataDelete</p>
     * <p>清除用户数据</p>
     *
     * <p>删除指定实例中的用户数据（异步任务）。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public PodDataDeleteRes podDataDelete(PodDataDeleteBody body) throws Exception {
        RawResponse rawResponse = json("PodDataDelete", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, PodDataDeleteRes.class);
    }

    /**
     * <p>stopRecording</p>
     * <p>结束录屏</p>
     *
     * <p>主动停止对当前云手机画面进行录屏。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public StopRecordingRes stopRecording(StopRecordingBody body) throws Exception {
        RawResponse rawResponse = json("StopRecording", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, StopRecordingRes.class);
    }

    /**
     * <p>getPodAppList</p>
     * <p>获取实例应用列表</p>
     *
     * <p>此接口用于查询指定实例上应用安装情况。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetPodAppListRes getPodAppList(GetPodAppListQuery query) throws Exception {
        RawResponse rawResponse = json("GetPodAppList", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetPodAppListRes.class);
    }

    /**
     * <p>listTask</p>
     * <p>查询任务列表信息</p>
     *
     * <p>查询实例、应用等相关任务的列表信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public ListTaskRes listTask(ListTaskQuery query) throws Exception {
        RawResponse rawResponse = json("ListTask", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, ListTaskRes.class);
    }

    /**
     * <p>getTaskInfo</p>
     * <p>查询任务详情</p>
     *
     * <p>查询指定任务的执行结果详细信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetTaskInfoRes getTaskInfo(GetTaskInfoQuery query) throws Exception {
        RawResponse rawResponse = json("GetTaskInfo", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetTaskInfoRes.class);
    }

    /**
     * <p>createPortMappingRule</p>
     * <p>创建端口映射规则</p>
     *
     * <p>此接口用于在指定云手机业务下创建端口映射规则。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreatePortMappingRuleRes createPortMappingRule(CreatePortMappingRuleBody body) throws Exception {
        RawResponse rawResponse = json("CreatePortMappingRule", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreatePortMappingRuleRes.class);
    }

    /**
     * <p>listPortMappingRule</p>
     * <p>查询端口映射列表</p>
     *
     * <p>查询业务下已创建的端口映射规则列表信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public ListPortMappingRuleRes listPortMappingRule(ListPortMappingRuleQuery query) throws Exception {
        RawResponse rawResponse = json("ListPortMappingRule", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, ListPortMappingRuleRes.class);
    }

    /**
     * <p>detailPortMappingRule</p>
     * <p>查询端口映射详情</p>
     *
     * <p>查询指定端口映射规则的详细信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DetailPortMappingRuleRes detailPortMappingRule(DetailPortMappingRuleQuery query) throws Exception {
        RawResponse rawResponse = json("DetailPortMappingRule", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DetailPortMappingRuleRes.class);
    }

    /**
     * <p>bindPortMappingRule</p>
     * <p>绑定端口映射</p>
     *
     * <p>此接口用于实例绑定端口映射规则。您可通过 `ProductId` 、`PodIdList`、`PortMappingRuleIdList` 参数，绑定端口映射规则。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public BindPortMappingRuleRes bindPortMappingRule(BindPortMappingRuleBody body) throws Exception {
        RawResponse rawResponse = json("BindPortMappingRule", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, BindPortMappingRuleRes.class);
    }

    /**
     * <p>unbindPortMappingRule</p>
     * <p>解绑端口映射</p>
     *
     * <p>此接口用于实例解绑端口映射规则，您可通过 `ProductId` 、`PodIdList`、`PortMappingRuleIdList` 参数，解绑端口映射规则。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UnbindPortMappingRuleRes unbindPortMappingRule(UnbindPortMappingRuleBody body) throws Exception {
        RawResponse rawResponse = json("UnbindPortMappingRule", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UnbindPortMappingRuleRes.class);
    }

    /**
     * <p>attachTag</p>
     * <p>实例打标签</p>
     *
     * <p>为指定实例添加分组标签（将指定标签批量关联绑定实例）。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public AttachTagRes attachTag(AttachTagBody body) throws Exception {
        RawResponse rawResponse = json("AttachTag", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, AttachTagRes.class);
    }

    /**
     * <p>listTag</p>
     * <p>标签列表</p>
     *
     * <p>此接口用于查询业务下创建的标签列表信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public ListTagRes listTag(ListTagQuery query) throws Exception {
        RawResponse rawResponse = json("ListTag", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, ListTagRes.class);
    }

    /**
     * <p>createTag</p>
     * <p>标签创建</p>
     *
     * <p>在业务下创建标签（定义标签名称、标签描述等信息）。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateTagRes createTag(CreateTagBody body) throws Exception {
        RawResponse rawResponse = json("CreateTag", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateTagRes.class);
    }

    /**
     * <p>deleteTag</p>
     * <p>标签删除</p>
     *
     * <p>删除已创建的标签。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteTagRes deleteTag(DeleteTagBody body) throws Exception {
        RawResponse rawResponse = json("DeleteTag", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteTagRes.class);
    }

    /**
     * <p>updateTag</p>
     * <p>标签更改</p>
     *
     * <p>更新指定标签的属性信息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateTagRes updateTag(UpdateTagBody body) throws Exception {
        RawResponse rawResponse = json("UpdateTag", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateTagRes.class);
    }

    /**
     * <p>uploadApp</p>
     * <p>应用上传</p>
     *
     * <p>上传应用安装文件到指定业务的应用管理中心（异步任务）。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UploadAppRes uploadApp(UploadAppBody body) throws Exception {
        RawResponse rawResponse = json("UploadApp", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UploadAppRes.class);
    }

    /**
     * <p>detailApp</p>
     * <p>应用信息查询</p>
     *
     * <p>此接口用于查询指定应用的详情及应用版本信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DetailAppRes detailApp(DetailAppQuery query) throws Exception {
        RawResponse rawResponse = json("DetailApp", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DetailAppRes.class);
    }

    /**
     * <p>updateApp</p>
     * <p>应用修改</p>
     *
     * <p>修改已发布的应用属性信息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateAppRes updateApp(UpdateAppBody body) throws Exception {
        RawResponse rawResponse = json("UpdateApp", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateAppRes.class);
    }

    /**
     * <p>listApp</p>
     * <p>应用列表查询</p>
     *
     * <p>此接口用于查询业务下的应用列表信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public ListAppRes listApp(ListAppQuery query) throws Exception {
        RawResponse rawResponse = json("ListApp", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, ListAppRes.class);
    }

    /**
     * <p>deleteApp</p>
     * <p>应用删除</p>
     *
     * <p>删除业务下的指定应用及应用信息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteAppRes deleteApp(DeleteAppBody body) throws Exception {
        RawResponse rawResponse = json("DeleteApp", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteAppRes.class);
    }

    /**
     * <p>uninstallApp</p>
     * <p>应用卸载</p>
     *
     * <p>将指定应用从云实例中卸载（异步任务）。</p>
     *
     * <p>应用卸载结果通过任务执行回调返回，详请参考 [回调服务接入指南](https://www.volcengine.com/docs/6394/138583)。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UninstallAppRes uninstallApp(UninstallAppBody body) throws Exception {
        RawResponse rawResponse = json("UninstallApp", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UninstallAppRes.class);
    }

    /**
     * <p>installApp</p>
     * <p>应用安装</p>
     *
     * <p>此接口将指定应用安装部署到指定的云实例中（异步任务）。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public InstallAppRes installApp(InstallAppBody body) throws Exception {
        RawResponse rawResponse = json("InstallApp", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, InstallAppRes.class);
    }

    /**
     * <p>installApps</p>
     * <p>应用批量安装</p>
     *
     * <p>此接口用于将多个应用批量安装部署到指定云实例中（异步任务）。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public InstallAppsRes installApps(InstallAppsBody body) throws Exception {
        RawResponse rawResponse = json("InstallApps", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, InstallAppsRes.class);
    }

    /**
     * <p>listAppVersionDeploy</p>
     * <p>应用版本部署信息</p>
     *
     * <p>此接口用于查询应用在实例上的部署情况。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public ListAppVersionDeployRes listAppVersionDeploy(ListAppVersionDeployQuery query) throws Exception {
        RawResponse rawResponse = json("ListAppVersionDeploy", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, ListAppVersionDeployRes.class);
    }

    /**
     * <p>autoInstallApp</p>
     * <p>应用自动下载安装</p>
     *
     * <p>通过下载应用安装文件方式，或应用镜像安装的方式，将应用自动安装部署到指定云手机实例。（异步任务）。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public AutoInstallAppRes autoInstallApp(AutoInstallAppBody body) throws Exception {
        RawResponse rawResponse = json("AutoInstallApp", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, AutoInstallAppRes.class);
    }

    /**
     * <p>getAppCrashLog</p>
     * <p>查询应用崩溃</p>
     *
     * <p>查询一个或多个云实例中应用的崩溃信息，包括应用名称和崩溃时间点。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetAppCrashLogRes getAppCrashLog(GetAppCrashLogQuery query) throws Exception {
        RawResponse rawResponse = json("GetAppCrashLog", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetAppCrashLogRes.class);
    }

    /**
     * <p>createDisplayLayoutMini</p>
     * <p>创建基础版屏幕布局</p>
     *
     * <p>创建基础版屏幕布局，适用于单屏云手机实例。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateDisplayLayoutMiniRes createDisplayLayoutMini(CreateDisplayLayoutMiniBody body) throws Exception {
        RawResponse rawResponse = json("CreateDisplayLayoutMini", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateDisplayLayoutMiniRes.class);
    }

    /**
     * <p>deleteDisplayLayout</p>
     * <p>删除屏幕布局</p>
     *
     * <p>删除指定屏幕布局配置信息（系统屏幕布局配置不可删除）。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteDisplayLayoutRes deleteDisplayLayout(DeleteDisplayLayoutBody body) throws Exception {
        RawResponse rawResponse = json("DeleteDisplayLayout", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteDisplayLayoutRes.class);
    }

    /**
     * <p>listDisplayLayoutMini</p>
     * <p>查询基础版屏幕布局列表</p>
     *
     * <p>此接口用于查询当前业务支持的基础版屏幕布局配置列表。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public ListDisplayLayoutMiniRes listDisplayLayoutMini(ListDisplayLayoutMiniQuery query) throws Exception {
        RawResponse rawResponse = json("ListDisplayLayoutMini", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, ListDisplayLayoutMiniRes.class);
    }

    /**
     * <p>detailDisplayLayoutMini</p>
     * <p>查询基础版屏幕布局详情</p>
     *
     * <p>查询指定基础版屏幕布局配置的详细信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DetailDisplayLayoutMiniRes detailDisplayLayoutMini(DetailDisplayLayoutMiniQuery query) throws Exception {
        RawResponse rawResponse = json("DetailDisplayLayoutMini", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DetailDisplayLayoutMiniRes.class);
    }

    /**
     * <p>createAppImage</p>
     * <p>创建应用镜像</p>
     *
     * <p>该接口发起异步任务，基于用户指定云手机实例中已经安装的应用程序包，自动打包并生成一个可部署的应用镜像。</p>
     *
     * <p>此操作允许用户将特定实例的应用程序环境，转换为可在云手机平台上重复使用的标准化镜像。用户可以轻松复制和部署到具有相同应用环境的多个实例中，从而提高应用部署的一致性和效率。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateAppImageRes createAppImage(CreateAppImageBody body) throws Exception {
        RawResponse rawResponse = json("CreateAppImage", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateAppImageRes.class);
    }

    /**
     * <p>detailAppVersionImage</p>
     * <p>查询应用镜像信息</p>
     *
     * <p>获取指定应用镜像的详细信息</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DetailAppVersionImageRes detailAppVersionImage(DetailAppVersionImageQuery query) throws Exception {
        RawResponse rawResponse = json("DetailAppVersionImage", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DetailAppVersionImageRes.class);
    }

    /**
     * <p>createImageOneStep</p>
     * <p>镜像内置应用</p>
     *
     * <p>基于已有镜像，快速构建内置应用和文件的自定义镜像（异步任务）。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateImageOneStepRes createImageOneStep(CreateImageOneStepBody body) throws Exception {
        RawResponse rawResponse = json("CreateImageOneStep", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateImageOneStepRes.class);
    }

    /**
     * <p>listImageResource</p>
     * <p>镜像分布列表</p>
     *
     * <p>查询当前业务下使用的所有镜像 ID，以及每个镜像所关联的实例数量。</p>
     *
     * <p>查询结果为调用接口前最后一次数据库刷新的数据，而非实时数据。如果在最后一次数据库刷新之后至本次接口调用期间有新镜像被实例化，这些新增实例将不会被包含在返回的结果中。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public ListImageResourceRes listImageResource(ListImageResourceQuery query) throws Exception {
        RawResponse rawResponse = json("ListImageResource", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, ListImageResourceRes.class);
    }

    /**
     * <p>getImagePreheating</p>
     * <p>镜像预热信息</p>
     *
     * <p>查询指定镜像的预热进度。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetImagePreheatingRes getImagePreheating(GetImagePreheatingQuery query) throws Exception {
        RawResponse rawResponse = json("GetImagePreheating", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetImagePreheatingRes.class);
    }

    /**
     * <p>listConfiguration</p>
     * <p>套餐列表-后端使用</p>
     *
     * <p>查询业务下已订购的资源套餐列表。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public ListConfigurationRes listConfiguration(ListConfigurationQuery query) throws Exception {
        RawResponse rawResponse = json("ListConfiguration", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, ListConfigurationRes.class);
    }

    /**
     * <p>listPodResourceSet</p>
     * <p>实例资源组列表</p>
     *
     * <p>此接口用于查询当前业务已订购的实例资源组列表信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public ListPodResourceSetRes listPodResourceSet(ListPodResourceSetQuery query) throws Exception {
        RawResponse rawResponse = json("ListPodResourceSet", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, ListPodResourceSetRes.class);
    }

    /**
     * <p>listPodResource</p>
     * <p>资源列表</p>
     *
     * <p>查询当前业务已订购的实例资源信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public ListPodResourceRes listPodResource(ListPodResourceQuery query) throws Exception {
        RawResponse rawResponse = json("ListPodResource", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, ListPodResourceRes.class);
    }

    /**
     * <p>listResourceQuota</p>
     * <p>资源配额</p>
     *
     * <p>查询业务维度实例资源配额信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public ListResourceQuotaRes listResourceQuota(ListResourceQuotaQuery query) throws Exception {
        RawResponse rawResponse = json("ListResourceQuota", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, ListResourceQuotaRes.class);
    }

    /**
     * <p>updatePodResourceApplyNum</p>
     * <p>修改实例订单并发数量</p>
     *
     * <p>在后付费计费模式下，修改已订购的实例数量。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdatePodResourceApplyNumRes updatePodResourceApplyNum(UpdatePodResourceApplyNumBody body) throws Exception {
        RawResponse rawResponse = json("UpdatePodResourceApplyNum", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdatePodResourceApplyNumRes.class);
    }

    /**
     * <p>subscribeResourceAuto</p>
     * <p>实例订购预付费-自动下单</p>
     *
     * <p>此接口用于自动下单订购并发实例。</p>
     *
     * <p>适用于云盘存储的预付费订购，本地存储的预付费、后付费订购。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public SubscribeResourceAutoRes subscribeResourceAuto(SubscribeResourceAutoBody body) throws Exception {
        RawResponse rawResponse = json("SubscribeResourceAuto", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, SubscribeResourceAutoRes.class);
    }

    /**
     * <p>renewResourceAuto</p>
     * <p>并发实例自动下单续订</p>
     *
     * <p>此接口用于自动下单续订并发实例。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public RenewResourceAutoRes renewResourceAuto(RenewResourceAutoBody body) throws Exception {
        RawResponse rawResponse = json("RenewResourceAuto", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, RenewResourceAutoRes.class);
    }

    /**
     * <p>updateProductResource</p>
     * <p>更新业务存储资源</p>
     *
     * <p>修改指定业务的存储资源订购总量。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateProductResourceRes updateProductResource(UpdateProductResourceBody body) throws Exception {
        RawResponse rawResponse = json("UpdateProductResource", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateProductResourceRes.class);
    }

    /**
     * <p>getProductResource</p>
     * <p>查询业务存储资源</p>
     *
     * <p>查询指定业务的存储资源信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public GetProductResourceRes getProductResource(GetProductResourceQuery query) throws Exception {
        RawResponse rawResponse = json("GetProductResource", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, GetProductResourceRes.class);
    }

    /**
     * <p>unsubscribeHostResource</p>
     * <p>退订后付费云机资源</p>
     *
     * <p>此接口用于后付费云机资源退订。通过 `ProductId`、`HostIdList`、`Force` 参数完成退订操作。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UnsubscribeHostResourceRes unsubscribeHostResource(UnsubscribeHostResourceBody body) throws Exception {
        RawResponse rawResponse = json("UnsubscribeHostResource", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UnsubscribeHostResourceRes.class);
    }

    /**
     * <p>updateHost</p>
     * <p>更新云机</p>
     *
     * <p>此接口用于更新指定云机信息，支持更新云机套餐。仅适用于本地存储资源类型。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateHostRes updateHost(UpdateHostBody body) throws Exception {
        RawResponse rawResponse = json("UpdateHost", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateHostRes.class);
    }

    /**
     * <p>listHost</p>
     * <p>查询云机列表</p>
     *
     * <p>此接口用于查询云机列表，仅适用于本地存储资源类型。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public ListHostRes listHost(ListHostQuery query) throws Exception {
        RawResponse rawResponse = json("ListHost", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, ListHostRes.class);
    }

    /**
     * <p>detailHost</p>
     * <p>查询云机详情</p>
     *
     * <p>此接口用于查询云机详情，您可通过 `ProductId` 或者 `HostId` 参数获取云机详情，仅适用于本地存储业务类型。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DetailHostRes detailHost(DetailHostQuery query) throws Exception {
        RawResponse rawResponse = json("DetailHost", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DetailHostRes.class);
    }

    /**
     * <p>rebootHost</p>
     * <p>重启云机</p>
     *
     * <p>此接口用于重启指定云机。仅适用于本地存储资源类型。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public RebootHostRes rebootHost(RebootHostBody body) throws Exception {
        RawResponse rawResponse = json("RebootHost", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, RebootHostRes.class);
    }

    /**
     * <p>resetHost</p>
     * <p>重置云机</p>
     *
     * <p>此接口用于重置指定云机。仅适用于本地存储资源类型。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ResetHostRes resetHost(ResetHostBody body) throws Exception {
        RawResponse rawResponse = json("ResetHost", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ResetHostRes.class);
    }

}
