package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Thanks_card_table extends Model {

	@Id
	public Integer STAFF_ID;

	public Integer THANKS_CARD_ID;



	public static Finder<Long, Thanks_card_table> find = new Finder<Long,Thanks_card_table>(
	        Long.class, Thanks_card_table.class);

}
