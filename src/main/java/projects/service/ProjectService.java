package projects.service;

import projects.dao.ProjectDao;
import projects.entity.Project;

public class ProjectService {
	
	ProjectDao projectDao = new ProjectDao();
	
	public Project addProject(Project project) {
		
		return projectDao.insertProject(project);
		
	}

}
