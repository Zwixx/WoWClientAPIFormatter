
package de.febrildur.wowclientapiformatter.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Payload {

    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("Nilable")
    @Expose
    private Boolean nilable;

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

}
