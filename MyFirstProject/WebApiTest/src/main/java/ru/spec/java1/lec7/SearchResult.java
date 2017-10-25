
package ru.spec.java1.lec7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "clusters",
    "items",
    "pages",
    "arguments",
    "found",
    "alternate_url",
    "per_page",
    "page"
})
public class SearchResult {

    @JsonProperty("clusters")
    private Object clusters;
    @JsonProperty("items")
    private List<Item> items = null;
    @JsonProperty("pages")
    private Integer pages;
    @JsonProperty("arguments")
    private Object arguments;
    @JsonProperty("found")
    private Integer found;
    @JsonProperty("alternate_url")
    private String alternateUrl;
    @JsonProperty("per_page")
    private Integer perPage;
    @JsonProperty("page")
    private Integer page;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("clusters")
    public Object getClusters() {
        return clusters;
    }

    @JsonProperty("clusters")
    public void setClusters(Object clusters) {
        this.clusters = clusters;
    }

    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

    @JsonProperty("pages")
    public Integer getPages() {
        return pages;
    }

    @JsonProperty("pages")
    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @JsonProperty("arguments")
    public Object getArguments() {
        return arguments;
    }

    @JsonProperty("arguments")
    public void setArguments(Object arguments) {
        this.arguments = arguments;
    }

    @JsonProperty("found")
    public Integer getFound() {
        return found;
    }

    @JsonProperty("found")
    public void setFound(Integer found) {
        this.found = found;
    }

    @JsonProperty("alternate_url")
    public String getAlternateUrl() {
        return alternateUrl;
    }

    @JsonProperty("alternate_url")
    public void setAlternateUrl(String alternateUrl) {
        this.alternateUrl = alternateUrl;
    }

    @JsonProperty("per_page")
    public Integer getPerPage() {
        return perPage;
    }

    @JsonProperty("per_page")
    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    @JsonProperty("page")
    public Integer getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(Integer page) {
        this.page = page;
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
