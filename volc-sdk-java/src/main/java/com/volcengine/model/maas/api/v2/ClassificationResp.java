
package com.volcengine.model.maas.api.v2;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Map;


/**
 * MaasClassificationResponse
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "label",
    "label_logprobos",
    "usage",
    "error"
})
@Generated("jsonschema2pojo")
public class ClassificationResp extends BaseResponse {

    /**
     * Label
     * <p>
     * 
     * 
     */
    @JsonProperty("label")
    private String label;
    /**
     * Label Logprobos
     * <p>
     * 
     * 
     */
    @JsonProperty("label_logprobos")
    private Map<String, LabelLogprobosValue> labelLogprobos;
    /**
     * Usage
     * <p>
     * 
     * 
     */
    @JsonProperty("usage")
    private Usage usage;
    /**
     * Error
     * <p>
     * 
     * 
     */
    @JsonProperty("error")
    private Error error;

    /**
     * Label
     * <p>
     * 
     * 
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * Label
     * <p>
     * 
     * 
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    public ClassificationResp withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Label Logprobos
     * <p>
     * 
     * 
     */
    @JsonProperty("label_logprobos")
    public Map<String, LabelLogprobosValue> getLabelLogprobos() {
        return labelLogprobos;
    }

    /**
     * Label Logprobos
     * <p>
     * 
     * 
     */
    @JsonProperty("label_logprobos")
    public void setLabelLogprobos(Map<String, LabelLogprobosValue> labelLogprobos) {
        this.labelLogprobos = labelLogprobos;
    }

    public ClassificationResp withLabelLogprobos(Map<String, LabelLogprobosValue> labelLogprobos) {
        this.labelLogprobos = labelLogprobos;
        return this;
    }

    /**
     * Usage
     * <p>
     * 
     * 
     */
    @JsonProperty("usage")
    public Usage getUsage() {
        return usage;
    }

    /**
     * Usage
     * <p>
     * 
     * 
     */
    @JsonProperty("usage")
    public void setUsage(Usage usage) {
        this.usage = usage;
    }

    public ClassificationResp withUsage(Usage usage) {
        this.usage = usage;
        return this;
    }

    /**
     * Error
     * <p>
     * 
     * 
     */
    @JsonProperty("error")
    public Error getError() {
        return error;
    }

    /**
     * Error
     * <p>
     * 
     * 
     */
    @JsonProperty("error")
    public void setError(Error error) {
        this.error = error;
    }

    public ClassificationResp withError(Error error) {
        this.error = error;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ClassificationResp.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("labelLogprobos");
        sb.append('=');
        sb.append(((this.labelLogprobos == null)?"<null>":this.labelLogprobos));
        sb.append(',');
        sb.append("usage");
        sb.append('=');
        sb.append(((this.usage == null)?"<null>":this.usage));
        sb.append(',');
        sb.append("error");
        sb.append('=');
        sb.append(((this.error == null)?"<null>":this.error));
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
        result = ((result* 31)+((this.label == null)? 0 :this.label.hashCode()));
        result = ((result* 31)+((this.error == null)? 0 :this.error.hashCode()));
        result = ((result* 31)+((this.labelLogprobos == null)? 0 :this.labelLogprobos.hashCode()));
        result = ((result* 31)+((this.usage == null)? 0 :this.usage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClassificationResp) == false) {
            return false;
        }
        ClassificationResp rhs = ((ClassificationResp) other);
        return (((((this.label == rhs.label)||((this.label!= null)&&this.label.equals(rhs.label)))&&((this.error == rhs.error)||((this.error!= null)&&this.error.equals(rhs.error))))&&((this.labelLogprobos == rhs.labelLogprobos)||((this.labelLogprobos!= null)&&this.labelLogprobos.equals(rhs.labelLogprobos))))&&((this.usage == rhs.usage)||((this.usage!= null)&&this.usage.equals(rhs.usage))));
    }

}
