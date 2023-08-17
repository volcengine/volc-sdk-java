package com.volcengine.service.tls;

import com.alibaba.fastjson.JSONObject;
import com.volcengine.error.SdkError;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.tls.ClientConfig;
import com.volcengine.model.tls.Const;
import com.volcengine.model.tls.DescribeRulesRequest;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import com.volcengine.model.tls.util.AdaptorUtil;
import com.volcengine.model.tls.util.MessageUtil;
import com.volcengine.model.tls.util.TimeUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.Header;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import static com.volcengine.model.tls.Const.*;
import static com.volcengine.model.tls.producer.ProducerConfig.EXTERNAL_ERROR;
import static com.volcengine.model.tls.producer.ProducerConfig.TOO_MANY_REQUEST_ERROR;

public class TLSLogClientImpl implements TLSLogClient {

    public static int DEFAULT_RETRY_INTERVAL_MS = 100;
    public static int DEFAULT_REQUEST_TIMEOUT_MS = 30 * 1000;
    public static int DEFAULT_RETRY_COUNTER_MAXIMUM = 50;

    private static AtomicInteger DEFAULT_RETRY_COUNTER = new AtomicInteger(0);
    private ClientConfig config;
    private final TLSHttpUtil httpRequest;

    public TLSLogClientImpl(TLSHttpUtil util, ClientConfig config) {
        this.httpRequest = util;
        this.config = config;
    }

    private static void increaseCounterByOne() {
        while (true) {
            int v = DEFAULT_RETRY_COUNTER.get();
            if (v >= DEFAULT_RETRY_COUNTER_MAXIMUM) {
                break;
            }
            boolean cas = DEFAULT_RETRY_COUNTER.compareAndSet(v, v + 1);
            if (cas) {
                break;
            }
        }
    }

    private static void decreaseCounterByOne() {
        while (true) {
            int v = DEFAULT_RETRY_COUNTER.get();
            if (v <= 0) {
                break;
            }
            boolean cas = DEFAULT_RETRY_COUNTER.compareAndSet(v, v - 1);
            if (cas) {
                break;
            }
        }
    }

    @Override
    public void configClient(ClientConfig config) {
        this.config = config;
        httpRequest.setServiceInfo(ClientConfig.initServiceInfo(config));
    }

    @Override
    public void resetAccessKeyToken(String accessKeyID, String accessKeySecret, String securityToken) {
        httpRequest.setAccessKey(accessKeyID);
        httpRequest.setSecretKey(accessKeySecret);
        httpRequest.setSessionToken(securityToken);
    }

    /**
     * @param socketTimeout     time ms
     * @param connectionTimeout time ms
     */
    @Override
    public void setTimeout(int socketTimeout, int connectionTimeout) {
        httpRequest.setSocketTimeout(socketTimeout);
        httpRequest.setConnectionTimeout(connectionTimeout);
        DEFAULT_REQUEST_TIMEOUT_MS = socketTimeout;
    }

