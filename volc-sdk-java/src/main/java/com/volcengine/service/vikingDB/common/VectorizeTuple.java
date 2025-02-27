package com.volcengine.service.vikingDB.common;

import com.google.gson.internal.LinkedTreeMap;
import com.volcengine.service.vikingDB.VikingDBException;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Data
public class VectorizeTuple {
    private static final String PARAM_DENSE = "dense";
    private static final String PARAM_SPARSE = "sparse";
    private static final String PARAM_TEXT_FIELD = "text_field";
    private static final String PARAM_IMAGE_FIELD = "image_field";
    private static final String PARAM_MODEL_NAME = "model_name";
    private static final String PARAM_MODEL_VERSION = "model_version";
    private static final String PARAM_DIM = "dim";

    private VectorizeModelConf dense = null;
    private VectorizeModelConf sparse = null;
    private Integer isBuild = 0;

    public VectorizeTuple setDense(VectorizeModelConf dense) {
        this.dense = dense;
        return this;
    }

    public VectorizeTuple setSparse(VectorizeModelConf sparse) {
        this.sparse = sparse;
        return this;
    }

    public VectorizeTuple build() throws Exception {
        VikingDBException vikingDBException = new VikingDBException(1000030, null, "Params does not exist");
        if (dense == null) {
            throw vikingDBException.getErrorCodeException(1000030, null, "Dense model vectorize conf does not exist");
        } else if (dense.getIsBuild() == 0) {
            throw vikingDBException.getErrorCodeException(1000030, null, "Dense model vectorize conf does not build");
        } else if (sparse != null && sparse.getIsBuild() == 0) {
            throw vikingDBException.getErrorCodeException(1000030, null, "Sparse model vectorize conf does not build");
        }
        isBuild = 1;
        return this;
    }

    @Data
    public static class VectorizeModelConf {
        private String textField = null;
        private String imageField = null;
        private String modelName = null;
        private String modelVersion = null;
        private Integer dim = null;
        private Integer isBuild = 0;

        public VectorizeModelConf setTextField(String textField) {
            this.textField = textField;
            return this;
        }

        public VectorizeModelConf setImageField(String imageField) {
            this.imageField = imageField;
            return this;
        }

        public VectorizeModelConf setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        public VectorizeModelConf setModelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            return this;
        }

        public VectorizeModelConf setDim(Integer dim) {
            this.dim = dim;
            return this;
        }

