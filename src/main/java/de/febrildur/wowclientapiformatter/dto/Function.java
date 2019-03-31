
package de.febrildur.wowclientapiformatter.dto;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Function {

    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Returns")
    @Expose
    private List<Return> returns = null;
    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("Arguments")
    @Expose
    private List<Argument> arguments = null;
    @SerializedName("Documentation")
    @Expose
    private List<String> documentation = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Return> getReturns() {
        return returns;
    }

    public void setReturns(List<Return> returns) {
        this.returns = returns;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Argument> getArguments() {
        return arguments;
    }

    public void setArguments(List<Argument> arguments) {
        this.arguments = arguments;
    }

    public List<String> getDocumentation() {
        return documentation;
    }

    public void setDocumentation(List<String> documentation) {
        this.documentation = documentation;
    }

}
