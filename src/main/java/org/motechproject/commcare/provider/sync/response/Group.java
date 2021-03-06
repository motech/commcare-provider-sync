package org.motechproject.commcare.provider.sync.response;

import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Group implements Serializable {
    @JsonProperty("case_sharing")
    private Boolean caseSharing;
    @JsonProperty
    private String domain;
    @JsonProperty
    private String id;
    @JsonProperty("metadata")
    private Map<String, Object> metaData;
    @JsonProperty
    private String name;
    @JsonProperty
    private List<String> path;
    @JsonProperty
    private Boolean reporting;
    @JsonProperty("resource_uri")
    private String resourceUri;
    @JsonProperty
    private List<String> users;

    public Group() {
    }

    public String getId() {
        return id;
    }

    public Map<String, Object> getMetaData() {
        return metaData;
    }

    public Boolean getCaseSharing() {
        return caseSharing;
    }

    public String getDomain() {
        return domain;
    }

    public String getName() {
        return name;
    }

    public List<String> getPath() {
        return path;
    }

    public Boolean getReporting() {
        return reporting;
    }

    public String getResourceUri() {
        return resourceUri;
    }

    public List<String> getUsers() {
        return users;
    }
}
