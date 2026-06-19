package homeprojects;
//author: Christopher Britten



// here is the repo class
// it handles talking to the database.
// Extending CrudRepository now will allow using
// save. find. and delete all the same  without writing it


import org.springframework.data.repository.CrudRepository;

public interface HomeProjectRepository extends CrudRepository<HomeProject, Long> {
}

// its important to note that this is empty on purpose
// CrudRepository already gives all the database methods needed