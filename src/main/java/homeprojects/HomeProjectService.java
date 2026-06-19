package homeprojects;
//author: Christopher Britten

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// This is all of the logic for the application
// outide of the controller and the repo .. this does the actual work
@Service
public class HomeProjectService {



    @Autowired
    private HomeProjectRepository repository;

    public Iterable<HomeProject> getAll() {
        return repository.findAll();
    }
    // fixed for crud repo
    // as per reviewing classes
    public HomeProject getById(Long id) {


        return repository.findById(id).orElse(null);
    }

    public HomeProject create(HomeProject project) {



        return repository.save(project);
    }





    // This pulls the existing project first
    // then copies the new values onto it before saving

    public HomeProject update(Long id, HomeProject updated) {
        HomeProject existing = repository.findById(id).orElse(null);
        if (existing == null) {
            return null;
        }
        existing.setTitle(updated.getTitle());
        existing.setRoom(updated.getRoom());
        existing.setEstimatedCost(updated.getEstimatedCost());
        existing.setStatus(updated.getStatus());
        existing.setPriority(updated.getPriority());
        return repository.save(existing);
    }


    // simple delete

    public boolean delete(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }

        // if not then return err
        return false;
    }
}