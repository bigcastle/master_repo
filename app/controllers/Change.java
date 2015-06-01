package controllers;

import play.*;
import play.data.Form;
import play.mvc.*;
import models.*;
import views.html.*;

import java.util.List;
import java.util.Map;

import play.data.validation.Constraints.*;


public class Change extends Controller {




    public static Result change(){

    	List<Department_table> department_list = Department_table.find.all();


    	return ok(change.render(department_list));

    }

    public static Result change_ck(){

    	Map<String,String[]> change_department =request().body().asFormUrlEncoded();

    	Integer ch_dep = Integer.parseInt(change_department.get("next")[0]);
    	Integer ch_staff =Integer.parseInt(change_department.get("id")[0]);

    	Stafftable change = Stafftable.find.byId(ch_staff);

    	Department_table ch_dep2=Department_table.find.byId(ch_dep);

    	change.department=ch_dep2;


    	if(ch_dep ==3){
    		change.authority_id=1;
    	}

    	change.update();
    	return redirect(routes.Change.change_ck());
    }


}

