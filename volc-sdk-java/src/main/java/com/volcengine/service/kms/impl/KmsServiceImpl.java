package com.volcengine.service.kms.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.Credentials;
import com.volcengine.model.request.SmsSendRequest;
import com.volcengine.model.request.iam.*;
import com.volcengine.model.request.kms.*;
import com.volcengine.model.response.CommonResponse;
import com.volcengine.model.response.SmsSendResponse;
import com.volcengine.model.response.iam.ListUsersResponse;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.response.iam.RoleGetResponse;
import com.volcengine.model.response.iam.RoleListResponse;
import com.volcengine.model.response.kms.*;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.IamConfig;
import com.volcengine.service.kms.IKmsService;
import com.volcengine.service.kms.KmsConfig;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class KmsServiceImpl extends BaseServiceImpl implements IKmsService {

    private KmsServiceImpl() {
        super(KmsConfig.serviceInfo, KmsConfig.apiInfoList);
    }

    public static IKmsService getInstance() {
        return new KmsServiceImpl();
    }

    private RawResponse commonHandlerQuery(String api, List<NameValuePair> params) throws Exception {
        RawResponse response = query(api, params);
        return response;
    }

    private RawResponse commonHandlerJson(String api, List<NameValuePair> params, Map<String, Object> reqBody) throws Exception {
        String body = JSON.toJSONString(reqBody);
        RawResponse response = json(api, params, body);
        return response;
    }

    @Override
    public CreateKeyringResponse createKeyring(CreateKeyringRequest req) throws Exception {
        List<NameValuePair> query = new ArrayList<>();
        query.add(new BasicNameValuePair("KeyringName", req.getKeyringName()));
        if (req.getKeyringType() != null && req.getKeyringType().length() != 0) {
            query.add(new BasicNameValuePair("KeyringType", req.getKeyringType()));
        }
        if (req.getDescription() != null) {
            query.add(new BasicNameValuePair("Description", req.getDescription()));
        }
        RawResponse response = commonHandlerQuery("CreateKeyring", query);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CreateKeyringResponse.class);
    }

    @Override
    public DescribeKeyringsResponse describeKeyrings(DescribeKeyringsRequest req) throws Exception {
        List<NameValuePair> query = new ArrayList<>();
        if (req.getCurrentPage() != 0) {
            query.add(new BasicNameValuePair("CurrentPage", String.valueOf(req.getCurrentPage())));
        }
        if (req.getPageSize() != 0) {
            query.add(new BasicNameValuePair("PageSize", String.valueOf(req.getPageSize())));
        }
        RawResponse response = commonHandlerQuery("DescribeKeyrings", query);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), DescribeKeyringsResponse.class);
    }

    @Override
    public UpdateKeyringResponse updateKeyring(UpdateKeyringRequest req) throws Exception {
        List<NameValuePair> query = new ArrayList<>();
        query.add(new BasicNameValuePair("KeyringName", req.getKeyringName()));
        if (req.getNewKeyringName() != null && req.getNewKeyringName().length() != 0) {
            query.add(new BasicNameValuePair("NewKeyringName", req.getNewKeyringName()));
        }
        if (req.getDescription() != null) {
            query.add(new BasicNameValuePair("Description", req.getDescription()));
        }
        RawResponse response = commonHandlerQuery("UpdateKeyring", query);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), UpdateKeyringResponse.class);
    }

    @Override
    public QueryKeyringResponse queryKeyring(QueryKeyringRequest req) throws Exception {
        List<NameValuePair> query = new ArrayList<>();
        query.add(new BasicNameValuePair("KeyringName", req.getKeyringName()));
        RawResponse response = commonHandlerQuery("QueryKeyring", query);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), QueryKeyringResponse.class);
    }

    @Override
    public CreateKeyResponse createKey(CreateKeyRequest req) throws Exception {
        List<NameValuePair> query = new ArrayList<>();
        query.add(new BasicNameValuePair("KeyringName", req.getKeyringName()));
        query.add(new BasicNameValuePair("KeyName", req.getKeyName()));

        if (req.getKeySpec() != null && req.getKeySpec().length() != 0) {
            query.add(new BasicNameValuePair("KeySpec", req.getKeySpec()));
        }
        if (req.getKeyUsage() != null && req.getKeyUsage().length() != 0) {
            query.add(new BasicNameValuePair("KeyUsage", req.getKeySpec()));
        }
        if (req.getProtectionLevel() != null && req.getProtectionLevel().length() != 0) {
            query.add(new BasicNameValuePair("ProtectionLevel", req.getKeySpec()));
        }
        if (req.getDescription() != null) {
            query.add(new BasicNameValuePair("Description", req.getDescription()));
        }
        RawResponse response = commonHandlerQuery("CreateKey", query);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CreateKeyResponse.class);
    }

    @Override
    public DescribeKeysResponse describeKeys(DescribeKeysRequest req) throws Exception {
        List<NameValuePair> query = new ArrayList<>();
        query.add(new BasicNameValuePair("KeyringName", req.getKeyringName()));
        if (req.getCurrentPage() != 0) {
            query.add(new BasicNameValuePair("CurrentPage", String.valueOf(req.getCurrentPage())));
        }
        if (req.getPageSize() != 0) {
            query.add(new BasicNameValuePair("PageSize", String.valueOf(req.getPageSize())));
        }
        RawResponse response = commonHandlerQuery("DescribeKeys", query);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), DescribeKeysResponse.class);
    }

    @Override
    public UpdateKeyResponse updateKey(UpdateKeyRequest req) throws Exception {
        List<NameValuePair> query = new ArrayList<>();
        query.add(new BasicNameValuePair("KeyringName", req.getKeyringName()));
        query.add(new BasicNameValuePair("KeyName", req.getKeyName()));

        if (req.getNewKeyName() != null && req.getNewKeyName().length() != 0) {
            query.add(new BasicNameValuePair("NewKeyName", req.getNewKeyName()));
        }
        if (req.getDescription() != null) {
            query.add(new BasicNameValuePair("Description", req.getDescription()));
        }
        RawResponse response = commonHandlerQuery("UpdateKey", query);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), UpdateKeyResponse.class);
    }

    @Override
    public GenerateDataKeyResponse generateDataKey(GenerateDataKeyRequest req) throws Exception {
        List<NameValuePair> query = new ArrayList<>();
        query.add(new BasicNameValuePair("KeyringName", req.getKeyringName()));
        query.add(new BasicNameValuePair("KeyName", req.getKeyName()));
        if (req.getNumberOfBytes() != 0) {
            query.add(new BasicNameValuePair("NumberOfBytes", String.valueOf(req.getNumberOfBytes())));
        }

        Map<String, Object> reqBody = new HashMap<>();
        if (req.getEncryptionContext() != null) {
            reqBody.put("EncryptionContext", req.getEncryptionContext());
        }
        RawResponse response = commonHandlerJson("GenerateDataKey", query, reqBody);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), GenerateDataKeyResponse.class);
    }

    @Override
    public EncryptResponse encrypt(EncryptRequest req) throws Exception {
        List<NameValuePair> query = new ArrayList<>();
        query.add(new BasicNameValuePair("KeyringName", req.getKeyringName()));
        query.add(new BasicNameValuePair("KeyName", req.getKeyName()));
        Map<String, Object> reqBody = new HashMap<>();
        if (req.getEncryptionContext() != null) {
            reqBody.put("EncryptionContext", req.getEncryptionContext());
        }
        reqBody.put("Plaintext", req.getPlaintext());
        RawResponse response = commonHandlerJson("Encrypt", query, reqBody);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), EncryptResponse.class);
    }

    @Override
    public DecryptResponse decrypt(DecryptRequest req) throws Exception {
        List<NameValuePair> query = new ArrayList<>();
        Map<String, Object> reqBody = new HashMap<>();
        if (req.getEncryptionContext() != null) {
            reqBody.put("EncryptionContext", req.getEncryptionContext());
        }
        reqBody.put("CiphertextBlob", req.getCiphertextBlob());
        RawResponse response = commonHandlerJson("Decrypt", query, reqBody);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), DecryptResponse.class);
    }

    @Override
    public EnableKeyResponse enableKey(EnableKeyRequest req) throws Exception {
        List<NameValuePair> query = new ArrayList<>();
        query.add(new BasicNameValuePair("KeyringName", req.getKeyringName()));
        query.add(new BasicNameValuePair("KeyName", req.getKeyName()));
        RawResponse response = commonHandlerQuery("EnableKey", query);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), EnableKeyResponse.class);
    }

    @Override
    public DisableKeyResponse disable(DisableKeyRequest req) throws Exception {
        List<NameValuePair> query = new ArrayList<>();
        query.add(new BasicNameValuePair("KeyringName", req.getKeyringName()));
        query.add(new BasicNameValuePair("KeyName", req.getKeyName()));
        RawResponse response = commonHandlerQuery("DisableKey", query);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), DisableKeyResponse.class);
    }

    @Override
    public ScheduleKeyDeletionResponse scheduleKeyDeletion(ScheduleKeyDeletionRequest req) throws Exception {
        List<NameValuePair> query = new ArrayList<>();
        query.add(new BasicNameValuePair("KeyringName", req.getKeyringName()));
        query.add(new BasicNameValuePair("KeyName", req.getKeyName()));
        if (req.getPendingWindowInDays() != 0) {
            query.add(new BasicNameValuePair("PendingWindowInDays", String.valueOf(req.getKeyName())));
        }
        RawResponse response = commonHandlerQuery("ScheduleKeyDeletion", query);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), ScheduleKeyDeletionResponse.class);
    }

    @Override
    public CancelKeyDeletionResponse cancelKeyDeletion(CancelKeyDeletionRequest req) throws Exception {
        List<NameValuePair> query = new ArrayList<>();
        query.add(new BasicNameValuePair("KeyringName", req.getKeyringName()));
        query.add(new BasicNameValuePair("KeyName", req.getKeyName()));
        RawResponse response = commonHandlerQuery("CancelKeyDeletion", query);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CancelKeyDeletionResponse.class);
    }
}