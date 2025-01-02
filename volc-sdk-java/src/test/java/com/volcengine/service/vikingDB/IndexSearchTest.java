package com.volcengine.service.vikingDB;

import com.volcengine.service.vikingDB.common.DataObject;
import com.volcengine.service.vikingDB.common.SearchParam;
import com.volcengine.service.vikingDB.common.VectorOrder;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndexSearchTest {
    @Test
    public void testIndexSearch() throws Exception {
        VikingDBService vikingDBService = BaseService.getService();
        Index index = vikingDBService.getIndex("test_coll_for_java_sdk", "index_hnsw");
        List<String> outputField = Arrays.asList("f_id", "f_string", "f_int64");
        Map<String, Object> filter = new HashMap<>();
        filter.put("op", "range");
        filter.put("field", "f_int64");
        filter.put("gt", 0);
        List<DataObject> datas = index.search(new SearchParam()
                .setVectorOrder(new VectorOrder().setVector(DataUtil.genRandomVector(4)).build())
                .setOutputFields(outputField)
                .setFilter(filter)
                .setPartition("default")
                .setLimit(20)
                .build());
        System.out.println(datas);
    }
}
