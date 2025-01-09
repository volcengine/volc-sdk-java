package com.volcengine.service.vikingDB;

import com.volcengine.service.vikingDB.common.CreateIndexParam;
import com.volcengine.service.vikingDB.common.DistanceType;
import com.volcengine.service.vikingDB.common.IndexType;
import com.volcengine.service.vikingDB.common.QuantType;
import com.volcengine.service.vikingDB.common.ShardType;
import com.volcengine.service.vikingDB.common.VectorIndexParams;
import org.junit.Test;

import java.util.Arrays;

public class IndexTest {

    @Test
    public void testIndexCreateForHnsw() throws Exception {
        VikingDBService vikingDBService = BaseService.getService();
        CreateIndexParam createIndexParam = new CreateIndexParam()
                .setCollectionName("test_coll_for_java_sdk")
                .setIndexName("index_hnsw")
                .setDescription("this is an example for java sdk test")
                .setShardPolicy(ShardType.Auto)
                .setVectorIndex(new VectorIndexParams()
                        .setIndexType(IndexType.HNSW)
                        .setDistance(DistanceType.IP)
                        .setQuant(QuantType.Float)
                        .setHnswM(20)
                        .setHnswCef(200)
                        .setHnswSef(200)
                        .build())
                .setScalarIndex(Arrays.asList("f_string", "f_int64", "f_float32"))
                .build();
        vikingDBService.createIndex(createIndexParam);
    }

    @Test
    public void testIndexCreateForSort() throws Exception {
        VikingDBService vikingDBService = BaseService.getService();
        CreateIndexParam createIndexParam = new CreateIndexParam()
                .setCollectionName("test_coll_for_java_sdk")
                .setIndexName("index_sort")
                .setDescription("this is an example for java sdk test")
                .setShardPolicy(ShardType.Auto)
                .setVectorIndex(new VectorIndexParams()
                        .setIndexType(IndexType.SORT)
                        .setDistance(DistanceType.IP)
                        .setQuant(QuantType.Float)
                        .build())
                .build();
        vikingDBService.createIndex(createIndexParam);
    }

    @Test
    public void testIndexInfo() throws Exception {
        VikingDBService vikingDBService = BaseService.getService();
        Index index = vikingDBService.getIndex("test_coll_for_java_sdk", "index_hnsw");
        System.out.println(index);
    }

    @Test
    public void testIndexDrop() throws Exception {
        VikingDBService vikingDBService = BaseService.getService();
        vikingDBService.dropIndex("test_coll_for_java_sdk", "index_hnsw");
    }
}
