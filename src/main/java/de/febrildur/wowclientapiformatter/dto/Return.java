
package de.febrildur.wowclientapiformatter.dto;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Return {

    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("Nilable")
    @Expose
    private Boolean nilable;
    @SerializedName("InnerType")
    @Expose
    private String innerType;
    @SerializedName("Documentation")
    @Expose
    private List<String> documentation = null;
    @SerializedName("StrideIndex")
    @Expose
    private Integer strideIndex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getNilable() {
        return nilable;
    }

    public void setNilable(Boolean nilable) {
        this.nilable = nilable;
    }

    public String getInnerType() {
        return innerType;
    }

    public void setInnerType(String innerType) {
        this.innerType = innerType;
    }

    public List<String> getDocumentation() {
        return documentation;
    }

    public void setDocumentation(List<String> documentation) {
        this.documentation = documentation;
    }

    public Integer getStrideIndex() {
        return strideIndex;
    }

    public void setStrideIndex(Integer strideIndex) {
        this.strideIndex = strideIndex;
    }

}
