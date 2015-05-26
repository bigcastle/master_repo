package models;


import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DEPARTMENT_TABLE extends Model {


	@Id
	public Integer DEPARTMENT_ID;

	public String DEPARTMENT_NAME;

	public Integer BOSS_ID;


	public static Finder<Long, DEPARTMENT_TABLE> find = new Finder<Long,DEPARTMENT_TABLE>(
	        Long.class, DEPARTMENT_TABLE.class);

}