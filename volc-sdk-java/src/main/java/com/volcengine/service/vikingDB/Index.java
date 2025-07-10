package com.volcengine.service.vikingDB;

import com.google.gson.internal.LinkedTreeMap;
import com.volcengine.service.vikingDB.common.Constant;
import com.volcengine.service.vikingDB.common.DataObject;
import com.volcengine.service.vikingDB.common.FetchDataParam;
import com.volcengine.service.vikingDB.common.IndexSortParam;
import com.volcengine.service.vikingDB.common.IndexSortResult;
import com.volcengine.service.vikingDB.common.PageDataObject;
import com.volcengine.service.vikingDB.common.SearchAggParam;
import com.volcengine.service.vikingDB.common.SearchAggResult;
import com.volcengine.service.vikingDB.common.SearchByIdParam;
import com.volcengine.service.vikingDB.common.SearchByTextParam;
import com.volcengine.service.vikingDB.common.SearchByVectorParam;
import com.volcengine.service.vikingDB.common.SearchParam;
import com.volcengine.service.vikingDB.common.SearchWithMultiModalParam;
import com.volcengine.service.vikingDB.common.VectorIndexParams;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Data
public class Index {
    protected String collectionName = null;
    protected String indexName = null;
    private String description = "";
    private VectorIndexParams vectorIndex = null;
    private List<String> scalarIndex = null;
    private String stat = null;
    protected VikingDBService vikingDBService = null;
    private Integer cpuQuota = 2;
    private Object partitionBy = null;
    protected String primaryKey = null;
    private String createTime = null;
    private String updateTime = null;
    private String updatePerson = null;
    private Integer shardCount = null;
    private String shardPolicy = null;
    protected Boolean isClient = false;
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
            if (getIsClient()) {
              search.put("replace_primay", true);
            }
            if (searchParam.getNeedReturnVector()) {
                search.put("need_return_vector", true);
            }
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
            if (getIsClient()) {
              search.put("replace_primay", true);
            }
            if (searchParam.getNeedReturnVector()) {
                search.put("need_return_vector", true);
            }
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

