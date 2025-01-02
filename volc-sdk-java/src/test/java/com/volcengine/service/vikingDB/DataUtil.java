package com.volcengine.service.vikingDB;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataUtil {
    private static final Random rand = new Random();

    public static List<Double> genRandomVector(int dim) {
        List<Double> res = new ArrayList<>();
        for (int i = 0; i < dim; i++) {
            res.add(genRandomDouble());
        }
        return res;
    }

    public static Long genRandomInt64() {
        return rand.nextLong();
    }

    public static Double genRandomDouble() {
        return rand.nextDouble() * 2 - 1;
    }
}
