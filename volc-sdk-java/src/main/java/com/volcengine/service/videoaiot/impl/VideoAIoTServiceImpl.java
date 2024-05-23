package com.volcengine.service.videoaiot.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.video_aiot.request.*;
import com.volcengine.model.video_aiot.response.*;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.live.LiveConfig;
import com.volcengine.service.videoaiot.VideoAIoTConfig;
import com.volcengine.service.videoaiot.VideoAIoTService;
import org.apache.http.HttpHost;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class VideoAIoTServiceImpl extends BaseServiceImpl implements VideoAIoTService {

    private static final List<NameValuePair> emptyList = new ArrayList<>();

    private VideoAIoTServiceImpl() {
        super(VideoAIoTConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), VideoAIoTConfig.apiInfoList);
    }

    private VideoAIoTServiceImpl(ServiceInfo serviceInfo) {
        super(serviceInfo, VideoAIoTConfig.apiInfoList);
    }

    private VideoAIoTServiceImpl(ServiceInfo info, HttpHost proxy, Map<String, ApiInfo> apiInfoList) {
        super(info, proxy, apiInfoList);
    }

    private VideoAIoTServiceImpl(ServiceInfo info, Map<String, ApiInfo> apiInfoList) {
        super(info, apiInfoList);
    }

    public static VideoAIoTService getInstance() {
        return new VideoAIoTServiceImpl();
    }

    public static VideoAIoTService getInstance(String region) throws Exception {
        ServiceInfo serviceInfo = LiveConfig.serviceInfoMap.get(region);
        if (serviceInfo == null) {
            throw new Exception("AIoTVideo not support region " + region);
        }
        return new VideoAIoTServiceImpl(serviceInfo);
    }

    @Override
    public IDResponse createSpace(CreateSpaceRequest createSpaceRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoCreateSpace, emptyList, JSON.toJSONString(createSpaceRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), IDResponse.class);
    }

    @Override
    public SpaceResponse getSpace(String spaceID) throws Exception {
        com.volcengine.model.response.RawResponse response = query(Const.AIoTVideoGetSpace, new ArrayList<NameValuePair>() {{
            add(new BasicNameValuePair("SpaceID", spaceID));
        }});
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), SpaceResponse.class);
    }

    @Override
    public ListSpaceResponse listSpace(ListSpaceRequest listSpaceRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = query(Const.AIoTVideoListSpace, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("PageNumber", Integer.toString(listSpaceRequest.getPageNumber())));
                add(new BasicNameValuePair("PageSize", Integer.toString(listSpaceRequest.getPageSize())));
            }
        });
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), ListSpaceResponse.class);
    }

    @Override
    public IDResponse startSpace(String spaceID) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoStartSpace, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("SpaceID", spaceID));
            }
        }, "");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), IDResponse.class);
    }


    @Override
    public GetDataProjectWithBindWidthAndFlowResponse getDataProjectWithBindWidthAndFlow(GetDataProjectWithBindWidthAndFlowRequest getDataProjectWithBindWidthAndFlow) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoGetDataProjectWithBindWidthAndFlow, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("SpaceID", getDataProjectWithBindWidthAndFlow.getSpaceID()));
                add(new BasicNameValuePair("StartTime", getDataProjectWithBindWidthAndFlow.getStartTime()));
                add(new BasicNameValuePair("EndTime", getDataProjectWithBindWidthAndFlow.getEndTime()));
                add(new BasicNameValuePair("Data", getDataProjectWithBindWidthAndFlow.getData()));
                add(new BasicNameValuePair("StreamName", getDataProjectWithBindWidthAndFlow.getStreamName()));
            }
        }, "");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), GetDataProjectWithBindWidthAndFlowResponse.class);
    }

    @Override
    public GetTotalDataResponse getTotalData(String time) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoGetTotalData, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("Time", time));
            }
        }, "");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), GetTotalDataResponse.class);
    }

    @Override
    public IDResponse stopSpace(String spaceID) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoStopSpace, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("SpaceID", spaceID));
            }
        }, "");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), IDResponse.class);
    }

    @Override
    public IDResponse deleteSpace(String spaceID) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoDeleteSpace, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("SpaceID", spaceID));
            }
        }, "");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), IDResponse.class);
    }

    @Override
    public IDResponse updateSpace(UpdateSpaceRequest updateSpaceRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoUpdateSpace, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("SpaceID", updateSpaceRequest.getSpaceID()));
            }
        }, JSON.toJSONString(updateSpaceRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), IDResponse.class);
    }

    @Override
    public RawResponse setSpaceTemplate(SetSpaceTemplateRequest setSpaceTemplateRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoSetSpaceTemplate, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("SpaceID", setSpaceTemplateRequest.getSpaceID()));
                add(new BasicNameValuePair("TemplateType", setSpaceTemplateRequest.getTemplateType()));
            }
        }, JSON.toJSONString(setSpaceTemplateRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RawResponse.class);
    }

    @Override
    public RawResponse unsetSpaceTemplate(String spaceID, String templateType) throws Exception {
        com.volcengine.model.response.RawResponse response = query(Const.AIoTVideoCancelBindTemplate, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("SpaceID", spaceID));
                add(new BasicNameValuePair("TemplateType", templateType));
            }
        });
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RawResponse.class);
    }

    @Override
    public SpaceTemplateResponse getSpaceTemplate(String spaceID) throws Exception {
        com.volcengine.model.response.RawResponse response = query(Const.AIoTVideoGetSpaceTemplate, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("SpaceID", spaceID));
            }
        });
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), SpaceTemplateResponse.class);
    }

