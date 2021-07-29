package com.sachin.rogi.dto;

import java.io.Serializable;

public class RogiDTO implements Serializable,Comparable<RogiDTO> {

	private int id;
	private String name;
	private int age;
	private String kayile;
	private boolean badukuGurantee;

	public RogiDTO() {

	}

	public RogiDTO(int id, String name, int age, String kayile, boolean badukuGurantee) {

		this.id = id;
		this.name = name;
		this.age = age;
		this.kayile = kayile;
		this.badukuGurantee = badukuGurantee;
	}

	@Override
	public String toString() {
		return "RogiDTO [id=" + id + ", name=" + name + ", age=" + age + ", kayile=" + kayile + ", badukuGurantee="
				+ badukuGurantee + "]";
	}
	
	@Override
	public int compareTo(RogiDTO o) {
		Integer temp = o.getAge();
		if (this.age == 0)
			return 0;
		if (this.age> 0)
			return 1;
		if (this.age< 0)
			return -1;
		return 0;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + (badukuGurantee ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + ((kayile == null) ? 0 : kayile.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RogiDTO other = (RogiDTO) obj;
		if (age != other.age)
			return false;
		if (badukuGurantee != other.badukuGurantee)
			return false;
		if (id != other.id)
			return false;
		if (kayile == null) {
			if (other.kayile != null)
				return false;
		} else if (!kayile.equals(other.kayile))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getKayile() {
		return kayile;
	}

	public void setKayile(String kayile) {
		this.kayile = kayile;
	}

	public boolean isBadukuGurantee() {
		return badukuGurantee;
	}

	public void setBadukuGurantee(boolean badukuGurantee) {
		this.badukuGurantee = badukuGurantee;
	}

}
