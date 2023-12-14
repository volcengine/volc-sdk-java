package com.volcengine.service.vikingDB;

import com.alibaba.fastjson.JSONArray;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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
import com.volcengine.service.vikingDB.common.CreateCollectionParam;
import com.volcengine.service.vikingDB.common.CreateIndexParam;
import com.volcengine.service.vikingDB.common.EmbModel;
import com.volcengine.service.vikingDB.common.Field;
import com.volcengine.service.vikingDB.common.RawData;
import com.volcengine.service.vikingDB.common.UpdateCollectionParam;
import com.volcengine.service.vikingDB.common.VectorIndexParams;

import org.apache.http.Header;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicHeader;

import java.beans.IndexedPropertyDescriptor;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.volcengine.helper.Const.*;

public class VikingDBService extends BaseServiceImpl {


    public VikingDBService(String host, String region, String ak, String sk, String scheme) {
        super(getServiceInfo(host, region, ak, sk, scheme), getApiInfo());

    }
    public static ServiceInfo getServiceInfo(String host, String region, String ak, String sk, String scheme){
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
        params.put(Const.Header,headers);
        params.put(Scheme, scheme);
        ServiceInfo serviceInfo = new ServiceInfo(params);
        return serviceInfo;
    }


    public static Map<String, ApiInfo> getApiInfo(){
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

        paramsPost.put(Const.Path, "/api/collection/del_data");
        apiInfo.put("DeleteData", new ApiInfo(paramsPost));

        paramsGet.put(Const.Path, "/api/collection/fetch_data");
        apiInfo.put("FetchData", new ApiInfo(paramsGet));

        paramsGet.put(Const.Path, "/api/index/fetch_data");
        apiInfo.put("FetchIndexData", new ApiInfo(paramsGet));

        paramsPost.put(Const.Path, "/api/index/search");
        apiInfo.put("SearchIndex", new ApiInfo(paramsPost));

        paramsPost.put(Const.Path, "/api/data/embedding");
        apiInfo.put("Embedding", new ApiInfo(paramsPost));

        paramsPost.put(Const.Path, "/api/collection/update");
        apiInfo.put("UpdateCollection", new ApiInfo(paramsPost));

        return apiInfo;
    }


    public LinkedTreeMap<String,Object> doRequest(String api, List<NameValuePair> params, HashMap<String,Object> body) throws Exception{
        // Gson gson = new Gson();
        Gson gson = new GsonBuilder().registerTypeAdapter(new TypeToken<LinkedTreeMap<String, Object>>() {}.getType(), new ObjectTypeAdapterRewrite()).create();
        RawResponse res = json(api,params, gson.toJson(body));
        if (res.getCode() != 0){
            try {
                throw new Exception(res.getException().getMessage());
            } catch (Exception e) {
                LinkedTreeMap<String,Object> resJson = gson.fromJson(e.getMessage(), new TypeToken<LinkedTreeMap<String, Object>>() {}.getType());
                Integer code = (Integer)resJson.get("code");
                String requestId = (String)resJson.get("request_id");
                String message = (String)resJson.get("message");
                VikingDBException vikingDBException = new VikingDBException(code, requestId, message);
                throw vikingDBException.getErrorCodeException(code, requestId, message);
            }
        }
        String resData =new String(res.getData(), StandardCharsets.UTF_8);
        LinkedTreeMap<String,Object> data = gson.fromJson(resData,new TypeToken<LinkedTreeMap<String, Object>>() {}.getType());
        // System.out.println(data);
        return data;
    }

    public static LinkedTreeMap<String,Object> convertStringToLinkedTreeMap(String x){
        Gson gson = new Gson();
        LinkedTreeMap<String,Object> data = gson.fromJson(x,new TypeToken<LinkedTreeMap<String, Object>>() {}.getType());
        return data;
    }
    public HashMap<String, Object> convertLinkedTreeMapToHashMap(LinkedTreeMap<String, Object> linkedTreeMap){
        HashMap<String, Object> hashMap = new HashMap<>();
        for(String key : linkedTreeMap.keySet()){
            Object value = linkedTreeMap.get(key);
            hashMap.put(key, value);
        }
        return hashMap;
    }

