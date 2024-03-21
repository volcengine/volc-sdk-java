package org.example;

import org.example.avro.Field;
import org.example.avro.Record;

import java.util.List;

public class AvroRecordPrinter {
    public static final int MYSQL_TYPE_DECIMAL = 0;
    public static final int MYSQL_TYPE_INT8 = 1;
    public static final int MYSQL_TYPE_INT16 = 2;
    public static final int MYSQL_TYPE_INT32 = 3;
    public static final int MYSQL_TYPE_FLOAT = 4;
    public static final int MYSQL_TYPE_DOUBLE = 5;
    public static final int MYSQL_TYPE_TIMESTAMP = 7;
    public static final int MYSQL_TYPE_INT64 = 8;
    public static final int MYSQL_TYPE_INT24 = 9;
    public static final int MYSQL_TYPE_DATE = 10;
    public static final int MYSQL_TYPE_TIME = 11;
    public static final int MYSQL_TYPE_DATETIME = 12;
    public static final int MYSQL_TYPE_YEAR = 13;
    public static final int MYSQL_TYPE_VARCHAR = 15;
    public static final int MYSQL_TYPE_DECIMAL_NEW = 246;
    public static final int MYSQL_TYPE_VAR_STRING = 253;
    public static final int MYSQL_TYPE_STRING = 254;

    public static void printRecord(Record record){
        System.out.printf("Operation[%s] ObjectName[%s] SourceTimestamp[%d] Id[%d]\n", record.getOperation(),
                record.getObjectName(), record.getSourceTimestamp(), record.getId());
        List<Object> before;
        List<Object> after;
        List<Field> fields = (List<Field>) record.getFields();
        switch (record.getOperation()){
            case DDL:
                System.out.printf("DDL[%s]\n", record.getAfterImages());
                break;
            case INSERT:
                after = (List<Object>) record.getAfterImages();
                for (int i=0;i<after.size();i++) {
                    System.out.printf("Field[%s] After[%s]\n", fields.get(i).getName(),
                            parseData(fields.get(i), after.get(i)));
                }
                break;
            case UPDATE:
                before = (List<Object>) record.getBeforeImages();
                after = (List<Object>) record.getAfterImages();
                for (int i=0;i<after.size();i++) {
                    System.out.printf("Field[%s] Before[%s] After[%s]\n", fields.get(i).getName(),
                            parseData(fields.get(i), before.get(i)),
                            parseData(fields.get(i), after.get(i)));
                }
                break;
            case DELETE:
                before = (List<Object>) record.getBeforeImages();
                for (int i=0;i<before.size();i++) {
                    System.out.printf("Field[%s] Before[%s]\n", fields.get(i).toString(),
                            parseData(fields.get(i), before.get(i)));
                }
                break;
        }
    }


    public static String parseData(Field field, Object data) {
        if (null == data){
            return "";
        }

        switch (field.getDataTypeNumber()){
            case MYSQL_TYPE_INT8:
            case MYSQL_TYPE_INT16:
            case MYSQL_TYPE_INT32:
            case MYSQL_TYPE_INT64:
            case MYSQL_TYPE_INT24:
                return ((org.example.avro.Integer) data).getValue().toString();
            case MYSQL_TYPE_DECIMAL:
            case MYSQL_TYPE_DECIMAL_NEW:
                return ((org.example.avro.Decimal) data).getValue().toString();
            case MYSQL_TYPE_FLOAT:
            case MYSQL_TYPE_DOUBLE:
                return ((org.example.avro.Float) data).getValue().toString();
            case MYSQL_TYPE_TIMESTAMP:
                org.example.avro.Timestamp ts = (org.example.avro.Timestamp) data;
                return String.format("%d.%d", ts.getTimestamp(),ts.getMillis());
            case MYSQL_TYPE_VARCHAR:
            case MYSQL_TYPE_VAR_STRING:
            case MYSQL_TYPE_STRING:
                return new String(((org.example.avro.Character) data).getValue().array());
            case MYSQL_TYPE_DATETIME:
                org.example.avro.DateTime dt = (org.example.avro.DateTime) data;
                return String.format("%04d-%02d-%02d %02d:%02d:%02d", dt.getYear(),dt.getMonth(),dt.getDay(),
                        dt.getHour(),dt.getMinute(),dt.getSecond());
            case MYSQL_TYPE_DATE:
                dt = (org.example.avro.DateTime) data;
                return String.format("%04d-%02d-%02d", dt.getYear(),dt.getMonth(),dt.getDay());
            case MYSQL_TYPE_TIME:
                dt = (org.example.avro.DateTime) data;
                return String.format("%02d:%02d:%02d", dt.getHour(),dt.getMinute(),dt.getSecond());
            case MYSQL_TYPE_YEAR:
                return ((org.example.avro.DateTime) data).getYear().toString();
            default:
                return data.toString();
        }
    }
}
