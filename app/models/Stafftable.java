package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;

import play.db.ebean.Model;


@Entity
public class Stafftable extends Model {

	@Id
	public Integer ID;

	public String STAFF_PASSWORD;

	public String STAFF_NAME;


	@ManyToOne(fetch=FetchType.EAGER)
	public DEPARTMENT_TABLE DEPARTMENT ;


	public Integer AUTHORITY_ID;


	public static Finder<Integer, Stafftable> find = new Finder<Integer,Stafftable>(
			Integer.class, Stafftable.class);








}
