package controllers;

import play.*;
import play.mvc.*;
import models.Stafftable;
import models.Card_detail_table;
import models.Department_table;
import views.html.*;

import java.util.List;

public class Showcase extends Controller {

    public static Result showcase(){

    	List<Card_detail_table> card_list = Card_detail_table.find.all();
    //	List<Stafftable> staff_list = Stafftable.find.all();
    //	List<Department_table> department = Department_table.find.all();

    	return ok(showcase.render(card_list));
    }
}