    public Collection createCollection(CreateCollectionParam createCollectionParam) throws Exception{
        if(createCollectionParam.getIsBuild() == 0){
            VikingDBException vikingDBException = new VikingDBException(1000031, null, "Param dose not build");
            throw vikingDBException.getErrorCodeException(1000031, null, "Param dose not build");
        }
        HashMap<String,Object> params = new HashMap<>();
        params.put("collection_name", createCollectionParam.getCollectionName());
        params.put("description", createCollectionParam.getDescription());
        String primaryKey = null;
        List<Map<String,Object>> fields = new ArrayList<>();
        for(Field field: createCollectionParam.getFields()){
            Map<String,Object> _field = new HashMap<>();
            _field.put("field_name", field.getFieldName());
            _field.put("field_type", field.getFieldType());
            if(field.getIsPrimaryKey()){
                if(!field.getFieldType().equals("string")&&!field.getFieldType().equals("int64")){
                    VikingDBException vikingDBException = new VikingDBException(1000032, null, "PrimaryKey must be String or Int64");
                    throw vikingDBException.getErrorCodeException(1000032, null, "PrimaryKey must be String or Int64");
                }
                if(primaryKey != null){
                    VikingDBException vikingDBException = new VikingDBException(1000032, null, "PrimaryKey must be String or Int64");
                    throw vikingDBException.getErrorCodeException(1000032, null, "PrimaryKey must be String or Int64");
                }
                primaryKey = field.getFieldName();
            }
            if(field.getDefaultVal() != null)
                _field.put("default_val", field.getDefaultVal());
            if(field.getDim() != null)
                _field.put("dim", field.getDim());
            if(field.getPipelineName() != null)
                _field.put("pipeline_name", field.getPipelineName());
            fields.add(_field);
        }
        params.put("primary_key", primaryKey);
        params.put("fields", fields);
        doRequest("CreateCollection", null, params);
        Collection collection = new Collection(createCollectionParam.getCollectionName(), 
                                            createCollectionParam.getFields(), 
                                            this, primaryKey);
        collection.setDescription(createCollectionParam.getDescription());
        return collection;
    }

    public Collection getCollection(String collectionName) throws Exception{
        HashMap<String,Object> params = new HashMap<>();
        params.put("collection_name", collectionName);
        LinkedTreeMap<String,Object> resData = doRequest("GetCollection",null, params);
        @SuppressWarnings("unchecked")
        LinkedTreeMap<String,Object> res = (LinkedTreeMap<String, Object>)resData.get("data");
        // System.out.println(res);

        Collection collection = new Collection();
        String primarykey = "";
        if (res.containsKey("description")) collection.setDescription((String)res.get("description"));
        if (res.containsKey("indexes")) collection.setIndexes((List<String>)res.get("indexes"));
        if (res.containsKey("create_time")) collection.setCreateTime((String)res.get("create_time"));
        if (res.containsKey("update_time")) collection.setUpdateTime((String)res.get("update_time"));
        if (res.containsKey("update_person")) collection.setUpdatePerson((String)res.get("update_person"));
        if (res.containsKey("stat")){
            HashMap<String, Object> stat = convertLinkedTreeMapToHashMap((LinkedTreeMap<String, Object>)res.get("stat"));
            collection.setStat(stat);
        }
        ArrayList<Field> fields = new ArrayList<>();
        if(res.containsKey("fields")){
            @SuppressWarnings("unchecked")
            List<LinkedTreeMap<String,Object>> retData = (List<LinkedTreeMap<String,Object>>)res.get("fields");
            // System.out.println(retData);
            for(LinkedTreeMap<String,Object> item :retData){
                Field field = new Field();
                if(item.containsKey("field_name")) field.setFieldName((String)item.get("field_name"));
                if(item.containsKey("field_type")) field.setFieldType((String)item.get("field_type"));
                // if(item.containsKey("default_val")) field.setDefaultVal((Object)item.get("default_val")).resetDefaultVal();
                if(item.containsKey("default_val")) field.setDefaultVal((Object)item.get("default_val"));
                if(item.containsKey("dim")){
                    field.setDim((Integer)item.get("dim"));
                }
                if(item.containsKey("pipeline_name")) field.setPipelineName((String)item.get("pipeline_name"));
                if(res.containsKey("primary_key")){
                    String pk = (String)res.get("primary_key");

                    if(pk.equals((String)item.get("field_name"))){
                        field.setIsPrimaryKey(true);
                        primarykey = pk;
                    }
                }
                fields.add(field);
            }
        }
        collection.setCollectionName(collectionName);
        collection.setVikingDBService(this);
        collection.setFields(fields);
        collection.setPrimaryKey(primarykey);
        
        return collection;

    }
    public void dropCollection(String collectionName) throws Exception{
        HashMap<String,Object> params = new HashMap<>();
        params.put("collection_name", collectionName);
        doRequest("DropCollection",null, params);
    }

