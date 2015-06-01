package controllers;

import play.mvc.*;
import models.*;
import views.html.*;

import java.util.List;
import java.util.Map;

import play.data.validation.Constraints.*;


public class Signup extends Controller {




    public static Result signupview(){

    	List<Department_table> department_list = Department_table.find.all();


    	return ok(signup.render(department_list));

    }

    public static Result singup_staff(){

    	Map<String,String[]> newStaff =request().body().asFormUrlEncoded();
    	Stafftable staff = new Stafftable();


    	Integer staff_id =Integer.parseInt(newStaff.get("id")[0]);
    	staff.id =staff_id;


    	Integer staff_dep = Integer.parseInt(newStaff.get("department")[0]);
    	Department_table staff_dep2 =Department_table.find.byId(staff_dep);
    	staff.department=staff_dep2;


    	staff.staff_name=newStaff.get("name")[0];
    	staff.staff_password=newStaff.get("pass")[0];

    	staff.authority_id=0;



    	staff.save();
    	return redirect(routes.Signup.singup_staff());
    }


}