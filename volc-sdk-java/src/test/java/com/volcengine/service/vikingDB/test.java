package com.volcengine.service.vikingDB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.volcengine.service.vikingDB.Collection;
import com.volcengine.service.vikingDB.VikingDBService;
import com.volcengine.service.vikingDB.common.CreateCollectionParam;
import com.volcengine.service.vikingDB.common.CreateIndexParam;
import com.volcengine.service.vikingDB.common.DataObject;
import com.volcengine.service.vikingDB.common.DistanceType;
import com.volcengine.service.vikingDB.common.EmbModel;
import com.volcengine.service.vikingDB.common.FetchDataParam;
import com.volcengine.service.vikingDB.common.Field;
import com.volcengine.service.vikingDB.common.FieldType;
import com.volcengine.service.vikingDB.common.ID;
import com.volcengine.service.vikingDB.common.IndexType;
import com.volcengine.service.vikingDB.common.Order;
import com.volcengine.service.vikingDB.common.QuantType;
import com.volcengine.service.vikingDB.common.RawData;
import com.volcengine.service.vikingDB.common.ScalarOrder;
import com.volcengine.service.vikingDB.common.SearchByIdParam;
import com.volcengine.service.vikingDB.common.SearchByTextParam;
import com.volcengine.service.vikingDB.common.SearchByVectorParam;
import com.volcengine.service.vikingDB.common.SearchParam;
import com.volcengine.service.vikingDB.common.Text;
import com.volcengine.service.vikingDB.common.UpdateCollectionParam;
import com.volcengine.service.vikingDB.common.UpdateIndexParam;
import com.volcengine.service.vikingDB.common.VectorIndexParams;
import com.volcengine.service.vikingDB.common.VectorOrder;


