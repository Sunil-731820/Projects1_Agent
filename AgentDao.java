package com.java.project;

import java.util.ArrayList;
import java.util.List;

public class AgentDao {

	static List<Agent> agentList;
	
	static {
		agentList = new ArrayList<Agent>();
	}
	
	public String udpateAgentDao(Agent agent) {
		Agent agentFound = searchAgentDao(agent.getAgentId());
		if (agentFound!=null) {
			agentFound.setName(agent.getName());
//			agentFound.setGender(agent.setGender());
			agentFound.setCity(agent.getCity());
			agentFound.setPaymode(agent.getPaymode());
			agentFound.setPreminum(agent.getPreminum());
			return "Agents  Record are  Updated Successfully ";
		}
		return "No  Record Not Found...";
	}
	
	public String deleteAgentDao(int agentid) {
		Agent agentFound = searchAgentDao(agentid);
		if (agentFound!=null) {
			agentList.remove(agentFound);
			return "Agent  data are  Deleted...";
		}
		return "agent data are  not Found...";
	}
	
	public Agent searchAgentDao(int agentid) {
		Agent agentFound = null;
		for (Agent agent : agentList) {
			if (agent.getAgentId()==agentid) {
				agentFound = agent;
			}
		}
		return agentFound;
	}
	public List<Agent> showAgentDao() {
		return agentList;
	}
	
	public String addAgentDao(Agent agent) {
		agentList.add(agent);
		return "Agent data is  added";
	}
}