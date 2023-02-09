package com.volcengine.service.videoaiot;

import com.volcengine.model.video_aiot.request.*;
import com.volcengine.model.video_aiot.response.*;
import com.volcengine.service.IBaseService;

public interface VideoAIoTService extends IBaseService {
    ///空间相关API
    /**
     * @param createSpaceRequest create space arguments
     * @return created space id
     * @throws Exception
     */
    IDResponse createSpace(CreateSpaceRequest createSpaceRequest) throws Exception;

    /**
     * @param spaceID
     * @return space
     * @throws Exception
     */
    SpaceResponse getSpace(String spaceID) throws Exception;

    /**
     * @param listSpaceRequest, max pageSize is 500
     * @return space list
     * @throws Exception
     */
    ListSpaceResponse listSpace(ListSpaceRequest listSpaceRequest) throws Exception;

    /**
     * @param spaceID
     * @return started space id
     * @throws Exception
     */
    IDResponse startSpace(String spaceID) throws Exception;

    /**
     * @param spaceID
     * @return stopped space id
     * @throws Exception
     */
    IDResponse stopSpace(String spaceID) throws Exception;

    /**
     * delete the space and release resources in the space
     * @param spaceID
     * @return deleted space id
     * @throws Exception
     */
    IDResponse deleteSpace(String spaceID) throws Exception;

    /**
     * update space by spaceID
     * @param updateSpaceRequest
     * @return changed space id
     * @throws Exception
     */
    IDResponse updateSpace(UpdateSpaceRequest updateSpaceRequest) throws Exception;

    /**
     * set space template, snapshot/record/ai
     * @param setSpaceTemplateRequest
     * @return
     * @throws Exception
     */
    RawResponse setSpaceTemplate(SetSpaceTemplateRequest setSpaceTemplateRequest) throws Exception;

    /**
     * cancel space template
     * @param spaceID
     * @param templateType
     * @return
     * @throws Exception
     */
    RawResponse unsetSpaceTemplate(String spaceID, String templateType) throws Exception;

    GetDataProjectWithBindWidthAndFlowResponse getDataProjectWithBindWidthAndFlow(GetDataProjectWithBindWidthAndFlowRequest getDataProjectWithBindWidthAndFlow) throws Exception;

    GetTotalDataResponse getTotalData(String time) throws Exception;

    /**
     * get space binded template by spaceID
     * @param spaceID
     * @return
     * @throws Exception
     */
    SpaceTemplateResponse getSpaceTemplate(String spaceID) throws Exception;

    RawResponse updateAuthInSpace(UpdateAuthInSpaceRequest updateAuthInSpace) throws Exception;

    RawResponse disableAuthInSpace(String spaceID, String domain) throws Exception;

    //todo 域名
//    IDResponse addSpaceDomain(AddSpaceDomainRequest addSpaceDomainRequest) throws Exception;
//    ListSpaceDomainResponse listSpaceDomain(String spaceID) throws Exception;
    //空间模板
//    IDResponse createRecordTemplate(CreateTemplateRequest createTemplateRequest) throws Exception;
//    IDResponse deleteTemplate(DeleteTemplateRequest deleteTemplateRequest) throws Exception;
    //防盗链
    ///设备相关接口
    CreateDeviceResponse createDevice(CreateDeviceRequest createDeviceRequest) throws Exception;

    ListDeviceResponse listDevice(ListDeviceRequest listDeviceRequest) throws Exception;

    GetDeviceResponse getDevice(GetDeviceRequest getDeviceRequest) throws Exception;

    IDResponse freshDevice(DeviceRequest freshDeviceRequest) throws Exception;

    IDResponse startDevice(DeviceRequest startDevice) throws Exception;

    IDResponse stopDevice(DeviceRequest stopDevice) throws Exception;

    IDResponse deleteDevice(DeviceRequest deleteDevice) throws Exception;

    IDResponse updateDevice(UpdateDeviceRequest updateDeviceRequest) throws Exception;

