
package com.volcengine.model.maas.api.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * MaasChatRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "messages",
    "stream",
    "crypto_token",
    "tools",
    "parameters",
    "user",
    "extra"
})
@Generated("jsonschema2pojo")
public class ChatReq {

    /**
     * Messages
     * <p>
     * 
     * 
     */
    @JsonProperty("messages")
    private List<Message> messages = new ArrayList<Message>();
    /**
     * Stream
     * <p>
     * 
     * 
     */
    @JsonProperty("stream")
    private Boolean stream = false;
    /**
     * Crypto Token
     * <p>
     * 
     * 
     */
    @JsonProperty("crypto_token")
    private String cryptoToken;
    /**
     * Tools
     * <p>
     * 
     * 
     */
    @JsonProperty("tools")
    private List<Tool> tools = new ArrayList<Tool>();
    /**
     * Parameters
     * <p>
     * 
     * 
     */
    @JsonProperty("parameters")
    private Parameters parameters;
    /**
     * User
     * <p>
     * 
     * 
     */
    @JsonProperty("user")
    private String user;
    /**
     * Extra
     * <p>
     * 
     * 
     */
    @JsonProperty("extra")
    private Map<String, String> extra;

    /**
     * Messages
     * <p>
     * 
     * 
     */
    @JsonProperty("messages")
    public List<Message> getMessages() {
        return messages;
    }

    /**
     * Messages
     * <p>
     * 
     * 
     */
    @JsonProperty("messages")
    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public ChatReq withMessages(List<Message> messages) {
        this.messages = messages;
        return this;
    }

    /**
     * Stream
     * <p>
     * 
     * 
     */
    @JsonProperty("stream")
    public Boolean getStream() {
        return stream;
    }

    /**
     * Stream
     * <p>
     * 
     * 
     */
    @JsonProperty("stream")
    public void setStream(Boolean stream) {
        this.stream = stream;
    }

    public ChatReq withStream(Boolean stream) {
        this.stream = stream;
        return this;
    }

    /**
     * Crypto Token
     * <p>
     * 
     * 
     */
    @JsonProperty("crypto_token")
    public String getCryptoToken() {
        return cryptoToken;
    }

    /**
     * Crypto Token
     * <p>
     * 
     * 
     */
    @JsonProperty("crypto_token")
    public void setCryptoToken(String cryptoToken) {
        this.cryptoToken = cryptoToken;
    }

    public ChatReq withCryptoToken(String cryptoToken) {
        this.cryptoToken = cryptoToken;
        return this;
    }

    /**
     * Tools
     * <p>
     * 
     * 
     */
    @JsonProperty("tools")
    public List<Tool> getTools() {
        return tools;
    }

    /**
     * Tools
     * <p>
     * 
     * 
     */
    @JsonProperty("tools")
    public void setTools(List<Tool> tools) {
        this.tools = tools;
    }

    public ChatReq withTools(List<Tool> tools) {
        this.tools = tools;
        return this;
    }

    /**
     * Parameters
     * <p>
     * 
     * 
     */
    @JsonProperty("parameters")
    public Parameters getParameters() {
        return parameters;
    }

    /**
     * Parameters
     * <p>
     * 
     * 
     */
    @JsonProperty("parameters")
    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public ChatReq withParameters(Parameters parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * User
     * <p>
     * 
     * 
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * User
     * <p>
     * 
     * 
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public ChatReq withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * Extra
     * <p>
     * 
     * 
     */
    @JsonProperty("extra")
    public Map<String, String> getExtra() {
        return extra;
    }

    /**
     * Extra
     * <p>
     * 
     * 
     */
    @JsonProperty("extra")
    public void setExtra(Map<String, String> extra) {
        this.extra = extra;
    }

    public ChatReq withExtra(Map<String, String> extra) {
        this.extra = extra;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChatReq.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("messages");
        sb.append('=');
        sb.append(((this.messages == null)?"<null>":this.messages));
        sb.append(',');
        sb.append("stream");
        sb.append('=');
        sb.append(((this.stream == null)?"<null>":this.stream));
        sb.append(',');
        sb.append("cryptoToken");
        sb.append('=');
        sb.append(((this.cryptoToken == null)?"<null>":this.cryptoToken));
        sb.append(',');
        sb.append("tools");
        sb.append('=');
        sb.append(((this.tools == null)?"<null>":this.tools));
        sb.append(',');
        sb.append("parameters");
        sb.append('=');
        sb.append(((this.parameters == null)?"<null>":this.parameters));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("extra");
        sb.append('=');
        sb.append(((this.extra == null)?"<null>":this.extra));
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
        result = ((result* 31)+((this.stream == null)? 0 :this.stream.hashCode()));
        result = ((result* 31)+((this.extra == null)? 0 :this.extra.hashCode()));
        result = ((result* 31)+((this.messages == null)? 0 :this.messages.hashCode()));
        result = ((result* 31)+((this.cryptoToken == null)? 0 :this.cryptoToken.hashCode()));
        result = ((result* 31)+((this.tools == null)? 0 :this.tools.hashCode()));
        result = ((result* 31)+((this.parameters == null)? 0 :this.parameters.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChatReq) == false) {
            return false;
        }
        ChatReq rhs = ((ChatReq) other);
        return ((((((((this.stream == rhs.stream)||((this.stream!= null)&&this.stream.equals(rhs.stream)))&&((this.extra == rhs.extra)||((this.extra!= null)&&this.extra.equals(rhs.extra))))&&((this.messages == rhs.messages)||((this.messages!= null)&&this.messages.equals(rhs.messages))))&&((this.cryptoToken == rhs.cryptoToken)||((this.cryptoToken!= null)&&this.cryptoToken.equals(rhs.cryptoToken))))&&((this.tools == rhs.tools)||((this.tools!= null)&&this.tools.equals(rhs.tools))))&&((this.parameters == rhs.parameters)||((this.parameters!= null)&&this.parameters.equals(rhs.parameters))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))));
    }

}
