
package de.febrildur.wowclientapiformatter.dto;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Event {

	@SerializedName("Name")
	@Expose
	private String name;
	@SerializedName("Payload")
	@Expose
	private List<Payload> payload = null;
	@SerializedName("Type")
	@Expose
	private String type;
	@SerializedName("LiteralName")
	@Expose
	private String literalName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Payload> getPayload() {
		return payload;
	}

	public void setPayload(List<Payload> payload) {
		this.payload = payload;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLiteralName() {
		return literalName;
	}

	public void setLiteralName(String literalName) {
		this.literalName = literalName;
	}

}
