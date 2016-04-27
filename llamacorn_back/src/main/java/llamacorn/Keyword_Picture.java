package llamacorn;

import javax.persistence.*;

public class Keyword_Picture {

	@Id
	@Column(name="KEYP_ID")
	private long id;
	private String keyword;
	
	
	public Keyword_Picture(long id, String keyword) {
		super();
		this.id = id;
		this.keyword = keyword;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	
}
