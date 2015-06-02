package controllers;

import java.util.List;

//import models.Card_detail_table;
import play.mvc.*;
//import models.Stafftable;
import models.*;
import views.html.mypage.*;

public class Mypage extends Controller{

	@Security.Authenticated(Secured.class)

	public static Result mypage(Integer staffId) {

		//Stafftable user = Stafftable.find.byId((int)staffId);
		//Stafftable user.Cdt_s = Stafftable.find.byId((int)staffId);
		Department_table boss = Department_table.find.where().eq("BOSS_ID", staffId).findUnique();
		Stafftable authority = Stafftable.find.where().eq("id", staffId).findUnique();

		List<Card_detail_table> receive_card = Card_detail_table.find.where().eq("receive_id", staffId).findList();
		List<Card_detail_table> send_card = Card_detail_table.find.where().eq("send_id", staffId).findList();
		return ok(mypage.render(boss, authority, receive_card, send_card));
	}


	/*@Security.Authenticated(Secured.class)
	public static Result help(){
		return ok(help.render());
	}*/

	public static Result popup(Integer id){
		//Card_detail_table card_ditail = Card_detail_table.find.byId((int)id);
		List<Card_detail_table> card_ditail = Card_detail_table.find.where().eq("id", id).findList();
		return ok(popup.render(card_ditail));
	}

/*
	public static Result total(){
		return ok(total.render());
	}
*/
	//全件表示
	/*	public static Result mypage(Integer staffId) {
		List<Card_detail_table> card_list = Card_detail_table.find.all();
		return ok(mypage.render(card_list));
	}

*/}
