package com.volcengine.service.vikingDB;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.Credentials;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.response.RawResponse;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.vikingDB.common.Constant;
import com.volcengine.service.vikingDB.common.CreateCollectionParam;
import com.volcengine.service.vikingDB.common.CreateIndexParam;
import com.volcengine.service.vikingDB.common.CreateTaskParam;
import com.volcengine.service.vikingDB.common.EmbModel;
import com.volcengine.service.vikingDB.common.ExceptionDetails;
import com.volcengine.service.vikingDB.common.Field;
import com.volcengine.service.vikingDB.common.RawData;
import com.volcengine.service.vikingDB.common.UpdateCollectionParam;
import com.volcengine.service.vikingDB.common.UpdateIndexParam;
import com.volcengine.service.vikingDB.common.VectorIndexParams;
import com.volcengine.service.vikingDB.common.VectorizeTuple;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicHeader;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.volcengine.helper.Const.CONNECTION_TIMEOUT;
import static com.volcengine.helper.Const.Host;
import static com.volcengine.helper.Const.SOCKET_TIMEOUT;
import static com.volcengine.helper.Const.Scheme;

public class VikingDBService extends BaseServiceImpl {


    public VikingDBService(String host, String region, String ak, String sk, String scheme) throws Exception {
        super(getServiceInfo(host, region, ak, sk, scheme), getApiInfo());
        requestPing();
    }

    public VikingDBService(String host, String region, String ak, String sk, String scheme, HttpHost proxy) throws Exception {
        super(getServiceInfo(host, region, ak, sk, scheme), proxy, getApiInfo());
        requestPing();
    }

    public void requestPing() throws Exception {
        HashMap<String, Object> map = new HashMap<>();
        RawResponse res = json("Ping", null, JSON.toJSONString(map));
        if (res.getCode() != 0) {
            throw new Exception("host or region is incorrect" + res);
        }
    }

    public static ServiceInfo getServiceInfo(String host, String region, String ak, String sk, String scheme) {
        Map<String, Object> params = new HashMap<>();
        params.put(Host, host);
        params.put(CONNECTION_TIMEOUT, 5000);
        params.put(SOCKET_TIMEOUT, 5000);
        Credentials credentials = new Credentials(region, "air");
        credentials.setAccessKeyID(ak);
        credentials.setSecretAccessKey(sk);
        params.put(Const.Credentials, credentials);
        List<Header> headers = new ArrayList<>();
        headers.add(new BasicHeader("Host", host));
        params.put(Const.Header, headers);
        params.put(Scheme, scheme);
        ServiceInfo serviceInfo = new ServiceInfo(params);
        return serviceInfo;
    }


    public static Map<String, ApiInfo> getApiInfo() {
        Map<String, ApiInfo> apiInfo = new HashMap<>();
        Map<String, Object> paramsPost = new HashMap<>();
        Map<String, Object> paramsGet = new HashMap<>();
        paramsPost.put(Const.Method, "POST");
        paramsGet.put(Const.Method, "GET");
        List<Header> headers = new ArrayList<>();
        headers.add(new BasicHeader("Accept", "application/json"));
        headers.add(new BasicHeader("Content-Type", "application/json"));
        paramsPost.put(Const.Header, headers);
        paramsGet.put(Const.Header, headers);

        paramsPost.put(Const.Path, "/api/collection/create");
        apiInfo.put("CreateCollection", new ApiInfo(paramsPost));

        paramsGet.put(Const.Path, "/api/collection/info");
        apiInfo.put("GetCollection", new ApiInfo(paramsGet));

        paramsPost.put(Const.Path, "/api/collection/drop");
        apiInfo.put("DropCollection", new ApiInfo(paramsPost));

        paramsGet.put(Const.Path, "/api/collection/list");
        apiInfo.put("ListCollections", new ApiInfo(paramsGet));

        paramsPost.put(Const.Path, "/api/index/create");
        apiInfo.put("CreateIndex", new ApiInfo(paramsPost));

        paramsGet.put(Const.Path, "/api/index/info");
        apiInfo.put("GetIndex", new ApiInfo(paramsGet));

        paramsPost.put(Const.Path, "/api/index/drop");
        apiInfo.put("DropIndex", new ApiInfo(paramsPost));

        paramsGet.put(Const.Path, "/api/index/list");
        apiInfo.put("ListIndexes", new ApiInfo(paramsGet));

        paramsPost.put(Const.Path, "/api/collection/upsert_data");
        apiInfo.put("UpsertData", new ApiInfo(paramsPost));

        paramsPost.put(Const.Path, "/api/collection/update_data");
        apiInfo.put("UpdateData", new ApiInfo(paramsPost));

        paramsPost.put(Const.Path, "/api/collection/del_data");
        apiInfo.put("DeleteData", new ApiInfo(paramsPost));

        paramsGet.put(Const.Path, "/api/collection/fetch_data");
        apiInfo.put("FetchData", new ApiInfo(paramsGet));

        paramsGet.put(Const.Path, "/api/index/fetch_data");
        apiInfo.put("FetchIndexData", new ApiInfo(paramsGet));

        paramsPost.put(Const.Path, "/api/index/search");
        apiInfo.put("SearchIndex", new ApiInfo(paramsPost));

        paramsPost.put(Const.Path, "/api/index/search/agg");
        apiInfo.put("SearchIndexAgg", new ApiInfo(paramsPost));

        paramsPost.put(Const.Path, "/api/index/sort");
        apiInfo.put("IndexSort", new ApiInfo(paramsPost));

        paramsPost.put(Const.Path, "/api/data/embedding");
        apiInfo.put("Embedding", new ApiInfo(paramsPost));

        paramsPost.put(Const.Path, "/api/collection/update");
        apiInfo.put("UpdateCollection", new ApiInfo(paramsPost));

        paramsPost.put(Const.Path, "/api/index/update");
        apiInfo.put("UpdateIndex", new ApiInfo(paramsPost));

        paramsPost.put(Const.Path, "/api/index/rerank");
        apiInfo.put("Rerank", new ApiInfo(paramsPost));

        paramsPost.put(Const.Path, "/api/index/batch_rerank");
        apiInfo.put("BatchRerank", new ApiInfo(paramsPost));

        paramsGet.put(Const.Path, "/api/viking_db/data/ping");
        apiInfo.put("Ping", new ApiInfo(paramsGet));

        paramsPost.put(Const.Path, "/api/data/embedding/version/2");
        apiInfo.put("EmbeddingV2", new ApiInfo(paramsPost));

        paramsPost.put(Const.Path, "/api/task/create");
        apiInfo.put("CreateTask", new ApiInfo(paramsPost));

        paramsPost.put(Const.Path, "/api/task/info");
        apiInfo.put("GetTask", new ApiInfo(paramsPost));

        paramsPost.put(Const.Path, "/api/task/list");
        apiInfo.put("ListTasks", new ApiInfo(paramsPost));

        paramsPost.put(Const.Path, "/api/task/drop");
        apiInfo.put("DropTask", new ApiInfo(paramsPost));

        paramsPost.put(Const.Path, "/api/task/update");
        apiInfo.put("UpdateTask", new ApiInfo(paramsPost));

        return apiInfo;
    }

