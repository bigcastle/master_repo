package models;

//import java.util.List;

//import javax.persistence.CascadeType;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.FetchType;
import javax.persistence.Id;

import javax.persistence.*;

import play.db.ebean.*;


@Entity
public class Stafftable extends Model {

	@Id
	public Integer id;

	public String staff_password;

	public String staff_name;


	@ManyToOne(fetch=FetchType.LAZY)
	public Department_table department ;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "send")
	public List<Card_detail_table> Cdt_s = new ArrayList<Card_detail_table>();

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "receive")
	public List<Card_detail_table> Cdt_r = new ArrayList<Card_detail_table>();

	public Integer authority_id;


	public static Finder<Integer, Stafftable> find = new Finder<Integer,Stafftable>(
			Integer.class, Stafftable.class);





}