    public List<Collection> listCollections() throws Exception{
        LinkedTreeMap<String,Object> resData = doRequest("ListCollections",null, null);
        @SuppressWarnings("unchecked")
        List<LinkedTreeMap<String, Object>> res = (List<LinkedTreeMap<String, Object>>)resData.get("data");
        // System.out.println(res);
        List<Collection> collections = new ArrayList<>();
        String primarykey = "";
        for(LinkedTreeMap<String, Object> item : res){
            Collection collection = new Collection();
            if (item.containsKey("description")) collection.setDescription((String)item.get("description"));
            if (item.containsKey("indexes")) collection.setIndexes((List<String>)item.get("indexes"));
            if (item.containsKey("create_time")) collection.setCreateTime((String)item.get("create_time"));
            if (item.containsKey("update_time")) collection.setUpdateTime((String)item.get("update_time"));
            if (item.containsKey("update_person")) collection.setUpdatePerson((String)item.get("update_person"));
            if (item.containsKey("stat")){
                HashMap<String, Object> stat = convertLinkedTreeMapToHashMap((LinkedTreeMap<String, Object>)item.get("stat"));
                collection.setStat(stat);
            }
            
            ArrayList<Field> fields = new ArrayList<>();
            if(item.containsKey("fields")){
                @SuppressWarnings("unchecked")
                List<LinkedTreeMap<String,Object>> retDatas = (List<LinkedTreeMap<String,Object>>)item.get("fields");
                // System.out.println(retDatas);
                for(LinkedTreeMap<String,Object> retData :retDatas){
                    Field field = new Field();
                    if(retData.containsKey("field_name")) field.setFieldName((String)retData.get("field_name"));
                    if(retData.containsKey("field_type")) field.setFieldType((String)retData.get("field_type"));
                    if(retData.containsKey("default_val")) field.setDefaultVal((Object)retData.get("default_val"));
                    if(retData.containsKey("dim")){
                        field.setDim((Integer)retData.get("dim"));
                    }
                    if(retData.containsKey("pipeline_name")) field.setPipelineName((String)retData.get("pipeline_name"));
                    if(item.containsKey("primary_key")){
                        if(item.get("primary_key") instanceof String){
                            String pk = (String)item.get("primary_key");
                            if(pk.equals((String)retData.get("field_name"))){
                                field.setIsPrimaryKey(true);
                                primarykey = pk;
                            }
                        } else {
                            primarykey = null;
                        }
                    }
                    fields.add(field);
                }
            }
            if (item.containsKey("collection_name")) collection.setCollectionName((String)item.get("collection_name"));
            collection.setVikingDBService(this);
            collection.setFields(fields);
            collection.setPrimaryKey(primarykey);
            collections.add(collection);
        }
        return collections;
    }
    public Index createIndex(CreateIndexParam createIndexParam) throws Exception{
        if(createIndexParam.getIsBuild() == 0){
            VikingDBException vikingDBException = new VikingDBException(1000031, null, "Param dose not build");
            throw vikingDBException.getErrorCodeException(1000031, null, "Param dose not build");
        }
        HashMap<String,Object> params = new HashMap<>();
        params.put("collection_name", createIndexParam.getCollectionName());
        params.put("index_name", createIndexParam.getIndexName());
        params.put("cpu_quota", createIndexParam.getCpuQuoat());
        params.put("description", createIndexParam.getDescription());
        params.put("partition_by", createIndexParam.getPartitionBy());
        if(createIndexParam.getVectorIndex() != null) params.put("vector_index", createIndexParam.getVectorIndex().dict());
        if(createIndexParam.getScalarIndex() != null) params.put("scalar_index", createIndexParam.getScalarIndex());
        // System.out.println(params);
        doRequest("CreateIndex",null, params);
        Index index = new Index(createIndexParam.getCollectionName(), createIndexParam.getIndexName(),
                                createIndexParam.getVectorIndex(), createIndexParam.getScalarIndex(),
                                null, this);
        index.setDescription(createIndexParam.getDescription());
        index.setPartitionBy(createIndexParam.getPartitionBy());
        index.setCpuQuota(createIndexParam.getCpuQuoat());
        return index;
    }

