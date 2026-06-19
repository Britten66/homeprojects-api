package homeprojects;
//author: Christopher Britten

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


// this will show the model section. It represents one home project and its info
// The annotation turns it into a table in the database
@Entity
@Table(name = "projects")
public class HomeProject {

// The id is the PK
// The database fills it in and with auto incrementing

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String room;
    private Double estimatedCost;
    private String status;
    private Integer priority;

    public HomeProject() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Double getEstimatedCost() {
        return estimatedCost;


    }
    public void setEstimatedCost(Double estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getPriority() {
        return priority;
    }
    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}