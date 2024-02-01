
package com.volcengine.model.maas.api.v2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * MaasChatMessage
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "role",
    "content",
    "name",
    "references",
    "tool_calls",
    "tool_call_id"
})
@Generated("jsonschema2pojo")
public class Message {

    /**
     * ChatRole
     * <p>
     * An enumeration.
     * 
     */
    @JsonProperty("role")
    @JsonPropertyDescription("An enumeration.")
    private Message.ChatRole role;
    /**
     * Content
     * <p>
     * 
     * 
     */
    @JsonProperty("content")
    private Object content;
    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * References
     * <p>
     * 
     * 
     */
    @JsonProperty("references")
    private List<Reference> references = new ArrayList<Reference>();
    /**
     * Tool Calls
     * <p>
     * 
     * 
     */
    @JsonProperty("tool_calls")
    private List<ToolCall> toolCalls = new ArrayList<ToolCall>();
    /**
     * Tool Call Id
     * <p>
     * 
     * 
     */
    @JsonProperty("tool_call_id")
    private String toolCallId;

    /**
     * ChatRole
     * <p>
     * An enumeration.
     * 
     */
    @JsonProperty("role")
    public Message.ChatRole getRole() {
        return role;
    }

    /**
     * ChatRole
     * <p>
     * An enumeration.
     * 
     */
    @JsonProperty("role")
    public void setRole(Message.ChatRole role) {
        this.role = role;
    }

    public Message withRole(Message.ChatRole role) {
        this.role = role;
        return this;
    }

    /**
     * Content
     * <p>
     * 
     * 
     */
    @JsonProperty("content")
    public Object getContent() {
        return content;
    }

    /**
     * Content
     * <p>
     * 
     * 
     */
    @JsonProperty("content")
    public void setContent(Object content) {
        this.content = content;
    }

    public Message withContent(Object content) {
        this.content = content;
        return this;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Message withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * References
     * <p>
     * 
     * 
     */
    @JsonProperty("references")
    public List<Reference> getReferences() {
        return references;
    }

    /**
     * References
     * <p>
     * 
     * 
     */
    @JsonProperty("references")
    public void setReferences(List<Reference> references) {
        this.references = references;
    }

    public Message withReferences(List<Reference> references) {
        this.references = references;
        return this;
    }

    /**
     * Tool Calls
     * <p>
     * 
     * 
     */
    @JsonProperty("tool_calls")
    public List<ToolCall> getToolCalls() {
        return toolCalls;
    }

    /**
     * Tool Calls
     * <p>
     * 
     * 
     */
    @JsonProperty("tool_calls")
    public void setToolCalls(List<ToolCall> toolCalls) {
        this.toolCalls = toolCalls;
    }

    public Message withToolCalls(List<ToolCall> toolCalls) {
        this.toolCalls = toolCalls;
        return this;
    }

    /**
     * Tool Call Id
     * <p>
     * 
     * 
     */
    @JsonProperty("tool_call_id")
    public String getToolCallId() {
        return toolCallId;
    }

    /**
     * Tool Call Id
     * <p>
     * 
     * 
     */
    @JsonProperty("tool_call_id")
    public void setToolCallId(String toolCallId) {
        this.toolCallId = toolCallId;
    }

    public Message withToolCallId(String toolCallId) {
        this.toolCallId = toolCallId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Message.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("role");
        sb.append('=');
        sb.append(((this.role == null)?"<null>":this.role));
        sb.append(',');
        sb.append("content");
        sb.append('=');
        sb.append(((this.content == null)?"<null>":this.content));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("references");
        sb.append('=');
        sb.append(((this.references == null)?"<null>":this.references));
        sb.append(',');
        sb.append("toolCalls");
        sb.append('=');
        sb.append(((this.toolCalls == null)?"<null>":this.toolCalls));
        sb.append(',');
        sb.append("toolCallId");
        sb.append('=');
        sb.append(((this.toolCallId == null)?"<null>":this.toolCallId));
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
        result = ((result* 31)+((this.role == null)? 0 :this.role.hashCode()));
        result = ((result* 31)+((this.references == null)? 0 :this.references.hashCode()));
        result = ((result* 31)+((this.toolCallId == null)? 0 :this.toolCallId.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.toolCalls == null)? 0 :this.toolCalls.hashCode()));
        result = ((result* 31)+((this.content == null)? 0 :this.content.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Message) == false) {
            return false;
        }
        Message rhs = ((Message) other);
        return (((((((this.role == rhs.role)||((this.role!= null)&&this.role.equals(rhs.role)))&&((this.references == rhs.references)||((this.references!= null)&&this.references.equals(rhs.references))))&&((this.toolCallId == rhs.toolCallId)||((this.toolCallId!= null)&&this.toolCallId.equals(rhs.toolCallId))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.toolCalls == rhs.toolCalls)||((this.toolCalls!= null)&&this.toolCalls.equals(rhs.toolCalls))))&&((this.content == rhs.content)||((this.content!= null)&&this.content.equals(rhs.content))));
    }


    /**
     * ChatRole
     * <p>
     * An enumeration.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ChatRole {

        SYSTEM("system"),
        ASSISTANT("assistant"),
        USER("user"),
        FUNCTION("function");
        private final String value;
        private final static Map<String, Message.ChatRole> CONSTANTS = new HashMap<String, Message.ChatRole>();

        static {
            for (Message.ChatRole c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ChatRole(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Message.ChatRole fromValue(String value) {
            Message.ChatRole constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
