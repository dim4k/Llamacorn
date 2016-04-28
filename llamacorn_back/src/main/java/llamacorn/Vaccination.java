package llamacorn;

import java.util.Date;

import javax.persistence.*;

public class Vaccination {
	
	@Id
	@Column(name="VACC_ID")
	private long id;
	private Contributor contributor;
	private Date datevacc;
	private String vaccin;
	private String notes;
	private String temperature;//controle saisie num mais stock string
	private String consvacc;
	private String cerfa;
	private String type;
	private String labo;
	private String cerfa1; //première injection du vaccin
	private Contributor contributor1;
	private Date date1;
	private String type1;
	private String lot;
	
	

}
