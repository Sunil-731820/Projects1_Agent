package com.java.project;

public class Agent {
	private int agentId;
	private String name;
	private Gender gender;
	private String city;
	private int paymode;
	private double preminum;
	
	
	
	public Agent() {
//		super();
		// TODO Auto-generated constructor stub
	}



	public Agent(int agentId, String name, Gender gender, String city, int paymode, double preminum) {
		super();
		this.agentId = agentId;
		this.name = name;
		this.gender = gender;
		this.city = city;
		this.paymode = paymode;
		this.preminum = preminum;
	}



	@Override
	public String toString() {
		return "Agent [agentId=" + agentId + ", name=" + name + ", gender=" + gender + ", city=" + city + ", paymode="
				+ paymode + ", preminum=" + preminum + "]";
	}



	public int getAgentId() {
		return agentId;
	}



	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Gender getGender() {
		return gender;
	}



	public void setGender(Gender gender) {
		this.gender = gender;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public int getPaymode() {
		return paymode;
	}



	public void setPaymode(int paymode) {
		this.paymode = paymode;
	}



	public double getPreminum() {
		return preminum;
	}



	public void setPreminum(double preminum) {
		this.preminum = preminum;
	}
	
	
	
	
}
