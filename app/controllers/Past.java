package controllers;


import play.*;
import play.data.Form;
import play.mvc.*;
import models.*;
import views.html.*;

import java.util.List;
import java.util.Map;

public class Past extends Controller {

	public static Result past(){

		List<Card_detail_table> card_list = Card_detail_table.find.all();
		List<Department_table> department_list = Department_table.find.all();

		card_list = Card_detail_table.find.where().orderBy("thanks_card_date desc").findList();

		return ok(past.render(card_list,department_list));
	}


}