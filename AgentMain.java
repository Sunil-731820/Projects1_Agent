package com.java.project;
import java.util.*;
import java.util.List;
import java.util.Scanner;

public class AgentMain {

	static Scanner sc = new Scanner(System.in);
	
	static AgentBal bal = new AgentBal();
	
	public static void main(String[] args) throws Exception{
		int choice;
		String gen ;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the gender Here ");
		gen = sc1.next();
		Gender gender;
		if(gen.toUpperCase().equals("MALE")) {
			gender = Gender.MALE;
		}
		else if(gen.toLowerCase().equals("FEMALE")) {
			gender = Gender.FEMALE;
		}
		do {
			System.out.println(" CHOOOSE ANY ONE OF THEM TO PERFORM YOUR OPERATIONS ");
			System.out.println("  -------------");
			System.out.println("1. Add Agent");
			System.out.println("2. Show Agentt");
			System.out.println("3. Search Agent");
			System.out.println("4. Delete Agent");
			System.out.println("5. Update Agent");
			System.out.println("6. Exit");
			System.out.println("Select Your Choice From Above   ");
			choice=sc.nextInt();
			switch(choice) {
			case 1 : 
				try {
					addAgent();
				} catch (AgentException e) {
					System.err.println(e.getMessage());
				}
				break;
			case 2 : 
				showAgent();
				break;
			case 3 : 
				searchAgent();
				break;
			case 4 : 
				deleteAgent();
				break;
			case 5 : 
				try {
					updateAgent();
				} catch (AgentException e) {
					e.printStackTrace();
				}
				break;
			}
			
		} while(choice!=6);
	}
	

	public static void deleteAgent() {
		int agentid;
		System.out.println("Enter AgentId No    ");
		agentid=sc.nextInt();
		String result = bal.deleteAgentBal(agentid);
		System.out.println(result);
	}
	
	public static void searchAgent() {
		int agentid;
		System.out.println("Enter AgentId No    ");
		agentid=sc.nextInt();
		Agent agent = bal.searchAgentBal(agentid);
		if (agent!=null) {
			System.out.println(agent);
		} else {
			System.out.println("Agents Record Are Not Found...");
		}
	}
	
	public static void updateAgent() throws AgentException {
		Agent agent = new Agent();
		System.out.println("Enter AgentId  Number Here    ");
		agent.setAgentId(sc.nextInt());
		System.out.println("Enter Agent  Name   ");
		agent.setName(sc.next());
		System.out.println("Enter City Here   ");
		agent.setCity(sc.nextLine());
		System.out.println("Enter Paymode here ");
		agent.setPaymode(sc.nextInt());
		System.out.println("Enter the Premium Here ");
		agent.setPreminum(sc.nextDouble());
		
		System.out.println(bal.updateAgentBal(agent));
		
	}
	
	public static void addAgent() throws AgentException {
		Agent agent = new Agent();
		System.out.println("Enter Agent  Number here    ");
		agent.setAgentId(sc.nextInt());
		System.out.println("Enter Agent Name   ");
		agent.setName(sc.next());
//		System.out.println("Enter the Gender Here ");
//		agent.setGender(sc.next());
		String gen ;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the gender Here ");
		gen = sc1.next();
//		Gender gender;
		if(gen.toUpperCase().equals("MALE")) {
			agent.setGender(Gender.MALE);
//			gender = Gender.MALE;
		}
		else if(gen.toLowerCase().equals("FEMALE")) {
			agent.setGender(Gender.FEMALE);
//			gender = Gender.FEMALE;
		}
		System.out.println("Enter City   ");
		agent.setCity(sc.next());
		System.out.println("Enter the PayMode Here ");
		agent.setPaymode(sc.nextInt());
		System.out.println("Enter the Preminum Here ");
		agent.setPreminum(sc.nextDouble());
		

		System.out.println(bal.addAgentBal(agent));
		
	}
	
	public static void showAgent() {
		List<Agent> agentList = bal.showAgentBal();
		for (Agent agent : agentList) {
			System.out.println(agent);
		}
	}
}
































