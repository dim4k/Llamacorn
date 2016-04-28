package llamacorn;

import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class IndexController {
    
    @RequestMapping(value = "/index")
    
    public String index(Model model) {
        return "index";
    }

}