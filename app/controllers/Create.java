package controllers;
import java.util.List;

import models.Card_detail_table;
import play.data.Form;
import play.mvc.*;
import views.html.Mypage;
import views.html.thanks_card;



public class Create extends Controller {

	public static Result thanks_card() {
	List<Card_detail_table> thanks = Card_detail_table.find.all();
	Card_detail_table = thanks;
			Card_detail_table.save();
	    return ok(thanks_card.render());
	}


	public static Result Mypage(){
    	return ok(Mypage.render());
    }


}
