package com.ccdc;

public class Person implements Comparable<Person> {

	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int compareTo(Person o) {
		return name.toLowerCase().compareTo(o.name.toLowerCase());
	}

}
