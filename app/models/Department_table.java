package models;


//import java.util.List;

import java.util.ArrayList;
import java.util.List;

import play.db.ebean.*;

import javax.persistence.CascadeType;
//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.OneToMany;


@Entity
public class Department_table extends Model {


	@Id
	public Integer id;

	public String department_name;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
	public List<Stafftable> Staff = new ArrayList<Stafftable>();

	public Integer BOSS_ID;


	public static Finder<Integer, Department_table> find = new Finder<Integer,Department_table>(
			Integer.class, Department_table.class);




}