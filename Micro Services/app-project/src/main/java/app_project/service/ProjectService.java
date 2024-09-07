package app_project.service;


import app_project.data.Project;
import app_project.data.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

@Autowired
private ProjectRepository projectRepository;


    public List<Project> getProjects() {
     return projectRepository.findAll();
    }

    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    public Project updateProject(Project project) {
        return projectRepository.save(project);
    }



    public Project deleteProjectById(int id) {
        Optional<Project> project = projectRepository.findById(id);//Filter on user id
        if (project.isPresent()) {
            projectRepository.deleteById(id);//Delete id
            return project.get();
        }
        return null;
        }


    public Project updateProjectById(int id, Project project) {
        Project existProject = projectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User is not found: " + id));

       existProject.setProjectName(project.getProjectName());
        existProject.setDescription(project.getDescription());
       existProject.setStartDate(project.getStartDate());
        existProject.setEndDate(project.getEndDate());

        return projectRepository.save(existProject);

    }

    public List<Project> findProjectByName(String projectName) {
        return projectRepository.findByProjectName(projectName);
    }
}

