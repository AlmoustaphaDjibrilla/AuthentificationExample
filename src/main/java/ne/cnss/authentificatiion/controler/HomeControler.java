package ne.cnss.authentificatiion.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControler {

    /**
     * la page principale
     * @return la page principale
     */
    @GetMapping(
            {"", "/"}
    )
    public String home(){
        return "index";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }
}
