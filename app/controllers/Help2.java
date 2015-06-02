package controllers;

import java.util.*;

import models.Card_detail_table;
import play.mvc.*;
import views.html.help.*;
import models.*;

public class Help2 extends Controller{

	public static Result helps(){

		Integer id =Integer.parseInt(session("login"));


		Stafftable depar= Stafftable.find.byId(id);
		int depa=depar.department.id;

		//List<Stafftable> depar_staff = Stafftable.find.where().eq("department.id", depa).findList();


		List<Card_detail_table> depar_staff = Card_detail_table.find.where().eq("receive.department.id", depa).eq("thanks_card_point",0).findList();


		return ok(help.render(depar_staff));
		//return TODO;
	}




	public static Result helpEva(){

		Map<String,String[]> card_list  =request().body().asFormUrlEncoded();

		Integer card_id =Integer.parseInt(card_list.get("id")[0]);
		Integer card_point =Integer.parseInt(card_list.get("point")[0]);

		Card_detail_table card =Card_detail_table.find.byId(card_id);

		card.thanks_card_point=card_point;

		card.update();
		return redirect(routes.Help2.helpEva());
	}
}
