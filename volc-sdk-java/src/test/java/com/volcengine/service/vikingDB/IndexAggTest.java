package com.volcengine.service.vikingDB;

import com.volcengine.service.vikingDB.common.SearchAggParam;
import com.volcengine.service.vikingDB.common.SearchAggResult;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class IndexAggTest {
    @Test
    public void testIndexAggGroupBy() throws Exception {
        VikingDBService vikingDBService = BaseService.getService();
        Index index = vikingDBService.getIndex("test_coll_for_sdk", "index_hnsw_hybrid");

        Map<String, Object> agg = new HashMap<>();
        agg.put("op", "count");
        agg.put("field", "f_string");
        Map<String, Object> filter = new HashMap<>();
        filter.put("op", "range");
        filter.put("field", "f_int64");
        filter.put("gt", 10);
        SearchAggResult result = index.searchAgg(new SearchAggParam()
                .setAgg(agg)
                .setFilter(filter)
                .build());
        System.out.println(result);
    }

    @Test
    public void testIndexAggTotalCount() throws Exception {
        VikingDBService vikingDBService = BaseService.getService();
        Index index = vikingDBService.getIndex("test_coll_for_sdk", "index_hnsw_hybrid");

        Map<String, Object> agg = new HashMap<>();
        agg.put("op", "count");
        agg.put("field", "f_string");
        SearchAggResult result = index.searchAgg(new SearchAggParam()
                .setAgg(agg)
                .build());
        System.out.println(result);
    }
}
