package models;

import java.util.Date;
import java.util.List;

import play.db.ebean.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Card_detail_table extends Model {


	@Id
	public Integer id;

	@ManyToOne(fetch=FetchType.LAZY)
	public Stafftable send;

	@ManyToOne(fetch=FetchType.LAZY)
	public Stafftable receive;

	public String thanks_card_help;

	public String thanks_card_word;

	public String thanks_card_date;

	public Integer thanks_card_point;

	public Integer thanks_card_totalpoint;




	public static Finder<Integer,Card_detail_table> find = new Finder<Integer,Card_detail_table>(
	        Integer.class, Card_detail_table.class);


 }





