
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
    "logo_urls",
    "vacancies_url",
    "name",
    "url",
    "alternate_url",
    "id",
    "trusted"
})
public class Employer {

    @JsonProperty("logo_urls")
    private LogoUrls logoUrls;
    @JsonProperty("vacancies_url")
    private String vacanciesUrl;
    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private String url;
    @JsonProperty("alternate_url")
    private String alternateUrl;
    @JsonProperty("id")
    private String id;
    @JsonProperty("trusted")
    private Boolean trusted;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("logo_urls")
    public LogoUrls getLogoUrls() {
        return logoUrls;
    }

    @JsonProperty("logo_urls")
    public void setLogoUrls(LogoUrls logoUrls) {
        this.logoUrls = logoUrls;
    }

    @JsonProperty("vacancies_url")
    public String getVacanciesUrl() {
        return vacanciesUrl;
    }

    @JsonProperty("vacancies_url")
    public void setVacanciesUrl(String vacanciesUrl) {
        this.vacanciesUrl = vacanciesUrl;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("alternate_url")
    public String getAlternateUrl() {
        return alternateUrl;
    }

    @JsonProperty("alternate_url")
    public void setAlternateUrl(String alternateUrl) {
        this.alternateUrl = alternateUrl;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("trusted")
    public Boolean getTrusted() {
        return trusted;
    }

    @JsonProperty("trusted")
    public void setTrusted(Boolean trusted) {
        this.trusted = trusted;
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
