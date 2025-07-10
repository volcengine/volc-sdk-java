package com.volcengine.service.vikingDB;

import com.volcengine.service.vikingDB.common.CreateCollectionParam;
import com.volcengine.service.vikingDB.common.Field;
import com.volcengine.service.vikingDB.common.FieldType;
import com.volcengine.service.vikingDB.common.VectorizeTuple;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {
    @Test
    public void testCollectionCreate() throws Exception {
        VikingDBService vikingDBService = BaseService.getService();
        CreateCollectionParam collectionParam = new CreateCollectionParam()
                .setCollectionName("test_coll_for_java_sdk")
                .setDescription("this is an example for java sdk test")
                .setFields(new ArrayList<Field>(){{
                    add(new Field().setFieldType(FieldType.Int64).setFieldName("f_id").setPrimaryKey(true).build());
                    add(new Field().setFieldType(FieldType.Vector).setFieldName("f_vector").setDim(4).build());
                    add(new Field().setFieldType(FieldType.String).setFieldName("f_string").build());
                    add(new Field().setFieldType(FieldType.Int64).setFieldName("f_int64").build());
                    add(new Field().setFieldType(FieldType.Float32).setFieldName("f_float32").build());
                }})
                .build();
        vikingDBService.createCollection(collectionParam);
    }

    @Test
    public void testCollectionCreateWithVectorize() throws Exception {
        VikingDBService vikingDBService = BaseService.getService();
        CreateCollectionParam collectionParam = new CreateCollectionParam()
                .setCollectionName("test_coll_for_sdk_with_vectorize")
                .setDescription("this is an example for sdk test")
                .setFields(new ArrayList<Field>(){{
                    add(new Field().setFieldType(FieldType.Int64).setFieldName("f_id").setPrimaryKey(true).build());
                    add(new Field().setFieldType(FieldType.String).setFieldName("f_string").build());
                    add(new Field().setFieldType(FieldType.Text).setFieldName("f_text1").build());
                    add(new Field().setFieldType(FieldType.Text).setFieldName("f_text2").build());
                    add(new Field().setFieldType(FieldType.Image).setFieldName("f_image1").build());
                    add(new Field().setFieldType(FieldType.Image).setFieldName("f_image2").build());
                }})
                .setVectorize(new ArrayList<VectorizeTuple>(){{
                    add(new VectorizeTuple()
                            .setDense(new VectorizeTuple.VectorizeModelConf()
                                    .setTextField("f_text1")
                                    .setImageField("f_image1")
                                    .setModelName("doubao-embedding-vision")
                                    .setModelVersion("241215")
                                    .setDim(3072)
                                    .build())
                            .setSparse(new VectorizeTuple.VectorizeModelConf()
                                    .setTextField("f_text2")
                                    .setModelName("bge-m3")
                                    .build())
                            .build()
                    );
                }})
                .build();
        vikingDBService.createCollection(collectionParam);
    }

    @Test
    public void testCollectionCreateWithProject() throws Exception {
        VikingDBService vikingDBService = BaseService.getService();
        CreateCollectionParam collectionParam = new CreateCollectionParam()
                .setCollectionName("test_coll_project_for_java_sdk")
                .setDescription("this is an example for sdk test")
                .SetProject("vikingdb_project_test")
                .setFields(new ArrayList<Field>(){{
                    add(new Field().setFieldType(FieldType.Int64).setFieldName("f_id").setPrimaryKey(true).build());
                    add(new Field().setFieldType(FieldType.String).setFieldName("f_string").build());
                    add(new Field().setFieldType(FieldType.Text).setFieldName("f_text1").build());
                    add(new Field().setFieldType(FieldType.Text).setFieldName("f_text2").build());
                    add(new Field().setFieldType(FieldType.Image).setFieldName("f_image1").build());
                    add(new Field().setFieldType(FieldType.Image).setFieldName("f_image2").build());
                }})
                .setVectorize(new ArrayList<VectorizeTuple>(){{
                    add(new VectorizeTuple()
                            .setDense(new VectorizeTuple.VectorizeModelConf()
                                    .setTextField("f_text1")
                                    .setImageField("f_image1")
                                    .setModelName("doubao-embedding-vision")
                                    .setModelVersion("241215")
                                    .setDim(3072)
                                    .build())
                            .setSparse(new VectorizeTuple.VectorizeModelConf()
                                    .setTextField("f_text2")
                                    .setModelName("bge-m3")
                                    .build())
                            .build()
                    );
                }})
                .build();
        vikingDBService.createCollection(collectionParam);
    }

    @Test
    public void testCollectionGet() throws Exception {
        VikingDBService vikingDBService = BaseService.getService();
        Collection collecttion = vikingDBService.getCollection("test_coll_for_sdk_with_vectorize");
        System.out.println(collecttion);
    }

    @Test
    public void testCollectionList() throws Exception {
        VikingDBService vikingDBService = BaseService.getService();
        List<Collection> collections = vikingDBService.listCollections();
        for (Collection collection : collections) {
            System.out.println(collection.getCollectionName());
        }
    }

    @Test
    public void testCollectionListWithProject() throws Exception {
        VikingDBService vikingDBService = BaseService.getService();
        String project = "default";
        List<Collection> collections = vikingDBService.listCollections(project);
        for (Collection collection : collections) {
            System.out.println(collection.getCollectionName());
        }
    }

    @Test
    public void testCollectionDrop() throws Exception {
        VikingDBService vikingDBService = BaseService.getService();
        vikingDBService.dropCollection("test_coll_for_java_sdk");
    }
}
