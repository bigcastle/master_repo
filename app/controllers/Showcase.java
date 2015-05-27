package controllers;

import play.*;
import play.mvc.*;
import models.Stafftable;
import models.Card_detail_table;
import models.DEPARTMENT_TABLE;
import views.html.*;

import java.util.List;

public class Showcase extends Controller {

    public static Result showcase(){

    	List<Card_detail_table> card_list = Card_detail_table.find.all();

    	return ok(caseview.render(card_list));
    }
}