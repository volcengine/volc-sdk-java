package com.volcengine.service.videoaiot;

import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.Credentials;
import com.volcengine.model.ServiceInfo;
import org.apache.http.Header;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VideoAIoTConfig {
    public static Map<String, ServiceInfo> serviceInfoMap = new HashMap<String, ServiceInfo>() {
        {
            put(Const.REGION_CN_NORTH_1, new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.CONNECTION_TIMEOUT, 5000);
                            put(Const.SOCKET_TIMEOUT, 5000);
                            put(Const.Scheme, "https");
                            put(Const.Host, "open.volcengineapi.com");
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new BasicHeader("Accept", "application/json"));
                                }
                            });
                            put(Const.Credentials, new Credentials(Const.REGION_CN_NORTH_1, "aiotvideo"));
                        }
                    }
            ));
        }
    };

    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put(Const.AIoTVideoCreateSpace, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoCreateSpace));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoGetSpace, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoGetSpace));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoListSpace, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoListSpace));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoGetDataProjectWithBindWidthAndFlow, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoGetDataProjectWithBindWidthAndFlow));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoGetTotalData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoGetTotalData));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoDeleteSpace, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoDeleteSpace));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoUpdateSpace, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoUpdateSpace));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoStartSpace, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoStartSpace));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoStopSpace, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoStopSpace));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));

            //TEMPLATES
            put(Const.VideoAIoTCreateRecordTemplate, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.VideoAIoTCreateRecordTemplate));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));

            put(Const.AIoTVideoSetSpaceTemplate, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoSetSpaceTemplate));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));


            put(Const.AIoTVideoGetSpaceTemplate, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoGetSpaceTemplate));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));

            put(Const.AIoTVideoCancelBindTemplate, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoCancelBindTemplate));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));

            put(Const.AIoTVideoUpdateAuthInSpace, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoUpdateAuthInSpace));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));

            put(Const.AIoTVideoDisableAuthInSpace, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoDisableAuthInSpace));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));

            put(Const.AIoTVideoCreateDevice, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoCreateDevice));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));

            put(Const.AIoTVideoStartDevice, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoStartDevice));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoStopDevice, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoStopDevice));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoListDevice, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoListDevice));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoUpdateDevice, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoUpdateDevice));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoListDeviceScreenshot, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoListDeviceScreenshot));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoListDeviceRecords, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoListDeviceRecords));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoCloudRecordPlay, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoCloudRecordPlay));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoLocalMediaDownload, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoLocalMediaDownload));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));

            put(Const.AIoTVideoFreshDevice, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoFreshDevice));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoDeleteDevice, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoDeleteDevice));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoGetDevice, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoGetDevice));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoGenSipID, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoGenSipID));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoGetDeviceChannels, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoGetDeviceChannels));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoGetDeviceChannelsV2, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoGetDeviceChannelsV2));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            //stream
            put(Const.AIoTVideoGetStream, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoGetStream));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));

            put(Const.AIoTVideoSetAlarmGuard, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoSetAlarmGuard));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoResetAlarm, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoResetAlarm));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoListAlarmNotify, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoListAlarmNotify));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoDeleteAlarmNotify, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoDeleteAlarmNotify));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoDeleteAlarmNotifyAll, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoDeleteAlarmNotifyAll));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoCloudControl, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoCloudControl));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoQueryPresetInfo, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoQueryPresetInfo));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoCruiseControl, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoCruiseControl));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoListStreams, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoListStreams));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoStreamLogs, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoStreamLogs));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoGetStreamData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoGetStreamData));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoStreamStartRecord, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoStreamStartRecord));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoStreamStopRecord, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoStreamStopRecord));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoGetStreamRecord, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoGetStreamRecord));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoDeleteStreamRecord, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoDeleteStreamRecord));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoUpdateStream, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoUpdateStream));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));

            put(Const.AIoTVideoStartStream, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoStartStream));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoStopStream, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoStopStream));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoCreateStream, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoCreateStream));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoDeleteStream, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoDeleteStream));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoForbidStream, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoForbidStream));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoUnforbidStream, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoUnforbidStream));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoStartVoiceTalk, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoStartVoiceTalk));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoStopVoiceTalk, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoStopVoiceTalk));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            //record
            put(Const.AIoTVideoGetRecordList, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoGetRecordList));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoGetRecordListV2, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoGetRecordListV2));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoPlaybackStat, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoPlaybackStat));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoPlaybackStart, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoPlaybackStart));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoPlaybackStop, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoPlaybackStop));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
            put(Const.AIoTVideoPlaybackControl, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AIoTVideoPlaybackControl));
                                    add(new BasicNameValuePair("Version", Const.VideoAIoTSDKVersion));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
