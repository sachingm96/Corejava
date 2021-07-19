package com.sachin.datastore.dto;

import java.io.Serializable;

import com.sachin.datastore.constant.HighwayType;

public class HighwayDTO implements Serializable, Comparable<HighwayDTO> {
	private int id;
	private int number;
	private HighwayType type;
	private String stateName;
	private double length;
	private boolean condition;
	private String contractCompany;

	public HighwayDTO() {

	}

	public HighwayDTO(int id, int number, HighwayType type, String stateName, double length, boolean condition,
			String contractCompany) {
		super();
		this.id = id;
		this.number = number;
		this.type = type;
		this.stateName = stateName;
		this.length = length;
		this.condition = condition;
		this.contractCompany = contractCompany;
	}

	@Override
	public String toString() {
		return "HighwayDTO [id=" + id + ", number=" + number + ", type=" + type + ", stateName=" + stateName
				+ ", length=" + length + ", condition=" + condition + ", contractCompany=" + contractCompany + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof HighwayDTO) {
			HighwayDTO other = (HighwayDTO) obj;
			if ((this.stateName.equals(other.getStateName()) && this.contractCompany.equals(getContractCompany())))
				return true;
		}
		return false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public HighwayType getType() {
		return type;
	}

	public void setType(HighwayType type) {
		this.type = type;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public boolean isCondition() {
		return condition;
	}

	public void setCondition(boolean condition) {
		this.condition = condition;
	}

	public String getContractCompany() {
		return contractCompany;
	}

	public void setContractCompany(String contractCompany) {
		this.contractCompany = contractCompany;
	}

	@Override
	public int compareTo(HighwayDTO o) {
		double max = o.getLength();
		if (this.length == max)
			return 0;
		if (this.length > max)
			return 1;
		if (this.length < max)
			return -1;

		return 0;
	}

}
