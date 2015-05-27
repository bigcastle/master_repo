package models;

import java.util.Date;
import java.util.List;

import play.db.ebean.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Card_detail_table extends Model {


	@Id
	public Integer ID;

	@ManyToOne
	public Stafftable send;

	@ManyToOne
	public Stafftable receive;

	public String THANKS_CARD_HELP;

	public String THANKS_CARD_WORD;

	public String THANKS_CARD_DATE;

	public Integer THANKS_CARD_POINT;

	public Integer THANKS_CARD_TOTALPOINT;




	public static Finder<Integer,Card_detail_table> find = new Finder<Integer,Card_detail_table>(
	        Integer.class, Card_detail_table.class);






}