    // 聚合接口
    public PageDataObject searchPagination(SearchParam searchParam) throws Exception {
      if (searchParam.getIsBuild() == 0) {
          VikingDBException vikingDBException = new VikingDBException(1000031, null, "Param dose not build");
          throw vikingDBException.getErrorCodeException(1000031, null, "Param dose not build");
      }
      HashMap<String, Object> searchBody = new HashMap<>();
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
              searchBody = searchByVectorParam.toMap();
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
                searchBody = searchByIdParam.toMap();
          } else {
            throw new VikingDBException(1000000, null, "Invalid SearchParam: VectorOrder is specified but neither vector nor ID is provided.");
          }
      } else if (searchParam.getRawOrder() != null) {
            SearchWithMultiModalParam multiModalParam = new SearchWithMultiModalParam()
            .setText(searchParam.getRawOrder().getText()) // 从 SearchParam.RawOrder 获取
            .setImage(searchParam.getRawOrder().getImage()) // 从 SearchParam.RawOrder 获取
            .setFilter(searchParam.getFilter())
            .setLimit(searchParam.getLimit())
            .setOutputFields(searchParam.getOutputFields())
            .setPartition(searchParam.getPartition())
            .setDenseWeight(searchParam.getDenseWeight())
            .setNeedInstruction(searchParam.getRawOrder().getNeedInstruction()) // 假设 RawOrder 中有此字段
            .setPrimaryKeyIn(searchParam.getPrimaryKeyIn())
            .setPrimaryKeyNotIn(searchParam.getPrimaryKeyNotIn())
            .setPostProcessInputLimit(searchParam.getPostProcessInputLimit())
            .setPostProcessOps(searchParam.getPostProcessOps())
            .build();
            searchBody = multiModalParam.toMap();
      } else if (searchParam.getScalarOrder() != null) {
          HashMap<String, Object> orderByScalar = new HashMap<>();
          orderByScalar.put("order", searchParam.getScalarOrder().getOrder());
          orderByScalar.put("field_name", searchParam.getScalarOrder().getFieldName());
          searchBody.put("order_by_scalar", orderByScalar);
          searchBody.put("limit", searchParam.getLimit());
          searchBody.put("partition", searchParam.getPartition());
          maybeSetPostProcessOps(searchParam, searchBody);
          maybeSetPrimaryKeyFilter(searchParam, searchBody);
          if (searchParam.getOutputFields() != null)
          searchBody.put("output_fields", searchParam.getOutputFields());
          if (searchParam.getFilter() != null)
              searchBody.put("filter", searchParam.getFilter());
      } else {
        searchBody.put("limit", searchParam.getLimit());
        searchBody.put("partition", searchParam.getPartition());
          if (searchParam.getOutputFields() != null)
              searchBody.put("output_fields", searchParam.getOutputFields());
          if (searchParam.getFilter() != null)
              searchBody.put("filter", searchParam.getFilter());
          maybeSetPostProcessOps(searchParam, searchBody);
          maybeSetPrimaryKeyFilter(searchParam, searchBody);
      }
      Integer remainingRetries = searchParam.getRetry() ? Constant.MAX_RETRIES : 0;
      HashMap<String, Object> params = new HashMap<>();
      if (searchParam.getOffset() > 0)
          searchBody.put("offset", searchParam.getOffset());
      if (getIsClient()) {
          searchBody.put("replace_primay", true);
      }
      if (searchParam.getNeedReturnVector()) {
          searchBody.put("need_return_vector", true);
      }
      searchBody.put("need_search_count", true);
      params.put("collection_name", collectionName);
      params.put("index_name", indexName);
      params.put("search", searchBody);
      LinkedTreeMap<String, Object> resData = vikingDBService.retryRequest("SearchIndex", null, params, remainingRetries);
      if (resData == null) {
          throw new Exception(Constant.NO_RESPONSE_DATA);
      }
      PageDataObject res = getPageData(resData, searchParam.getOutputFields());
      return res;
  }

    public List<DataObject> searchById(SearchByIdParam searchByIdParam) throws Exception {
        if (searchByIdParam.getIsBuild() == 0) {
            VikingDBException vikingDBException = new VikingDBException(1000031, null, "Param dose not build");
            throw vikingDBException.getErrorCodeException(1000031, null, "Param dose not build");
        }
        HashMap<String, Object> search = searchByIdParam.toMap();
        if (getIsClient()) {
          search.put("replace_primay", true);
        }
        if (searchByIdParam.getNeedReturnVector()) {
            search.put("need_return_vector", true);
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

        HashMap<String, Object> search = searchByVectorParam.toMap();
        if (getIsClient()) {
          search.put("replace_primay", true);
        }
        if (searchByVectorParam.getNeedReturnVector()) {
            search.put("need_return_vector", true);
        }
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

    public List<DataObject> searchWithMultiModal(SearchWithMultiModalParam searchWithMultiModalParam) throws Exception {
        if (searchWithMultiModalParam.getIsBuild() == 0) {
            VikingDBException vikingDBException = new VikingDBException(1000031, null, "Param dose not build");
            throw vikingDBException.getErrorCodeException(1000031, null, "Param dose not build");
        }

        HashMap<String, Object> search = searchWithMultiModalParam.toMap();
        if (getIsClient()) {
          search.put("replace_primay", true);
        }
        if (searchWithMultiModalParam.getNeedReturnVector()) {
            search.put("need_return_vector", true);
        }
        HashMap<String, Object> params = new HashMap<>();
        params.put("collection_name", collectionName);
        params.put("index_name", indexName);
        params.put("search", search);
        Integer remainingRetries = searchWithMultiModalParam.getRetry() ? Constant.MAX_RETRIES : 0;
        LinkedTreeMap<String, Object> resData = vikingDBService.retryRequest("SearchIndex", null, params, remainingRetries);
        if (resData == null) {
            throw new Exception(Constant.NO_RESPONSE_DATA);
        }
        return getDatas(resData, searchWithMultiModalParam.getOutputFields());
    }

    /**
     * 推荐使用多模态检索方法。支持 纯文本、图片、图文对 的方式检索
     * @see #searchWithMultiModal
     */
    public List<DataObject> searchByText(SearchByTextParam searchByTextParam) throws Exception {
        if (searchByTextParam.getIsBuild() == 0) {
            VikingDBException vikingDBException = new VikingDBException(1000031, null, "Param dose not build");
            throw vikingDBException.getErrorCodeException(1000031, null, "Param dose not build");
        }

        HashMap<String, Object> search = searchByTextParam.toMap();
        if (getIsClient()) {
          search.put("replace_primay", true);
        }
        if (searchByTextParam.getNeedReturnVector()) {
            search.put("need_return_vector", true);
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

    public SearchAggResult searchAgg(SearchAggParam searchAggParam) throws Exception {
        if (searchAggParam.getIsBuild() == 0) {
            VikingDBException vikingDBException = new VikingDBException(1000031, null, "Param dose not build");
            throw vikingDBException.getErrorCodeException(1000031, null, "Param dose not build");
        }
        HashMap<String, Object> params = new HashMap<>();
        params.put("collection_name", collectionName);
        params.put("index_name", indexName);
        params.put("agg", searchAggParam.getAgg());
        HashMap<String, Object> search = new HashMap<>();
        search.put("filter", searchAggParam.getFilter());
        search.put("partition", searchAggParam.getPartition());
        params.put("search", search);
        Integer remainingRetries = searchAggParam.getRetry() ? Constant.MAX_RETRIES : 0;
        LinkedTreeMap<String, Object> resData = vikingDBService.retryRequest("SearchIndexAgg", null, params, remainingRetries);
        if (resData == null) {
            throw new Exception(Constant.NO_RESPONSE_DATA);
        }
        @SuppressWarnings("unchecked")
        LinkedTreeMap<String, Object> data = (LinkedTreeMap<String, Object>) resData.get("data");
        if (data == null) {
            throw new Exception(Constant.NO_RESPONSE_DATA);
        }
        SearchAggResult searchAggResult = new SearchAggResult();
        Object aggOp = data.get("agg_op");
        if (aggOp instanceof String) {
            @SuppressWarnings("unchecked")
            String aggOpValue = (String) aggOp;
            searchAggResult.setAggOp(aggOpValue);
        }
        Object groupByField = data.get("group_by_field");
        if (groupByField instanceof String) {
            @SuppressWarnings("unchecked")
            String groupByFieldValue = (String) groupByField;
            searchAggResult.setGroupByField(groupByFieldValue);
        }
        Object aggResult = data.get("agg_result");
        if (aggResult instanceof LinkedTreeMap) {
            @SuppressWarnings("unchecked")
            LinkedTreeMap<String, Object> aggResultValue = (LinkedTreeMap<String, Object>) aggResult;
            searchAggResult.setAggResult(aggResultValue);
        }
        return searchAggResult;
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
        if (resData == null) {
            throw new Exception(Constant.NO_RESPONSE_DATA);
        }

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
        if (getIsClient()) {
          params.put("replace_primay", true);
        }

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
        if (getIsClient()) {
          params.put("replace_primay", true);
        }
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


    public PageDataObject getPageData(LinkedTreeMap<String, Object> resData, List<String> outputFields) throws Exception {
      List<DataObject> items = getDatas(resData, outputFields);
      PageDataObject pageData = new PageDataObject();
      pageData.setItems(items);
      @SuppressWarnings("unchecked")
      LinkedTreeMap<String, Object> extendInfo = (LinkedTreeMap<String, Object>) resData.get("extend");
      if (extendInfo == null) {
        return pageData;
      }
      pageData.setPagination(vikingDBService.convertLinkedTreeMapToHashMap(extendInfo));
      return pageData;
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
                if (outputFields == null || outputFields.size() != 0 || item.get("fields") != null) {
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
