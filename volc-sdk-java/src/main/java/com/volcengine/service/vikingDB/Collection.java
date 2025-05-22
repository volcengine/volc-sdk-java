package com.volcengine.service.vikingDB;

import com.google.gson.internal.LinkedTreeMap;
import com.volcengine.service.vikingDB.common.Constant;
import com.volcengine.service.vikingDB.common.DataObject;
import com.volcengine.service.vikingDB.common.Field;
import com.volcengine.service.vikingDB.common.VectorizeTuple;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Data
public class Collection {
    protected String collectionName;
    private List<Field> fields;
    protected VikingDBService vikingDBService;
    protected String primaryKey;
    private List<String> indexes = null;
    private String description = "";
    private List<VectorizeTuple> vectorize = null;
    private HashMap<String, Object> stat = null;
    private String createTime = null;
    private String updateTime = null;
    private String updatePerson = null;
    protected Boolean isClient = false;

    public Collection(String collectionName, List<Field> fields, VikingDBService vikingDBService, String primaryKey) {
        this.collectionName = collectionName;
        this.fields = fields;
        this.vikingDBService = vikingDBService;
        this.primaryKey = primaryKey;
    }

    public Collection() {
    }

    public HashMap<String, Object> validAndPackageData(DataObject dataObject, Boolean asyncUpsert) throws Exception {
        if (dataObject.getIsBuild() == 0) {
            VikingDBException vikingDBException = new VikingDBException(1000031, null, "Param dose not build");
            throw vikingDBException.getErrorCodeException(1000031, null, "Param dose not build");
        }

        List<HashMap<String, Object>> fieldList = new ArrayList<>();
        fieldList.add(dataObject.getFields());
        Integer ttl = null;
        if (dataObject.getTTL() != null) {
            ttl = dataObject.getTTL();
        }
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("collection_name", collectionName);
        params.put("fields", fieldList);
        params.put("ttl", ttl);
        if (asyncUpsert) {
            params.put("async", asyncUpsert);
        }
        return params;
    }

    public HashMap<Integer, ArrayList<Object>> validAndPackageDatas(List<DataObject> dataObjects) throws Exception {
        HashMap<Integer, ArrayList<Object>> record = new HashMap<>();
        for (DataObject item : dataObjects) {
            if (item.getIsBuild() == 0) {
                VikingDBException vikingDBException = new VikingDBException(1000031, null, "Param dose not build");
                throw vikingDBException.getErrorCodeException(1000031, null, "Param dose not build");
            }

            if (record.get(item.getTTL()) != null) {
                ArrayList<Object> fields = record.get(item.getTTL());
                fields.add(item.getFields());
                record.put(item.getTTL(), fields);
            } else {
                ArrayList<Object> fields = new ArrayList<>();
                fields.add(item.getFields());
                record.put(item.getTTL(), fields);
            }
        }
        return record;
    }

    public void upsertData(DataObject dataObject) throws Exception {
        HashMap<String, Object> params = validAndPackageData(dataObject, false);
        vikingDBService.retryRequest("UpsertData", null, params, Constant.MAX_RETRIES);

    }

    public void upsertData(DataObject dataObject, Boolean asyncUpsert) throws Exception {
        HashMap<String, Object> params = validAndPackageData(dataObject, asyncUpsert);
        vikingDBService.retryRequest("UpsertData", null, params, Constant.MAX_RETRIES);

    }

    public void upsertData(List<DataObject> dataObjects) throws Exception {
        HashMap<Integer, ArrayList<Object>> record = validAndPackageDatas(dataObjects);
        for (Integer key : record.keySet()) {
            HashMap<String, Object> params = new HashMap<String, Object>();
            params.put("collection_name", collectionName);
            params.put("fields", record.get(key));
            params.put("ttl", key);
            vikingDBService.retryRequest("UpsertData", null, params, Constant.MAX_RETRIES);
        }
    }

    public void upsertData(List<DataObject> dataObjects, Boolean asyncUpsert) throws Exception {
        HashMap<Integer, ArrayList<Object>> record = validAndPackageDatas(dataObjects);
        for (Integer key : record.keySet()) {
            HashMap<String, Object> params = new HashMap<String, Object>();
            params.put("collection_name", collectionName);
            params.put("fields", record.get(key));
            params.put("ttl", key);
            if (asyncUpsert) {
                params.put("async", asyncUpsert);
            }
            vikingDBService.retryRequest("UpsertData", null, params, Constant.MAX_RETRIES);
        }
    }

    public void updateData(DataObject dataObject) throws Exception {
        HashMap<String, Object> params = validAndPackageData(dataObject, false);
        vikingDBService.retryRequest("UpdateData", null, params, Constant.MAX_RETRIES);
    }

    public void updateData(List<DataObject> dataObjects) throws Exception {
        HashMap<Integer, ArrayList<Object>> record = validAndPackageDatas(dataObjects);
        for (Integer key : record.keySet()) {
            HashMap<String, Object> params = new HashMap<String, Object>();
            params.put("collection_name", collectionName);
            params.put("fields", record.get(key));
            params.put("ttl", key);
            vikingDBService.retryRequest("UpdateData", null, params, Constant.MAX_RETRIES);
        }
    }

    public <T> void deleteData(T id) throws Exception {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("collection_name", collectionName);
        params.put("primary_keys", id);
        vikingDBService.doRequest("DeleteData", null, params);
    }

    public void deleteAllData() throws Exception {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("collection_name", collectionName);
        params.put("del_all", true);
        vikingDBService.doRequest("DeleteData", null, params);
    }

    public <T> DataObject fetchData(T id) throws Exception {
        DataObject dataObject;
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("collection_name", collectionName);
        params.put("primary_keys", id);
        if (getIsClient()) {
          params.put("replace_primay", true);
      }
        LinkedTreeMap<String, Object> resData = vikingDBService.retryRequest("FetchData", null, params, Constant.MAX_RETRIES);
        if (resData == null) {
            throw new Exception(Constant.NO_RESPONSE_DATA);
        }
        @SuppressWarnings("unchecked")
        ArrayList<LinkedTreeMap<String, Object>> res = (ArrayList<LinkedTreeMap<String, Object>>) resData.get("data");
        HashMap<String, Object> hashMap = vikingDBService.convertLinkedTreeMapToHashMap(res.get(0));
        dataObject = new DataObject()
                .setFields(hashMap)
                .setId(id);
        return dataObject;
    }

    public List<DataObject> fetchData(List<?> ids) throws Exception {
        List<DataObject> dataObjects = new ArrayList<>();
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("collection_name", collectionName);
        params.put("primary_keys", ids);
        if (getIsClient()) {
            params.put("replace_primay", true);
        }
        LinkedTreeMap<String, Object> resData = vikingDBService.retryRequest("FetchData", null, params, Constant.MAX_RETRIES);
        if (resData == null) {
            throw new Exception(Constant.NO_RESPONSE_DATA);
        }
        @SuppressWarnings("unchecked")
        ArrayList<LinkedTreeMap<String, Object>> res = (ArrayList<LinkedTreeMap<String, Object>>) resData.get("data");
        for (LinkedTreeMap<String, Object> linkedTreeMap : res) {
            HashMap<String, Object> hashMap = vikingDBService.convertLinkedTreeMapToHashMap(linkedTreeMap);
            DataObject dataObject = new DataObject()
                    .setFields(hashMap)
                    .setId(hashMap.get(primaryKey));
            dataObjects.add(dataObject);
        }
        return dataObjects;
    }
}