//    @Override
//    public IDResponse addSpaceDomain(AddSpaceDomainRequest addSpaceDomainRequest) throws Exception {
//        return null;
//    }
//
//    @Override
//    public ListSpaceDomainResponse listSpaceDomain(String spaceID) throws Exception {
//        return null;
//    }

//    @Override
//    public IDResponse createRecordTemplate(CreateTemplateRequest createTemplateRequest) throws Exception {
//        com.volcengine.model.response.RawResponse response = json(Const.VideoAIoTCreateRecordTemplate, new ArrayList<NameValuePair>() {
//            {
//            }
//        }, JSON.toJSONString(createTemplateRequest));
//        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
//            throw response.getException();
//        }
//        return JSON.parseObject(response.getData(), IDResponse.class);
//    }
//
//    @Override
//    public IDResponse deleteTemplate(DeleteTemplateRequest deleteTemplateRequest) throws Exception {
//        com.volcengine.model.response.RawResponse response = json(Const.VideoAIoTDeleteRecordTemplate, new ArrayList<NameValuePair>() {
//            {
//            }
//        }, JSON.toJSONString(deleteTemplateRequest));
//        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
//            throw response.getException();
//        }
//        return JSON.parseObject(response.getData(), IDResponse.class);
//
//    }


    @Override
    public RawResponse updateAuthInSpace(UpdateAuthInSpaceRequest updateAuthInSpace) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoUpdateAuthInSpace, new ArrayList<NameValuePair>() {
        }, JSON.toJSONString(updateAuthInSpace));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RawResponse.class);
    }

    @Override
    public RawResponse disableAuthInSpace(String spaceID, String domain) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoDisableAuthInSpace, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("SpaceID", spaceID));
                add(new BasicNameValuePair("Domain", domain));
            }
        }, "");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RawResponse.class);
    }

    @Override
    public CreateDeviceResponse createDevice(CreateDeviceRequest createDeviceRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoCreateDevice, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("SpaceID", createDeviceRequest.getSpaceID()));
            }
        }, JSON.toJSONString(createDeviceRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CreateDeviceResponse.class);
    }

    @Override
    public ListDeviceResponse listDevice(ListDeviceRequest listDeviceRequest) throws Exception {
        ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("SpaceID", listDeviceRequest.getSpaceID()));
                add(new BasicNameValuePair("PageSize", Integer.toString(listDeviceRequest.getPageSize())));
                add(new BasicNameValuePair("PageNumber", Integer.toString(listDeviceRequest.getPageNumber())));
            }
        };
        if (listDeviceRequest.getDeviceName() != null) {
            nameValuePairs.add(new BasicNameValuePair("DeviceName", listDeviceRequest.getDeviceName()));
        }
        com.volcengine.model.response.RawResponse response = query(Const.AIoTVideoListDevice, nameValuePairs);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), ListDeviceResponse.class);
    }

    @Override
    public GetDeviceResponse getDevice(GetDeviceRequest getDeviceRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = query(Const.AIoTVideoGetDevice, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("SpaceID", getDeviceRequest.getSpaceID()));
                add(new BasicNameValuePair("DeviceID", getDeviceRequest.getDeviceID()));
                add(new BasicNameValuePair("SipServerID", getDeviceRequest.getSipServerID()));
            }
        });
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), GetDeviceResponse.class);
    }

    @Override
    public LocalMediaDownloadResponse localMediaDownload(LocalMediaDownloadRequest localMediaDownloadRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoLocalMediaDownload, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("SpaceID", localMediaDownloadRequest.getSpaceID()));
            }
        }, JSON.toJSONString(localMediaDownloadRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), LocalMediaDownloadResponse.class);
    }

    @Override
    public GetLocalMediaDownloadResponse getLocalDownload(String id) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoGetLocalDownload, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("ID", id));
            }
        }, "");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), GetLocalMediaDownloadResponse.class);
    }

    public IDResponse freshDevice(DeviceRequest freshDeviceRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = query(Const.AIoTVideoFreshDevice, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("SpaceID", freshDeviceRequest.getSpaceID()));
                add(new BasicNameValuePair("DeviceID", freshDeviceRequest.getDeviceID()));
            }
        });
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), IDResponse.class);
    }

    @Override
    public IDResponse startDevice(DeviceRequest startDevice) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoStartDevice, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("SpaceID", startDevice.getSpaceID()));
                add(new BasicNameValuePair("DeviceID", startDevice.getDeviceID()));
            }
        }, "");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), IDResponse.class);
    }

    @Override
    public IDResponse stopDevice(DeviceRequest stopDevice) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoStopDevice, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("SpaceID", stopDevice.getSpaceID()));
                add(new BasicNameValuePair("DeviceID", stopDevice.getDeviceID()));
            }
        }, "");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), IDResponse.class);
    }

    @Override
    public IDResponse deleteDevice(DeviceRequest deleteDevice) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoDeleteDevice, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("SpaceID", deleteDevice.getSpaceID()));
                add(new BasicNameValuePair("DeviceID", deleteDevice.getDeviceID()));
            }
        }, "");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), IDResponse.class);
    }

    @Override
    public IDResponse updateDevice(UpdateDeviceRequest updateDeviceRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoUpdateDevice, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("SpaceID", updateDeviceRequest.getSpaceID()));
                add(new BasicNameValuePair("DeviceID", updateDeviceRequest.getDeviceID()));
            }
        }, JSON.toJSONString(updateDeviceRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), IDResponse.class);
    }

    //截图和录制查询
    @Override
    public ListDeviceRecordsResponse listDeviceScreenshots(ListDeviceRecordsRequest listDeviceRecordsRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoListDeviceScreenshot, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("SpaceID", listDeviceRecordsRequest.getSpaceID()));
                add(new BasicNameValuePair("StreamID", listDeviceRecordsRequest.getStreamID()));
                add(new BasicNameValuePair("PageNumber", Integer.toString(listDeviceRecordsRequest.getPageNumber())));
                add(new BasicNameValuePair("PageSize", Integer.toString(listDeviceRecordsRequest.getPageSize())));
            }
        }, JSON.toJSONString(listDeviceRecordsRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), ListDeviceRecordsResponse.class);
    }

    @Override
    public ListDeviceRecordsResponse listDeviceRecords(ListDeviceRecordsRequest listDeviceRecordsRequest) throws Exception {
        if (listDeviceRecordsRequest.getReqType() == null) {
            listDeviceRecordsRequest.setReqType("");
        }
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoListDeviceRecords, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("SpaceID", listDeviceRecordsRequest.getSpaceID()));
                add(new BasicNameValuePair("StreamID", listDeviceRecordsRequest.getStreamID()));
                add(new BasicNameValuePair("PageNumber", Integer.toString(listDeviceRecordsRequest.getPageNumber())));
                add(new BasicNameValuePair("PageSize", Integer.toString(listDeviceRecordsRequest.getPageSize())));

                add(new BasicNameValuePair("DeviceNSID", listDeviceRecordsRequest.getDeviceNSID()));
                add(new BasicNameValuePair("ChannelID", listDeviceRecordsRequest.getChannelID()));
                add(new BasicNameValuePair("StreamingIndex", Integer.toString(listDeviceRecordsRequest.getStreamingIndex())));
                add(new BasicNameValuePair("Resolution", listDeviceRecordsRequest.getResolution()));
                add(new BasicNameValuePair("ReqType", listDeviceRecordsRequest.getReqType()));
                add(new BasicNameValuePair("WithSub", listDeviceRecordsRequest.isWithSub() ? "1" : "0"));
            }
        }, JSON.toJSONString(listDeviceRecordsRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), ListDeviceRecordsResponse.class);
    }

    @Override
    public ListStreamRecordsResponseV3 listStreamRecords(ListStreamRecordsRequestV3 listStreamRecordsRequestV3) throws Exception {
        if (listStreamRecordsRequestV3.getReqType() == null) {
            listStreamRecordsRequestV3.setReqType("");
        }
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoListStreamRecords, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("PageNumber", Integer.toString(listStreamRecordsRequestV3.getPageNumber())));
                add(new BasicNameValuePair("PageSize", Integer.toString(listStreamRecordsRequestV3.getPageSize())));
            }
        }, JSON.toJSONString(listStreamRecordsRequestV3));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), ListStreamRecordsResponseV3.class);
    }

    @Override
    public CloudPlayResponse cloudRecordPlay(CloudRecordPlayRequest cloudRecordPlayArgs) throws Exception {
        if ((cloudRecordPlayArgs.getStartTs().getClass() != Integer.class) && (cloudRecordPlayArgs.getStartTs().getClass() != String.class)) {
            throw new InvalidParameterException("startTs object type " + cloudRecordPlayArgs.getStartTs().getClass().getName() + " is not allowed, Integer or String is allowed");
        }
        if ((cloudRecordPlayArgs.getEndTs().getClass() != Integer.class) && (cloudRecordPlayArgs.getEndTs().getClass() != String.class)) {
            throw new InvalidParameterException("endTs object type " + cloudRecordPlayArgs.getStartTs().getClass().getName() + " is not allowed, Integer or String is allowed");
        }
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoCloudRecordPlay, new ArrayList<NameValuePair>() {
        }, JSON.toJSONString(cloudRecordPlayArgs));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CloudPlayResponse.class);
    }

    @Override
    public PlayCloudResponse playCloudRecord(PlayCloudRecordRequest playCloudRecordRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoPlayCloudRecord, new ArrayList<NameValuePair>() {
        }, JSON.toJSONString(playCloudRecordRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), PlayCloudResponse.class);
    }

    @Override
    public IDResponse genSipID(String sipServerID, String deviceType) throws Exception {
        com.volcengine.model.response.RawResponse response = query(Const.AIoTVideoGenSipID, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("SipServerID", sipServerID));
                add(new BasicNameValuePair("DeviceType", deviceType));
            }
        });
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), IDResponse.class);
    }

    @Override
    public IDResponse genSipIDBySpaceID(String spaceID, String deviceType) throws Exception {
        com.volcengine.model.response.RawResponse response = query(Const.AIoTVideoGenSipID, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("SpaceID", spaceID));
                add(new BasicNameValuePair("DeviceType", deviceType));
            }
        });
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), IDResponse.class);
    }

    @Override
    public GetDeviceChannelResponse getDeviceChannels(GetDeviceChannelRequest getDeviceChannelRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = query(Const.AIoTVideoGetDeviceChannels, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("DeviceID", getDeviceChannelRequest.getDeviceID()));
                add(new BasicNameValuePair("QueryMode", getDeviceChannelRequest.getQueryMode()));
            }
        });
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), GetDeviceChannelResponse.class);
    }

    @Override
    public GetDeviceChannelV2Response getDeviceChannelsV2(GetDeviceChannelV2Request getDeviceChannelRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = query(Const.AIoTVideoGetDeviceChannelsV2, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("DeviceID", getDeviceChannelRequest.getDeviceID()));
                add(new BasicNameValuePair("QueryMode", getDeviceChannelRequest.getQueryMode()));
            }
        });
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), GetDeviceChannelV2Response.class);
    }


    @Override
    public RawResponse setAlarmGuard(SetAlarmGuardRequest setAlarmGuardRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoSetAlarmGuard, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("DeviceNSID", setAlarmGuardRequest.getDeviceNSID()));
                add(new BasicNameValuePair("Enable", setAlarmGuardRequest.getEnable()));
                add(new BasicNameValuePair("SipID", setAlarmGuardRequest.getSipID()));
                add(new BasicNameValuePair("ChannelID", setAlarmGuardRequest.getChannelID()));
            }
        }, "");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RawResponse.class);
    }

    @Override
    public RawResponse resetAlarm(ResetAlarmRequest resetAlarmRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoResetAlarm, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("DeviceNSID", resetAlarmRequest.getDeviceNSID()));
                add(new BasicNameValuePair("SipID", resetAlarmRequest.getSipID()));
                add(new BasicNameValuePair("ChannelID", resetAlarmRequest.getChannelID()));
            }
        }, "");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RawResponse.class);
    }

    @Override
    public ListAlarmNotifyResponse listAlarmNotify(ListAlarmNotifyRequest listAlarmNotifyRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoListAlarmNotify, new ArrayList<NameValuePair>() {
        }, JSON.toJSONString(listAlarmNotifyRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), ListAlarmNotifyResponse.class);
    }

    @Override
    public RawResponse deleteAlarmNotify(String alarmNotifyID) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoDeleteAlarmNotify, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("AlarmNotifyID", alarmNotifyID));
            }
        }, "");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RawResponse.class);
    }

    @Override
    public RawResponse deleteAlarmNotifyAll(String spaceID, String deviceNSID) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoDeleteAlarmNotifyAll, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("SpaceID", spaceID));
                add(new BasicNameValuePair("DeviceID", deviceNSID));
            }
        }, "");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RawResponse.class);
    }

    @Override
    public RawResponse cloudControl(DeviceCloudControlRequest deviceCloudControlRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoCloudControl, new ArrayList<NameValuePair>() {
        }, JSON.toJSONString(deviceCloudControlRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RawResponse.class);
    }

    @Override
    public DeviceQueryPresetResponse queryPresetInfo(DeviceQueryPresetRequest queryPresetRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoQueryPresetInfo, new ArrayList<NameValuePair>() {
        }, JSON.toJSONString(queryPresetRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), DeviceQueryPresetResponse.class);
    }

    @Override
    public RawResponse cruiseControl(DeviceCruiseControlRequest deviceCruiseControlRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoCruiseControl, new ArrayList<NameValuePair>() {
        }, JSON.toJSONString(deviceCruiseControlRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RawResponse.class);
    }

    @Override
    public RawResponse setCruiseTrack(SetCruiseTrackRequest setCruiseTrackRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoSetCruiseTrack, new ArrayList<NameValuePair>() {
        }, JSON.toJSONString(setCruiseTrackRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RawResponse.class);
    }

    @Override
    public GetCruiseTrackResponse getCruiseTrack(GetCruiseTrackRequest getCruiseTrackRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = query(Const.AIoTVideoGetCruiseTrack, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("DeviceNSID", getCruiseTrackRequest.getDeviceNSID()));
                add(new BasicNameValuePair("ChannelID", getCruiseTrackRequest.getChannelID()));
                add(new BasicNameValuePair("TrackID", Integer.toString(getCruiseTrackRequest.getTrackID())));
            }
        });
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), GetCruiseTrackResponse.class);
    }

    @Override
    public ListCruiseTracksResponse listCruiseTracks(ListCruiseTracksRequest listCruiseTracksRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = query(Const.AIoTVideoListCruiseTracks, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("DeviceNSID", listCruiseTracksRequest.getDeviceNSID()));
                add(new BasicNameValuePair("ChannelID", listCruiseTracksRequest.getChannelID()));
            }
        });
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), ListCruiseTracksResponse.class);
    }

    @Override
    public RawResponse deleteCruiseTrack(DeleteCruiseTrackRequest deleteCruiseTrackRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoDeleteCruiseTrack, new ArrayList<NameValuePair>() {
        }, JSON.toJSONString(deleteCruiseTrackRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RawResponse.class);
    }

    @Override
    public RawResponse startCruiseTrack(StartCruiseTrackRequest startCruiseTrackRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoStartCruiseTrack, new ArrayList<NameValuePair>() {
        }, JSON.toJSONString(startCruiseTrackRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RawResponse.class);
    }

    @Override
    public RawResponse stopCruiseTrack(StopCruiseTrackRequest stopCruiseTrackRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoStopCruiseTrack, new ArrayList<NameValuePair>() {
        }, JSON.toJSONString(stopCruiseTrackRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RawResponse.class);
    }

    //流相关
    @Override
    public GetStreamResponse getStream(GetStreamRequest getStreamRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = query(Const.AIoTVideoGetStream, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("StreamID", getStreamRequest.getStreamID()));
                add(new BasicNameValuePair("FreshExpiredPull", getStreamRequest.getFreshExpiredPull()));
                add(new BasicNameValuePair("FreshExpiredPush", getStreamRequest.getFreshExpiredPush()));
                add(new BasicNameValuePair("StreamingIndex", String.valueOf(getStreamRequest.getStreamingIndex())));
                add(new BasicNameValuePair("Resolution", getStreamRequest.getResolution()));
            }
        });
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), GetStreamResponse.class);
    }

    @Override
    public ListStreamsResponse listStreams(ListStreamsRequest listStreamsRequest) throws Exception {
        ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("SpaceID", listStreamsRequest.getSpaceID()));
                add(new BasicNameValuePair("PageSize", Integer.toString(listStreamsRequest.getPageSize())));
                add(new BasicNameValuePair("PageNumber", Integer.toString(listStreamsRequest.getPageNumber())));
            }
        };
        if (listStreamsRequest.getStreamName() != null) {
            nameValuePairs.add(new BasicNameValuePair("StreamName", listStreamsRequest.getStreamName()));
        }
        com.volcengine.model.response.RawResponse response = query(Const.AIoTVideoListStreams, nameValuePairs);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), ListStreamsResponse.class);
    }

    @Override
    public IDResponse updateStream(UpdateStreamRequest updateStreamRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoUpdateStream, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("SpaceID", updateStreamRequest.getSpaceID()));
                add(new BasicNameValuePair("StreamID", updateStreamRequest.getStreamID()));
            }
        }, JSON.toJSONString(updateStreamRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), IDResponse.class);
    }

    @Override
    public StartStreamResponse startStream(StreamRequest startStream) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoStartStream, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("StreamID", startStream.getStreamID()));
                add(new BasicNameValuePair("EnableAudioTranscode", startStream.isEnableAudioTranscode() ? "1" : "0"));
                add(new BasicNameValuePair("IgnoreAudio", startStream.isIgnoreAudio() ? "1" : "0"));
            }
        }, JSON.toJSONString(startStream));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), StartStreamResponse.class);
    }

    @Override
    public IDResponse stopStream(StreamRequest stopStream) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoStopStream, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("StreamID", stopStream.getStreamID()));
                add(new BasicNameValuePair("IsSmart", stopStream.getIsSmart()));
            }
        }, JSON.toJSONString(stopStream));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), IDResponse.class);
    }

    @Override
    public StreamLogsResponse streamLogs(StreamLogsRequest streamLogs) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoStreamLogs, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("StartTs", streamLogs.getStartTs()));
                add(new BasicNameValuePair("EndTs", streamLogs.getEndTs()));
                add(new BasicNameValuePair("StreamID", streamLogs.getStreamID()));
            }
        }, "");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), StreamLogsResponse.class);
    }

    @Override
    public IDResponse createStream(CreateStreamRequest createStream) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoCreateStream, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("SpaceID", createStream.getSpaceID()));
            }
        }, JSON.toJSONString(createStream));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), IDResponse.class);
    }

    @Override
    public IDResponse deleteStream(StreamRequest deleteStream) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoDeleteStream, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("StreamID", deleteStream.getStreamID()));
            }
        }, "");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), IDResponse.class);
    }

    @Override
    public StatStreamResponse statStream(StatStreamRequest statStreamRequest) throws Exception {
        List<NameValuePair> pairs = new ArrayList<>();
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoStatStream, pairs, JSON.toJSONString(statStreamRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), StatStreamResponse.class);
    }

    @Override
    public IDResponse streamStartRecord(StreamStartRecordRequest streamStartRecordRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoStreamStartRecord, new ArrayList<NameValuePair>() {
        }, JSON.toJSONString(streamStartRecordRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), IDResponse.class);
    }

    @Override
    public RawResponse streamStopRecord(String recordID) throws Exception {
        ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("RecordID", recordID));
            }
        };
        com.volcengine.model.response.RawResponse response = query(Const.AIoTVideoStreamStopRecord, nameValuePairs);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RawResponse.class);
    }

    @Override
    public GetStreamRecordResponse getStreamRecord(String recordID) throws Exception {
        ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("RecordID", recordID));
            }
        };
        com.volcengine.model.response.RawResponse response = query(Const.AIoTVideoGetStreamRecord, nameValuePairs);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), GetStreamRecordResponse.class);
    }

    @Override
    public DeleteStreamRecordResponse deleteStreamRecord(String recordID) throws Exception {
        ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("RecordID", recordID));
            }
        };
        com.volcengine.model.response.RawResponse response = query(Const.AIoTVideoDeleteStreamRecord, nameValuePairs);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), DeleteStreamRecordResponse.class);
    }

    @Override
    public GetStreamDataResponse getStreamData(GetStreamDataRequest getStreamData) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoGetStreamData, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("StreamID", getStreamData.getStreamID()));
                add(new BasicNameValuePair("StartTime", getStreamData.getStartTime()));
                add(new BasicNameValuePair("EndTime", getStreamData.getEndTime()));
            }
        }, "");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), GetStreamDataResponse.class);
    }

    @Override
    public IDResponse forbidStream(String streamID) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoForbidStream, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("StreamID", streamID));
            }
        }, "");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), IDResponse.class);
    }

    @Override
    public IDResponse forbidStream(StreamRequest streamRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoForbidStream, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("StreamID", streamRequest.getStreamID()));
            }
        }, JSON.toJSONString(streamRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), IDResponse.class);
    }

    @Override
    public IDResponse unForbidStream(String streamID) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoUnforbidStream, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("StreamID", streamID));
            }
        }, "");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), IDResponse.class);
    }

    @Override
    public IDResponse allowStream(StreamRequest streamRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoUnforbidStream, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("StreamID", streamRequest.getStreamID()));
            }
        }, JSON.toJSONString(streamRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), IDResponse.class);
    }

    @Override
    public GetRecordResponse getRecordList(GetRecordListRequest request) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoGetRecordList, new ArrayList<NameValuePair>() {
            {
            }
        }, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), GetRecordResponse.class);
    }

    @Override
    public GetRecordV2Response getRecordListV2(GetRecordListV2Request request) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoGetRecordListV2, new ArrayList<NameValuePair>() {
            {
            }
        }, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), GetRecordV2Response.class);
    }

    @Override
    public GetRecordV3Response getRecordListV3(GetRecordListV3Request request) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoGetRecordListV3, new ArrayList<NameValuePair>() {
            {
            }
        }, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), GetRecordV3Response.class);
    }

    @Override
    public PlaybackStartResponse playbackStart(PlaybackStartRequest request) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoPlaybackStart, new ArrayList<NameValuePair>() {
            {
            }
        }, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), PlaybackStartResponse.class);
    }

    @Override
    public PlaybackStartResponse playbackStartV2(PlaybackStartRequestV2 request) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoPlaybackStartV2, new ArrayList<NameValuePair>() {
            {
            }
        }, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), PlaybackStartResponse.class);
    }

    @Override
    public PlaybackStatResponse playbackStat(String playbackStreamID) throws Exception {
        com.volcengine.model.response.RawResponse response = query(Const.AIoTVideoPlaybackStat, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("StreamID", playbackStreamID));
            }
        });
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), PlaybackStatResponse.class);
    }

    @Override
    public IDResponse playbackStop(String playbackStreamID) throws Exception {
        com.volcengine.model.response.RawResponse response = query(Const.AIoTVideoPlaybackStop, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("StreamID", playbackStreamID));
            }
        });
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), IDResponse.class);
    }

    @Override
    public IDResponse playbackControl(PlaybackControlRequest request) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoPlaybackControl, new ArrayList<NameValuePair>() {
            {
            }
        }, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), IDResponse.class);
    }

