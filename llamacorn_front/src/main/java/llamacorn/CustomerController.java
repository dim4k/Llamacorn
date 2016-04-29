package llamacorn;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class CustomerController {
	
	private static Customer getCustomerbyId(long id)
	{
	    final String uri = "http://localhost:8080/customers/"+id;
	     
	    RestTemplate restTemplate = new RestTemplate();
	     
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	     
	    Customer result = restTemplate.getForObject(uri, Customer.class);
	    
	    System.out.println(result);
	    	    
	    return result;
	}
	
	private static Animal getCustomerAnimalbyId(long id)
	{
	    final String uri = "http://localhost:8080/customers/"+id+"/animals";
	     
	    RestTemplate restTemplate = new RestTemplate();
	     
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	     
	    Animal result =  restTemplate.getForObject(uri, Animal.class);
	    
	    System.out.println(result);
	    	    
	    return result;
	}
	
	private static ArrayList<Customer> getCustomers()
	{
	    final String uri = "http://localhost:8080/customers";
	     
	    RestTemplate restTemplate = new RestTemplate();
	     
	    HttpHeaders headers = new HttpHeaders();
	    
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	     
	    ArrayList<Customer> result = restTemplate.getForObject(uri, ArrayList.class);	    
	    
	    for (Customer custo : result) {
	        System.out.println(custo.toString());
	    }
	    	    
	    return result;
	}
	
    @RequestMapping("/customer/{id}")
    public String customer(@PathVariable long id, Model model){
    	Customer customer = CustomerController.getCustomerbyId(id);
    	
    	Animal animal = CustomerController.getCustomerAnimalbyId(id);
    	
        model.addAttribute("customer", customer.toString());
        model.addAttribute("animal", animal.toString());
        model.addAttribute("idcustomer", id);
        return "customer";
    }
    
    @RequestMapping("/customers")
    public String customers(Model model){
    	ArrayList<Customer> customers = CustomerController.getCustomers();
    	
        model.addAttribute("customers", customers);
        
        return "customers";
    }
    
    @RequestMapping(value="/customer/new", method=RequestMethod.GET)
    public String newCustoForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "addCustomer";
    }

    @RequestMapping(value="/customer/new", method=RequestMethod.POST)
    public String newCustoSubmit(@ModelAttribute Customer customer, Model model) {
        //model.addAttribute("customer", customer);
    	
        final String uri = "http://localhost:8080/customers";
        
        RestTemplate restTemplate = new RestTemplate();
        Customer custo = restTemplate.postForObject( uri, customer, Customer.class);
     
        System.out.println(custo);
        
        model.addAttribute("customer", custo);
        
        return "result";
    }

}