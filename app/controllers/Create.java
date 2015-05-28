package controllers;
import java.util.List;
import java.util.Map;

import models.Card_detail_table;
import play.data.Form;
import play.mvc.*;
import views.html.index;
import views.html.thanks_card;



public class Create extends Controller {

	public static Result thanks_card(){
		List<Card_detail_table> taskList = Card_detail_table.find.all();
	    return ok(thanks_card.render(taskList));
	}
	public static Result index(){
		return ok(index.render("konn"));
	}
	public static Result create_card(){
		 Map<String, String[]> params = request().body().asFormUrlEncoded();

		
		Card_detail_table create = new Card_detail_table();
		create.thanks_card_date =params.get("date")[0];
		create.save();
		create.thanks_card_help =params.get("comment")[1];
		create.save();
		create.thanks_card_word =params.get("thanks_card")[2];
		create.save();
		return redirect(routes.Create.index());
	}
	
	




}