    public Index getIndex(String collectionName, String indexName) throws Exception{
        HashMap<String,Object> params = new HashMap<>();
        params.put("collection_name", collectionName);
        params.put("index_name", indexName);
        LinkedTreeMap<String,Object> resData = doRequest("GetIndex",null, params);
        @SuppressWarnings("unchecked")
        LinkedTreeMap<String,Object> res = (LinkedTreeMap<String, Object>)resData.get("data");
        // System.out.println(res);

        Index index = new Index();
        index.setCollectionName(collectionName);
        index.setIndexName(indexName);
        index.setVikingDBService(this);
        if(res.containsKey("vector_index")){
            @SuppressWarnings("unchecked")
            LinkedTreeMap<String,Object> vectorIndexMap = (LinkedTreeMap<String, Object>)res.get("vector_index");
            VectorIndexParams vectorIndexParams = new VectorIndexParams();
            if(vectorIndexMap.containsKey("index_type")) vectorIndexParams.setIndexType((String)vectorIndexMap.get("index_type"));
            if(vectorIndexMap.containsKey("distance")) vectorIndexParams.setDistance((String)vectorIndexMap.get("distance"));
            if(vectorIndexMap.containsKey("quant")) vectorIndexParams.setQuant((String)vectorIndexMap.get("quant"));
            if(vectorIndexMap.containsKey("hnsw_m")){
                vectorIndexParams.setHnswM((Integer)vectorIndexMap.get("hnsw_m"));
            }
            if(vectorIndexMap.containsKey("hnsw_sef")){
                vectorIndexParams.setHnswSef((Integer)vectorIndexMap.get("hnsw_sef"));
            }
            if(vectorIndexMap.containsKey("hnsw_cef")){
                vectorIndexParams.setHnswCef((Integer)vectorIndexMap.get("hnsw_cef"));
            }
            index.setVectorIndex(vectorIndexParams);
        }
        List<String> scalarIndex = null;
        if(res.containsKey("range_index")){
            @SuppressWarnings("unchecked")
            List<String> tmp = (List<String>)res.get("range_index");
            scalarIndex = tmp;
        } 
        if(res.containsKey("enum_index")){
            if(scalarIndex != null){
                @SuppressWarnings("unchecked")
                List<String> tmp = (List<String>)res.get("enum_index");
                Set<String> set = new HashSet<>();
                set.addAll(tmp);
                set.addAll(scalarIndex);
                scalarIndex = new ArrayList<>(set);
            } else {
                @SuppressWarnings("unchecked")
                List<String> tmp = (List<String>)res.get("enum_index");
                scalarIndex = tmp;
            }
        }
        index.setScalarIndex(scalarIndex);
        if(res.containsKey("description")) index.setDescription((String)res.get("description"));
        if(res.containsKey("cpu_quota")){
            index.setCpuQuota((Integer)res.get("cpu_quota"));
        }
        if(res.containsKey("partition_by")) index.setPartitionBy((String)res.get("partition_by"));
        if(res.containsKey("status")) index.setStat((String)res.get("status"));
        if(res.containsKey("create_time")) index.setCreateTime((String)res.get("create_time"));
        if(res.containsKey("update_time")) index.setUpdateTime((String)res.get("update_time"));
        if(res.containsKey("update_person")) index.setUpdatePerson((String)res.get("update_person"));
        if(res.containsKey("shard_count")) index.setShardCount((Integer)res.get("shard_count"));
        if(res.containsKey("index_cost")){
            HashMap<String,Object> indexCost = convertLinkedTreeMapToHashMap((LinkedTreeMap<String,Object>)res.get("index_cost"));
            index.setIndexCost(indexCost);
        }


        return index;
    }

