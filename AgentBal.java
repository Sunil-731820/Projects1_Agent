package com.java.project;
import java.util.List;

public class AgentBal {

	static StringBuilder sb = new StringBuilder();
	public boolean validateStudent(Agent agent) {
		boolean isValid = true;
		
		if (agent.getAgentId() <= 0) {
			isValid = false;
			sb.append("Agent Id  Cannot be Zero or Negative...\n");
		}
		
		if (agent.getName().length() < 5) {
			isValid=false;
			sb.append("Name Should Contains Minimum of  five characters...\n");
		}
		
		if (agent.getCity().length() >=0) {
			isValid=false;
			sb.append("City can be zero  characters...\n");
		}
		
		return isValid;
	}
	
	public String deleteStudentBal(int agentid) {
		return new AgentDao().deleteAgentDao(agentid);
	}
	
	public Agent searchAgentBal(int sno) {
		return new AgentDao().searchAgentDao(sno);
	}
	public List<Agent> showAgentBal() {
		return new AgentDao().showAgentDao();
	}
	
	public String updateAgentBal(Agent agent) throws AgentException {
		AgentDao dao = new AgentDao();
		if (validateStudent(agent)==true) {
			return dao.udpateAgentDao(agent);
		} else {
			throw new AgentException(sb.toString());
		}
	}
	
	public String addAgentBal(Agent agent) throws AgentException {
		AgentDao dao = new AgentDao();
		if (validateStudent(agent)==true) {
			return dao.addAgentDao(agent);
		} else {
			throw new AgentException(sb.toString());
		}
	}
}
