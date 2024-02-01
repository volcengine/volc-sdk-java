
package com.volcengine.model.maas.api.v2;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Embedding
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "index",
    "embedding",
    "object"
})
@Generated("jsonschema2pojo")
public class Embedding {

    /**
     * Index
     * <p>
     * 
     * 
     */
    @JsonProperty("index")
    private Integer index;
    /**
     * Embedding
     * <p>
     * 
     * 
     */
    @JsonProperty("embedding")
    private List<Double> embedding = new ArrayList<Double>();
    /**
     * Object
     * <p>
     * 
     * 
     */
    @JsonProperty("object")
    private String object;

    /**
     * Index
     * <p>
     * 
     * 
     */
    @JsonProperty("index")
    public Integer getIndex() {
        return index;
    }

    /**
     * Index
     * <p>
     * 
     * 
     */
    @JsonProperty("index")
    public void setIndex(Integer index) {
        this.index = index;
    }

    public Embedding withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * Embedding
     * <p>
     * 
     * 
     */
    @JsonProperty("embedding")
    public List<Double> getEmbedding() {
        return embedding;
    }

    /**
     * Embedding
     * <p>
     * 
     * 
     */
    @JsonProperty("embedding")
    public void setEmbedding(List<Double> embedding) {
        this.embedding = embedding;
    }

    public Embedding withEmbedding(List<Double> embedding) {
        this.embedding = embedding;
        return this;
    }

    /**
     * Object
     * <p>
     * 
     * 
     */
    @JsonProperty("object")
    public String getObject() {
        return object;
    }

    /**
     * Object
     * <p>
     * 
     * 
     */
    @JsonProperty("object")
    public void setObject(String object) {
        this.object = object;
    }

    public Embedding withObject(String object) {
        this.object = object;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Embedding.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("index");
        sb.append('=');
        sb.append(((this.index == null)?"<null>":this.index));
        sb.append(',');
        sb.append("embedding");
        sb.append('=');
        sb.append(((this.embedding == null)?"<null>":this.embedding));
        sb.append(',');
        sb.append("object");
        sb.append('=');
        sb.append(((this.object == null)?"<null>":this.object));
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
        result = ((result* 31)+((this.index == null)? 0 :this.index.hashCode()));
        result = ((result* 31)+((this.embedding == null)? 0 :this.embedding.hashCode()));
        result = ((result* 31)+((this.object == null)? 0 :this.object.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Embedding) == false) {
            return false;
        }
        Embedding rhs = ((Embedding) other);
        return ((((this.index == rhs.index)||((this.index!= null)&&this.index.equals(rhs.index)))&&((this.embedding == rhs.embedding)||((this.embedding!= null)&&this.embedding.equals(rhs.embedding))))&&((this.object == rhs.object)||((this.object!= null)&&this.object.equals(rhs.object))));
    }

}
