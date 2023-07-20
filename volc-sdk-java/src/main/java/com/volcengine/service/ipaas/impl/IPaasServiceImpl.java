package com.volcengine.service.ipaas.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.ipaas.request.DetailInstanceRequest;
import com.volcengine.model.ipaas.request.ListHostRequest;
import com.volcengine.model.ipaas.request.ListInstanceRequest;
import com.volcengine.model.ipaas.response.DetailInstanceResponse;
import com.volcengine.model.ipaas.response.ListHostResponse;
import com.volcengine.model.ipaas.response.ListInstanceResponse;
import com.volcengine.model.response.RawResponse;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.ipaas.IPaasConfig;
import com.volcengine.service.ipaas.IPaasService;
import org.apache.http.HttpHost;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IPaasServiceImpl extends BaseServiceImpl implements IPaasService {

    private static final List<NameValuePair> emptyList = new ArrayList<>();
    private IPaasServiceImpl() {
        super(IPaasConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), IPaasConfig.apiInfoList);
    }

    private IPaasServiceImpl(HttpHost proxy) {
        super(IPaasConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), proxy, IPaasConfig.apiInfoList);
    }

    private IPaasServiceImpl(ServiceInfo serviceInfo) {
        super(serviceInfo, IPaasConfig.apiInfoList);
    }


    public static IPaasService getInstance() {
        return new IPaasServiceImpl();
    }

    public static IPaasService getInstance2(HttpHost proxy) {
        return new IPaasServiceImpl(proxy);
    }

    public static IPaasService getInstance(String region) throws Exception {
        ServiceInfo serviceInfo = IPaasConfig.serviceInfoMap.get(region);
        if (serviceInfo == null) {
            throw new Exception("Live not support region " + region);
        }
        return new IPaasServiceImpl(serviceInfo);
    }

    @Override
    public ListHostResponse listHost(ListHostRequest listHostRequest) throws Exception {
        ArrayList<NameValuePair> array = new ArrayList<NameValuePair>(){
            {
                add(new BasicNameValuePair("product_id", listHostRequest.getProductId()));
                add(new BasicNameValuePair("package_id", listHostRequest.getPackageID()));
                add(new BasicNameValuePair("host_id", listHostRequest.getHostID()));
                add(new BasicNameValuePair("host_id_in", listHostRequest.getHostIDIn()));
                add(new BasicNameValuePair("instance_id_in", listHostRequest.getInstanceIDIn()));
                add(new BasicNameValuePair("region", listHostRequest.getRegion()));
                add(new BasicNameValuePair("dc_in", listHostRequest.getDcIn()));
                add(new BasicNameValuePair("order_by", listHostRequest.getOrderBy()));
                add(new BasicNameValuePair("isp", String.valueOf(listHostRequest.getIsp())));
                add(new BasicNameValuePair("host_create_after", String.valueOf(listHostRequest.getHostCreateAfter())));
                add(new BasicNameValuePair("detail", Boolean.toString(listHostRequest.isDetail())));
                add(new BasicNameValuePair("is_desc", Boolean.toString(listHostRequest.isIsDesc())));
            }
        };
        if (!Objects.equals(listHostRequest.getInstanceNo(), null)) {
            array.add(new BasicNameValuePair("instance_no", listHostRequest.getInstanceNo()));
        }

        if (!Objects.equals(listHostRequest.getInstanceID(), null)) {
            array.add(new BasicNameValuePair("instance_id", listHostRequest.getInstanceID()));
        }

        if (!Objects.equals(listHostRequest.getStatus(), 0L)) {
            array.add(new BasicNameValuePair("status", String.valueOf(listHostRequest.getStatus())));
        }

        if (!Objects.equals(listHostRequest.getOffset(), 0L)) {
            array.add(new BasicNameValuePair("offset", String.valueOf(listHostRequest.getOffset())));
        }
        if (!Objects.equals(listHostRequest.getCount(), 0L)) {
            array.add(new BasicNameValuePair("count", String.valueOf(listHostRequest.getCount())));
        }

        RawResponse response = query(Const.IPaasListHost, array);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ListHostResponse.class);
    }

    @Override
    public ListInstanceResponse listInstance(ListInstanceRequest listInstanceRequest) throws Exception {
        ArrayList<NameValuePair> array = new ArrayList<NameValuePair>(){
            {
                add(new BasicNameValuePair("product_id", listInstanceRequest.getProductId()));
                add(new BasicNameValuePair("instance_id_in", listInstanceRequest.getInstanceIDIn()));
                add(new BasicNameValuePair("instance_id_like", listInstanceRequest.getInstanceIDLike()));
                add(new BasicNameValuePair("detail", Boolean.toString(listInstanceRequest.isDetail())));
                add(new BasicNameValuePair("is_order_asc", Boolean.toString(listInstanceRequest.isIsOrderASC())));
            }
        };
        if (!Objects.equals(listInstanceRequest.getPackageID(), null)) {
            array.add(new BasicNameValuePair("package_id", listInstanceRequest.getPackageID()));
        }
        if (!Objects.equals(listInstanceRequest.getPackageID(), null)) {
            array.add(new BasicNameValuePair("instance_id", listInstanceRequest.getInstanceID()));
        }
        if (!Objects.equals(listInstanceRequest.getPackageID(), null)) {
            array.add(new BasicNameValuePair("host_id", listInstanceRequest.getHostID()));
        }
        if (!Objects.equals(listInstanceRequest.getStatus(), 0L)) {
            array.add(new BasicNameValuePair("status", String.valueOf(listInstanceRequest.getStatus())));
        }
        if (!Objects.equals(listInstanceRequest.getIsp(), 0L)) {
            array.add(new BasicNameValuePair("isp", String.valueOf(listInstanceRequest.getIsp())));
        }
        if (!Objects.equals(listInstanceRequest.getDC(), null)) {
            array.add(new BasicNameValuePair("dc", listInstanceRequest.getDC()));
        }
        if (!Objects.equals(listInstanceRequest.getTagID(), null)) {
            array.add(new BasicNameValuePair("tag_id", listInstanceRequest.getTagID()));
        }
        if (!Objects.equals(listInstanceRequest.getAdbKeyID(), 0L)) {
            array.add(new BasicNameValuePair("adb_key_id", String.valueOf(listInstanceRequest.getAdbKeyID())));
        }
        if (!Objects.equals(listInstanceRequest.getSecurityGroupID(), 0L)) {
            array.add(new BasicNameValuePair("security_group_id", String.valueOf(listInstanceRequest.getSecurityGroupID())));
        }
        if (!Objects.equals(listInstanceRequest.getSGBoundSt(), 0L)) {
            array.add(new BasicNameValuePair("sg_bound_st", String.valueOf(listInstanceRequest.getSGBoundSt())));
        }
        if (!Objects.equals(listInstanceRequest.getOffset(), 0L)) {
            array.add(new BasicNameValuePair("offset", String.valueOf(listInstanceRequest.getOffset())));
        }
        if (!Objects.equals(listInstanceRequest.getCount(), 0L)) {
            array.add(new BasicNameValuePair("count", String.valueOf(listInstanceRequest.getCount())));
        }
        if (!Objects.equals(listInstanceRequest.getCount(), 0L)) {
            array.add(new BasicNameValuePair("count", String.valueOf(listInstanceRequest.getCount())));
        }
        if (!Objects.equals(listInstanceRequest.getOrderBy(), null)) {
            array.add(new BasicNameValuePair("order_by", listInstanceRequest.getTagID()));
        }
        if (!Objects.equals(listInstanceRequest.getStatusIn(), null)) {
            array.add(new BasicNameValuePair("status_in", listInstanceRequest.getStatusIn()));
        }
        if (!Objects.equals(listInstanceRequest.getTagIDIn(), null)) {
            array.add(new BasicNameValuePair("tag_id_in", listInstanceRequest.getTagIDIn()));
        }

        RawResponse response = query(Const.IPaasListInstance, array);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ListInstanceResponse.class);
    };

    @Override
    public DetailInstanceResponse detailInstance(DetailInstanceRequest DetailInstanceRequest) throws Exception {
        ArrayList<NameValuePair> array = new ArrayList<NameValuePair>(){
            {
                add(new BasicNameValuePair("instance_id", DetailInstanceRequest.getInstanceID()));
                add(new BasicNameValuePair("sn", DetailInstanceRequest.getSN()));
            }
        };

        RawResponse response = query(Const.IPaasDetailInstance, array);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), DetailInstanceResponse.class);
    }
}
