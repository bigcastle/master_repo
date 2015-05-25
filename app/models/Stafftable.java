package models;


import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;


@Entity
public class Stafftable extends Model {

	@Id
	public Integer STAFF_ID;

	public String STAFF_PASSWORD;

	public String STAFF_NAME;

	public Integer DEPARTMENT_ID;

	public Integer AUTHORITY_ID;


}
