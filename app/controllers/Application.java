package controllers;

import play.*;
import play.mvc.*;

//import models.Stafftable;

import views.html.*;

public class Application extends Controller {

    public static Result index() {

/*
    	Stafftable task = new Stafftable();


    	task.STAFF_ID =1;
    	task.STAFF_PASSWORD = "1111";
    	task.STAFF_NAME = "松本";
    	task.DEPARTMENT_ID = 1;
    	task.AUTHORITY_ID = 0;
    	task.save();

    	task.STAFF_ID =2;
    	task.STAFF_PASSWORD = "2222";
    	task.STAFF_NAME = "喜納";
    	task.DEPARTMENT_ID = 2;
    	task.AUTHORITY_ID = 0;
    	task.save();


    	task.STAFF_ID =3;
    	task.STAFF_PASSWORD = "3333";
    	task.STAFF_NAME = "大城";
    	task.DEPARTMENT_ID = 3;
    	task.AUTHORITY_ID = 0;
    	task.save();


    	task.STAFF_ID =4;
    	task.STAFF_PASSWORD = "4444";
    	task.STAFF_NAME = "田中";
    	task.DEPARTMENT_ID = 1;
    	task.AUTHORITY_ID = 1;
    	task.save();


    	task.STAFF_ID =5;
    	task.STAFF_PASSWORD = "5555";
    	task.STAFF_NAME = "上間";
    	task.DEPARTMENT_ID = 2;
    	task.AUTHORITY_ID = 1;
    	task.save();


    	task.STAFF_ID =6;
    	task.STAFF_PASSWORD = "6666";
    	task.STAFF_NAME = "中西";
    	task.DEPARTMENT_ID = 3;
    	task.AUTHORITY_ID = 1;
    	task.save();
    								*/

        return ok(index.render("hi"));
    }


}
