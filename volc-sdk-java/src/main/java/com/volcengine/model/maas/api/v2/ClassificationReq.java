
package com.volcengine.model.maas.api.v2;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * MaasClassificationRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "query",
    "labels"
})
@Generated("jsonschema2pojo")
public class ClassificationReq {

    /**
     * Query
     * <p>
     * 
     * 
     */
    @JsonProperty("query")
    private String query;
    /**
     * Labels
     * <p>
     * 
     * 
     */
    @JsonProperty("labels")
    private List<String> labels = new ArrayList<String>();

    /**
     * Query
     * <p>
     * 
     * 
     */
    @JsonProperty("query")
    public String getQuery() {
        return query;
    }

    /**
     * Query
     * <p>
     * 
     * 
     */
    @JsonProperty("query")
    public void setQuery(String query) {
        this.query = query;
    }

    public ClassificationReq withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Labels
     * <p>
     * 
     * 
     */
    @JsonProperty("labels")
    public List<String> getLabels() {
        return labels;
    }

    /**
     * Labels
     * <p>
     * 
     * 
     */
    @JsonProperty("labels")
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public ClassificationReq withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ClassificationReq.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("query");
        sb.append('=');
        sb.append(((this.query == null)?"<null>":this.query));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null)?"<null>":this.labels));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.query == null)? 0 :this.query.hashCode()));
        result = ((result* 31)+((this.labels == null)? 0 :this.labels.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClassificationReq) == false) {
            return false;
        }
        ClassificationReq rhs = ((ClassificationReq) other);
        return (((this.query == rhs.query)||((this.query!= null)&&this.query.equals(rhs.query)))&&((this.labels == rhs.labels)||((this.labels!= null)&&this.labels.equals(rhs.labels))));
    }

}
