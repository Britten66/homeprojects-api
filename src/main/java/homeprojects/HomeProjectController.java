import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class HomeProjectController {

    @Autowired
    private HomeProjectService service;

    @GetMapping
    public List<HomeProject> getAll() {
        return service.getAll();
    }