    @Override
    public PutLogsResponse putLogs(PutLogsRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        ArrayList<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair(TOPIC_ID, request.getTopicId()));
        HashMap<String, String> headers = new HashMap<>();
        if (request.getHashKey() != null) {
            headers.put(X_TLS_HASHKEY, request.getHashKey());
        }
        String compressType = request.getCompressType();
        if (compressType != null) {
            headers.put(X_TLS_COMPRESS_TYPE, compressType);
            headers.put(X_TLS_BODY_RAW_SIZE, String.valueOf(request.getLogGroupList().toByteArray().length));
        }
        // 2、check sum and sendRequest
        RawResponse rawResponse = doProtoRetryRequest(PUT_LOGS, params, headers, request.getLogGroupList().toByteArray(), compressType);
        // 3、parse response
        return new PutLogsResponse(rawResponse.getHeaders());
    }

    @Override
    public PutLogsResponse putLogsV2(PutLogsRequestV2 request) throws LogException {
        // 1、check params, topic id is required params
        if (request == null || StringUtils.isEmpty(request.getTopicId()) || request.getLogs() == null) {
            throw new LogException("InvalidArgument", "Request is:" + request, null);
        }
        // 2、prepare request
        ArrayList<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair(TOPIC_ID, request.getTopicId()));
        HashMap<String, String> headers = new HashMap<>();
        if (request.getHashKey() != null) {
            headers.put(X_TLS_HASHKEY, request.getHashKey());
        }
        PutLogRequest.LogGroupList logGroupList = AdaptorUtil.logItems2PbGroupList(request.getPath(), request.getSource(), request.getLogs());
        String compressType = request.getCompressType();
        if (compressType != null) {
            headers.put(X_TLS_COMPRESS_TYPE, compressType);
            headers.put(X_TLS_BODY_RAW_SIZE, String.valueOf(logGroupList.toByteArray().length));
        }
        // 3、check sum and sendRequest
        RawResponse rawResponse = doProtoRetryRequest(PUT_LOGS, params, headers, logGroupList.toByteArray(), compressType);
        // 4、parse response
        return new PutLogsResponse(rawResponse.getHeaders());
    }

    @Override
    public DescribeCursorResponse describeCursor(DescribeCursorRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        ArrayList<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair(TOPIC_ID, request.getTopicId()));
        params.add(new BasicNameValuePair(SHARD_ID, String.valueOf(request.getShardId())));
        String requestBody = JSONObject.toJSONString(request);
        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(DESCRIBE_CURSOR, params, requestBody);
        // 3、parse response
        return new DescribeCursorResponse(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), DescribeCursorResponse.class);

    }

    @Override
    public ConsumeLogsResponse consumeLogs(ConsumeLogsRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        ArrayList<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair(TOPIC_ID, request.getTopicId()));
        params.add(new BasicNameValuePair(SHARD_ID, String.valueOf(request.getShardId())));
        String requestBody = JSONObject.toJSONString(request);
        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(CONSUME_LOGS, params, requestBody);
        // 3、parse response
        return new ConsumeLogsResponse(rawResponse.getHeaders(), request.getCompression()).deSerialize(rawResponse.getData(), ConsumeLogsResponse.class);
    }

    @Override
    public SearchLogsResponse searchLogs(SearchLogsRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        ArrayList<NameValuePair> params = new ArrayList<>();
        String requestBody = JSONObject.toJSONString(request);
        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(SEARCH_LOGS, params, requestBody);
        // 3、parse response
        return new SearchLogsResponse(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), SearchLogsResponse.class);
    }

    @Override
    public SearchLogsResponseV2 searchLogsV2(SearchLogsRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        ArrayList<NameValuePair> params = new ArrayList<>();
        String requestBody = JSONObject.toJSONString(request);
        Map<String, String> headers = new HashMap<>();
        headers.put(HEADER_API_VERSION, API_VERSION_V_0_3_0);
        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(SEARCH_LOGS, params, requestBody, headers);
        // 3、parse response
        return new SearchLogsResponseV2(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), SearchLogsResponseV2.class);
    }

    @Override
    public DescribeShardsResponse describeShards(DescribeShardsRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        ArrayList<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair(TOPIC_ID, request.getTopicId()));
        if (request.getPageNumber() != null) {
            params.add(new BasicNameValuePair(PAGE_NUMBER, String.valueOf(request.getPageNumber())));
        }
        if (request.getPageSize() != null) {
            params.add(new BasicNameValuePair(PAGE_SIZE, String.valueOf(request.getPageSize())));
        }
        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(DESCRIBE_SHARDS, params, Const.EMPTY_JSON);
        // 3、parse response
        return new DescribeShardsResponse(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), DescribeShardsResponse.class);
    }

    @Override
    public DescribeLogContextResponse describeLogContext(DescribeLogContextRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1. prepare request
        ArrayList<NameValuePair> params = new ArrayList<>();
        String requestBody = JSONObject.toJSONString(request);

        // 2. check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(DESCRIBE_LOG_CONTEXT, params, requestBody);

        // 3. parse response
        return new DescribeLogContextResponse(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), DescribeLogContextResponse.class);
    }

    @Override
    public WebTracksResponse webTracks(WebTracksRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        String compressType = request.getCompressType();
        ArrayList<NameValuePair> params = new ArrayList<>();
        {
            if (StringUtils.isNotEmpty(request.getTopicId())) {
                params.add(new BasicNameValuePair(TOPIC_ID, String.valueOf(request.getTopicId())));
            }
            if (StringUtils.isNotEmpty(request.getProjectId())) {
                params.add(new BasicNameValuePair(PROJECT_ID, String.valueOf(request.getProjectId())));
            }
        }
        String requestBody = JSONObject.toJSONString(request);
        HashMap<String, String> headers = new HashMap<>();
        {
            headers.put("Content-Type", "application/json");
            if (compressType != null) {
                headers.put(X_TLS_COMPRESS_TYPE, compressType);
                headers.put(X_TLS_BODY_RAW_SIZE, String.valueOf(requestBody.length()));
            }
        }

        // 2、check sum and sendRequest
        RawResponse rawResponse = doProtoRetryRequest(WEB_TRACKS, params, headers, requestBody.getBytes(), compressType);

        // 3、parse response
        return new WebTracksResponse(rawResponse.getHeaders());
    }

    @Override
    public DescribeHistogramResponse describeHistogram(DescribeHistogramRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1. prepare request
        ArrayList<NameValuePair> params = new ArrayList<>();
        String requestBody = JSONObject.toJSONString(request);

        // 2. check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(DESCRIBE_HISTOGRAM, params, requestBody);

        // 3. parse response
        return new DescribeHistogramResponse(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), DescribeHistogramResponse.class);
    }

    /**
     * @param request:projectName、region are required，description of project is optional
     * @return CreateProjectResponse:requestId and projectId
     * @throws LogException
     */
    @Override
    public CreateProjectResponse createProject(CreateProjectRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        String requestBody = JSONObject.toJSONString(request);

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(Const.CREATE_PROJECT, new ArrayList<>(), requestBody);

        // 3、parse response
        return new CreateProjectResponse(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), CreateProjectResponse.class);
    }

    private RawResponse sendJsonRequest(String path, ArrayList<NameValuePair> query, String requestBody) throws LogException {
        return sendJsonRequest(path, query, requestBody, new HashMap<>());
    }

    private RawResponse sendJsonRequest(String path, ArrayList<NameValuePair> query, String requestBody, Map<String, String> headers) throws LogException {
        checkMd5(path, requestBody.getBytes());

        mergeHeaders(path, headers);

        RawResponse rawResponse = doRetryRequest(path, query, requestBody);
        if (rawResponse.getCode() != SdkError.SUCCESS.getNumber()) {
            String[] error = getError(rawResponse);
            throw new LogException(rawResponse.getHttpCode(), error[0], error[1], rawResponse.getFirstHeader(X_TLS_REQUESTID));
        }
        return rawResponse;
    }

    private void mergeHeaders(String path, Map<String, String> headers) {
        if (headers == null) {
            headers = new HashMap<>();
        }
        // 默认api版本0.2.0，如果用户有header使用用户自定义的
        if (!headers.containsKey(HEADER_API_VERSION)) {
            headers.put(HEADER_API_VERSION, this.config.getApiVersion());
        }
        Map<String, ApiInfo> apiInfoList = this.httpRequest.getApiInfoList();
        ApiInfo apiInfo = apiInfoList.get(path);
        List<Header> apiHeader = new ArrayList<>();
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            apiHeader.add(new BasicHeader(entry.getKey(), entry.getValue()));
        }
        apiInfo.setHeader(apiHeader);
    }

    private RawResponse doRetryRequest(String path, ArrayList<NameValuePair> params, String requestBody) throws LogException {
        RawResponse rawResponse = null;
        long expectedQuitTimestamp = System.currentTimeMillis() + DEFAULT_REQUEST_TIMEOUT_MS;
        int tryCount = 0;
        // retry
        while (true) {
            rawResponse = httpRequest.json(path, params, requestBody);
            tryCount += 1;
            // return if request succeed or tryCount >= 5
            if (tryCount >= 5 || rawResponse.getCode() == SdkError.SUCCESS.getNumber() || !needRetryStatus(rawResponse.getHttpCode())) {
                decreaseCounterByOne();
                break;
            }
            increaseCounterByOne();
            try {
                long sleepMs = TimeUtil.calcDefaultBackOffMs(DEFAULT_RETRY_COUNTER.get(), DEFAULT_RETRY_INTERVAL_MS, expectedQuitTimestamp);
                if (sleepMs > 0) {
                    Thread.sleep(sleepMs);
                }
            } catch (InterruptedException e) {
                throw new LogException("sdk error", "retry thread interrupt exception", null);
            }
        }
        //throw exception
        if (rawResponse.getCode() != SdkError.SUCCESS.getNumber()) {
            String[] error = getError(rawResponse);
            throw new LogException(rawResponse.getHttpCode(), error[0], error[1], rawResponse.getFirstHeader(X_TLS_REQUESTID));
        }
        return rawResponse;
    }

    //429 or 5xx error retry
    private boolean needRetryStatus(int httpCode) {
        return httpCode == TOO_MANY_REQUEST_ERROR || httpCode >= EXTERNAL_ERROR;
    }

    /**
     * @param request:projectId is required
     * @return DeleteProjectResponse:requestId
     * @throws LogException
     */
    @Override
    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        String requestBody = JSONObject.toJSONString(request);

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(DELETE_PROJECT, new ArrayList<>(), requestBody);

        // 3、parse response
        return new DeleteProjectResponse(rawResponse.getHeaders());
    }

    /**
     * @param request:projectId required,name and description optional
     * @return ModifyProjectResponse:requestId
     * @throws LogException
     */
    @Override
    public ModifyProjectResponse modifyProject(ModifyProjectRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        String requestBody = JSONObject.toJSONString(request);

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(MODIFY_PROJECT, new ArrayList<>(), requestBody);

        // 3、parse response
        return new ModifyProjectResponse(rawResponse.getHeaders());
    }

    /**
     * @param request:requestId is required
     * @return DescribeProjectResponse:List of ProjectInfo，detail see {@link com.volcengine.model.tls.ProjectInfo}
     * @throws LogException
     */
    @Override
    public DescribeProjectResponse describeProject(DescribeProjectRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        ArrayList<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair(PROJECT_ID, request.getProjectId()));

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(DESCRIBE_PROJECT, params, Const.EMPTY_JSON);

        // 3、parse response
        return new DescribeProjectResponse(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), DescribeProjectResponse.class);
    }

    /**
     * @param request isFullName:true for exactly match , false for fuzzy match
     *                project id or name、page size and number are all optional detail see
     *                {@link com.volcengine.model.tls.request.DescribeProjectsRequest}
     * @return DescribeProjectsResponse:list of {@link com.volcengine.model.tls.ProjectInfo} and project count
     * @throws LogException
     */
    @Override
    public DescribeProjectsResponse describeProjects(DescribeProjectsRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        ArrayList<NameValuePair> params = new ArrayList<>();
        if (request.getIsFullName() != null)
            params.add(new BasicNameValuePair(IS_FULL_NAME, String.valueOf(request.getIsFullName())));
        if (StringUtils.isNotEmpty(request.getProjectId())) {
            params.add(new BasicNameValuePair(PROJECT_ID, request.getProjectId()));
        }
        if (StringUtils.isNotEmpty(request.getProjectName())) {
            params.add(new BasicNameValuePair(PROJECT_NAME, request.getProjectName()));
        }
        if (request.getPageNumber() != null) {
            params.add(new BasicNameValuePair(PAGE_NUMBER, String.valueOf(request.getPageNumber())));
        }
        if (request.getPageSize() != null) {
            params.add(new BasicNameValuePair(PAGE_SIZE, String.valueOf(request.getPageSize())));
        }

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(Const.DESCRIBE_PROJECTS, params, Const.EMPTY_JSON);

        // 3、parse response
        return new DescribeProjectsResponse(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), DescribeProjectsResponse.class);

    }


    @Override
    public CreateTopicResponse createTopic(CreateTopicRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        String requestBody = JSONObject.toJSONString(request);

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(CREATE_TOPIC, new ArrayList<>(), requestBody);

        // 3、parse response
        return new CreateTopicResponse(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), CreateTopicResponse.class);

    }

    @Override
    public DeleteTopicResponse deleteTopic(DeleteTopicRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        String requestBody = JSONObject.toJSONString(request);

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(DELETE_TOPIC, new ArrayList<>(), requestBody);

        // 3、parse response
        return new DeleteTopicResponse(rawResponse.getHeaders());
    }

    @Override
    public ModifyTopicResponse modifyTopic(ModifyTopicRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        String requestBody = JSONObject.toJSONString(request);

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(MODIFY_TOPIC, new ArrayList<>(), requestBody);

        // 3、parse response
        return new ModifyTopicResponse(rawResponse.getHeaders());
    }

    @Override
    public DescribeTopicResponse describeTopic(DescribeTopicRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        ArrayList<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair(TOPIC_ID, request.getTopicId()));

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(DESCRIBE_TOPIC, params, Const.EMPTY_JSON);

        // 3、parse response
        return new DescribeTopicResponse(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), DescribeTopicResponse.class);

    }

    @Override
    public DescribeTopicsResponse describeTopics(DescribeTopicsRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        ArrayList<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair(PROJECT_ID, request.getProjectId()));
        if (request.getIsFullName() != null)
            params.add(new BasicNameValuePair(IS_FULL_NAME, String.valueOf(request.getIsFullName())));
        if (request.getPageNumber() != null) {
            params.add(new BasicNameValuePair(PAGE_NUMBER, String.valueOf(request.getPageNumber())));
        }
        if (request.getPageSize() != null) {
            params.add(new BasicNameValuePair(PAGE_SIZE, String.valueOf(request.getPageSize())));
        }
        if (StringUtils.isNotEmpty(request.getTopicId())) {
            params.add(new BasicNameValuePair(TOPIC_ID, request.getTopicId()));
        }
        if (StringUtils.isNotEmpty(request.getTopicName())) {
            params.add(new BasicNameValuePair(TOPIC_NAME, request.getTopicName()));
        }

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(Const.DESCRIBE_TOPICS, params, Const.EMPTY_JSON);

        // 3、parse response
        return new DescribeTopicsResponse(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), DescribeTopicsResponse.class);

    }


    @Override
    public CreateIndexResponse createIndex(CreateIndexRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        String requestBody = JSONObject.toJSONString(request);

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(Const.CREATE_INDEX, new ArrayList<>(), requestBody);

        // 3、parse response
        return new CreateIndexResponse(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), CreateIndexResponse.class);
    }

    @Override
    public DeleteIndexResponse deleteIndex(DeleteIndexRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        String requestBody = JSONObject.toJSONString(request);

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(DELETE_INDEX, new ArrayList<>(), requestBody);

        // 3、parse response
        return new DeleteIndexResponse(rawResponse.getHeaders());

    }

    @Override
    public ModifyIndexResponse modifyIndex(ModifyIndexRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        String requestBody = JSONObject.toJSONString(request);

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(MODIFY_INDEX, new ArrayList<>(), requestBody);

        // 3、parse response
        return new ModifyIndexResponse(rawResponse.getHeaders());
    }

    @Override
    public DescribeIndexResponse describeIndex(DescribeIndexRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        ArrayList<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair(TOPIC_ID, request.getTopicId()));

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(DESCRIBE_INDEX, params, Const.EMPTY_JSON);

        // 3、parse response
        return new DescribeIndexResponse(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), DescribeIndexResponse.class);

    }

    @Override
    public CreateRuleResponse createRule(CreateRuleRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        String requestBody = JSONObject.toJSONString(request);

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(CREATE_RULE, new ArrayList<>(), requestBody);

        // 3、parse response
        return new CreateRuleResponse(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), CreateRuleResponse.class);

    }

    @Override
    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        String requestBody = JSONObject.toJSONString(request);

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(DELETE_RULE, new ArrayList<>(), requestBody);

        // 3、parse response
        return new DeleteRuleResponse(rawResponse.getHeaders());
    }

    @Override
    public ModifyRuleResponse modifyRule(ModifyRuleRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        String requestBody = JSONObject.toJSONString(request);

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(MODIFY_RULE, new ArrayList<>(), requestBody);

        // 3、parse response
        return new ModifyRuleResponse(rawResponse.getHeaders());
    }

    @Override
    public DescribeRuleResponse describeRule(DescribeRuleRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        ArrayList<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair(RULE_ID, request.getRuleId()));

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(DESCRIBE_RULE, params, Const.EMPTY_JSON);

        // 3、parse response
        return new DescribeRuleResponse(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), DescribeRuleResponse.class);

    }

    @Override
    public DescribeRulesResponse describeRules(DescribeRulesRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        ArrayList<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair(PROJECT_ID, request.getProjectId()));
        if (request.getPageNumber() != null) {
            params.add(new BasicNameValuePair(PAGE_NUMBER, String.valueOf(request.getPageNumber())));
        }
        if (request.getPageSize() != null) {
            params.add(new BasicNameValuePair(PAGE_SIZE, String.valueOf(request.getPageSize())));
        }
        if (StringUtils.isNotEmpty(request.getRuleId())) {
            params.add(new BasicNameValuePair(RULE_ID, request.getRuleId()));
        }
        if (StringUtils.isNotEmpty(request.getRuleName())) {
            params.add(new BasicNameValuePair(RULE_NAME, request.getRuleName()));
        }
        if (StringUtils.isNotEmpty(request.getTopicId())) {
            params.add(new BasicNameValuePair(TOPIC_ID, request.getTopicId()));
        }
        if (StringUtils.isNotEmpty(request.getTopicName())) {
            params.add(new BasicNameValuePair(TOPIC_NAME, request.getTopicName()));
        }

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(DESCRIBE_RULES, params, Const.EMPTY_JSON);

        // 3、parse response
        return new DescribeRulesResponse(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), DescribeRulesResponse.class);
    }


    @Override
    public ApplyRuleToHostGroupsResponse applyRuleToHostGroups(ApplyRuleToHostGroupsRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        String requestBody = JSONObject.toJSONString(request);

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(APPLY_RULE_TO_HOES_GROUPS, new ArrayList<>(), requestBody);

        // 3、parse response
        return new ApplyRuleToHostGroupsResponse(rawResponse.getHeaders());
    }

    @Override
    public DeleteRuleFromHostGroupsResponse deleteRuleFromHostGroups(DeleteRuleFromHostGroupsRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        String requestBody = JSONObject.toJSONString(request);

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(DELETE_RULE_FROM_HOST_GROUPS, new ArrayList<>(), requestBody);

        // 3、parse response
        return new DeleteRuleFromHostGroupsResponse(rawResponse.getHeaders());
    }

    @Override
    public CreateHostGroupResponse createHostGroup(CreateHostGroupRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        String requestBody = JSONObject.toJSONString(request);

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(CREATE_HOST_GROUP, new ArrayList<>(), requestBody);

        // 3、parse response
        return new CreateHostGroupResponse(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), CreateHostGroupResponse.class);

    }

    @Override
    public DeleteHostGroupResponse deleteHostGroup(DeleteHostGroupRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        String requestBody = JSONObject.toJSONString(request);

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(DELETE_HOST_GROUP, new ArrayList<>(), requestBody);

        // 3、parse response
        return new DeleteHostGroupResponse(rawResponse.getHeaders());

    }

    @Override
    public ModifyHostGroupResponse modifyHostGroup(ModifyHostGroupRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        String requestBody = JSONObject.toJSONString(request);

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(MODIFY_HOST_GROUP, new ArrayList<>(), requestBody);

        // 3、parse response
        return new ModifyHostGroupResponse(rawResponse.getHeaders());
    }

    @Override
    public DescribeHostGroupResponse describeHostGroup(DescribeHostGroupRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        ArrayList<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair(HOST_GROUP_ID, request.getHostGroupId()));

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(DESCRIBE_HOST_GROUP, params, Const.EMPTY_JSON);

        // 3、parse response
        return new DescribeHostGroupResponse(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), DescribeHostGroupResponse.class);
    }

    @Override
    public DescribeHostGroupsResponse describeHostGroups(DescribeHostGroupsRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 2、prepare request
        ArrayList<NameValuePair> params = new ArrayList<>();
        if (request.getPageNumber() != null) {
            params.add(new BasicNameValuePair(PAGE_NUMBER, String.valueOf(request.getPageNumber())));
        }
        if (request.getPageSize() != null) {
            params.add(new BasicNameValuePair(PAGE_SIZE, String.valueOf(request.getPageSize())));
        }
        if (StringUtils.isNotEmpty(request.getHostGroupId())) {
            params.add(new BasicNameValuePair(HOST_GROUP_ID, request.getHostGroupId()));
        }
        if (StringUtils.isNotEmpty(request.getHostGroupName())) {
            params.add(new BasicNameValuePair(HOST_GROUP_NAME, request.getHostGroupName()));
        }
        if (StringUtils.isNotEmpty(request.getHostIdentifier())) {
            params.add(new BasicNameValuePair(HOST_IDENTIFIER, request.getHostIdentifier()));
        }

        // 3、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(DESCRIBE_HOST_GROUPS, params, Const.EMPTY_JSON);

        // 4、parse response
        return new DescribeHostGroupsResponse(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), DescribeHostGroupsResponse.class);

    }


    @Override
    public DescribeHostsResponse describeHosts(DescribeHostsRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 2、prepare request
        ArrayList<NameValuePair> params = new ArrayList<>();
        if (request.getPageNumber() != null) {
            params.add(new BasicNameValuePair(PAGE_NUMBER, String.valueOf(request.getPageNumber())));
        }
        if (request.getPageSize() != null) {
            params.add(new BasicNameValuePair(PAGE_SIZE, String.valueOf(request.getPageSize())));
        }
        if (request.getHeartbeatStatus() != null) {
            params.add(new BasicNameValuePair(HEARTBEAT_STATUS, String.valueOf(request.getHeartbeatStatus())));
        }
        if (StringUtils.isNotEmpty(request.getHostGroupId())) {
            params.add(new BasicNameValuePair(HOST_GROUP_ID, request.getHostGroupId()));
        }
        if (StringUtils.isNotEmpty(request.getIp())) {
            params.add(new BasicNameValuePair(IP, request.getIp()));
        }

        // 3、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(DESCRIBE_HOSTS, params, Const.EMPTY_JSON);

        // 4、parse response
        return new DescribeHostsResponse(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), DescribeHostsResponse.class);
    }

    @Override
    public DeleteHostResponse deleteHost(DeleteHostRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        String requestBody = JSONObject.toJSONString(request);

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(DELETE_HOST, new ArrayList<>(), requestBody);

        // 3、parse response
        return new DeleteHostResponse(rawResponse.getHeaders());

    }

    @Override
    public DescribeHostGroupRulesResponse describeHostGroupRules(DescribeHostGroupRulesRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        ArrayList<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair(HOST_GROUP_ID, request.getHostGroupId()));
        if (request.getPageNumber() > 0) {
            params.add(new BasicNameValuePair(PAGE_NUMBER, String.valueOf(request.getPageNumber())));
        }
        if (request.getPageSize() > 0) {
            params.add(new BasicNameValuePair(PAGE_SIZE, String.valueOf(request.getPageSize())));
        }

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(DESCRIBE_HOST_GROUP_RULES, params, Const.EMPTY_JSON);

        // 3、parse response
        return new DescribeHostGroupRulesResponse(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), DescribeHostGroupRulesResponse.class);

    }

    @Override
    public ModifyHostGroupsAutoUpdateResponse modifyHostGroupsAutoUpdate(ModifyHostGroupsAutoUpdateRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 2. prepare request
        ArrayList<NameValuePair> params = new ArrayList<>();
        String requestBody = JSONObject.toJSONString(request);

        // 3. check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(MODIFY_HOST_GROUPS_AUTO_UPDATE, params, requestBody);

        // 4. parse response
        return new ModifyHostGroupsAutoUpdateResponse(rawResponse.getHeaders());
    }

    @Override
    public CreateAlarmResponse createAlarm(CreateAlarmRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        String requestBody = JSONObject.toJSONString(request);

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(CREATE_ALARM, new ArrayList<>(), requestBody);

        // 3、parse response
        return new CreateAlarmResponse(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), CreateAlarmResponse.class);
    }

    @Override
    public DeleteAlarmResponse deleteAlarm(DeleteAlarmRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        String requestBody = JSONObject.toJSONString(request);

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(DELETE_ALARM, new ArrayList<>(), requestBody);

        // 3、parse response
        return new DeleteAlarmResponse(rawResponse.getHeaders());
    }

    @Override
    public ModifyAlarmResponse modifyAlarm(ModifyAlarmRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        String requestBody = JSONObject.toJSONString(request);

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(MODIFY_ALARM, new ArrayList<>(), requestBody);

        // 3、parse response
        return new ModifyAlarmResponse(rawResponse.getHeaders());

    }

    @Override
    public DescribeAlarmsResponse describeAlarms(DescribeAlarmsRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        ArrayList<NameValuePair> params = new ArrayList<>();
        if (request.getPageNumber() != null) {
            params.add(new BasicNameValuePair(PAGE_NUMBER, String.valueOf(request.getPageNumber())));
        }
        if (request.getPageSize() != null) {
            params.add(new BasicNameValuePair(PAGE_SIZE, String.valueOf(request.getPageSize())));
        }
        params.add(new BasicNameValuePair(PROJECT_ID, String.valueOf(request.getProjectId())));
        if (StringUtils.isNotEmpty(request.getAlarmName())) {
            params.add(new BasicNameValuePair(ALARM_NAME, String.valueOf(request.getAlarmName())));
        }
        if (StringUtils.isNotEmpty(request.getAlarmId())) {
            params.add(new BasicNameValuePair(ALARM_ID, String.valueOf(request.getAlarmId())));
        }
        if (StringUtils.isNotEmpty(request.getTopicId())) {
            params.add(new BasicNameValuePair(TOPIC_ID, String.valueOf(request.getTopicId())));
        }
        if (StringUtils.isNotEmpty(request.getTopicName())) {
            params.add(new BasicNameValuePair(TOPIC_NAME, String.valueOf(request.getTopicName())));
        }
        if (request.getStatus() != null) {
            params.add(new BasicNameValuePair(STATUS, String.valueOf(request.getStatus())));
        }

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(DESCRIBE_ALARMS, params, Const.EMPTY_JSON);

        // 3、parse response
        return new DescribeAlarmsResponse(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), DescribeAlarmsResponse.class);

    }

    @Override
    public CreateAlarmNotifyGroupResponse createAlarmNotifyGroup(CreateAlarmNotifyGroupRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        String requestBody = JSONObject.toJSONString(request);

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(CREATE_ALARM_NOTIFY_GROUP, new ArrayList<>(), requestBody);

        // 3、parse response
        return new CreateAlarmNotifyGroupResponse(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), CreateAlarmNotifyGroupResponse.class);
    }

    @Override
    public DeleteAlarmNotifyGroupResponse deleteAlarmNotifyGroup(DeleteAlarmNotifyGroupRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        String requestBody = JSONObject.toJSONString(request);

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(DELETE_ALARM_NOTIFY_GROUP, new ArrayList<>(), requestBody);

        // 3、parse response
        return new DeleteAlarmNotifyGroupResponse(rawResponse.getHeaders());
    }

    @Override
    public ModifyAlarmNotifyGroupResponse modifyAlarmNotifyGroup(ModifyAlarmNotifyGroupRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 1、prepare request
        String requestBody = JSONObject.toJSONString(request);

        // 2、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(MODIFY_ALARM_NOTIFY_GROUP, new ArrayList<>(), requestBody);

        // 3、parse response
        return new ModifyAlarmNotifyGroupResponse(rawResponse.getHeaders());
    }

    @Override
    public DescribeAlarmNotifyGroupsResponse describeAlarmNotifyGroups(DescribeAlarmNotifyGroupsRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }
        // 2、prepare request
        ArrayList<NameValuePair> params = new ArrayList<>();
        if (request.getPageNumber() != null) {
            params.add(new BasicNameValuePair(PAGE_NUMBER, String.valueOf(request.getPageNumber())));
        }
        if (request.getPageSize() != null) {
            params.add(new BasicNameValuePair(PAGE_SIZE, String.valueOf(request.getPageSize())));
        }
        if (StringUtils.isNotEmpty(request.getAlarmNotifyGroupId())) {
            params.add(new BasicNameValuePair(ALARM_NOTIFY_GROUP_ID, String.valueOf(request.getAlarmNotifyGroupId())));
        }
        if (StringUtils.isNotEmpty(request.getAlarmNotifyGroupName())) {
            params.add(new BasicNameValuePair(ALARM_NOTIFY_GROUP_NAME, String.valueOf(request.getAlarmNotifyGroupName())));
        }
        if (StringUtils.isNotEmpty(request.getReceiverName())) {
            params.add(new BasicNameValuePair(RECEIVER_NAME, String.valueOf(request.getReceiverName())));
        }
        if (StringUtils.isNotEmpty(request.getAlarmNotifyGroupId())) {
            params.add(new BasicNameValuePair(ALARM_NOTIFY_GROUP_ID, String.valueOf(request.getAlarmNotifyGroupId())));
        }

        // 3、check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(DESCRIBE_ALARM_NOTIFY_GROUPS, params, Const.EMPTY_JSON);

        // 4、parse response
        return new DescribeAlarmNotifyGroupsResponse(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), DescribeAlarmNotifyGroupsResponse.class);
    }

    @Override
    public OpenKafkaConsumerResponse openKafkaConsumer(OpenKafkaConsumerRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 2. prepare request
        ArrayList<NameValuePair> params = new ArrayList<>();
        String requestBody = JSONObject.toJSONString(request);

        // 3. check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(OPEN_KAFKA_CONSUMER, params, requestBody);

        // 4. parse response
        return new OpenKafkaConsumerResponse(rawResponse.getHeaders());
    }

    @Override
    public CloseKafkaConsumerResponse closeKafkaConsumer(CloseKafkaConsumerRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 2. prepare request
        ArrayList<NameValuePair> params = new ArrayList<>();
        String requestBody = JSONObject.toJSONString(request);

        // 3. check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(CLOSE_KAFKA_CONSUMER, params, requestBody);

        // 4. parse response
        return new CloseKafkaConsumerResponse(rawResponse.getHeaders());
    }

    @Override
    public DescribeKafkaConsumerResponse describeKafkaConsumer(DescribeKafkaConsumerRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 2. prepare request
        ArrayList<NameValuePair> params = new ArrayList<>();
        {
            if (StringUtils.isNotEmpty(request.getTopicId())) {
                params.add(new BasicNameValuePair(TOPIC_ID, String.valueOf(request.getTopicId())));
            }
        }
        String requestBody = JSONObject.toJSONString(request);

        // 3. check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(DESCRIBE_KAFKA_CONSUMER, params, requestBody);

        // 4. parse response
        return new DescribeKafkaConsumerResponse(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), DescribeKafkaConsumerResponse.class);
    }

    @Override
    public CreateDownloadTaskResponse createDownloadTask(CreateDownloadTaskRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 2. prepare request
        ArrayList<NameValuePair> params = new ArrayList<>();
        String requestBody = JSONObject.toJSONString(request);

        // 3. check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(CREATE_DOWNLOAD_TASK, params, requestBody);

        // 4. parse response
        return new CreateDownloadTaskResponse(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), CreateDownloadTaskResponse.class);
    }

    @Override
    public DescribeDownloadTasksResponse describeDownloadTasks(DescribeDownloadTasksRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 2. prepare request
        ArrayList<NameValuePair> params = new ArrayList<>();
        {
            if (StringUtils.isNotEmpty(request.getTopicId())) {
                params.add(new BasicNameValuePair(TOPIC_ID, String.valueOf(request.getTopicId())));
            }
            if (request.getPageNumber() != null) {
                params.add(new BasicNameValuePair(PAGE_NUMBER, String.valueOf(request.getPageNumber())));
            }
            if (request.getPageSize() != null) {
                params.add(new BasicNameValuePair(PAGE_SIZE, String.valueOf(request.getPageSize())));
            }
        }
        String requestBody = JSONObject.toJSONString(request);

        // 3. check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(DESCRIBE_DOWNLOAD_TASKS, params, requestBody);

        // 4. parse response
        return new DescribeDownloadTasksResponse(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), DescribeDownloadTasksResponse.class);
    }

    @Override
    public DescribeDownloadUrlResponse describeDownloadUrl(DescribeDownloadUrlRequest request) throws LogException {
        if (request == null || !request.CheckValidation()) {
            throw new LogException("InvalidArgument", "Invalid request, Please check it", null);
        }

        // 2. prepare request
        ArrayList<NameValuePair> params = new ArrayList<>();
        {
            if (StringUtils.isNotEmpty(request.getTaskId())) {
                params.add(new BasicNameValuePair(TASK_ID, String.valueOf(request.getTaskId())));
            }
        }
        String requestBody = JSONObject.toJSONString(request);

        // 3. check sum and sendRequest
        RawResponse rawResponse = sendJsonRequest(DESCRIBE_DOWNLOAD_URL, params, requestBody);

        // 4. parse response
        return new DescribeDownloadUrlResponse(rawResponse.getHeaders()).deSerialize(rawResponse.getData(), DescribeDownloadUrlResponse.class);
    }

    private RawResponse doProtoRetryRequest(String api, List<NameValuePair> params, Map<String, String> headers, byte[] body, String compressType) throws LogException {
        if (!headers.containsKey(HEADER_API_VERSION)) {
            headers.put(HEADER_API_VERSION, this.config.getApiVersion());
        }
        RawResponse rawResponse = null;
        long expectedQuitTimestamp = System.currentTimeMillis() + DEFAULT_REQUEST_TIMEOUT_MS;
        int tryCount = 0;
        // retry
        while (true) {
            rawResponse = httpRequest.proto(api, params, headers, body, compressType);
            tryCount += 1;
            // return if request succeed
            if (tryCount >= 5 || rawResponse.getCode() == SdkError.SUCCESS.getNumber() || !needRetryStatus(rawResponse.getHttpCode())) {
                decreaseCounterByOne();
                break;
            }
            increaseCounterByOne();
            try {
                long sleepMs = TimeUtil.calcDefaultBackOffMs(DEFAULT_RETRY_COUNTER.get(), DEFAULT_RETRY_INTERVAL_MS, expectedQuitTimestamp);
                if (sleepMs > 0) {
                    Thread.sleep(sleepMs);
                }
            } catch (InterruptedException e) {
                throw new LogException("sdk error", "retry thread interrupt exception", null);
            }
        }
        //throw exception
        if (rawResponse.getCode() != SdkError.SUCCESS.getNumber()) {
            String[] error = getError(rawResponse);
            throw new LogException(rawResponse.getHttpCode(), error[0], error[1], rawResponse.getFirstHeader(X_TLS_REQUESTID));
        }
        return rawResponse;
    }

    private void checkMd5(String path, byte[] body) throws LogException {
        ApiInfo apiInfo = httpRequest.getApiInfoList().get(path);
        List<Header> header = apiInfo.getHeader();
        if (header == null) {
            header = new ArrayList<>();
        }
        String checkSum = MessageUtil.md5CheckSum(body);
        if (checkSum != null) {
            header.add(new BasicHeader(HEADER_CONTENT_MD5, checkSum));
        }
    }

    private String[] getError(RawResponse response) {
        String code, message = "";
        code = SdkError.getErrorDesc(SdkError.getError(response.getCode()));
        if (response.getException() != null) {
            message = response.getException().getMessage();
        }
        return new String[]{code, message};
    }
}
