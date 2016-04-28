package llamacorn;

import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class CustomerController {
	
    
    @RequestMapping(value = "/customer")
    
    public String customer(Model model) {

       
        model.addAttribute("listCustomer", "name");
        return "customer";
    }
  
}