    public void setHeader(HashMap<String, String> header) {
        Map<String, ApiInfo> apiInfo = this.apiInfoList;
        for (String key : apiInfo.keySet()) {
            List<Header> newHeader = apiInfo.get(key).getHeader();
            for (String item : header.keySet()) {
                newHeader.add(new BasicHeader(item, header.get(item)));
            }
            apiInfo.get(key).setHeader(newHeader);
        }
        this.apiInfoList = apiInfo;
    }


    public LinkedTreeMap<String, Object> doRequest(String api, List<NameValuePair> params, HashMap<String, Object> body) throws Exception {
        Gson gson = new GsonBuilder().registerTypeAdapter(new TypeToken<LinkedTreeMap<String, Object>>() {
        }.getType(), new ObjectTypeAdapterRewrite()).create();
        RawResponse res = json(api, params, gson.toJson(body));
        if (res.getCode() != 0) {
            Long code = null;
            String requestId = null;
            String message = null;
            LinkedTreeMap<String, Object> resJson = null;
            VikingDBException vikingDBException = new VikingDBException();
            try {
                resJson = gson.fromJson(res.getException().getMessage(), new TypeToken<LinkedTreeMap<String, Object>>() {
                }.getType());
            } catch (JsonSyntaxException e) {
                throw new RuntimeException("Exception from Vikingdb_Server failed to parse JSON: " + res.getException().getMessage(), e);
            }
            if (resJson != null) {
                code = (Long) resJson.get("code");
                requestId = (String) resJson.get("request_id");
                message = (String) resJson.get("message");
                vikingDBException = new VikingDBException(code, requestId, message);
                throw vikingDBException.getErrorCodeException(code, requestId, message);
            } else {
                throw new Exception("return code is not 0 and res is null:" + res);
            }
        }
        LinkedTreeMap<String, Object> data = null;
        String resData = new String(res.getData(), StandardCharsets.UTF_8);
        try {
            data = gson.fromJson(resData, new TypeToken<LinkedTreeMap<String, Object>>() {
            }.getType());
        } catch (JsonSyntaxException e) {
            throw new RuntimeException("Exception from Vikingdb_Server failed to parse JSON: " + resData, e);
        }
        return data;
    }

