package models;

import java.util.Date;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;


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




}
