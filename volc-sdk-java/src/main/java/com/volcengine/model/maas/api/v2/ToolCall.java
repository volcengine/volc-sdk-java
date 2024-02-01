
package com.volcengine.model.maas.api.v2;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ToolCall
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "type",
    "function"
})
@Generated("jsonschema2pojo")
public class ToolCall {

    /**
     * Id
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * Type
     * <p>
     * 
     * 
     */
    @JsonProperty("type")
    private String type;
    /**
     * FunctionCall
     * <p>
     * 
     * 
     */
    @JsonProperty("function")
    private FunctionCall function;

    /**
     * Id
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Id
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ToolCall withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Type
     * <p>
     * 
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
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public ToolCall withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * FunctionCall
     * <p>
     * 
     * 
     */
    @JsonProperty("function")
    public FunctionCall getFunction() {
        return function;
    }

    /**
     * FunctionCall
     * <p>
     * 
     * 
     */
    @JsonProperty("function")
    public void setFunction(FunctionCall function) {
        this.function = function;
    }

    public ToolCall withFunction(FunctionCall function) {
        this.function = function;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolCall.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("function");
        sb.append('=');
        sb.append(((this.function == null)?"<null>":this.function));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.function == null)? 0 :this.function.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ToolCall) == false) {
            return false;
        }
        ToolCall rhs = ((ToolCall) other);
        return ((((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.function == rhs.function)||((this.function!= null)&&this.function.equals(rhs.function))));
    }

}
