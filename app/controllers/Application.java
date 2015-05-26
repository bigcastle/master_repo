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


    	return ok(Caseview.render(card_list, card_id));
    }



}
