package homeprojects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeProjectService {

    @Autowired
    private HomeProjectRepository repository;

    public List<HomeProject> getAll() {
        return repository.findAll();
    }

    public HomeProject getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public HomeProject create(HomeProject project) {
        return repository.save(project);
    }

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

    public boolean delete(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}