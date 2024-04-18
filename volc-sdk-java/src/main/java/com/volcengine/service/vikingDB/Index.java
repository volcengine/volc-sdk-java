package com.volcengine.service.vikingDB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.hamcrest.core.IsInstanceOf;

import com.google.gson.internal.LinkedTreeMap;
import com.volcengine.model.stream.SearchAuthorResponse;
import com.volcengine.service.vikingDB.common.DataObject;
import com.volcengine.service.vikingDB.common.FetchDataParam;
import com.volcengine.service.vikingDB.common.SearchByIdParam;
import com.volcengine.service.vikingDB.common.SearchByTextParam;
import com.volcengine.service.vikingDB.common.SearchByVectorParam;
import com.volcengine.service.vikingDB.common.SearchParam;
import com.volcengine.service.vikingDB.common.VectorIndexParams;

import lombok.Data;
@Data
public class Index {
    private String collectionName = null;
    private String indexName = null;
    private String description = "";
    private VectorIndexParams vectorIndex = null;
    private List<String> scalarIndex = null;
    private String stat = null;
    private VikingDBService vikingDBService = null;
    private Integer cpuQuota = 2;
    private Object partitionBy = null;
    private String primaryKey = null;
    private String createTime=null;
    private String updateTime=null;
    private String updatePerson=null;
    private Integer shardCount=null;
    private HashMap<String,Object> indexCost=null;
    public Index(){}
    public Index(String collectionName, String indexName, VectorIndexParams vectorIndex, 
                List<String> scalarIndex, String stat, VikingDBService vikingDBService){
        this.collectionName = collectionName;
        this.indexName = indexName;
        this.vectorIndex = vectorIndex;
        this.scalarIndex = scalarIndex;
        this.stat = stat;
        this.vikingDBService = vikingDBService;
        

    }
    public String requestPrimaryKey() throws Exception{
        if(this.primaryKey != null) return this.primaryKey;

        Collection collection = vikingDBService.getCollection(this.collectionName);
        this.primaryKey = collection.getPrimaryKey();
        return this.primaryKey;
    }


    public List<DataObject> search(SearchParam searchParam) throws Exception{
        if(searchParam.getIsBuild() == 0){
            VikingDBException vikingDBException = new VikingDBException(1000031, null, "Param dose not build");
            throw vikingDBException.getErrorCodeException(1000031, null, "Param dose not build");
        }

        List<DataObject> res = new ArrayList<>();
        if(searchParam.getVectorOrder() != null){
            if(searchParam.getVectorOrder().getVector() != null){
                SearchByVectorParam searchByVectorParam = new SearchByVectorParam()
                                                            .setFilter(searchParam.getFilter())
                                                            .setLimit(searchParam.getLimit())
                                                            .setOutputFields(searchParam.getOutputFields())
                                                            .setPartition(searchParam.getPartition())
                                                            .setVector(searchParam.getVectorOrder().getVector())
                                                            .setDenseWeight(searchParam.getDenseWeight())
                                                            .setSparseVectors(searchParam.getVectorOrder().getSparseVectors())
                                                            .build();
                                                            
                return searchByVector(searchByVectorParam);
            } else if(searchParam.getVectorOrder().getId() != null){
                SearchByIdParam searchByIdParam = new SearchByIdParam()
                                                            .setFilter(searchParam.getFilter())
                                                            .setLimit(searchParam.getLimit())
                                                            .setOutputFields(searchParam.getOutputFields())
                                                            .setPartition(searchParam.getPartition())
                                                            .setId(searchParam.getVectorOrder().getId())
                                                            .setDenseWeight(searchParam.getDenseWeight())
                                                            .build();
                res = searchById(searchByIdParam);
            }
        } else if(searchParam.getScalarOrder() != null){
            HashMap<String,Object> orderByScalar = new HashMap<>();
            orderByScalar.put("order", searchParam.getScalarOrder().getOrder());
            orderByScalar.put("field_name", searchParam.getScalarOrder().getFieldName());
            HashMap<String,Object> search = new HashMap<>();
            search.put("order_by_scalar", orderByScalar);
            search.put("limit", searchParam.getLimit());
            search.put("partition", searchParam.getPartition());
            if(searchParam.getOutputFields() != null) 
                search.put("output_fields", searchParam.getOutputFields());
            if(searchParam.getFilter() != null)
                search.put("filter", searchParam.getFilter());
            HashMap<String,Object> params = new HashMap<>();
            params.put("collection_name", collectionName);
            params.put("index_name", indexName);
            params.put("search", search);

            LinkedTreeMap<String,Object> resData = vikingDBService.doRequest("SearchIndex",null, params);
            res =  getDatas(resData, searchParam.getOutputFields());
        } else {
            HashMap<String,Object> search = new HashMap<>();
            search.put("limit", searchParam.getLimit());
            search.put("partition", searchParam.getPartition());
            if(searchParam.getOutputFields() != null) 
                search.put("output_fields", searchParam.getOutputFields());
            if(searchParam.getFilter() != null)
                search.put("filter", searchParam.getFilter());
            HashMap<String,Object> params = new HashMap<>();
            params.put("collection_name", collectionName);
            params.put("index_name", indexName);
            params.put("search", search);

            LinkedTreeMap<String,Object> resData = vikingDBService.doRequest("SearchIndex",null, params);
            res =  getDatas(resData, searchParam.getOutputFields());
        }
        return res;
    }


