
package com.volcengine.model.maas.api.v2;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Map;


/**
 * Tool
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "function",
    "options"
})
@Generated("jsonschema2pojo")
public class Tool {

    /**
     * Type
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    private String type;
    /**
     * Function
     * <p>
     * 
     * 
     */
    @JsonProperty("function")
    private Function function;
    /**
     * Options
     * <p>
     * 
     * 
     */
    @JsonProperty("options")
    private Map<String, Object> options;

    /**
     * Type
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Tool withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Function
     * <p>
     * 
     * 
     */
    @JsonProperty("function")
    public Function getFunction() {
        return function;
    }

    /**
     * Function
     * <p>
     * 
     * 
     */
    @JsonProperty("function")
    public void setFunction(Function function) {
        this.function = function;
    }

    public Tool withFunction(Function function) {
        this.function = function;
        return this;
    }

    /**
     * Options
     * <p>
     * 
     * 
     */
    @JsonProperty("options")
    public Map<String, Object> getOptions() {
        return options;
    }

    /**
     * Options
     * <p>
     * 
     * 
     */
    @JsonProperty("options")
    public void setOptions(Map<String, Object> options) {
        this.options = options;
    }

    public Tool withOptions(Map<String, Object> options) {
        this.options = options;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tool.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("function");
        sb.append('=');
        sb.append(((this.function == null)?"<null>":this.function));
        sb.append(',');
        sb.append("options");
        sb.append('=');
        sb.append(((this.options == null)?"<null>":this.options));
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
        result = ((result* 31)+((this.options == null)? 0 :this.options.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.function == null)? 0 :this.function.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tool) == false) {
            return false;
        }
        Tool rhs = ((Tool) other);
        return ((((this.options == rhs.options)||((this.options!= null)&&this.options.equals(rhs.options)))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.function == rhs.function)||((this.function!= null)&&this.function.equals(rhs.function))));
    }

}
