package com.nt.corejva;

public class Pclass {
	public int id;
	public String name;
	public String code;

	public Pclass(int id, String name, String code) {
		this.id = id;
		this.name = name;
		this.code = code;
	}

	@Override
	public String toString() {
		return "Pclass [id=" + id + ", name=" + name + ", code=" + code + "]";
	}

}