    public List<DataObject> searchById(SearchByIdParam searchByIdParam) throws Exception{
        if(searchByIdParam.getIsBuild() == 0){
            VikingDBException vikingDBException = new VikingDBException(1000031, null, "Param dose not build");
            throw vikingDBException.getErrorCodeException(1000031, null, "Param dose not build");
        }

        List<Object> idList = new ArrayList<>();
        idList.add(searchByIdParam.getId());
        HashMap<String,Object> orderById = new HashMap<>();
        orderById.put("primary_keys", idList);
        HashMap<String,Object> search = new HashMap<>();
        search.put("order_by_vector", orderById);
        search.put("limit", searchByIdParam.getLimit());
        search.put("partition", searchByIdParam.getPartition());
        if(searchByIdParam.getOutputFields() != null) 
            search.put("output_fields", searchByIdParam.getOutputFields());
        if(searchByIdParam.getFilter() != null)
            search.put("filter", searchByIdParam.getFilter());
        if(searchByIdParam.getDenseWeight() != null)
            search.put("dense_weight", searchByIdParam.getDenseWeight());
        HashMap<String,Object> params = new HashMap<>();
        params.put("collection_name", collectionName);
        params.put("index_name", indexName);
        params.put("search", search);

        LinkedTreeMap<String,Object> resData = vikingDBService.doRequest("SearchIndex",null, params);
        return getDatas(resData, searchByIdParam.getOutputFields());

    }
    


