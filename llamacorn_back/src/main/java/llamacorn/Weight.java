package llamacorn;

import java.sql.Date;

import javax.persistence.*;

public class Weight {

	@Id
	@Column(name="WEIG_ID")
	private long id;
	private Date date;
	private int weight;
	private String comment;
}
