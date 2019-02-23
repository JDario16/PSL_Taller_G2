package co.com.psl;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ElevenController {

    @RequestMapping("/Eleven")
    public String index() {
        return "ElevenTeam";
    }
}
