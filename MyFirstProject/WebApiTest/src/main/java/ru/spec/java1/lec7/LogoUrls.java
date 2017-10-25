
package ru.spec.java1.lec7;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "90",
    "240",
    "original"
})
public class LogoUrls {

    @JsonProperty("90")
    private String _90;
    @JsonProperty("240")
    private String _240;
    @JsonProperty("original")
    private String original;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("90")
    public String get90() {
        return _90;
    }

    @JsonProperty("90")
    public void set90(String _90) {
        this._90 = _90;
    }

    @JsonProperty("240")
    public String get240() {
        return _240;
    }

    @JsonProperty("240")
    public void set240(String _240) {
        this._240 = _240;
    }

    @JsonProperty("original")
    public String getOriginal() {
        return original;
    }

    @JsonProperty("original")
    public void setOriginal(String original) {
        this.original = original;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
