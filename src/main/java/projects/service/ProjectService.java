package projects.service;

import java.util.List;
import java.util.NoSuchElementException;

import projects.dao.ProjectDao;
import projects.entity.Project;

public class ProjectService {
	
	ProjectDao projectDao = new ProjectDao();
	
	public Project addProject(Project project) {
		
		return projectDao.insertProject(project);
		
	}

	public List<Project> fetchAllProjects() {
		List<Project> projects = projectDao.fetchAllProjects();
		return projects;
	}

	public Project fetchProjectById(Integer projectId) {
		return projectDao.fetchProjectById(projectId)
				.orElseThrow(() -> new NoSuchElementException(
						"Project with projectID=" + projectId 
						+ " does not exist."));
	}

}
