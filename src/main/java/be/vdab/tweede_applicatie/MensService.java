package be.vdab.tweede_applicatie;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.util.Arrays;
import java.util.List;


@Service
public class MensService {

    private final String eersteAppUrl;
    private final RestTemplate restTemplate;




    public MensService(@Value("${eerste.app.url}") String eersteAppUrl) {
        this.eersteAppUrl = eersteAppUrl;
        this.restTemplate = new RestTemplate();
    }

    public List<TodoDTO> getTodosVoorMens(long id) {
        String url = eersteAppUrl + "/mensen/" + id + "/todos" ;

        try{
            TodoDTO[] todosArray = restTemplate.getForObject(url, TodoDTO[].class);
            return Arrays.asList(todosArray);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Mens not found");
        }
    }


}
