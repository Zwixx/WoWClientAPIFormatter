
package de.febrildur.wowclientapiformatter.dto;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Argument {

	@SerializedName("Name")
	@Expose
	private String name;
	@SerializedName("Type")
	@Expose
	private String type;
	@SerializedName("Nilable")
	@Expose
	private Boolean nilable;
	@SerializedName("Default")
	@Expose
	private Object _default;
	@SerializedName("Documentation")
	@Expose
	private List<String> documentation = null;

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

	public Object getDefault() {
		return _default;
	}

	public void setDefault(Object _default) {
		this._default = _default;
	}

	public List<String> getDocumentation() {
		return documentation;
	}

	public void setDocumentation(List<String> documentation) {
		this.documentation = documentation;
	}
}
