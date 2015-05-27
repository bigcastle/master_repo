package models;


//import java.util.List;

import play.db.ebean.*;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.OneToMany;


@Entity
public class DEPARTMENT_TABLE extends Model {


	@Id
	public Integer ID;

	public String DEPARTMENT_NAME;


	public Integer BOSS_ID;


	public static Finder<Integer, DEPARTMENT_TABLE> find = new Finder<Integer,DEPARTMENT_TABLE>(
			Integer.class, DEPARTMENT_TABLE.class);




}