    ListDeviceRecordsResponse listDeviceScreenshots(ListDeviceRecordsRequest listDeviceRecordsRequest) throws Exception;

    ListDeviceRecordsResponse listDeviceRecords(ListDeviceRecordsRequest listDeviceRecordsRequest) throws Exception;

    /**
     * real time m3u8 file
     * @param cloudRecordPlayRequest
     * @return
     * @throws Exception
     */
    CloudPlayResponse cloudRecordPlay(CloudRecordPlayRequest cloudRecordPlayRequest) throws Exception;

    LocalMediaDownloadResponse localMediaDownload(LocalMediaDownloadRequest localMediaDownloadRequest) throws Exception;

    /**
     * @param sipServerID sip server id
     * @param deviceType  IPC/NVR
     * @return
     * @throws Exception
     */
    IDResponse genSipID(String sipServerID, String deviceType) throws Exception;

    GetDeviceChannelResponse getDeviceChannels(GetDeviceChannelRequest getDeviceChannelRequest) throws Exception;

    RawResponse setAlarmGuard(SetAlarmGuardRequest setAlarmGuardRequest) throws Exception;

    RawResponse resetAlarm(ResetAlarmRequest resetAlarmRequest) throws Exception;

    ListAlarmNotifyResponse listAlarmNotify(ListAlarmNotifyRequest listAlarmNotifyRequest) throws Exception;

    RawResponse deleteAlarmNotify(String alarmNotifyID) throws Exception;

    RawResponse deleteAlarmNotifyAll(String apceID, String deviceNSID) throws Exception;

    //device control
    RawResponse cloudControl(DeviceCloudControlRequest deviceCloudControlRequest) throws Exception;

    DeviceQueryPresetResponse queryPresetInfo(DeviceQueryPresetRequest queryPresetRequest) throws Exception;

    RawResponse cruiseControl(DeviceCruiseControlRequest deviceCruiseControlRequest) throws Exception;

    ///流
    GetStreamResponse getStream(GetStreamRequest getStreamRequest) throws Exception;

    ListStreamsResponse listStreams(ListStreamsRequest listStreamsRequest) throws Exception;

    IDResponse updateStream(UpdateStreamRequest updateStreamRequest) throws Exception;

    IDResponse startStream(StreamRequest startStream) throws Exception;

    IDResponse stopStream(StreamRequest stopStream) throws Exception;

    IDResponse createStream(CreateStreamRequest createStream) throws Exception;

    IDResponse deleteStream(StreamRequest deleteStream) throws Exception;

    IDResponse streamStartRecord(StreamStartRecordRequest streamStartRecordRequest) throws Exception;

    RawResponse streamStopRecord(String recordID) throws Exception;

    GetStreamRecordResponse getStreamRecord(String recordID) throws Exception;

    DeleteStreamRecordResponse deleteStreamRecord(String recordID) throws Exception;

//    RawResponse createForward(CreateForwardRequest createForwardRequest) throws Exception;
//
//    ListForwardResponse listForward(ListForwardRequest listForwardRequest) throws Exception;
//
//    GetForwardResponse getForward(String streamID) throws Exception;
//
//    RawResponse startForward(String streamID) throws Exception;
//
//    RawResponse stopForward(String streamID) throws Exception;
//
//    DeleteForwardResponse deleteForward(DeleteForwardRequest deleteForwardRequest) throws Exception;
//
    StreamLogsResponse streamLogs(StreamLogsRequest streamLogs) throws Exception;

    GetStreamDataResponse getStreamData(GetStreamDataRequest getStreamData) throws Exception;

    IDResponse forbidStream(String streamID) throws Exception;

    IDResponse unForbidStream(String streamID) throws Exception;

    //模板

    //ai库

    //ai布控

    //慢直播

    //国标级联

    //语音对讲
    StartVoiceTalkResponse startVoiceTalk(StartVoiceTalkRequest startVoiceTalkRequest) throws Exception;

    RawResponse stopVoiceTalk(StopVoiceTalkRequest stopVoiceTalkRequest) throws Exception;
}
