package homeprojects;
//author: Christopher Britten

import org.springframework.data.jpa.repository.JpaRepository;




// here is the repo class
// it handles talking to the database.
// Extending JpaRepository will allow using save, find, and delete without writing it
public interface HomeProjectRepository extends JpaRepository<HomeProject, Long> {
}

// its important to note that this is empty on purpose
// JpaRepository already gives all the database methods needed