//    @Override
//    public IDResponse createTemplate(CreateTemplateRequest createTemplateRequest, String templateType) throws Exception {
//        return null;
//    }
//
//    @Override
//    public Template getTemplate(String templateID, String templateType) throws Exception {
//        return null;
//    }
//
//    @Override
//    public IDResponse deleteTemplate(String templateID, String templateType) throws Exception {
//        return null;
//    }

    @Override
    public StartVoiceTalkResponse startVoiceTalk(StartVoiceTalkRequest startVoiceTalkRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoStartVoiceTalk, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("SpaceID", startVoiceTalkRequest.getSpaceID()));
                add(new BasicNameValuePair("DeviceNSID", startVoiceTalkRequest.getDeviceNSID()));
                add(new BasicNameValuePair("Transport", startVoiceTalkRequest.transportToString()));
            }
        }, "");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), StartVoiceTalkResponse.class);
    }

    @Override
    public RawResponse stopVoiceTalk(StopVoiceTalkRequest stopVoiceTalkRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoStopVoiceTalk, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("SpaceID", stopVoiceTalkRequest.getSpaceID()));
                add(new BasicNameValuePair("DeviceNSID", stopVoiceTalkRequest.getDeviceNSID()));
            }
        }, "");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RawResponse.class);
    }

    @Override
    public IDResponse createRecordPlan(CreateRecordPlanRequest createRecordPlanRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoCreateRecordPlan, new ArrayList<NameValuePair>() {
        }, JSON.toJSONString(createRecordPlanRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), IDResponse.class);
    }

    @Override
    public IDResponse updateRecordPlan(UpdateRecordPlanRequest updateRecordPlanRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoUpdateRecordPlan, new ArrayList<NameValuePair>() {
        }, JSON.toJSONString(updateRecordPlanRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), IDResponse.class);
    }

    @Override
    public IDResponse deleteRecordPlan(String planID) throws Exception {
        com.volcengine.model.response.RawResponse response = json(Const.AIoTVideoDeleteRecordPlan, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("PlanID", planID));
            }
        }, "");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), IDResponse.class);
    }

    @Override
    public RecordPlanResponse getRecordPlan(String planID) throws Exception {
        com.volcengine.model.response.RawResponse response = query(Const.AIoTVideoGetRecordPlan, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("PlanID", planID));
            }
        });
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RecordPlanResponse.class);
    }

    @Override
    public ListRecordPlansResponse listRecordPlans(ListRecordPlansRequest listRecordPlansRequest) throws Exception {
        com.volcengine.model.response.RawResponse response = query(Const.AIoTVideoListRecordPlans, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("FilterName", listRecordPlansRequest.getFilterName()));
            }
        });
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), ListRecordPlansResponse.class);
    }

    @Override
    public ListRecordPlanChannelsResponse listRecordPlanChannels(String planID) throws Exception {
        com.volcengine.model.response.RawResponse response = query(Const.AIoTVideoListRecordPlanChannels, new ArrayList<NameValuePair>() {
            {
                add(new BasicNameValuePair("PlanID", planID));
            }
        });
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), ListRecordPlanChannelsResponse.class);
    }
}