    public List<DataObject> searchByVector(SearchByVectorParam searchByVectorParam) throws Exception{
        if(searchByVectorParam.getIsBuild() == 0){
            VikingDBException vikingDBException = new VikingDBException(1000031, null, "Param dose not build");
            throw vikingDBException.getErrorCodeException(1000031, null, "Param dose not build");
        }

        List<Object> vectorList = new ArrayList<>();
        vectorList.add(searchByVectorParam.getVector());
        HashMap<String,Object> orderByVector = new HashMap<>();
        orderByVector.put("vectors", vectorList);
        if (searchByVectorParam.getSparseVectors() != null) {
            List<Object> sparseVectorList = new ArrayList<>();
            sparseVectorList.add(searchByVectorParam.getSparseVectors());
            orderByVector.put("sparse_vectors", sparseVectorList);
        }
        HashMap<String,Object> search = new HashMap<>();
        search.put("order_by_vector", orderByVector);
        search.put("limit", searchByVectorParam.getLimit());
        search.put("partition", searchByVectorParam.getPartition());
        if(searchByVectorParam.getOutputFields() != null) 
            search.put("output_fields", searchByVectorParam.getOutputFields());
        if(searchByVectorParam.getFilter() != null)
            search.put("filter", searchByVectorParam.getFilter());
        if(searchByVectorParam.getDenseWeight() != null)
            search.put("dense_weight", searchByVectorParam.getDenseWeight());
        HashMap<String,Object> params = new HashMap<>();
        params.put("collection_name", collectionName);
        params.put("index_name", indexName);
        params.put("search", search);

        LinkedTreeMap<String,Object> resData = vikingDBService.doRequest("SearchIndex",null, params);
        // System.out.println(resData);
        return getDatas(resData, searchByVectorParam.getOutputFields());
    }

    public List<DataObject> searchByText(SearchByTextParam searchByTextParam) throws Exception{
        if(searchByTextParam.getIsBuild() == 0){
            VikingDBException vikingDBException = new VikingDBException(1000031, null, "Param dose not build");
            throw vikingDBException.getErrorCodeException(1000031, null, "Param dose not build");
        }

        HashMap<String,Object> orderByRaw = new HashMap<>();
        orderByRaw.put("text", searchByTextParam.getText().getText());
        HashMap<String,Object> search = new HashMap<>();
        search.put("order_by_raw", orderByRaw);
        search.put("limit", searchByTextParam.getLimit());
        search.put("partition", searchByTextParam.getPartition());
        if(searchByTextParam.getOutputFields() != null) 
            search.put("output_fields", searchByTextParam.getOutputFields());
        if(searchByTextParam.getFilter() != null)
            search.put("filter", searchByTextParam.getFilter());
        if(searchByTextParam.getDenseWeight() != null)
            search.put("dense_weight", searchByTextParam.getDenseWeight());
        HashMap<String,Object> params = new HashMap<>();
        params.put("collection_name", collectionName);
        params.put("index_name", indexName);
        params.put("search", search);

        LinkedTreeMap<String,Object> resData = vikingDBService.doRequest("SearchIndex",null, params);
        return getDatas(resData, searchByTextParam.getOutputFields());
    }


    public <T>DataObject fetchData(T id, FetchDataParam fetchDataParam) throws Exception{
        DataObject dataObject;
        HashMap<String,Object> params = new HashMap<String,Object>();
        params.put("collection_name", collectionName);
        params.put("index_name", indexName);
        params.put("primary_keys", id);
        params.put("partition", fetchDataParam.getPartition());
        if(fetchDataParam.getOutputFields() != null) 
            params.put("output_fields", fetchDataParam.getOutputFields());
        

        LinkedTreeMap<String,Object> resData = vikingDBService.doRequest("FetchIndexData",null, params);
        // System.out.println(resData);
        @SuppressWarnings("unchecked")
        ArrayList<LinkedTreeMap<String,Object>> res = (ArrayList<LinkedTreeMap<String,Object>>)resData.get("data");
        // System.out.println(res);
        HashMap<String,Object> hashMap = vikingDBService.convertLinkedTreeMapToHashMap(res.get(0));
        // System.out.println(hashMap);
        @SuppressWarnings("unchecked")
        LinkedTreeMap<String,Object> fieldsLinkedTreeMap = (LinkedTreeMap<String,Object>)hashMap.get("fields");
        HashMap<String,Object> fieldsHashMap = new HashMap<>();
            if(fieldsLinkedTreeMap == null){
                fieldsHashMap = hashMap;

            } else {
                fieldsHashMap = vikingDBService.convertLinkedTreeMapToHashMap(fieldsLinkedTreeMap);
            }
        dataObject = new DataObject()
                    .setFields(fieldsHashMap)
                    .setId(id);
        return dataObject;
    }

