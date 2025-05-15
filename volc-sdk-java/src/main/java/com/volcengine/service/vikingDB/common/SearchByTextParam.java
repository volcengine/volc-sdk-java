package com.volcengine.service.vikingDB.common;

import com.volcengine.service.vikingDB.VikingDBException;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class SearchByTextParam {
    private Text text = null;
    private Map<String, Object> filter = null;
    private Integer limit = 10;
    private List<String> outputFields = null;
    private Object partition = "default";
    private Double denseWeight = null;
    private Boolean needInstruction = null;
    private List<Object> primaryKeyIn = null;
    private List<Object> primaryKeyNotIn = null;
    private Integer postProcessInputLimit = null;
    private List<Map<String, Object>> postProcessOps = null;
    private Integer isBuild = 0;
    private Boolean retry = false;

    public SearchByTextParam setText(Text text) {
        this.text = text;
        return this;
    }

    public SearchByTextParam setFilter(Map<String, Object> filter) {
        this.filter = filter;
        return this;
    }

    public SearchByTextParam setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public SearchByTextParam setOutputFields(List<String> outputFields) {
        this.outputFields = outputFields;
        return this;
    }

    public SearchByTextParam setPartition(Object partition) {
        this.partition = partition;
        return this;
    }

    public SearchByTextParam setDenseWeight(Double denseWeight) {
        this.denseWeight = denseWeight;
        return this;
    }

    public SearchByTextParam setNeedInstruction(Boolean needInstruction) {
        this.needInstruction = needInstruction;
        return this;
    }

    public SearchByTextParam setPrimaryKeyIn(List<Object> primaryKeyIn) {
        this.primaryKeyIn = primaryKeyIn;
        return this;
    }

    public SearchByTextParam setPrimaryKeyNotIn(List<Object> primaryKeyNotIn) {
        this.primaryKeyNotIn = primaryKeyNotIn;
        return this;
    }

    public SearchByTextParam setPostProcessInputLimit(Integer postProcessInputLimit) {
        this.postProcessInputLimit = postProcessInputLimit;
        return this;
    }

    public SearchByTextParam setPostProcessOps(List<Map<String, Object>> postProcessOps) {
        this.postProcessOps = postProcessOps;
        return this;
    }

    public SearchByTextParam setRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }

    public SearchByTextParam build() throws Exception {
        VikingDBException vikingDBException = new VikingDBException(1000030, null, "Params does not exist");
        if (this.text == null) {
            throw vikingDBException.getErrorCodeException(1000030, null, "Text does not exist");
        } else {
            this.isBuild = 1;
            return this;
        }
    }

    public HashMap<String, Object> toMap() {
        HashMap<String, Object> search = new HashMap<>();
        HashMap<String, Object> orderByRaw = new HashMap<>();

        // 假设 getText() 返回一个包含文本的对象，而实际文本通过该对象的某个方法获取
        // 如果 getText() 直接返回 String，则直接使用 this.getText()
        orderByRaw.put("text", this.getText().getText());
        // 如果 SearchByTextParam 直接持有图片信息，也应在此处添加
        // 例如: if (this.getImage() != null) { orderByRaw.put("image", this.getImage()); }
        // 目前的 searchByTextParam 似乎只处理文本，与 searchWithMultiModalParam 不同

        search.put("order_by_raw", orderByRaw);
        search.put("limit", this.getLimit());
        search.put("partition", this.getPartition());

        if (this.getOutputFields() != null) {
            search.put("output_fields", this.getOutputFields());
        }
        if (this.getFilter() != null) {
            search.put("filter", this.getFilter());
        }
        if (this.getDenseWeight() != null) {
            search.put("dense_weight", this.getDenseWeight());
        }
        if (this.getNeedInstruction() != null) {
            search.put("need_instruction", this.getNeedInstruction());
        }
        if (this.getPrimaryKeyIn() != null) {
            search.put("primary_key_in", this.getPrimaryKeyIn());
        }
        if (this.getPrimaryKeyNotIn() != null) {
            search.put("primary_key_not_in", this.getPrimaryKeyNotIn());
        }
        if (this.getPostProcessInputLimit() != null) {
            search.put("post_process_input_limit", this.getPostProcessInputLimit());
        }
        if (this.getPostProcessOps() != null) {
            search.put("post_process_ops", this.getPostProcessOps());
        }
        return search;
    }
}
