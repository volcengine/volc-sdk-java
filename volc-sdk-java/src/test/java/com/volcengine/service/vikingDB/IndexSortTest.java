package com.volcengine.service.vikingDB;

import com.volcengine.service.vikingDB.common.IndexSortParam;
import com.volcengine.service.vikingDB.common.IndexSortResult;
import org.junit.Test;

import java.util.Arrays;

public class IndexSortTest {
    @Test
    public void testIndexSort() throws Exception {
        VikingDBService vikingDBService = BaseService.getService();
        Index index = vikingDBService.getIndex("test_coll_for_java_sdk", "index_sort");

        IndexSortResult<Long> datas = index.sort(new IndexSortParam<Long>()
                .setPrimaryKeys(Arrays.asList(-1L,0L,1L))
                .setQueryVector(DataUtil.genRandomVector(4))
                .build());
        System.out.println(datas);
    }
}
