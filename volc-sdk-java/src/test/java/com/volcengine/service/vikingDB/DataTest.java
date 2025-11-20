package com.volcengine.service.vikingDB;

import com.volcengine.service.vikingDB.common.DataObject;
import com.volcengine.service.vikingDB.common.FetchDataParam;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataTest {

    @Test
    public void testDataUpsertSingle() throws Exception {
        VikingDBService vikingDBService = BaseService.getService();
        Collection collection = vikingDBService.getCollection("test_coll_for_sdk_with_vectorize");
        HashMap<String, Object> fields = new HashMap<>();
        fields.put("f_id", 1);
        fields.put("f_string", "doc1");
        fields.put("f_text1", "text for 1");
        fields.put("f_text2", "text for 2");
        fields.put("f_image1", "tos://your_bucket/your_object1");
        fields.put("f_image2", "tos://your_bucket/your_object2");
        DataObject data = new DataObject()
                .setFields(fields)
                .build();
        collection.upsertData(data);
    }

    @Test
    public void testDataUpsertBatch() throws Exception {
        VikingDBService vikingDBService = BaseService.getService();
        Collection collection = vikingDBService.getCollection("test_coll_for_java_sdk");
        int dataNum = 100;
        List<DataObject> dataObjects = new ArrayList<>(dataNum);
        for (int i = 1; i <= dataNum; i++) {
            HashMap<String, Object> fields = new HashMap<>();
            fields.put("f_id", Integer.toString(i));
            fields.put("f_vector", DataUtil.genRandomVector(4));
            fields.put("f_string", "doc" + i);
            fields.put("f_int64", DataUtil.genRandomInt64());
            fields.put("f_float32", DataUtil.genRandomDouble());
            Map<String, Double> m = new HashMap<>();
            m.put("你", DataUtil.genRandomDouble());
            m.put("好", DataUtil.genRandomDouble());
            fields.put("f_sparse_vector", m);
            DataObject dataObject1 = new DataObject()
                    .setFields(fields)
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
        System.out.println(dataObjects.size());
    }

    @Test
    public void testDataDeleteBatch() throws Exception {
        VikingDBService vikingDBService = BaseService.getService();
        Index index = vikingDBService.getIndex("test_coll_for_java_sdk", "index_hnsw");
        FetchDataParam param = new FetchDataParam().build();

        List<DataObject> datas = index.fetchData(Arrays.asList(1), param);
        System.out.println(datas);

        Collection collection = vikingDBService.getCollection("test_coll_for_java_sdk");
        collection.deleteData(1, true);

        Thread.sleep(2000);
        
        datas = index.fetchData(Arrays.asList(1), param);
        System.out.println(datas);
    }
}
