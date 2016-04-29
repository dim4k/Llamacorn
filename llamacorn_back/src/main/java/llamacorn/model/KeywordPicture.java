package llamacorn.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class KeywordPicture {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String keyword;
	
	
	public KeywordPicture(long id, String keyword) {
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
