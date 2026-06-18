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

        // using null here if nothing is found
        if (project == null) {
            // response not found should be a 404
            // handlers built into these as I was building fast. hoping to pick it up with a post
            return ResponseEntity.notFound().build();
        }

        // here if this gets found it will sent to project
        return ResponseEntity.ok(project);
    }


    @PostMapping
    public HomeProject create(@RequestBody HomeProject project) {
        return service.create(project);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HomeProject> update(@PathVariable Long id, @RequestBody HomeProject project) {
        HomeProject updated = service.update(id, project);
        if (updated == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (service.delete(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
