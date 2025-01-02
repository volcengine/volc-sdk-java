package com.volcengine.service.vikingDB;

import com.volcengine.service.vikingDB.common.CreateCollectionParam;
import com.volcengine.service.vikingDB.common.Field;
import com.volcengine.service.vikingDB.common.FieldType;
import org.junit.Test;

import java.util.ArrayList;

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
    public void testCollectionDrop() throws Exception {
        VikingDBService vikingDBService = BaseService.getService();
        vikingDBService.dropCollection("test_coll_for_java_sdk");
    }
}
