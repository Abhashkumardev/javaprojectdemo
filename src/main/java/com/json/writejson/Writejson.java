package com.json.writejson;

public class Writejson {
	
	private final long id;
	private final String name;

	public Writejson(String name, long id) {
		this.name = name;
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
