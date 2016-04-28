package llamacorn;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contributor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	protected Contributor(){}

}
