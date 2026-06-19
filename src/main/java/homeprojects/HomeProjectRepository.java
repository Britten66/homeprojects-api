package homeprojects;
//author: Christopher Britten



// here is the repo class
// it handles talking to the database.
// Extending JpaRepository will allow using save, find, and delete without writing it
import org.springframework.data.repository.CrudRepository;

public interface HomeProjectRepository extends CrudRepository<HomeProject, Long> {
}

// its important to note that this is empty on purpose
// JpaRepository already gives all the database methods needed
