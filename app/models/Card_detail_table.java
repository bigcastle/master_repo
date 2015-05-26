package models;

import java.util.Date;
import java.util.List;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Card_detail_table extends Model {


	@Id
	public Integer THANKS_CARD_ID;

	public String THANKS_CARD_HELP;

	public String THANKS_CARD_WORD;

	public String THANKS_CARD_DATE;

	public Integer THANKS_CARD_RECEIVE;

	public Integer THANKS_CARD_POINT;

	public Integer THANKS_CARD_TOTALPOINT;

	public static Finder<Integer,Card_detail_table> find = new Finder<Integer,Card_detail_table>(
	        Integer.class, Card_detail_table.class);



	@OneToOne
	public List<Thanks_card_table> thanks_card;



}
