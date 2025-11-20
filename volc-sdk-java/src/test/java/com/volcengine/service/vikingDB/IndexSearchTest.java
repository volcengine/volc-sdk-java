package com.volcengine.service.vikingDB;

import com.volcengine.service.vikingDB.common.DataObject;
import com.volcengine.service.vikingDB.common.FetchDataParam;
import com.volcengine.service.vikingDB.common.ScalarOrder;
import com.volcengine.service.vikingDB.common.SearchParam;
import com.volcengine.service.vikingDB.common.SearchWithMultiModalParam;
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

    @Test
    public void testIndexSearchFilterByPrimaryKeys() throws Exception {
        VikingDBService vikingDBService = BaseService.getService();
        Index index = vikingDBService.getIndex("test_coll_for_java_sdk", "index_hnsw");
        List<String> outputField = Arrays.asList("f_id", "f_string", "f_int64");
        List<DataObject> datas = index.search(new SearchParam()
                .setVectorOrder(new VectorOrder().setVector(DataUtil.genRandomVector(4)).build())
                .setOutputFields(outputField)
                .setPartition("default")
                .setPrimaryKeyIn(Arrays.asList(0, 1, 2, 3, 4, 5))
                .setPrimaryKeyNotIn(Arrays.asList(2, 3))
                .setLimit(20)
                .build());
        System.out.println(datas);
    }

    @Test
    public void testIndexSearchFilterByPostProcessOps() throws Exception {
        VikingDBService vikingDBService = BaseService.getService();
        Index index = vikingDBService.getIndex("test_coll_for_java_sdk", "index_hnsw");
        Map<String, Object> stringMatchOp = new HashMap<>();
        stringMatchOp.put("op", "string_match");
        stringMatchOp.put("field", "f_string");
        stringMatchOp.put("pattern", ".*doc[4-9]*$");
        // Map<String, Object> stringLikeOp = new HashMap<>();
        // stringLikeOp.put("op", "string_like");
        // stringLikeOp.put("field", "f_string");
        // stringLikeOp.put("pattern", "docf%");
        Map<String, Object> enumFreqLimitOp = new HashMap<>();
        enumFreqLimitOp.put("op", "enum_freq_limiter");
        enumFreqLimitOp.put("field", "f_string");
        enumFreqLimitOp.put("threshold", 2);
        List<DataObject> datas = index.search(new SearchParam()
                .setScalarOrder(new ScalarOrder("f_int64", "asc").build())
                .setOutputFields(Arrays.asList("f_id", "f_string", "f_int64", "f_float32"))
                .setPartition("default")
                .setPostProcessInputLimit(100)
                .setPostProcessOps(Arrays.asList(stringMatchOp, enumFreqLimitOp))
                .setLimit(3)
                .build());
        for (DataObject data : datas) {
            System.out.println(data);
        }
    }

    @Test
    public void testIndexSearchWithMultiModal() throws Exception {
        VikingDBService vikingDBService = BaseService.getService();
        Index index = vikingDBService.getIndex("test_coll_for_sdk_with_vectorize", "index_hnsw_hybrid");
        List<DataObject> datas = index.searchWithMultiModal(new SearchWithMultiModalParam()
                .setText("1")
                .setImage("tos://your_bucket/your_object")
                .build());
        System.out.println(datas);
    }

    @Test
    public void testIndexFetch() throws Exception {
        VikingDBService vikingDBService = BaseService.getService();
        Index index = vikingDBService.getIndex("test_coll_for_java_sdk", "index_hnsw");
        FetchDataParam param = new FetchDataParam().build();
        List<DataObject> datas = index.fetchData(Arrays.asList(1), param);
        System.out.println(datas);
    }
}
