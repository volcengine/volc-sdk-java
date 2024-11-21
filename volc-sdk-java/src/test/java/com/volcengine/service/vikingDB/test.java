package com.volcengine.service.vikingDB;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Random;

import org.apache.http.HttpHost;

import java.util.Map;
import com.volcengine.service.vikingDB.Collection;
import com.volcengine.service.vikingDB.Index;
import com.volcengine.service.vikingDB.VikingDBService;
import com.volcengine.service.vikingDB.common.*;
// import static com.volcengine.service.vikingDB.test.genRandomVector;


public class test {
    public static List<Double> genRandomVector(int dim){
        List<Double> res = new ArrayList<>();
        for(int i=0;i<dim;i++){
            res.add(new Random().nextDouble());
        }
        return res;
    }
    
    public static void main(String[] args) throws Exception {
        VikingDBService vikingDBService = new VikingDBService("", "", "", "","");
        // HashMap<String, Object> taskParams = new HashMap<>();
        // taskParams.put("tos_path", "demo-1028/demo_1030");
        // taskParams.put("ignore_error", false);
        // taskParams.put("collection_name", "sparse");
        // taskParams.put("file_type", "json");
        // CreateTaskParam taskParam = new CreateTaskParam()
        //                             .setTaskType(TaskType.DataImport)
        //                             .setTaskParams(taskParams)
        //                             .build();
        // String id = vikingDBService.createTask(taskParam);
        // System.out.println(id);

        // Task task = vikingDBService.getTask("");
        // System.out.println(task);

        // List<Task> tasks = vikingDBService.listTasks();
        // System.out.println(tasks);

        // vikingDBService.dropTask("");




        // List<Field> fields = new ArrayList<>();
        // fields.add(new Field().setFieldName("doc_id").setFieldType(FieldType.Int64).setPrimaryKey(true).build());
        // fields.add(new Field().setFieldName("text_vector").setFieldType(FieldType.Vector).setDim(12).build());
        // fields.add(new Field().setFieldName("text_sparse_vector").setFieldType(FieldType.Sparse_Vector).build());
        // fields.add(new Field().setFieldName("like").setFieldType(FieldType.Int64).setDefaultVal(0).build());
        // fields.add(new Field().setFieldName("price").setFieldType(FieldType.Float32).setDefaultVal(2.2).build());
        // fields.add(new Field().setFieldName("aim").setFieldType(FieldType.Bool).setDefaultVal(false).build());
        // fields.add(new Field().setFieldName("author").setFieldType(FieldType.List_String).build());
        // CreateCollectionParam createCollectionParam = new CreateCollectionParam()
        //                                                .setCollectionName("t")
        //                                                .setFields(fields)
        //                                                .build();
        // Collection collection = vikingDBService.createCollection(createCollectionParam);

        // VectorIndexParams vectorIndex = new VectorIndexParams()
        //                                 .setDistance(DistanceType.COSINE)
        //                                 .setIndexType(IndexType.HNSW_HYBRID)
        //                                 .setQuant(QuantType.Float)
        //                                 .build();
        // List<String> scalarIndex = new ArrayList<>();
        // scalarIndex.add("price");
        // scalarIndex.add("aim");
        // CreateIndexParam createIndexParam = new CreateIndexParam()
        //                                 .setCollectionName("t")
        //                                 .setIndexName("t3")
        //                                 .setDescription("this is a test for index")
        //                                 .setCpuQuoat(5)
        //                                 .setVectorIndex(vectorIndex)
        //                                 .setScalarIndex(scalarIndex)
        //                                 .setPartitionBy("like")
        //                                 .setShardPolicy(ShardType.Auto)
        //                                 .setShardCount(10)
        //                                 .build();
        // Index index = vikingDBService.createIndex(createIndexParam);
        // System.out.println(index);

        // Index index = vikingDBService.getIndex("sparse", "sparse");
        // System.out.println(index);

        // List<Index> indexes = vikingDBService.listIndexes("t");
        // for (Index index: indexes){
        //     System.out.println("----");
        //     System.out.println(index);
        // }
        
//        101.126.33.217   180.184.64.90
//        List<Field> fields = new ArrayList<>();
//     //    fields.add(new Field().setFieldName("doc_id").setFieldType(FieldType.String).setPrimaryKey(true).build());
//        fields.add(new Field().setFieldName("doc_id1").setFieldType(FieldType.Int64).setPrimaryKey(true).build());
// //        fields.add(new Field().setFieldName("doc_id").setFieldType(FieldType.String).setDefaultVal("10").build());
//        fields.add(new Field().setFieldName("text_vector").setFieldType(FieldType.Vector).setDim(4).build());
//        fields.add(new Field().setFieldName("sparse_vector").setFieldType(FieldType.Sparse_Vector).build());
//        fields.add(new Field().setFieldName("like").setFieldType(FieldType.Int64).setDefaultVal(0).build());
//        fields.add(new Field().setFieldName("price").setFieldType(FieldType.Float32).setDefaultVal(2.2).build());
//        fields.add(new Field().setFieldName("aim").setFieldType(FieldType.Bool).setDefaultVal(false).build());
//        fields.add(new Field().setFieldName("List_String").setFieldType(FieldType.List_String).build());
//        fields.add(new Field().setFieldName("List_Int64").setFieldType(FieldType.List_Int64).build());
// //        fields.add(new Field().setFieldName("text").setFieldType(FieldType.Text).setDefaultVal(false).setPipelineName("text_bge_large_zh").build());
//     //    fields.add(new Field().setFieldName("text").setFieldType(FieldType.Text).setPipelineName("text_bge_large_and_m3").build());
//        CreateCollectionParam createCollectionParam = new CreateCollectionParam()
//                                                            .setCollectionName("test44")
//                                                            .setFields(fields)
//                                                            .setDescription("text_bge_large_and_m3")
//                                                            .build();
//        Collection collection = vikingDBService.createCollection(createCollectionParam);
//        System.out.println(collection);

    //    Collection aa = vikingDBService.getCollection("sparse_go");  // 查询数据集
    //    System.out.println(aa);

//     //    vikingDBService.dropCollection("test66"); // 删除数据集
//     //    System.out.println(vikingDBService);

//         // List<Collection> collections = vikingDBService.listCollections();  // 查询数据集列表
//         // System.out.println(collections);

    //    HashMap<String,Double> sparse = new HashMap<String,Double>();
    //    sparse.put("hello", 0.5);
    //    HashMap<String,Object> field3 = new HashMap<String,Object>();

    //    field3.put("vector", genRandomVector(12));
    //    DataObject dataObject3 = new DataObject()
    //            .setFields(field3)
    //            .setTTL(0)
    //            .build();
            
    //    Collection collection = vikingDBService.getCollection("sparse_go");
    //    List<DataObject> dataObjects = new ArrayList<>();
    //    dataObjects.add(dataObject3);
    //    collection.upsertData(dataObjects);

    //    Collection collection = vikingDBService.getCollection("test66");  // 删除数据
    //    collection.deleteData("48");

    //    Collection aa = vikingDBService.getCollection("sparse_go"); // 数据集查询数据
    //    DataObject dataObject = aa.fetchData("123");
    //    System.out.println(dataObject);

    //    List<Field> fields = new ArrayList<>();
//        List<String> x = new ArrayList<>();x.add("2");
//        List<Integer> y = new ArrayList<>(); y.add(2);
//        fields.add(new Field().setFieldName("a11").setFieldType(FieldType.Sparse_Vector).setDefaultVal(10).build());
//        fields.add(new Field().setFieldName("bbbb").setFieldType(FieldType.String).setDefaultVal("test3333").build());
//        fields.add(new Field().setFieldName("cccc").setFieldType(FieldType.Bool).setDefaultVal(false).build());
//        fields.add(new Field().setFieldName("ddddd").setFieldType(FieldType.Vector).setDim(10).build());
//        fields.add(new Field().setFieldName("eeee").setFieldType(FieldType.Float32).setDefaultVal(2.2).build());
//        fields.add(new Field().setFieldName("ffff").setFieldType(FieldType.List_Int64).setDefaultVal(y).build());
//        fields.add(new Field().setFieldName("ggggg").setFieldType(FieldType.List_String).setDefaultVal(x).build());
//        fields.add(new Field().setFieldName("ppppp").setFieldType(FieldType.List_Int64).setDefaultVal(y).build());
    //    fields.add(new Field().setFieldName("qqqq").setFieldType(FieldType.Text).setPipelineName("text_split_bge_m3").build());
    //    UpdateCollectionParam updateCollectionParam = new UpdateCollectionParam().setCollectionName("test66")
    //            .setFields(fields)
    //            .setDescription("新增字段1111")
    //            .build();
    //    vikingDBService.updateCollection(updateCollectionParam);
    //    System.out.println(updateCollectionParam);
//
    //    VectorIndexParams vectorIndex = new VectorIndexParams()
    //            .setIndexType(IndexType.HNSW_HYBRID)
    //            .setDistance(DistanceType.IP)
    //            .setQuant(QuantType.Int8)
    //            .build();
    //    List<String> scalarIndex = new ArrayList<>();
    //    scalarIndex.add("price");
    //    scalarIndex.add("like");
    //    CreateIndexParam createIndexParam = new CreateIndexParam()
    //            .setCollectionName("test44")
    //            .setIndexName("test_index44")
    //            .setDescription("this is a test for index")
    //            .setCpuQuoat(1)
    //            .setVectorIndex(vectorIndex)
    //            .setScalarIndex(scalarIndex)
    //            .build();
    //    Index index = vikingDBService.createIndex(createIndexParam);
    //    System.out.println(index); // 创建索引

//        List<String> scalar_index = new ArrayList<>();
// //        scalar_index.add("name");
//        UpdateIndexParam parmas = new UpdateIndexParam().setCollectionName("test44")
//                .setIndexName("test_index44")
//                .setCpuQuoat(3)
//                .setDescription("java sdk 更新")
//                .setScalarIndex(scalar_index)
//                .build();
//        vikingDBService.updateIndex(parmas);
        // 更新索引

    //    vikingDBService.dropIndex("vdb_20240506111822_79ql0", "vdb_20240506111822_79ql0_Index");  // 删除索引

    //    List<Index> indexes = vikingDBService.listIndexes("test44");  // 查询数据集下面的索引
    //    System.out.println(indexes);

    //    List<Index> indexes = vikingDBService.listIndexes("test1"); // 列出索引的索引
    //    System.out.println(indexes);

//
//        List<String> outputField = new ArrayList<>();
// //        outputField.add("[]");
//        outputField.add("like");
// //        outputField.add("List_Int64");
// //        outputField.add("text_vector");
//        ArrayList<String> ids = new ArrayList<>();
//        ids.add("123");
// //        ids.add("22");
// //        ids.add("33");
// //        ids.add("44");
//        Index index = vikingDBService.getIndex("sparse_go", "sparse_go_test5");
//        DataObject dataObject = index.fetchData("123", new FetchDataParam().build());  // 索引数据查询
//        System.out.println(dataObject);

    //    List<String> outputField = new ArrayList<>();
    //    outputField.add("doc_id1");
    //    outputField.add("List_String");
    //    outputField.add("text_vector");
////        HashMap<String, Object> filter = new HashMap<>();
////        filter.put("op", "range_out");
////        filter.put("field", "price");
////        filter.put("gt", 500.0);
////        filter.put("lt", 100.0);
////
    //    SearchByIdParam searchByIdParam = new SearchByIdParam()
    //            .setId(111)
    //            .setRetry(true)
    //            .build();
    //    Index index = vikingDBService.getIndex("sparse_go", "sparse_go_test5");
    //    List<DataObject> datas = index.searchById(searchByIdParam);  // 向量id检索
    //    List<DataObject> datas = index.search(new SearchParam()
    //            .setOutputFields(outputField)
    //            .setFilter(filter)
    //            .setLimit(10)
    //            .build());
    //    System.out.println(datas);
    //     // 支持 no_order

////
    //    List<String> outputField = new ArrayList<>();
//        outputField.add("doc_id");
//        outputField.add("like");
//        outputField.add("text_vector");
//        outputField.add("price");
//        outputField.add("aim");
//        outputField.add("List_String");
//        outputField.add("List_Int64");
//        HashMap<String,Object> sparse = new HashMap<String,Object>();
//        sparse.put("hello", 0.5);
//        SearchByVectorParam searchByVectorParam = new SearchByVectorParam()
//                .setVector(genRandomVector(12))
//                .setSparseVectors(sparse)
// //                .setOutputFields(outputField)
//                .setLimit(5)
//                .setRetry(true)
//                .build();
//        Index index = vikingDBService.getIndex("sparse_go", "sparse_go_test5");

//        List<DataObject> datas = index.searchByVector(searchByVectorParam); // 向量检索
//        System.out.println(datas);
////
//        Index index = vikingDBService.getIndex("test3333", "test_index2");
//        List<DataObject> datas = index.search(new SearchParam()
////                .setVectorOrder(new VectorOrder().setId(777).build())
////                .setVectorOrder(new VectorOrder().setVector(genRandomVector(12)).build())
//                .setScalarOrder(new ScalarOrder("new_field2", Order.Asc).build())
//                .setPartition("46")
//                .setLimit(3)
//                .build());
//        System.out.println(genRandomVector(10));
//        System.out.println(datas);  // 混合检索

////        Index index = vikingDBService.getIndex("AutoTest_WDwAE0VlauX", "demo_excel_url");
//        Index index = vikingDBService.getIndex("test44", "test_index21");
////        HashMap<String, Object> filter = new HashMap<>();
////        filter.put("op", "range");
////        filter.put("field", "gap");
////        filter.put("lt", 4);
//        Text text = new Text().setText("aaaaa").build();
//        SearchByTextParam searchByTextParam = new SearchByTextParam()
//                .setText(text)
////                .setFilter(filter)
////                .setPartition("46")
//                .build();
//        List<DataObject> datas = index.searchByText(searchByTextParam); // 非结构化数据检索
//        System.out.println(datas);



//        Index index = vikingDBService.getIndex("test3", "test_index2");
//        List<String> outputField = new ArrayList<>();
//        outputField.add("doc_id");
//        outputField.add("like");
//        outputField.add("text_vector");
//        HashMap<String, Object> filter = new HashMap<>();
//        filter.put("op", "range");
//        filter.put("field", "price");
//        filter.put("lt", 8);
//        List<DataObject> datas = index.search(new SearchParam()
//                .setVectorOrder(new VectorOrder().setVector(genRandomVector(8)).build())
//                .setOutputFields(outputField)
//                .setPartition("40")
//                .setFilter(filter)
//                .setLimit(2)
//                .build());
//
//        System.out.println(datas);



//        Index index1 = vikingDBService.getIndex("test3", "test_index2");
//        List<DataObject> datas1 = index1.search(new SearchParam()
//                .setVectorOrder(new VectorOrder().setId("40").build())
//                .setPartition("40")
//                .build());
//
//        System.out.println(datas1);
//
//        Index index2 = vikingDBService.getIndex("test3", "test_index2");
//        List<DataObject> datas2 = index2.search(new SearchParam()
//                .setScalarOrder(new ScalarOrder("price", Order.Asc).build())
//                .setLimit(2)
//                .setPartition("40")
//                .build());
//        System.out.println(datas2);



//        System.out.printf("Hello and welcome!");
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("i = " + i);
//        }

//        Double score = vikingDBService.rerank("退改", "如果您需要人工服务，可以拨打人工客服电话：4006660921", "转人工");
//        Double score = vikingDBService.rerank("退改", "1、1日票 1.5日票 2日票的退款政策： -到访日前2天的00:00前，免费退款 - 到访日前2天的00:00至到访日前夜23:59期间,退款需扣除服务费（人民币80元） - 到访日当天（00:00 之后），不可退款 2、半日票的退款政策： - 未使用的们票可在所选入...", "门票退改政策｜北京环球影城的门票退改政策")
//        System.out.println(score);

//        Map<String,Object> map1 = new HashMap<>();
//        map1.put("query", "退改");
//        map1.put("content", "如果您需要人工服务，可以拨打人工客服电话：4006660921");
//        map1.put("title", "无");
//        Map<String,Object> map2 = new HashMap<>();
//        map2.put("query", "退改");
//        map2.put("content", "1、1日票 1.5日票 2日票的退款政策： -到访日前2天的00:00前，免费退款 - 到访日前2天的00:00至到访日前夜23:59期间,退款需扣除服务费（人民币80元） - 到访日当天（00:00 之后），不可退款 2、半日票的退款政策： - 未使用的们票可在所选入...");
//        map2.put("title", "门票退改政策｜北京环球影城的门票退改政策");
//        Map<String,Object> map3 = new HashMap<>();
//        map3.put("query", "退改");
//        map3.put("content", "如果您需要人工服务，可以拨打人工客服电话：4006660921");
//        List<Map<String,Object>> datas = new ArrayList<>();
//        datas.add(map1);
//        datas.add(map2);
//        datas.add(map3);
//        List<Double> res = vikingDBService.batchRerank(datas);
//        System.out.println(res);

    }
}