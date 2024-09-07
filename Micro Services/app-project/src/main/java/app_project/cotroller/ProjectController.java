    package app_project.cotroller;


    import app_project.data.Project;
    import app_project.service.ProjectService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    @RestController
    @CrossOrigin(origins = "http://localhost:3000")
    public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping(path = "/projects")
    public List<Project> findAllProjects(){
        return projectService.getProjects();
    }

    @PostMapping(path = "/projects")
    public Project createProject(@RequestBody Project project) {
        return projectService.createProject(project);
    }

    @PutMapping(path = "/projects")
    public Project updateProject(@RequestBody Project project){
        return projectService.updateProject(project);
    }

    @DeleteMapping(path = "/projects/{id}")
    public Project deleteProjectById(@PathVariable int id){
       return projectService.deleteProjectById(id);
    }

    @PutMapping("/projects/{id}")
    public Project updateProjectById(@PathVariable int id, @RequestBody Project project) {
        return projectService.updateProjectById(id,project);
    }

    @GetMapping(path ="/projects/{projectName}")
    public List<Project> findProjectByName(@PathVariable String projectName){
        return projectService.findProjectByName(projectName);

        }


    }