    public List<DataObject> fetchData(List<?> ids, FetchDataParam fetchDataParam) throws Exception{
        List<DataObject> dataObjects = new ArrayList<>();
        HashMap<String,Object> params = new HashMap<String,Object>();
        params.put("collection_name", collectionName);
        params.put("index_name", indexName);
        params.put("primary_keys", ids);
        params.put("partition", fetchDataParam.getPartition());
        if(fetchDataParam.getOutputFields() != null) 
            params.put("output_fields", fetchDataParam.getOutputFields());
        
        LinkedTreeMap<String,Object> resData = vikingDBService.doRequest("FetchIndexData",null, params);
        // System.out.println(resData);
        @SuppressWarnings("unchecked")
        ArrayList<LinkedTreeMap<String,Object>> res = (ArrayList<LinkedTreeMap<String,Object>>)resData.get("data");
        // System.out.println(res);

        for(LinkedTreeMap<String,Object> LinkedTreeMap:res){
            // System.out.println(LinkedTreeMap);
            @SuppressWarnings("unchecked")
            LinkedTreeMap<String,Object> fieldsLinkedTreeMap = (LinkedTreeMap<String,Object>)LinkedTreeMap.get("fields");
            HashMap<String,Object> fieldsHashMap = new HashMap<>();
            if(fieldsLinkedTreeMap == null){
                fieldsHashMap = vikingDBService.convertLinkedTreeMapToHashMap(LinkedTreeMap);

            } else {
                fieldsHashMap = vikingDBService.convertLinkedTreeMapToHashMap(fieldsLinkedTreeMap);
            }
           
            DataObject dataObject = new DataObject()
                                    .setFields(fieldsHashMap)
                                    .setId(LinkedTreeMap.get(requestPrimaryKey()));
            dataObjects.add(dataObject);
        }
        return dataObjects;
    }
 

    public List<DataObject> getDatas(LinkedTreeMap<String,Object> resData, List<String> outputFields) throws Exception{
        // System.out.println(resData);
        @SuppressWarnings("unchecked")
        ArrayList<ArrayList<LinkedTreeMap<String,Object>>> res = (ArrayList<ArrayList<LinkedTreeMap<String,Object>>>)resData.get("data");
        // System.out.println(res);
        // System.out.println("----------------");
        List<DataObject> datas = new ArrayList<>();
        for(ArrayList<LinkedTreeMap<String,Object>> linkedTreeMap : res){
            for(LinkedTreeMap<String,Object> item : linkedTreeMap){
                // System.out.println(item);
                // String id = (String)item.get(requestPrimaryKey());
                Object id = null;
                if(item.get(requestPrimaryKey()) instanceof String){
                    id = (String)item.get(requestPrimaryKey());
                } else {
                    id = (Integer)item.get(requestPrimaryKey());
                }
                HashMap<String,Object> fields = new HashMap<>();
                if(outputFields == null || outputFields.size() != 0){
                    @SuppressWarnings("unchecked")
                    LinkedTreeMap<String,Object> map = (LinkedTreeMap<String,Object>)item.get("fields");
                    fields = vikingDBService.convertLinkedTreeMapToHashMap(map);
                }
                String text = null;
                if(item.containsKey("text")){
                    text = (String)item.get("text");
                }
                DataObject dataObject;
                // System.out.println(item.get("score").getClass());
                if(item.get("score") instanceof Double){
                    dataObject = new DataObject()
                                    .setFields(fields)
                                    .setId(id)
                                    .setText(text)
                                    .setScore((Double)item.get("score"));
                } else {
                    Integer score = (Integer)item.get("score");
                    dataObject = new DataObject()
                                    .setFields(fields)
                                    .setId(id)
                                    .setText(text)
                                    .setScore(score.doubleValue());
                }
                
                datas.add(dataObject);
            }  
        }
        return datas;
    }
}
