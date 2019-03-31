package de.febrildur.wowclientapiformatter.dto;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WoWAPI {

	@SerializedName("Name")
	@Expose
	private String name;
	@SerializedName("Type")
	@Expose
	private String type;
	@SerializedName("Tables")
	@Expose
	private List<Table> tables = null;
	@SerializedName("Functions")
	@Expose
	private List<Function> functions = null;
	@SerializedName("Events")
	@Expose
	private List<Event> events = null;
	@SerializedName("Namespace")
	@Expose
	private String namespace;

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

	public List<Table> getTables() {
		return tables;
	}

	public void setTables(List<Table> tables) {
		this.tables = tables;
	}

	public List<Function> getFunctions() {
		return functions;
	}

	public void setFunctions(List<Function> functions) {
		this.functions = functions;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

}
