package GenericLibrary;

/**
 * this interface contains all the endpoints
 * @author sheno
 *
 */
public interface EndPointsLibrary {
	
	String createProject = "/addProject";
	String updateProject = "/projects";
	String getAllProjects="/projects";
	String getSingleProject="/projects/";
	String deleteProject = "/projects/";
	

}