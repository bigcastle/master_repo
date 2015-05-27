package controllers;

import play.*;
import play.mvc.*;
import models.Stafftable;
import models.Card_detail_table;
import models.DEPARTMENT_TABLE;
import models.Thanks_card_table;
import views.html.*;

import java.util.List;

public class Application extends Controller {

    public static Result index() {


        return ok(index.render("hi"));
    }



    public static Result caseview(){
    	List<Card_detail_table> card_list = Card_detail_table.find.all();

    	Card_detail_table card =Card_detail_table.find.byId(1);
    	Thanks_card_table card_id =Thanks_card_table.find.byId(card.THANKS_CARD_RECEIVE);
    	Stafftable staff_id =Stafftable.find.byId(card_id.STAFF_ID);
    	DEPARTMENT_TABLE department_id =DEPARTMENT_TABLE.find.byId(staff_id.DEPARTMENT_ID);
    	return ok(caseview.render(card_list,card_id));
    }



}
