package projectLibrary;

public class ProjectLibrary {
	
	//Step1: create the keys as global variables
	String createdBy;
	String projectName;
	int status;
	int teamSize;
	
	//Step2:create a constructor to initialise the variables
	public ProjectLibrary(String createdBy, String projectName, int status, int teamSize) {
		this.createdBy = createdBy;
		this.projectName = projectName;
		this.status = status;
		this.teamSize = teamSize;
	}

	
	//Step3: Provide getters and setters to access the variables

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	
	
	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	
		
	
	

}