    public void dropIndex(String collectionName, String indexName) throws Exception{
        HashMap<String,Object> params = new HashMap<>();
        params.put("collection_name", collectionName);
        params.put("index_name", indexName);
        doRequest("DropIndex",null, params);
    }

    public List<Index> listIndexes(String collectionName) throws Exception{
        HashMap<String,Object> params = new HashMap<>();
        params.put("collection_name", collectionName);
        LinkedTreeMap<String,Object> resData = doRequest("ListIndexes",null, params);
        @SuppressWarnings("unchecked")
        List<LinkedTreeMap<String, Object>> res = (List<LinkedTreeMap<String, Object>>)resData.get("data");
        // System.out.println(res);
        List<Index> indexes = new ArrayList<>();
        for(LinkedTreeMap<String, Object> item : res){
            Index index = this.getIndex(collectionName, (String)item.get("index_name"));
            indexes.add(index);
        }
        return indexes;
    }
    public void updateCollection(UpdateCollectionParam updateCollectionParam) throws Exception{
        if(updateCollectionParam.getIsBuild() == 0){
            VikingDBException vikingDBException = new VikingDBException(1000031, null, "Param dose not build");
            throw vikingDBException.getErrorCodeException(1000031, null, "Param dose not build");
        }
        List<Map<String,Object>> fields = new ArrayList<>();
        for(Field field: updateCollectionParam.getFields()){
            Map<String,Object> _field = new HashMap<>();
            _field.put("field_name", field.getFieldName());
            _field.put("field_type", field.getFieldType());
            if(field.getDefaultVal() != null)
                _field.put("default_val", field.getDefaultVal());
            if(field.getDim() != null)
                _field.put("dim", field.getDim());
            if(field.getPipelineName() != null)
                _field.put("pipeline_name", field.getPipelineName());
            fields.add(_field);
        }
        HashMap<String,Object> params = new HashMap<>();
        params.put("collection_name", updateCollectionParam.getCollectionName());
        params.put("fields", fields);
        if(updateCollectionParam.getDescription() != null){
            params.put("description", updateCollectionParam.getDescription());
        }
        doRequest("UpdateCollection", null, params);

    }
    public List<Double> embedding(EmbModel embModel, RawData rawData) throws Exception{
        if(embModel.getIsBuild() == 0 || rawData.getIsBuild() == 0){
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
        LinkedTreeMap<String,Object> resData = doRequest("Embedding",null, params);
        @SuppressWarnings("unchecked")
        List<List<Double>> res = (List<List<Double>>)resData.get("data");
        return res.get(0);
    }
    public List<List<Double>> embedding(EmbModel embModel, List<RawData> rawDatas) throws Exception{
        for(RawData rawData: rawDatas){
            if(embModel.getIsBuild() == 0 || rawData.getIsBuild() == 0){
                VikingDBException vikingDBException = new VikingDBException(1000031, null, "Param dose not build");
                throw vikingDBException.getErrorCodeException(1000031, null, "Param dose not build");
            }
        }

        HashMap<String, Object> model = new HashMap<>();
        model.put("model_name", embModel.getModelName());
        model.put("params", embModel.getParams());
        List<HashMap<String, Object>> data = new ArrayList<>();
        for(RawData rawData: rawDatas){
            HashMap<String, Object> param = new HashMap<>();
            param.put("data_type", rawData.getDataType());
            param.put("text", rawData.getText());
            data.add(param);
        }
        HashMap<String, Object> params = new HashMap<>();
        params.put("model", model);
        params.put("data", data);
        LinkedTreeMap<String,Object> resData = doRequest("Embedding",null, params);
        @SuppressWarnings("unchecked")
        List<List<Double>> res = (List<List<Double>>)resData.get("data");
        return res;
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
                double dbNum = in.nextDouble();
                // 数字超过long的最大值，返回浮点类型
                if (dbNum > Long.MAX_VALUE) {
                    return dbNum;
                }
                // 判断数字是否为整数值
                long lngNum = (long) dbNum;
                if (dbNum == lngNum) {
                    try {
                        return (int) lngNum;
                    } catch (Exception e) {
                        return lngNum;
                    }
                } else {
                    return dbNum;
                }
 
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






