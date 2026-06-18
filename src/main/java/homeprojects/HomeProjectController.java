package homeprojects;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/api/projects")
public class HomeProjectController {

    @Autowired
    private HomeProjectService service;

    @GetMapping
    public List<HomeProject> getAll() {
        return service.getAll();
    }


    @GetMapping("/{id}")
    public ResponseEntity<HomeProject> getById(@PathVariable Long id) {
        HomeProject project = service.getById(id);
        if (project == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(project);
    }