public class test {
    public static void main(String[] args) throws Exception {
        // System.out.println("example");
       VikingDBService vikingDBService = new VikingDBService("", "", "", "","http");

    //    List<Map<String,Object>> datas = new ArrayList<>();
    //    Map<String,Object> map1 = new HashMap<>();
    //    map1.put("query", "退改");
    //    map1.put("content", "如果您需要人工服务，可以拨打人工客服电话：4006660921");
    //    map1.put("title", "无");
    //    Map<String,Object> map2 = new HashMap<>();
    //    map2.put("query", "退改");
    //    map2.put("content", "1、1日票 1.5日票 2日票的退款政策： -到访日前2天的00:00前，免费退款 - 到访日前2天的00:00至到访日前夜23:59期间,退款需扣除服务费（人民币80元） - 到访日当天（00:00 之后），不可退款 2、半日票的退款政策： - 未使用的们票可在所选入...");
    //    map2.put("title", "门票退改政策｜北京环球影城的门票退改政策");
    //    Map<String,Object> map3 = new HashMap<>();
    //    map3.put("query", "退改");
    //    map3.put("content", "如果您需要人工服务，可以拨打人工客服电话：4006660921");
    //    datas.add(map1);
    //    datas.add(map2);
    //    datas.add(map3);
    //    List<Double> res = vikingDBService.batchRerank(datas);
    //    System.out.println(res);


    //    Double score = vikingDBService.rerank("退改", "如果您需要人工服务，可以拨打人工客服电话：4006660921", "转人工");
    //    System.out.println(score);
    //    HashMap<String,String> header = new HashMap<>();
    //    header.put("V-User-Name", "javaName");
    //    header.put("V-User-Id", "javaID");
    //    header.put("V-Account-Id", "javaAccountID");
    //    vikingDBService.setHeader(header);
    //    List<Field> fields = new ArrayList<>();
    //    fields.add(new Field().setFieldName("doc_id").setFieldType(FieldType.Int64).setPrimaryKey(true).build());
    //    fields.add(new Field().setFieldName("text_vector").setFieldType(FieldType.Vector).setDim(10).build());
    //    fields.add(new Field().setFieldName("like").setFieldType(FieldType.Int64).setDefaultVal(0).build());
    //    fields.add(new Field().setFieldName("price").setFieldType(FieldType.Float32).setDefaultVal(2.2).build());
    //    fields.add(new Field().setFieldName("aim").setFieldType(FieldType.Bool).setDefaultVal(false).build());
    //    fields.add(new Field().setFieldName("author").setFieldType(FieldType.List_String).build());
    //    CreateCollectionParam createCollectionParam = new CreateCollectionParam()
    //                                                    .setCollectionName("javaSDKTest")
    //                                                    .setFields(fields)
    //                                                    .setDescription("test")
    //                                                    .build();
    //    Collection collection = vikingDBService.createCollection(createCollectionParam);

       Collection collection = vikingDBService.getCollection("example");
       System.out.println(collection);

    //     vikingDBService.dropCollection("javaSDKTest");
        
    //     List<Collection> collections = vikingDBService.listCollections();
    //     for(Collection collection:collections){
    //         System.out.println(collection);
    //     }

        // VectorIndexParams vectorIndex = new VectorIndexParams()
        //                                 .setDistance(DistanceType.COSINE)
        //                                 .setIndexType(IndexType.DiskANN)
        //                                 .setQuant(QuantType.Float)
        //                                 .build();
        // List<String> scalarIndex = new ArrayList<>();
        // scalarIndex.add("price");
        // scalarIndex.add("aim");
        // CreateIndexParam createIndexParam = new CreateIndexParam()
        //                                 .setCollectionName("tt")
        //                                 .setIndexName("ttt")
        //                                 .setDescription("this is a test for index")
        //                                 .setCpuQuoat(5)
        //                                 .setVectorIndex(vectorIndex)
        //                                 .setScalarIndex(scalarIndex)
        //                                 .setPartitionBy("like")
        //                                 .setShardCount(3)
        //                                 .build();
        // Index index = vikingDBService.createIndex(createIndexParam);
        // System.out.println(index);

        // Index index = vikingDBService.getIndex("tt", "tt");
        // System.out.println(index);

    //     vikingDBService.dropIndex("javaSDKTest", "test_index");
    
        // List<Index> indexes = vikingDBService.listIndexes("javaSDKTest");
        // System.out.println(indexes);

    //     HashMap<String,Object> field1 = new HashMap<String,Object>();
    //     List<String> author1 = new ArrayList<>();
    //     author1.add("name1");
    //     author1.add("name2");
    //     field1.put("doc_id", "11");
    //     field1.put("text_vector", genRandomVector(10));
    //     field1.put("like", 1);
    //     field1.put("price", 1.11);
    //     field1.put("aim", true);
    //     field1.put("author", author1);
    //     DataObject dataObject1 = new DataObject()
    //                             .setFields(field1)
    //                             .setTTL(200000)
    //                             .build();
    //     HashMap<String,Object> field2 = new HashMap<String,Object>();
    //     List<String> author2 = new ArrayList<>();
    //     author2.add("name3");
    //     author2.add("name4");
    //     field2.put("doc_id", "22");
    //     field2.put("text_vector", genRandomVector(10));
    //     field2.put("like", 2);
    //     field2.put("price", 1.11);
    //     field2.put("aim", false);
    //     field2.put("author", author2);
    //     DataObject dataObject2 = new DataObject()
    //                             .setFields(field2)
    //                             .build();
    //     HashMap<String,Object> field3 = new HashMap<String,Object>();
    //     List<String> author3 = new ArrayList<>();
    //     author3.add("name5");
    //     author3.add("name6");
    //     field3.put("doc_id", "33");
    //     field3.put("text_vector", genRandomVector(10));
    //     field3.put("like", 3);
    //     field3.put("price", 3.33);
    //     field3.put("aim", false);
    //     field3.put("author", author3);
    //     DataObject dataObject3 = new DataObject()
    //                             .setFields(field3)
    //                             .setTTL(6000000)
    //                             .build();
    //     HashMap<String,Object> field4 = new HashMap<String,Object>();
    //     List<String> author4 = new ArrayList<>();
    //     author4.add("name7");
    //     author4.add("name8");
    //     field4.put("doc_id", "44");
    //     field4.put("text_vector", genRandomVector(10));
    //     field4.put("like", 4);
    //     field4.put("price", 4.44);
    //     field4.put("aim", false);
    //     field4.put("author", author4);
    //     DataObject dataObject4 = new DataObject()
    //                             .setFields(field4)
    //                             .build();
    //     Collection collection = vikingDBService.getCollection("javaSDKTest");
    //     List<DataObject> dataObjects = new ArrayList<>();
    //     dataObjects.add(dataObject1);
    //     dataObjects.add(dataObject2);
    //     dataObjects.add(dataObject3);
    //     dataObjects.add(dataObject4);
    //     collection.upsertData(dataObjects);

    //     Collection collection = vikingDBService.getCollection("javaSDKTest");
    //     List<String> ids = new ArrayList<>();
    //     ids.add("11");
    //     ids.add("22");
    //     ids.add("33");
    //     ids.add("44");
    //     List<DataObject> dataObjects = collection.fetchData(ids);
    //     System.out.println(dataObjects);

    //     Collection collection = vikingDBService.getCollection("javaSDKTest");
    //     List<String> ids = new ArrayList<>();
    //     ids.add("11");
    //     ids.add("22");
    //     collection.deleteData(ids);

    //     List<String> outputField = new ArrayList<>();
    //     outputField.add("doc_id");
    //     outputField.add("like");
    //     outputField.add("text_vector");
    //     HashMap<String, Object> filter = new HashMap<>();
    //     filter.put("op", "range");
    //     filter.put("field", "price");
    //     filter.put("lt", 4);
    //     SearchByVectorParam searchByVectorParam = new SearchByVectorParam()
    //                                                 .setVector(genRandomVector(10))
    //                                                 .setOutputFields(outputField)
    //                                                 .setLimit(1)
    //                                                 .setFilter(filter)
    //                                                 .setPartition(3)
    //                                                 .build();
    //     Index index = vikingDBService.getIndex("javaSDKTest", "test_index");
    //     List<DataObject> datas = index.searchByVector(searchByVectorParam);
    //     System.out.println(datas);

    //     List<String> outputField = new ArrayList<>();
    //     outputField.add("doc_id");
    //     outputField.add("price");
    //     outputField.add("text_vector");
    //     HashMap<String, Object> filter = new HashMap<>();
    //     filter.put("op", "range");
    //     filter.put("field", "price");
    //     filter.put("lt", 4);
    //     SearchByIdParam searchByIdParam = new SearchByIdParam()
    //                                         .setOutputFields(outputField)
    //                                         .setId("22")
    //                                         .setPartition(3)
    //                                         .setFilter(filter)
    //                                         .setLimit(2)
    //                                         .build();
    //     Index index = vikingDBService.getIndex("javaSDKTest", "test_index");
    //     List<DataObject> datas = index.searchById(searchByIdParam);
    //     System.out.println(datas);

        // Index index = vikingDBService.getIndex("javaSDKTest", "test_index");
        // List<String> outputField = new ArrayList<>();
        // outputField.add("doc_id");
        // outputField.add("like");
        // outputField.add("text_vector");
        // HashMap<String, Object> filter = new HashMap<>();
        // filter.put("op", "range");
        // filter.put("field", "price");
        // filter.put("lt", 4);
        // List<DataObject> datas = index.search(new SearchParam()
        //                                         .setVectorOrder(new VectorOrder().setVector(genRandomVector(10)).build())
        //                                         .setOutputFields(outputField)
        //                                         .setPartition(3)
        //                                         .setFilter(filter)
        //                                         .setLimit(2)
        //                                         .build());

        // System.out.println(datas);

        // Index index = vikingDBService.getIndex("example", "example_index");
        // List<String> outputField = new ArrayList<>();
        // outputField.add("doc_id");
        // outputField.add("like");
        // outputField.add("text_vector");
        // HashMap<String, Object> filter = new HashMap<>();
        // filter.put("op", "range");
        // filter.put("field", "price");
        // filter.put("lt", 4);
        // List<DataObject> datas = index.search(new SearchParam()
        //                                         .setOutputFields(outputField)
        //                                         .setFilter(filter)
        //                                         .setLimit(5)
        //                                         .build());

        // System.out.println(datas);

        // Index index = vikingDBService.getIndex("javaSDKTest", "test_index");
        // List<DataObject> datas = index.search(new SearchParam()
        //                                         .setVectorOrder(new VectorOrder().setId("22").build())
        //                                         .setPartition(3)
        //                                         .build());

        // System.out.println(datas);

    //     Index index = vikingDBService.getIndex("javaSDKTest", "test_index");
    //     List<DataObject> datas = index.search(new SearchParam()
    //                                             .setScalarOrder(new ScalarOrder("price", Order.Asc).build())
    //                                             .setLimit(2)
    //                                             .setPartition(3)
    //                                             .build());
    //     System.out.println(datas);

    //     ArrayList<String> ids = new ArrayList<>();
    //     ids.add("11");
    //     ids.add("22");
    //     ids.add("33");
    //     ids.add("44");
    //     Index index = vikingDBService.getIndex("test", "test_index");
    //     List<DataObject> dataObject = index.fetchData(ids, new FetchDataParam().setOutputFields(outputField).build());
    //     DataObject dataObject = index.fetchData("22", new FetchDataParam().setOutputFields(outputField).build());
    //     System.out.println(dataObject);

    //     List<Double> res = vikingDBService.embedding(new EmbModel().setModelName("bge_large_zh").build(), new RawData().setDataType("text").setText("hello1").build());
    //     System.out.println(res);

    //     ArrayList<RawData> rawDatas = new ArrayList<>();
    //     rawDatas.add(new RawData().setDataType("text").setText("hello1").build());
    //     rawDatas.add(new RawData().setDataType("text").setText("hello2").build());
    //     List<List<Double>> res = vikingDBService.embedding(new EmbModel().setModelName("bge_large_zh").build(), rawDatas);
    //     for(List<Double> list: res){
    //         System.out.println(list);
    //         System.out.println("-----------");
    //     }

    //    List<Field> fields = new ArrayList<>();
    //    fields.add(new Field().setFieldName("doc_id").setFieldType(FieldType.String).setPrimaryKey(true).build());
    //    fields.add(new Field().setFieldName("text").setFieldType(FieldType.Text).setPipelineName("text_split_bge_large_zh").build());
    //    fields.add(new Field().setFieldName("like").setFieldType(FieldType.Int64).setDefaultVal(0).build());
    //    fields.add(new Field().setFieldName("price").setFieldType(FieldType.Float32).setDefaultVal(2.2).build());
    //    fields.add(new Field().setFieldName("aim").setFieldType(FieldType.Bool).setDefaultVal(false).build());
    //    CreateCollectionParam createCollectionParam = new CreateCollectionParam()
    //                                                    .setCollectionName("test_text")
    //                                                    .setFields(fields)
    //                                                    .setDescription("test for text")
    //                                                    .build();
    //    Collection collection = vikingDBService.createCollection(createCollectionParam);

    //     VectorIndexParams vectorIndex = new VectorIndexParams()
    //                                     .setDistance(DistanceType.COSINE)
    //                                     .setIndexType(IndexType.HNSW)
    //                                     .setQuant(QuantType.Float)
    //                                     .build();
    //     List<String> scalarIndex = new ArrayList<>();
    //     scalarIndex.add("price");
    //     scalarIndex.add("like");
    //     CreateIndexParam createIndexParam = new CreateIndexParam()
    //                                     .setCollectionName("test_text")
    //                                     .setIndexName("test_index_text")
    //                                     .setDescription("this is a test for index_text")
    //                                     .setCpuQuoat(5)
    //                                     .setVectorIndex(vectorIndex)
    //                                     .setScalarIndex(scalarIndex)
    //                                     .build();
    //     Index index = vikingDBService.createIndex(createIndexParam);


    //     HashMap<String,Object> field1 = new HashMap<String,Object>();
    //     HashMap<String,String> text1 = new HashMap<>();
    //     text1.put("text", "this is one");
    //     field1.put("doc_id", "11");
    //     field1.put("text", text1);
    //     field1.put("like", 1);
    //     field1.put("price", 1.11);
    //     field1.put("aim", true);
    //     DataObject dataObject1 = new DataObject()
    //                             .setFields(field1)
    //                             .setTTL(10)
    //                             .build();
    //     HashMap<String,Object> field2 = new HashMap<String,Object>();
    //     HashMap<String,String> text2 = new HashMap<>();
    //     text2.put("text", "this is two");
    //     field2.put("doc_id", "22");
    //     field2.put("text", text2);
    //     field2.put("like", 2);
    //     field2.put("price", 2.22);
    //     field2.put("aim", false);
    //     DataObject dataObject2 = new DataObject()
    //                             .setFields(field2)
    //                             .setTTL(1000)
    //                             .build();
    //     HashMap<String,Object> field3 = new HashMap<String,Object>();
    //     HashMap<String,String> text3 = new HashMap<>();
    //     text3.put("text", "this is three");
    //     field3.put("doc_id", "33");
    //     field3.put("text", text3);
    //     field3.put("like", 3);
    //     field3.put("price", 3.33);
    //     field3.put("aim", false);
    //     DataObject dataObject3 = new DataObject()
    //                             .setFields(field3)
    //                             .build();
    //     HashMap<String,Object> field4 = new HashMap<String,Object>();
    //     HashMap<String,String> text4 = new HashMap<>();
    //     text4.put("text", "this is four");
    //     field4.put("doc_id", "44");
    //     field4.put("text", text4);
    //     field4.put("like", 4);
    //     field4.put("price", 4.44);
    //     field4.put("aim", false);
    //     DataObject dataObject4 = new DataObject()
    //                             .setFields(field4)
    //                             .build();
    //     Collection collection = vikingDBService.getCollection("test_text");
    //     List<DataObject> dataObjects = new ArrayList<>();
    //     dataObjects.add(dataObject1);
    //     dataObjects.add(dataObject2);
    //     dataObjects.add(dataObject3);
    //     dataObjects.add(dataObject4);
    //     collection.upsertData(dataObject4);

        // Index index = vikingDBService.getIndex("test_text", "test_index_text");
        // HashMap<String, Object> filter = new HashMap<>();
        // filter.put("op", "range");
        // filter.put("field", "price");
        // filter.put("lt", 4);
        // Text text = new Text().setText("this.is test").build();
        // SearchByTextParam searchByTextParam = new SearchByTextParam()
        //                                         .setText(text)
        //                                         .setFilter(filter)
        //                                         .build();
        // List<DataObject> datas = index.searchByText(searchByTextParam);
        // System.out.println(datas);

        // Collection collection = vikingDBService.getCollection("test_text");
        // List<String> ids = new ArrayList<>();
        // ids.add("11");
        // ids.add("22");
        // ids.add("33");
        // ids.add("44");
        // List<DataObject> dataObjects = collection.fetchData(ids);
        // System.out.println(dataObjects);

        // List<Field> fields = new ArrayList<>();
        // fields.add(new Field().setFieldName("new_field1").setFieldType(FieldType.Int64).setDefaultVal(10).build());
        // fields.add(new Field().setFieldName("new_field2").setFieldType(FieldType.String).setDefaultVal("test").build());
        // UpdateCollectionParam updateCollectionParam = new UpdateCollectionParam().setCollectionName("javaSDKTest1")
        //                                                                         .setFields(fields)
        //                                                                         .setDescription("modify")
        //                                                                         .build();
        // vikingDBService.updateCollection(updateCollectionParam);

        // Collection collection = vikingDBService.getCollection("javaSDKTest1");
        // System.out.println(collection);

        // Index index = vikingDBService.getIndex("example", "goIndex");
        // System.out.println(index.getShardCount());
        // List<String> scalar_index = new ArrayList<>();
        // scalar_index.add("like");
        // UpdateIndexParam parmas = new UpdateIndexParam().setCollectionName("example")
        //                                 .setIndexName("goIndex")
        //                                 .setCpuQuoat(3)
        //                                 .setDescription("java test")
        //                                 .setScalarIndex(scalar_index)
        //                                 .setShardCount(7)
        //                                 .build();
        // vikingDBService.updateIndex(parmas);
        // Index index1 = vikingDBService.getIndex("example", "goIndex");
        // System.out.println(index1);



    }
    public static List<Double> genRandomVector(int dim){
        List<Double> res = new ArrayList<>();
        for(int i=0;i<dim;i++){
            res.add(new Random().nextDouble());
        }
        return res;
    }
    
}