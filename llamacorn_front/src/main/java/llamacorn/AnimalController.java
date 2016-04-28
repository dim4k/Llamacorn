package llamacorn;

import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class AnimalController {
	
    
    @RequestMapping(value = "/animal")
    
    public String customer(Model model) {

       
        model.addAttribute("listAnimal", "name");
        return "animal";
    }
  
}
