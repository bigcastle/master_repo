package models;

import play.db.ebean.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Thanks_card_table extends Model {

	@Id
	public Integer STAFF_ID;

	public Integer THANKS_CARD_ID;



	public static Finder<Integer, Thanks_card_table> find = new Finder<Integer,Thanks_card_table>(
			Integer.class, Thanks_card_table.class);

	@ManyToOne
	public List<Stafftable> user;


	@ManyToOne
	public List<Card_detail_table> card_detail;

}
