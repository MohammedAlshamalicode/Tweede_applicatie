package be.vdab.tweede_applicatie;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/mensen")
public class MensController {

    private final MensService mensService;

    public MensController(MensService mensService) {
        this.mensService = mensService;
    }

    @GetMapping("/{id}/todos")
    public List<TodoDTO> getTodosVoorMens (@PathVariable long id) {

        return mensService.getTodosVoorMens(id).stream().sorted(Comparator.comparing(TodoDTO::prioriteit)).toList();
    }
}