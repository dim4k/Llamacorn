package llamacorn;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CustomerController {
	
	private static Customer getCustomer1() throws JsonParseException, JsonMappingException, IOException
	{
	    final String uri = "http://localhost:8080/customers/1";
	     
	    RestTemplate restTemplate = new RestTemplate();
	     
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	     
	    Customer result = restTemplate.getForObject(uri, Customer.class);
	    
	    System.out.println(result);
	    	    
	    return result;
	}
	
    @RequestMapping("/customer")
    public String customer(Model model) throws JsonParseException, JsonMappingException, IOException {
    	Customer customer = CustomerController.getCustomer1();
    	
        model.addAttribute("name", customer.getName());
        return "customer";
    }

}