package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;

import play.db.ebean.Model;


@Entity
public class Stafftable extends Model {

	@Id
	public Integer STAFF_ID;

	public String STAFF_PASSWORD;

	public String STAFF_NAME;

	public Integer DEPARTMENT_ID;

	public Integer AUTHORITY_ID;


	public static Finder<Integer, Stafftable> find = new Finder<Integer,Stafftable>(
			Integer.class, Stafftable.class);

	@OneToMany
	public List<Thanks_card_table> thanks_card;


	@ManyToOne
	public List<DEPARTMENT_TABLE> department;

	@OneToMany
	public List<Card_detail_table> card_data;



}