    public LinkedTreeMap<String, Object> retryRequest(String api, List<NameValuePair> params, HashMap<String, Object> body, Integer remainingRetries) throws Exception {
        Gson gson = new GsonBuilder().registerTypeAdapter(new TypeToken<LinkedTreeMap<String, Object>>() {
        }.getType(), new ObjectTypeAdapterRewrite()).create();
        RawResponse res = json(api, params, gson.toJson(body));
        if (res.getCode() != 0) {
            Long code = null;
            String requestId = null;
            String message = null;
            LinkedTreeMap<String, Object> resJson = null;
            VikingDBException vikingDBException = new VikingDBException();
            try {
                resJson = gson.fromJson(res.getException().getMessage(), new TypeToken<LinkedTreeMap<String, Object>>() {
                }.getType());
            } catch (JsonSyntaxException e) {
                throw new RuntimeException("Exception from Vikingdb_Server failed to parse JSON: " + res.getException().getMessage(), e);
            }
            if (resJson != null) {
                code = (Long) resJson.get("code");
                requestId = (String) resJson.get("request_id");
                message = (String) resJson.get("message");
                if (code == 1000029 && remainingRetries > 0) {
                    remainingRetries = remainingRetries - 1;
                    Double timeout = this.calculateRetryTimeout(remainingRetries);
                    try {
                        Thread.sleep((long) (timeout * 1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return this.retryRequest(api, params, body, remainingRetries);

                }
                vikingDBException = new VikingDBException(code, requestId, message);
                throw vikingDBException.getErrorCodeException(code, requestId, message);
            } else {
                throw new Exception("return code is not 0 and res is null:" + res);
            }
        }
        LinkedTreeMap<String, Object> data = null;
        String resData = new String(res.getData(), StandardCharsets.UTF_8);
        try {
            data = gson.fromJson(resData, new TypeToken<LinkedTreeMap<String, Object>>() {
            }.getType());
        } catch (JsonSyntaxException e) {
            throw new RuntimeException("Exception from Vikingdb_Server failed to parse JSON: " + resData, e);
        }
        return data;
    }

    public double calculateRetryTimeout(int remainingRetries) {
        int nbRetries = Constant.MAX_RETRIES - remainingRetries;
        double sleepSeconds = Math.min(Constant.INITIAL_RETRY_DELAY * Math.pow(2.0, nbRetries), Constant.MAX_RETRY_DELAY);
        Random random = new Random();
        double jitter = 1 - 0.25 * random.nextDouble();
        double timeout = sleepSeconds * jitter;
        return timeout >= 0 ? timeout : 0;
    }

    public static LinkedTreeMap<String, Object> convertStringToLinkedTreeMap(String x) {
        Gson gson = new Gson();
        LinkedTreeMap<String, Object> data = gson.fromJson(x, new TypeToken<LinkedTreeMap<String, Object>>() {
        }.getType());
        return data;
    }

    public HashMap<String, Object> convertLinkedTreeMapToHashMap(LinkedTreeMap<String, Object> linkedTreeMap) {
        HashMap<String, Object> hashMap = new HashMap<>();
        for (String key : linkedTreeMap.keySet()) {
            Object value = linkedTreeMap.get(key);
            hashMap.put(key, value);
        }
        return hashMap;
    }

    public ExceptionDetails extractExceptionDetails(String exceptionMessage) {
        String pattern = "message:(.*?), code:(\\d+), request_id:([a-fA-F0-9]+)";
        Pattern regexPattern = Pattern.compile(pattern);
        Matcher matcher = regexPattern.matcher(exceptionMessage);

        if (matcher.find()) {
            String message = matcher.group(1).trim();
            int code = Integer.parseInt(matcher.group(2).trim());
            String requestId = matcher.group(3).trim();
            return new ExceptionDetails(message, code, requestId);
        } else {
            return new ExceptionDetails(null, -1, null);
        }
    }

    public Collection createCollection(CreateCollectionParam createCollectionParam) throws Exception {
        if (createCollectionParam.getIsBuild() == 0) {
            VikingDBException vikingDBException = new VikingDBException(1000031, null, "Param dose not build");
            throw vikingDBException.getErrorCodeException(1000031, null, "Param dose not build");
        }
        HashMap<String, Object> params = new HashMap<>();
        params.put("collection_name", createCollectionParam.getCollectionName());
        params.put("description", createCollectionParam.getDescription());
        String primaryKey = null;
        List<Map<String, Object>> fields = new ArrayList<>();
        for (Field field : createCollectionParam.getFields()) {
            Map<String, Object> _field = new HashMap<>();
            _field.put("field_name", field.getFieldName());
            _field.put("field_type", field.getFieldType());
            if (field.getIsPrimaryKey()) {
                if (!field.getFieldType().equals("string") && !field.getFieldType().equals("int64")) {
                    VikingDBException vikingDBException = new VikingDBException(1000032, null, "PrimaryKey must be String or Int64");
                    throw vikingDBException.getErrorCodeException(1000032, null, "PrimaryKey must be String or Int64");
                }
                if (primaryKey != null) {
                    VikingDBException vikingDBException = new VikingDBException(1000032, null, "PrimaryKey must be String or Int64");
                    throw vikingDBException.getErrorCodeException(1000032, null, "PrimaryKey must be String or Int64");
                }
                primaryKey = field.getFieldName();
            }
            if (field.getDefaultVal() != null)
                _field.put("default_val", field.getDefaultVal());
            if (field.getDim() != null)
                _field.put("dim", field.getDim());
            if (field.getPipelineName() != null)
                _field.put("pipeline_name", field.getPipelineName());
            fields.add(_field);
        }
        if (primaryKey == null)
            primaryKey = "__AUTO_ID__";
        params.put("primary_key", primaryKey);
        params.put("fields", fields);
        List<Map<String, Object>> vectorize = VectorizeTuple.getVectorizeToMapList(
                createCollectionParam.getVectorize());
        if (vectorize != null) {
            params.put("vectorize", vectorize);
        }
        doRequest("CreateCollection", null, params);
        Collection collection = new Collection(createCollectionParam.getCollectionName(),
                createCollectionParam.getFields(),
                this, primaryKey);
        collection.setDescription(createCollectionParam.getDescription());
        collection.setVectorize(createCollectionParam.getVectorize());
        return collection;
    }

    public Collection getCollection(String collectionName) throws Exception {
        HashMap<String, Object> params = new HashMap<>();
        params.put("collection_name", collectionName);
        LinkedTreeMap<String, Object> resData = null;
        resData = retryRequest("GetCollection", null, params, Constant.MAX_RETRIES);
        @SuppressWarnings("unchecked")
        LinkedTreeMap<String, Object> res = (LinkedTreeMap<String, Object>) resData.get("data");

        Collection collection = new Collection();
        String primarykey = "";
        if (res.containsKey("description")) collection.setDescription((String) res.get("description"));
        if (res.containsKey("indexes")) collection.setIndexes((List<String>) res.get("indexes"));
        if (res.containsKey("create_time")) collection.setCreateTime((String) res.get("create_time"));
        if (res.containsKey("update_time")) collection.setUpdateTime((String) res.get("update_time"));
        if (res.containsKey("update_person")) collection.setUpdatePerson((String) res.get("update_person"));
        if (res.containsKey("stat")) {
            HashMap<String, Object> stat = convertLinkedTreeMapToHashMap((LinkedTreeMap<String, Object>) res.get("stat"));
            collection.setStat(stat);
        }

        if (res.containsKey("primary_key")) {
            if (res.get("primary_key") instanceof String)
                primarykey = (String) res.get("primary_key");
        }
        ArrayList<Field> fields = new ArrayList<>();
        if (res.containsKey("fields")) {
            @SuppressWarnings("unchecked")
            List<LinkedTreeMap<String, Object>> retData = (List<LinkedTreeMap<String, Object>>) res.get("fields");
            for (LinkedTreeMap<String, Object> item : retData) {
                Field field = new Field();
                if (item.containsKey("field_name")) field.setFieldName((String) item.get("field_name"));
                if (item.containsKey("field_type")) field.setFieldType((String) item.get("field_type"));
                if (item.containsKey("default_val")) field.setDefaultVal((Object) item.get("default_val"));
                if (item.containsKey("dim")) {
                    field.setDim((Long) item.get("dim"));
                }
                if (item.containsKey("pipeline_name")) field.setPipelineName((String) item.get("pipeline_name"));
                if (primarykey.equals((String) item.get("field_name"))) field.setIsPrimaryKey(true);
                fields.add(field);
            }
        }
        List<VectorizeTuple> vectorize = null;
        if (res.containsKey("vectorize")) {
            @SuppressWarnings("unchecked")
            List<LinkedTreeMap<String, Object>> vectorizeList = (List<LinkedTreeMap<String, Object>>) res.get("vectorize");
            vectorize = VectorizeTuple.getVectorizeFromList(vectorizeList);
        }

        collection.setCollectionName(collectionName);
        collection.setVikingDBService(this);
        collection.setFields(fields);
        collection.setPrimaryKey(primarykey);
        collection.setVectorize(vectorize);

        return collection;

    }

    public void dropCollection(String collectionName) throws Exception {
        HashMap<String, Object> params = new HashMap<>();
        params.put("collection_name", collectionName);
        doRequest("DropCollection", null, params);
    }

    public List<Collection> listCollections() throws Exception {
        LinkedTreeMap<String, Object> resData = doRequest("ListCollections", null, null);
        @SuppressWarnings("unchecked")
        List<LinkedTreeMap<String, Object>> res = (List<LinkedTreeMap<String, Object>>) resData.get("data");
        List<Collection> collections = new ArrayList<>();
        String primarykey = "";
        for (LinkedTreeMap<String, Object> item : res) {
            Collection collection = new Collection();
            if (item.containsKey("description")) collection.setDescription((String) item.get("description"));
            if (item.containsKey("indexes")) collection.setIndexes((List<String>) item.get("indexes"));
            if (item.containsKey("create_time")) collection.setCreateTime((String) item.get("create_time"));
            if (item.containsKey("update_time")) collection.setUpdateTime((String) item.get("update_time"));
            if (item.containsKey("update_person")) collection.setUpdatePerson((String) item.get("update_person"));
            if (item.containsKey("stat")) {
                HashMap<String, Object> stat = convertLinkedTreeMapToHashMap((LinkedTreeMap<String, Object>) item.get("stat"));
                collection.setStat(stat);
            }
            if (item.containsKey("primary_key")) {
                if (item.get("primary_key") instanceof String)
                    primarykey = (String) item.get("primary_key");
            }
            ArrayList<Field> fields = new ArrayList<>();
            if (item.containsKey("fields")) {
                @SuppressWarnings("unchecked")
                List<LinkedTreeMap<String, Object>> retDatas = (List<LinkedTreeMap<String, Object>>) item.get("fields");
                for (LinkedTreeMap<String, Object> retData : retDatas) {
                    Field field = new Field();
                    if (retData.containsKey("field_name")) field.setFieldName((String) retData.get("field_name"));
                    if (retData.containsKey("field_type")) field.setFieldType((String) retData.get("field_type"));
                    if (retData.containsKey("default_val")) field.setDefaultVal((Object) retData.get("default_val"));
                    if (retData.containsKey("dim")) {
                        field.setDim((Long) retData.get("dim"));
                    }
                    if (retData.containsKey("pipeline_name"))
                        field.setPipelineName((String) retData.get("pipeline_name"));

                    if (primarykey.equals((String) retData.get("field_name"))) field.setIsPrimaryKey(true);

                    fields.add(field);
                }
            }
            if (item.containsKey("collection_name")) collection.setCollectionName((String) item.get("collection_name"));
            List<VectorizeTuple> vectorize = null;
            if (item.containsKey("vectorize")) {
                @SuppressWarnings("unchecked")
                List<LinkedTreeMap<String, Object>> vectorizeList = (List<LinkedTreeMap<String, Object>>) item.get("vectorize");
                vectorize = VectorizeTuple.getVectorizeFromList(vectorizeList);
            }
            collection.setVikingDBService(this);
            collection.setFields(fields);
            collection.setPrimaryKey(primarykey);
            collection.setVectorize(vectorize);
            collections.add(collection);
        }
        return collections;
    }

    public Index createIndex(CreateIndexParam createIndexParam) throws Exception {
        if (createIndexParam.getIsBuild() == 0) {
            VikingDBException vikingDBException = new VikingDBException(1000031, null, "Param dose not build");
            throw vikingDBException.getErrorCodeException(1000031, null, "Param dose not build");
        }
        HashMap<String, Object> params = new HashMap<>();
        params.put("collection_name", createIndexParam.getCollectionName());
        params.put("index_name", createIndexParam.getIndexName());
        params.put("cpu_quota", createIndexParam.getCpuQuoat());
        params.put("description", createIndexParam.getDescription());
        params.put("partition_by", createIndexParam.getPartitionBy());
        if (createIndexParam.getVectorIndex() != null)
            params.put("vector_index", createIndexParam.getVectorIndex().dict());
        if (createIndexParam.getScalarIndex() != null) params.put("scalar_index", createIndexParam.getScalarIndex());
        if (createIndexParam.getShardCount() != null) params.put("shard_count", createIndexParam.getShardCount());
        if (createIndexParam.getShardPolicy() != null) params.put("shard_policy", createIndexParam.getShardPolicy());
        doRequest("CreateIndex", null, params);
        Index index = new Index(createIndexParam.getCollectionName(), createIndexParam.getIndexName(),
                createIndexParam.getVectorIndex(), createIndexParam.getScalarIndex(),
                null, this);
        index.setDescription(createIndexParam.getDescription());
        index.setPartitionBy(createIndexParam.getPartitionBy());
        index.setCpuQuota(createIndexParam.getCpuQuoat());
        index.setShardCount(createIndexParam.getShardCount());
        index.setShardPolicy(createIndexParam.getShardPolicy());
        index.requestPrimaryKey();
        return index;
    }

    public Index getIndex(String collectionName, String indexName) throws Exception {
        HashMap<String, Object> params = new HashMap<>();
        params.put("collection_name", collectionName);
        params.put("index_name", indexName);
        LinkedTreeMap<String, Object> resData = null;
        resData = this.retryRequest("GetIndex", null, params, Constant.MAX_RETRIES);
        @SuppressWarnings("unchecked")
        LinkedTreeMap<String, Object> res = (LinkedTreeMap<String, Object>) resData.get("data");
        Index index = new Index();
        index.setCollectionName(collectionName);
        index.setIndexName(indexName);
        index.setVikingDBService(this);
        index.requestPrimaryKey();
        if (res.containsKey("vector_index")) {
            @SuppressWarnings("unchecked")
            LinkedTreeMap<String, Object> vectorIndexMap = (LinkedTreeMap<String, Object>) res.get("vector_index");
            VectorIndexParams vectorIndexParams = new VectorIndexParams();
            if (vectorIndexMap.containsKey("index_type"))
                vectorIndexParams.setIndexType((String) vectorIndexMap.get("index_type"));
            if (vectorIndexMap.containsKey("distance"))
                vectorIndexParams.setDistance((String) vectorIndexMap.get("distance"));
            if (vectorIndexMap.containsKey("quant")) vectorIndexParams.setQuant((String) vectorIndexMap.get("quant"));
            if (vectorIndexMap.containsKey("hnsw_m")) {
                vectorIndexParams.setHnswM(((Long) vectorIndexMap.get("hnsw_m")));
            }
            if (vectorIndexMap.containsKey("hnsw_sef")) {
                vectorIndexParams.setHnswSef(((Long) vectorIndexMap.get("hnsw_sef")));
            }
            if (vectorIndexMap.containsKey("hnsw_cef")) {
                vectorIndexParams.setHnswCef(((Long) vectorIndexMap.get("hnsw_cef")));
            }
            index.setVectorIndex(vectorIndexParams);
        }
        List<String> scalarIndex = null;
        if (res.containsKey("range_index")) {
            @SuppressWarnings("unchecked")
            List<String> tmp = (List<String>) res.get("range_index");
            scalarIndex = tmp;
        }
        if (res.containsKey("enum_index")) {
            if (scalarIndex != null) {
                @SuppressWarnings("unchecked")
                List<String> tmp = (List<String>) res.get("enum_index");
                Set<String> set = new HashSet<>();
                set.addAll(tmp);
                set.addAll(scalarIndex);
                scalarIndex = new ArrayList<>(set);
            } else {
                @SuppressWarnings("unchecked")
                List<String> tmp = (List<String>) res.get("enum_index");
                scalarIndex = tmp;
            }
        }
        index.setScalarIndex(scalarIndex);
        if (res.containsKey("description")) index.setDescription((String) res.get("description"));
        if (res.containsKey("cpu_quota")) {
            index.setCpuQuota((Long) res.get("cpu_quota"));
        }
        if (res.containsKey("partition_by")) index.setPartitionBy((String) res.get("partition_by"));
        if (res.containsKey("status")) index.setStat((String) res.get("status"));
        if (res.containsKey("create_time")) index.setCreateTime((String) res.get("create_time"));
        if (res.containsKey("update_time")) index.setUpdateTime((String) res.get("update_time"));
        if (res.containsKey("update_person")) index.setUpdatePerson((String) res.get("update_person"));
        if (res.containsKey("shard_count")) index.setShardCount(((Long) res.get("shard_count")));
        if (res.containsKey("shard_policy")) index.setShardPolicy((String) res.get("shard_policy"));
        if (res.containsKey("index_cost")) {
            HashMap<String, Object> indexCost = convertLinkedTreeMapToHashMap((LinkedTreeMap<String, Object>) res.get("index_cost"));
            index.setIndexCost(indexCost);
        }


        return index;
    }

    public void dropIndex(String collectionName, String indexName) throws Exception {
        HashMap<String, Object> params = new HashMap<>();
        params.put("collection_name", collectionName);
        params.put("index_name", indexName);
        doRequest("DropIndex", null, params);
    }

    public List<Index> listIndexes(String collectionName) throws Exception {
        HashMap<String, Object> params = new HashMap<>();
        params.put("collection_name", collectionName);
        LinkedTreeMap<String, Object> resData = doRequest("ListIndexes", null, params);
        @SuppressWarnings("unchecked")
        List<LinkedTreeMap<String, Object>> res = (List<LinkedTreeMap<String, Object>>) resData.get("data");
        List<Index> indexes = new ArrayList<>();
        for (LinkedTreeMap<String, Object> item : res) {
            Index index = this.getIndex(collectionName, (String) item.get("index_name"));
            indexes.add(index);
        }
        return indexes;
    }

    public void updateCollection(UpdateCollectionParam updateCollectionParam) throws Exception {
        if (updateCollectionParam.getIsBuild() == 0) {
            VikingDBException vikingDBException = new VikingDBException(1000031, null, "Param dose not build");
            throw vikingDBException.getErrorCodeException(1000031, null, "Param dose not build");
        }
        List<Map<String, Object>> fields = new ArrayList<>();
        for (Field field : updateCollectionParam.getFields()) {
            Map<String, Object> _field = new HashMap<>();
            _field.put("field_name", field.getFieldName());
            _field.put("field_type", field.getFieldType());
            if (field.getDefaultVal() != null)
                _field.put("default_val", field.getDefaultVal());
            if (field.getDim() != null)
                _field.put("dim", field.getDim());
            if (field.getPipelineName() != null)
                _field.put("pipeline_name", field.getPipelineName());
            fields.add(_field);
        }
        HashMap<String, Object> params = new HashMap<>();
        params.put("collection_name", updateCollectionParam.getCollectionName());
        params.put("fields", fields);
        if (updateCollectionParam.getDescription() != null) {
            params.put("description", updateCollectionParam.getDescription());
        }
        doRequest("UpdateCollection", null, params);

    }

    public void updateIndex(UpdateIndexParam updateIndexParam) throws Exception {
        if (updateIndexParam.getIsBuild() == 0) {
            VikingDBException vikingDBException = new VikingDBException(1000031, null, "Param dose not build");
            throw vikingDBException.getErrorCodeException(1000031, null, "Param dose not build");
        }
        HashMap<String, Object> params = new HashMap<>();
        params.put("collection_name", updateIndexParam.getCollectionName());
        params.put("index_name", updateIndexParam.getIndexName());
        if (updateIndexParam.getCpuQuoat() != null) {
            params.put("cpu_quota", updateIndexParam.getCpuQuoat());
        }
        if (updateIndexParam.getDescription() != null) {
            params.put("description", updateIndexParam.getDescription());
        }
        if (updateIndexParam.getScalarIndex() != null) {
            params.put("scalar_index", updateIndexParam.getScalarIndex());
        }
        if (updateIndexParam.getShardCount() != null) {
            params.put("shard_count", updateIndexParam.getShardCount());
        }
        doRequest("UpdateIndex", null, params);
    }

    public List<Double> embedding(EmbModel embModel, RawData rawData) throws Exception {
        if (embModel.getIsBuild() == 0 || rawData.getIsBuild() == 0) {
            VikingDBException vikingDBException = new VikingDBException(1000031, null, "Param dose not build");
            throw vikingDBException.getErrorCodeException(1000031, null, "Param dose not build");
        }

        HashMap<String, Object> model = new HashMap<>();
        model.put("model_name", embModel.getModelName());
        model.put("params", embModel.getParams());
        HashMap<String, Object> param = new HashMap<>();
        List<HashMap<String, Object>> data = new ArrayList<>();
        param.put("data_type", rawData.getDataType());
        param.put("text", rawData.getText());
        data.add(param);
        HashMap<String, Object> params = new HashMap<>();
        params.put("model", model);
        params.put("data", data);
        LinkedTreeMap<String, Object> resData = doRequest("Embedding", null, params);
        @SuppressWarnings("unchecked")
        List<List<Double>> res = (List<List<Double>>) resData.get("data");
        return res.get(0);
    }

    public List<List<Double>> embedding(EmbModel embModel, List<RawData> rawDatas) throws Exception {
        for (RawData rawData : rawDatas) {
            if (embModel.getIsBuild() == 0 || rawData.getIsBuild() == 0) {
                VikingDBException vikingDBException = new VikingDBException(1000031, null, "Param dose not build");
                throw vikingDBException.getErrorCodeException(1000031, null, "Param dose not build");
            }
        }

        HashMap<String, Object> model = new HashMap<>();
        model.put("model_name", embModel.getModelName());
        model.put("params", embModel.getParams());
        List<HashMap<String, Object>> data = new ArrayList<>();
        for (RawData rawData : rawDatas) {
            HashMap<String, Object> param = new HashMap<>();
            param.put("data_type", rawData.getDataType());
            param.put("text", rawData.getText());
            data.add(param);
        }
        HashMap<String, Object> params = new HashMap<>();
        params.put("model", model);
        params.put("data", data);
        LinkedTreeMap<String, Object> resData = doRequest("Embedding", null, params);
        @SuppressWarnings("unchecked")
        List<List<Double>> res = (List<List<Double>>) resData.get("data");
        return res;
    }

    public Double rerank(String query, String content, String title) throws Exception {
        HashMap<String, Object> params = new HashMap<>();
        params.put("query", query);
        params.put("content", content);
        params.put("title", title);
        LinkedTreeMap<String, Object> resData = doRequest("Rerank", null, params);
        return (Double) resData.get("data");
    }

    public List<Double> batchRerank(List<Map<String, Object>> datas) throws Exception {
        HashMap<String, Object> params = new HashMap<>();
        params.put("datas", datas);
        LinkedTreeMap<String, Object> resData = doRequest("BatchRerank", null, params);
        List<Double> scores = new ArrayList<>();

        @SuppressWarnings("unchecked")
        List<Double> res = (List<Double>) resData.get("data");

        for (int i = 0; i < res.size(); i++) {
            scores.add(res.get(i));
        }
        return scores;
    }

    public Map<String, Object> embeddingV2(EmbModel embModel, List<RawData> rawDatas) throws Exception {
        for (RawData rawData : rawDatas) {
            if (embModel.getIsBuild() == 0 || rawData.getIsBuild() == 0) {
                VikingDBException vikingDBException = new VikingDBException(1000031, null, "Param dose not build");
                throw vikingDBException.getErrorCodeException(1000031, null, "Param dose not build");
            }
        }

        HashMap<String, Object> model = new HashMap<>();
        model.put("model_name", embModel.getModelName());
        model.put("params", embModel.getParams());
        List<HashMap<String, Object>> data = new ArrayList<>();
        for (RawData rawData : rawDatas) {
            HashMap<String, Object> param = new HashMap<>();
            param.put("data_type", rawData.getDataType());
            if (rawData.getText() != null) {
                param.put("text", rawData.getText());
            }
            if (rawData.getImage() != null) {
                param.put("image", rawData.getImage());
            }
            data.add(param);
        }
        HashMap<String, Object> params = new HashMap<>();
        params.put("model", model);
        params.put("data", data);
        LinkedTreeMap<String, Object> resData = doRequest("EmbeddingV2", null, params);
        @SuppressWarnings("unchecked")
        Map<String, Object> res = (Map<String, Object>) resData.get("data");
        return res;
    }

    public Map<String, Object> embeddingV2(EmbModel embModel, RawData rawData) throws Exception {
        if (embModel.getIsBuild() == 0 || rawData.getIsBuild() == 0) {
            VikingDBException vikingDBException = new VikingDBException(1000031, null, "Param dose not build");
            throw vikingDBException.getErrorCodeException(1000031, null, "Param dose not build");
        }

        HashMap<String, Object> model = new HashMap<>();
        model.put("model_name", embModel.getModelName());
        model.put("params", embModel.getParams());
        HashMap<String, Object> param = new HashMap<>();
        List<HashMap<String, Object>> data = new ArrayList<>();
        param.put("data_type", rawData.getDataType());
        if (rawData.getText() != null) {
            param.put("text", rawData.getText());
        }
        if (rawData.getImage() != null) {
            param.put("image", rawData.getImage());
        }
        data.add(param);
        HashMap<String, Object> params = new HashMap<>();
        params.put("model", model);
        params.put("data", data);
        LinkedTreeMap<String, Object> resData = doRequest("EmbeddingV2", null, params);
        @SuppressWarnings("unchecked")
        Map<String, Object> res = (Map<String, Object>) resData.get("data");
        return res;
    }

    public Task packageTask(Map<String, Object> res) throws Exception {
        Task task = new Task();
        if (res.containsKey("collection_name")) task.setCollectionName((String) res.get("collection_name"));
        if (res.containsKey("create_time")) task.setCreateTime((String) res.get("create_time"));
        if (res.containsKey("task_id")) task.setTaskId((String) res.get("task_id"));
        if (res.containsKey("task_status")) task.setTaskStatus((String) res.get("task_status"));
        if (res.containsKey("task_type")) task.setTaskType((String) res.get("task_type"));
        if (res.containsKey("update_person")) task.setUpdatePerson((String) res.get("update_person"));
        if (res.containsKey("update_time")) task.setUpdateTime((String) res.get("update_time"));
        if (res.containsKey("process_info")) {
            // 兼容
            if (res.get("process_info") instanceof String) {
                HashMap<String, Object> tmp = new HashMap<>();
                task.setProcessInfo(tmp);
            } else {
                HashMap<String, Object> processInfo = convertLinkedTreeMapToHashMap((LinkedTreeMap<String, Object>) res.get("process_info"));
                task.setProcessInfo(processInfo);
            }
        }
        if (res.containsKey("task_params")) {
            HashMap<String, Object> taskParams = convertLinkedTreeMapToHashMap((LinkedTreeMap<String, Object>) res.get("task_params"));
            task.setTaskParams(taskParams);
        }
        return task;
    }

    public String createTask(CreateTaskParam createTaskParam) throws Exception {
        if (createTaskParam.getIsBuild() == 0) {
            VikingDBException vikingDBException = new VikingDBException(1000031, null, "Param dose not build");
            throw vikingDBException.getErrorCodeException(1000031, null, "Param dose not build");
        }
        HashMap<String, Object> params = new HashMap<>();
        params.put("task_type", createTaskParam.getTaskType());
        params.put("task_params", createTaskParam.getTaskParams());
        LinkedTreeMap<String, Object> res = doRequest("CreateTask", null, params);
        if (res.containsKey("data")) {
            @SuppressWarnings("unchecked")
            Map<String, Object> resdata = (Map<String, Object>) res.get("data");
            if (resdata.containsKey("task_id")) {
                return (String) resdata.get("task_id");
            }
        }
        return "";
    }

    public Task getTask(String taskId) throws Exception {
        HashMap<String, Object> params = new HashMap<>();
        params.put("task_id", taskId);
        LinkedTreeMap<String, Object> resData = doRequest("GetTask", null, params);
        ;
        @SuppressWarnings("unchecked")
        Map<String, Object> res = (Map<String, Object>) resData.get("data");
        return packageTask(res);
    }

    public List<Task> listTasks() throws Exception {
        LinkedTreeMap<String, Object> resData = doRequest("ListTasks", null, null);
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> res = (List<Map<String, Object>>) resData.get("data");
        List<Task> tasks = new ArrayList<>();
        for (Map<String, Object> item : res) {
            tasks.add(packageTask(item));
        }
        return tasks;
    }

    public void dropTask(String taskId) throws Exception {
        HashMap<String, Object> params = new HashMap<>();
        params.put("task_id", taskId);
        doRequest("DropTask", null, params);
    }

    public void updateTask(String taskId, String task_status) throws Exception {
        HashMap<String, Object> params = new HashMap<>();
        params.put("task_id", taskId);
        params.put("task_status", task_status);
        doRequest("UpdateTask", null, params);
    }


}

// gson.fromJson默认将整数转化为小数，该函数作用是重写这一方法
class ObjectTypeAdapterRewrite extends TypeAdapter<Object> {


    @Override
    public Object read(JsonReader in) throws IOException {
        JsonToken token = in.peek();
        switch (token) {
            case BEGIN_ARRAY:
                List<Object> list = new ArrayList<>();
                in.beginArray();
                while (in.hasNext()) {
                    list.add(read(in));
                }
                in.endArray();
                return list;

            case BEGIN_OBJECT:
                Map<String, Object> map = new LinkedTreeMap<>();
                in.beginObject();
                while (in.hasNext()) {
                    map.put(in.nextName(), read(in));
                }
                in.endObject();
                return map;

            case STRING:
                return in.nextString();

            case NUMBER:
                /**
                 * 改写数字的处理逻辑，将数字值分为整型与浮点型。
                 */

                // 读取数字，并尝试转换为 BigDecimal
                BigDecimal decimalValue = new BigDecimal(in.nextString());

                // 检查是否超出 long 的范围
                if (decimalValue.compareTo(new BigDecimal(Long.MIN_VALUE)) < 0 ||
                        decimalValue.compareTo(new BigDecimal(Long.MAX_VALUE)) > 0) {
                    // 超出 long 范围，使用 double
                    return decimalValue.doubleValue();
                } else if (decimalValue.scale() > 0) {
                    // BigDecimal.scale() > 0 表示小数部分存在，转换为 double
                    return decimalValue.doubleValue();
                } else {
                    // 没有小数且在 long 范围内，转换为 long
                    return decimalValue.longValue();
                }
                // double dbNum = 
                // // 数字超过long的最大值，返回浮点类型
                // if (dbNum > Long.MAX_VALUE) {
                //     return dbNum;
                // }
                // // 判断数字是否为整数值
                // long lngNum = (long) dbNum;
                // if (dbNum == lngNum) {
                //     return lngNum;
                // } else {
                //     return dbNum;
                // }

            case BOOLEAN:
                return in.nextBoolean();

            case NULL:
                in.nextNull();
                return null;

            default:
                throw new IllegalStateException();
        }
    }

    @Override
    public void write(JsonWriter out, Object value) throws IOException {
    }
}






