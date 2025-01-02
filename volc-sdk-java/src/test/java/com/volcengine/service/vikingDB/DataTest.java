package com.volcengine.service.vikingDB;

import com.volcengine.service.vikingDB.common.DataObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DataTest {

    @Test
    public void testDataUpsertBatch() throws Exception {
        VikingDBService vikingDBService = BaseService.getService();
        Collection collection = vikingDBService.getCollection("test_coll_for_java_sdk");
        int dataNum = 100;
        List<DataObject> dataObjects = new ArrayList<>(dataNum);
        for (int i = 1; i <= dataNum; i++) {
            HashMap<String,Object> field = new HashMap<>();
            field.put("f_id", i);
            field.put("f_vector", DataUtil.genRandomVector(4));
            field.put("f_string", "doc" + i);
            field.put("f_int64", DataUtil.genRandomInt64());
            field.put("f_float32", DataUtil.genRandomDouble());
            DataObject dataObject1 = new DataObject()
                    .setFields(field)
                    .setTTL(0)
                    .build();
            dataObjects.add(dataObject1);
        }
        collection.upsertData(dataObjects);
    }

    @Test
    public void testDataFetchByCollectionSingle() throws Exception {
        VikingDBService vikingDBService = BaseService.getService();
        Collection collection = vikingDBService.getCollection("test_coll_for_java_sdk");
        DataObject singleData = collection.fetchData(1);
        System.out.println(singleData);
    }

    @Test
    public void testDataFetchByCollectionBatch() throws Exception {
        VikingDBService vikingDBService = BaseService.getService();
        Collection collection = vikingDBService.getCollection("test_coll_for_java_sdk");
        List<DataObject> dataObjects = collection.fetchData(Arrays.asList(1, 2, 3));
        System.out.println(dataObjects);
    }
}