        public VectorizeModelConf build() throws Exception {
            isBuild = 1;
            return this;
        }
    }

    public static List<VectorizeTuple> getVectorizeFromList(List<LinkedTreeMap<String, Object>> vectorizeList) {
        List<VectorizeTuple> result = vectorizeList.stream()
                .map(VectorizeTuple::getVectorizeTupleFromMap)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        return result.isEmpty() ? null : result;
    }

    public static VectorizeTuple getVectorizeTupleFromMap(LinkedTreeMap<String, Object> vectorizeTupleMap) {
        try {
            VectorizeTuple vectorizeTuple = new VectorizeTuple();
            if (vectorizeTupleMap.containsKey(PARAM_DENSE)) {
                @SuppressWarnings("unchecked")
                LinkedTreeMap<String, Object> denseObj = (LinkedTreeMap<String, Object>) vectorizeTupleMap.get(PARAM_DENSE);
                VectorizeModelConf denseConf = getVectorizeModelConfFromMap(denseObj);
                vectorizeTuple.setDense(denseConf);
            }
            if (vectorizeTupleMap.containsKey(PARAM_SPARSE)) {
                @SuppressWarnings("unchecked")
                LinkedTreeMap<String, Object> sparseObj = (LinkedTreeMap<String, Object>) vectorizeTupleMap.get(PARAM_SPARSE);
                VectorizeModelConf sparseConf = getVectorizeModelConfFromMap(sparseObj);
                vectorizeTuple.setSparse(sparseConf);
            }
            return vectorizeTuple.build();
        } catch (Exception e) {
            return null;
        }
    }

    public static VectorizeModelConf getVectorizeModelConfFromMap(LinkedTreeMap<String, Object> vectorizeConfMap) {
        try {
            VectorizeModelConf vectorizeModelConf = new VectorizeModelConf();
            if (vectorizeConfMap.containsKey(PARAM_TEXT_FIELD)) {
                @SuppressWarnings("unchecked")
                String textField = (String) vectorizeConfMap.get(PARAM_TEXT_FIELD);
                vectorizeModelConf.setTextField(textField);
            }
            if (vectorizeConfMap.containsKey(PARAM_IMAGE_FIELD)) {
                @SuppressWarnings("unchecked")
                String imageField = (String) vectorizeConfMap.get(PARAM_IMAGE_FIELD);
                vectorizeModelConf.setImageField(imageField);
            }
            if (vectorizeConfMap.containsKey(PARAM_MODEL_NAME)) {
                @SuppressWarnings("unchecked")
                String modelName = (String) vectorizeConfMap.get(PARAM_MODEL_NAME);
                vectorizeModelConf.setModelName(modelName);
            }
            if (vectorizeConfMap.containsKey(PARAM_MODEL_VERSION)) {
                @SuppressWarnings("unchecked")
                String modelVersion = (String) vectorizeConfMap.get(PARAM_MODEL_VERSION);
                vectorizeModelConf.setModelVersion(modelVersion);
            }
            if (vectorizeConfMap.containsKey(PARAM_DIM)) {
                @SuppressWarnings("unchecked")
                Long dim = (Long) vectorizeConfMap.get(PARAM_DIM);
                vectorizeModelConf.setDim(dim.intValue());
            }
            return vectorizeModelConf.build();
        } catch (Exception e) {
            return null;
        }
    }

    public static List<Map<String, Object>> getVectorizeToMapList(List<VectorizeTuple> vectorize) throws Exception {
        if (vectorize == null) {
            return null;
        }
        List<Map<String, Object>> result = new ArrayList<>(vectorize.size());
        for (VectorizeTuple v : vectorize) {
            VikingDBException vikingDBException = new VikingDBException(1000030, null, "Params does not exist");
            if (v == null || v.getIsBuild() == 0) {
                throw vikingDBException.getErrorCodeException(1000030, null, "Vectorize item does not build");
            }
            result.add(VectorizeTuple.getVectorizeTupleToMap(v));
        }
        return result;
    }

    public static Map<String, Object> getVectorizeTupleToMap(VectorizeTuple vectorizeTuple) {
        Map<String, Object> result = new HashMap<>();
        result.put(PARAM_DENSE, getVectorizeModelConfToMap(vectorizeTuple.dense));
        if (vectorizeTuple.sparse != null) {
            result.put(PARAM_SPARSE, getVectorizeModelConfToMap(vectorizeTuple.sparse));
        }
        return result;
    }

    public static Map<String, Object> getVectorizeModelConfToMap(VectorizeModelConf vectorizeConf) {
        Map<String, Object> result = new HashMap<>();
        if (vectorizeConf.getTextField() != null) {
            result.put(PARAM_TEXT_FIELD, vectorizeConf.getTextField());
        }
        if (vectorizeConf.getImageField() != null) {
            result.put(PARAM_IMAGE_FIELD, vectorizeConf.getImageField());
        }
        if (vectorizeConf.getModelName() != null) {
            result.put(PARAM_MODEL_NAME, vectorizeConf.getModelName());
        }
        if (vectorizeConf.getModelVersion() != null) {
            result.put(PARAM_MODEL_VERSION, vectorizeConf.getModelVersion());
        }
        if (vectorizeConf.getDim() != null) {
            result.put(PARAM_DIM, vectorizeConf.getDim());
        }
        return result;
    }
}
