package com.volcengine.service.vikingDB;

import com.google.gson.internal.LinkedTreeMap;
import com.volcengine.service.vikingDB.common.Constant;
import com.volcengine.service.vikingDB.common.DataObject;
import com.volcengine.service.vikingDB.common.FetchDataParam;
import com.volcengine.service.vikingDB.common.IndexSortParam;
import com.volcengine.service.vikingDB.common.IndexSortResult;
import com.volcengine.service.vikingDB.common.SearchByIdParam;
import com.volcengine.service.vikingDB.common.SearchByTextParam;
import com.volcengine.service.vikingDB.common.SearchByVectorParam;
import com.volcengine.service.vikingDB.common.SearchParam;
import com.volcengine.service.vikingDB.common.VectorIndexParams;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
    private String createTime = null;
    private String updateTime = null;
    private String updatePerson = null;
    private Integer shardCount = null;
    private String shardPolicy = null;
    private HashMap<String, Object> indexCost = null;

    public Index() {
    }

    public Index(String collectionName, String indexName, VectorIndexParams vectorIndex,
                 List<String> scalarIndex, String stat, VikingDBService vikingDBService) {
        this.collectionName = collectionName;
        this.indexName = indexName;
        this.vectorIndex = vectorIndex;
        this.scalarIndex = scalarIndex;
        this.stat = stat;
        this.vikingDBService = vikingDBService;


    }

    public void setCpuQuota(Integer cpuQuota) {
        this.cpuQuota = cpuQuota;
    }

    public void setCpuQuota(Long cpuQuota) {
        this.cpuQuota = cpuQuota.intValue();
    }

    public void setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
    }

    public void setShardCount(Long shardCount) {
        this.shardCount = shardCount.intValue();
    }

    public void setShardPolicy(String shardPolicy) {
        this.shardPolicy = shardPolicy;
    }

    public String requestPrimaryKey() throws Exception {
        if (this.primaryKey != null) return this.primaryKey;

        Collection collection = vikingDBService.getCollection(this.collectionName);
        this.primaryKey = collection.getPrimaryKey();
        return this.primaryKey;
    }


    public List<DataObject> search(SearchParam searchParam) throws Exception {
        if (searchParam.getIsBuild() == 0) {
            VikingDBException vikingDBException = new VikingDBException(1000031, null, "Param dose not build");
            throw vikingDBException.getErrorCodeException(1000031, null, "Param dose not build");
        }

        List<DataObject> res = new ArrayList<>();
        if (searchParam.getVectorOrder() != null) {
            if (searchParam.getVectorOrder().getVector() != null) {
                SearchByVectorParam searchByVectorParam = new SearchByVectorParam()
                        .setFilter(searchParam.getFilter())
                        .setLimit(searchParam.getLimit())
                        .setOutputFields(searchParam.getOutputFields())
                        .setPartition(searchParam.getPartition())
                        .setVector(searchParam.getVectorOrder().getVector())
                        .setDenseWeight(searchParam.getDenseWeight())
                        .setSparseVectors(searchParam.getVectorOrder().getSparseVectors())
                        .setPrimaryKeyIn(searchParam.getPrimaryKeyIn())
                        .setPrimaryKeyNotIn(searchParam.getPrimaryKeyNotIn())
                        .setPostProcessInputLimit(searchParam.getPostProcessInputLimit())
                        .setPostProcessOps(searchParam.getPostProcessOps())
                        .build();
                return searchByVector(searchByVectorParam);
            } else if (searchParam.getVectorOrder().getId() != null) {
                SearchByIdParam searchByIdParam = new SearchByIdParam()
                        .setFilter(searchParam.getFilter())
                        .setLimit(searchParam.getLimit())
                        .setOutputFields(searchParam.getOutputFields())
                        .setPartition(searchParam.getPartition())
                        .setId(searchParam.getVectorOrder().getId())
                        .setDenseWeight(searchParam.getDenseWeight())
                        .setPrimaryKeyIn(searchParam.getPrimaryKeyIn())
                        .setPrimaryKeyNotIn(searchParam.getPrimaryKeyNotIn())
                        .setPostProcessInputLimit(searchParam.getPostProcessInputLimit())
                        .setPostProcessOps(searchParam.getPostProcessOps())
                        .build();
                res = searchById(searchByIdParam);
            }
        } else if (searchParam.getScalarOrder() != null) {
            HashMap<String, Object> orderByScalar = new HashMap<>();
            orderByScalar.put("order", searchParam.getScalarOrder().getOrder());
            orderByScalar.put("field_name", searchParam.getScalarOrder().getFieldName());
            HashMap<String, Object> search = new HashMap<>();
            search.put("order_by_scalar", orderByScalar);
            search.put("limit", searchParam.getLimit());
            search.put("partition", searchParam.getPartition());
            maybeSetPostProcessOps(searchParam, search);
            maybeSetPrimaryKeyFilter(searchParam, search);
            if (searchParam.getOutputFields() != null)
                search.put("output_fields", searchParam.getOutputFields());
            if (searchParam.getFilter() != null)
                search.put("filter", searchParam.getFilter());
            HashMap<String, Object> params = new HashMap<>();
            params.put("collection_name", collectionName);
            params.put("index_name", indexName);
            params.put("search", search);
            Integer remainingRetries = searchParam.getRetry() ? Constant.MAX_RETRIES : 0;
            LinkedTreeMap<String, Object> resData = vikingDBService.retryRequest("SearchIndex", null, params, remainingRetries);
            if (resData == null) {
                throw new Exception(Constant.NO_RESPONSE_DATA);
            }
            res = getDatas(resData, searchParam.getOutputFields());
        } else {
            HashMap<String, Object> search = new HashMap<>();
            search.put("limit", searchParam.getLimit());
            search.put("partition", searchParam.getPartition());
            if (searchParam.getOutputFields() != null)
                search.put("output_fields", searchParam.getOutputFields());
            if (searchParam.getFilter() != null)
                search.put("filter", searchParam.getFilter());
            maybeSetPostProcessOps(searchParam, search);
            maybeSetPrimaryKeyFilter(searchParam, search);
            HashMap<String, Object> params = new HashMap<>();
            params.put("collection_name", collectionName);
            params.put("index_name", indexName);
            params.put("search", search);
            Integer remainingRetries = searchParam.getRetry() ? Constant.MAX_RETRIES : 0;
            LinkedTreeMap<String, Object> resData = vikingDBService.retryRequest("SearchIndex", null, params, remainingRetries);
            if (resData == null) {
                throw new Exception(Constant.NO_RESPONSE_DATA);
            }
            res = getDatas(resData, searchParam.getOutputFields());
        }
        return res;
    }


    public List<DataObject> searchById(SearchByIdParam searchByIdParam) throws Exception {
        if (searchByIdParam.getIsBuild() == 0) {
            VikingDBException vikingDBException = new VikingDBException(1000031, null, "Param dose not build");
            throw vikingDBException.getErrorCodeException(1000031, null, "Param dose not build");
        }
        List<Object> idList = new ArrayList<>();
        idList.add(searchByIdParam.getId());
        HashMap<String, Object> orderById = new HashMap<>();
        orderById.put("primary_keys", idList);
        HashMap<String, Object> search = new HashMap<>();
        search.put("order_by_vector", orderById);
        search.put("limit", searchByIdParam.getLimit());
        search.put("partition", searchByIdParam.getPartition());
        if (searchByIdParam.getOutputFields() != null)
            search.put("output_fields", searchByIdParam.getOutputFields());
        if (searchByIdParam.getFilter() != null)
            search.put("filter", searchByIdParam.getFilter());
        if (searchByIdParam.getDenseWeight() != null)
            search.put("dense_weight", searchByIdParam.getDenseWeight());
        if (searchByIdParam.getPrimaryKeyIn() != null) {
            search.put("primary_key_in", searchByIdParam.getPrimaryKeyIn());
        }
        if (searchByIdParam.getPrimaryKeyNotIn() != null) {
            search.put("primary_key_not_in", searchByIdParam.getPrimaryKeyNotIn());
        }
        if (searchByIdParam.getPostProcessInputLimit() != null) {
            search.put("post_process_input_limit", searchByIdParam.getPostProcessInputLimit());
        }
        if (searchByIdParam.getPostProcessOps() != null) {
            search.put("post_process_ops", searchByIdParam.getPostProcessOps());
        }
        HashMap<String, Object> params = new HashMap<>();
        params.put("collection_name", collectionName);
        params.put("index_name", indexName);
        params.put("search", search);
        Integer remainingRetries = searchByIdParam.getRetry() ? Constant.MAX_RETRIES : 0;
        LinkedTreeMap<String, Object> resData = vikingDBService.retryRequest("SearchIndex", null, params, remainingRetries);
        if (resData == null) {
            throw new Exception(Constant.NO_RESPONSE_DATA);
        }
        return getDatas(resData, searchByIdParam.getOutputFields());
    }


    public List<DataObject> searchByVector(SearchByVectorParam searchByVectorParam) throws Exception {
        if (searchByVectorParam.getIsBuild() == 0) {
            VikingDBException vikingDBException = new VikingDBException(1000031, null, "Param dose not build");
            throw vikingDBException.getErrorCodeException(1000031, null, "Param dose not build");
        }

        List<Object> vectorList = new ArrayList<>();
        vectorList.add(searchByVectorParam.getVector());
        HashMap<String, Object> orderByVector = new HashMap<>();
        orderByVector.put("vectors", vectorList);
        if (searchByVectorParam.getSparseVectors() != null) {
            List<Object> sparseVectorList = new ArrayList<>();
            sparseVectorList.add(searchByVectorParam.getSparseVectors());
            orderByVector.put("sparse_vectors", sparseVectorList);
        }
        HashMap<String, Object> search = new HashMap<>();
        search.put("order_by_vector", orderByVector);
        search.put("limit", searchByVectorParam.getLimit());
        search.put("partition", searchByVectorParam.getPartition());
        if (searchByVectorParam.getPrimaryKeyIn() != null) {
            search.put("primary_key_in", searchByVectorParam.getPrimaryKeyIn());
        }
        if (searchByVectorParam.getPrimaryKeyNotIn() != null) {
            search.put("primary_key_not_in", searchByVectorParam.getPrimaryKeyNotIn());
        }
        if (searchByVectorParam.getPostProcessInputLimit() != null) {
            search.put("post_process_input_limit", searchByVectorParam.getPostProcessInputLimit());
        }
        if (searchByVectorParam.getPostProcessOps() != null) {
            search.put("post_process_ops", searchByVectorParam.getPostProcessOps());
        }
        if (searchByVectorParam.getOutputFields() != null)
            search.put("output_fields", searchByVectorParam.getOutputFields());
        if (searchByVectorParam.getFilter() != null)
            search.put("filter", searchByVectorParam.getFilter());
        if (searchByVectorParam.getDenseWeight() != null)
            search.put("dense_weight", searchByVectorParam.getDenseWeight());
        HashMap<String, Object> params = new HashMap<>();
        params.put("collection_name", collectionName);
        params.put("index_name", indexName);
        params.put("search", search);
        Integer remainingRetries = searchByVectorParam.getRetry() ? Constant.MAX_RETRIES : 0;
        LinkedTreeMap<String, Object> resData = vikingDBService.retryRequest("SearchIndex", null, params, remainingRetries);
        if (resData == null) {
            throw new Exception(Constant.NO_RESPONSE_DATA);
        }
        return getDatas(resData, searchByVectorParam.getOutputFields());
    }

    public List<DataObject> searchByText(SearchByTextParam searchByTextParam) throws Exception {
        if (searchByTextParam.getIsBuild() == 0) {
            VikingDBException vikingDBException = new VikingDBException(1000031, null, "Param dose not build");
            throw vikingDBException.getErrorCodeException(1000031, null, "Param dose not build");
        }

        HashMap<String, Object> orderByRaw = new HashMap<>();
        orderByRaw.put("text", searchByTextParam.getText().getText());
        HashMap<String, Object> search = new HashMap<>();
        search.put("order_by_raw", orderByRaw);
        search.put("limit", searchByTextParam.getLimit());
        search.put("partition", searchByTextParam.getPartition());
        if (searchByTextParam.getOutputFields() != null)
            search.put("output_fields", searchByTextParam.getOutputFields());
        if (searchByTextParam.getFilter() != null)
            search.put("filter", searchByTextParam.getFilter());
        if (searchByTextParam.getDenseWeight() != null)
            search.put("dense_weight", searchByTextParam.getDenseWeight());
        if (searchByTextParam.getPrimaryKeyIn() != null) {
            search.put("primary_key_in", searchByTextParam.getPrimaryKeyIn());
        }
        if (searchByTextParam.getPrimaryKeyNotIn() != null) {
            search.put("primary_key_not_in", searchByTextParam.getPrimaryKeyNotIn());
        }
        if (searchByTextParam.getPostProcessInputLimit() != null) {
            search.put("post_process_input_limit", searchByTextParam.getPostProcessInputLimit());
        }
        if (searchByTextParam.getPostProcessOps() != null) {
            search.put("post_process_ops", searchByTextParam.getPostProcessOps());
        }
        HashMap<String, Object> params = new HashMap<>();
        params.put("collection_name", collectionName);
        params.put("index_name", indexName);
        params.put("search", search);
        Integer remainingRetries = searchByTextParam.getRetry() ? Constant.MAX_RETRIES : 0;
        LinkedTreeMap<String, Object> resData = vikingDBService.retryRequest("SearchIndex", null, params, remainingRetries);
        if (resData == null) {
            throw new Exception(Constant.NO_RESPONSE_DATA);
        }
        return getDatas(resData, searchByTextParam.getOutputFields());
    }

    private static void maybeSetPrimaryKeyFilter(SearchParam searchParam, HashMap<String, Object> params) {
        if (searchParam == null) return;
        if (searchParam.getPrimaryKeyIn() != null) {
            params.put("primary_key_in", searchParam.getPrimaryKeyIn());
        }
        if (searchParam.getPrimaryKeyNotIn() != null) {
            params.put("primary_key_not_in", searchParam.getPrimaryKeyNotIn());
        }
    }

    private static void maybeSetPostProcessOps(SearchParam searchParam, HashMap<String, Object> params) {
        if (searchParam == null) return;
        if (searchParam.getPostProcessInputLimit() != null) {
            params.put("post_process_input_limit", searchParam.getPostProcessInputLimit());
        }
        if (searchParam.getPostProcessOps() != null) {
            params.put("post_process_ops", searchParam.getPostProcessOps());
        }
    }

    public <T> IndexSortResult<T> sort(IndexSortParam<T> indexSortParam) throws Exception {
        if (indexSortParam.getIsBuild() == 0) {
            VikingDBException vikingDBException = new VikingDBException(1000031, null, "Param dose not build");
            throw vikingDBException.getErrorCodeException(1000031, null, "Param dose not build");
        }
        HashMap<String, Object> params = new HashMap<>();
        params.put("collection_name", collectionName);
        params.put("index_name", indexName);
        HashMap<String, Object> sortSubParam = new HashMap<>();
        sortSubParam.put("query_vector", indexSortParam.getQueryVector());
        sortSubParam.put("primary_keys", indexSortParam.getPrimaryKeys());
        params.put("sort", sortSubParam);
        Integer remainingRetries = indexSortParam.getRetry() ? Constant.MAX_RETRIES : 0;
        LinkedTreeMap<String, Object> resData = vikingDBService.retryRequest("IndexSort", null, params, remainingRetries);

        @SuppressWarnings("unchecked")
        LinkedTreeMap<String, Object> data = (LinkedTreeMap<String, Object>) resData.get("data");
        if (data == null) {
            throw new Exception(Constant.NO_RESPONSE_DATA);
        }
        Object primaryKeyNotExist = data.get("primary_key_not_exist");
        Object sortResult = data.get("sort_result");
        IndexSortResult<T> indexSortResult = new IndexSortResult<>();
        if (primaryKeyNotExist instanceof ArrayList) {
            @SuppressWarnings("unchecked")
            ArrayList<T> pk = (ArrayList<T>) primaryKeyNotExist;
            indexSortResult.setPrimaryKeyNotExist(pk);
        }
        if (sortResult instanceof ArrayList) {
            List<IndexSortResult.InnerSortResult<T>> srr = new ArrayList<>();
            @SuppressWarnings("unchecked")
            ArrayList<LinkedTreeMap<String, Object>> sortResultItems = (ArrayList<LinkedTreeMap<String, Object>>) sortResult;
            for (LinkedTreeMap<String, Object> sortResultItem : sortResultItems) {
                Object primaryKey = sortResultItem.get("primary_key");
                T pk = null;
                Double sc = null;
                if (primaryKey != null) {
                    pk = (T) primaryKey;
                }
                Object score = sortResultItem.get("score");
                if (primaryKey != null) {
                    sc = (Double) score;
                }
                srr.add(new IndexSortResult.InnerSortResult<T>().setPrimaryKey(pk).setScore(sc));
            }
            indexSortResult.setSortResult(srr);
        }
        return indexSortResult;
    }


    public <T> DataObject fetchData(T id, FetchDataParam fetchDataParam) throws Exception {
        DataObject dataObject;
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("collection_name", collectionName);
        params.put("index_name", indexName);
        params.put("primary_keys", id);
        params.put("partition", fetchDataParam.getPartition());
        if (fetchDataParam.getOutputFields() != null)
            params.put("output_fields", fetchDataParam.getOutputFields());


        LinkedTreeMap<String, Object> resData = vikingDBService.retryRequest("FetchIndexData", null, params, Constant.MAX_RETRIES);
        if (resData == null) {
            throw new Exception(Constant.NO_RESPONSE_DATA);
        }
        @SuppressWarnings("unchecked")
        ArrayList<LinkedTreeMap<String, Object>> res = (ArrayList<LinkedTreeMap<String, Object>>) resData.get("data");
        HashMap<String, Object> hashMap = vikingDBService.convertLinkedTreeMapToHashMap(res.get(0));
        @SuppressWarnings("unchecked")
        LinkedTreeMap<String, Object> fieldsLinkedTreeMap = (LinkedTreeMap<String, Object>) hashMap.get("fields");
        HashMap<String, Object> fieldsHashMap = new HashMap<>();
        if (fieldsLinkedTreeMap == null) {
            fieldsHashMap = hashMap;

        } else {
            fieldsHashMap = vikingDBService.convertLinkedTreeMapToHashMap(fieldsLinkedTreeMap);
        }
        dataObject = new DataObject()
                .setFields(fieldsHashMap)
                .setId(id);
        return dataObject;
    }

    public List<DataObject> fetchData(List<?> ids, FetchDataParam fetchDataParam) throws Exception {
        List<DataObject> dataObjects = new ArrayList<>();
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("collection_name", collectionName);
        params.put("index_name", indexName);
        params.put("primary_keys", ids);
        params.put("partition", fetchDataParam.getPartition());
        if (fetchDataParam.getOutputFields() != null)
            params.put("output_fields", fetchDataParam.getOutputFields());

        LinkedTreeMap<String, Object> resData = vikingDBService.retryRequest("FetchIndexData", null, params, Constant.MAX_RETRIES);
        if (resData == null) {
            throw new Exception(Constant.NO_RESPONSE_DATA);
        }
        @SuppressWarnings("unchecked")
        ArrayList<LinkedTreeMap<String, Object>> res = (ArrayList<LinkedTreeMap<String, Object>>) resData.get("data");

        for (LinkedTreeMap<String, Object> LinkedTreeMap : res) {
            @SuppressWarnings("unchecked")
            LinkedTreeMap<String, Object> fieldsLinkedTreeMap = (LinkedTreeMap<String, Object>) LinkedTreeMap.get("fields");
            HashMap<String, Object> fieldsHashMap = new HashMap<>();
            if (fieldsLinkedTreeMap == null) {
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


    public List<DataObject> getDatas(LinkedTreeMap<String, Object> resData, List<String> outputFields) throws Exception {
        @SuppressWarnings("unchecked")
        ArrayList<ArrayList<LinkedTreeMap<String, Object>>> res = (ArrayList<ArrayList<LinkedTreeMap<String, Object>>>) resData.get("data");
        List<DataObject> datas = new ArrayList<>();
        for (ArrayList<LinkedTreeMap<String, Object>> linkedTreeMap : res) {
            for (LinkedTreeMap<String, Object> item : linkedTreeMap) {
                Object id = null;
                if (item.get(requestPrimaryKey()) instanceof String) {
                    id = (String) item.get(requestPrimaryKey());
                } else {
                    id = (Long) item.get(requestPrimaryKey());
                }
                HashMap<String, Object> fields = new HashMap<>();
                if (outputFields == null || outputFields.size() != 0) {
                    @SuppressWarnings("unchecked")
                    LinkedTreeMap<String, Object> map = (LinkedTreeMap<String, Object>) item.get("fields");
                    fields = vikingDBService.convertLinkedTreeMapToHashMap(map);
                }
                String text = null;
                if (item.containsKey("text")) {
                    text = (String) item.get("text");
                }
                DataObject dataObject;
                if (item.get("score") instanceof Double) {
                    dataObject = new DataObject()
                            .setFields(fields)
                            .setId(id)
                            .setText(text)
                            .setScore((Double) item.get("score"));
                } else {
                    Long score = (Long) item.get("score");
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
