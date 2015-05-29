package controllers;

import java.util.List;
import java.util.Map;

import com.avaje.ebean.Ebean;

import models.Stafftable;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.evaluation;
import models.Card_detail_table;

public class Total extends Controller{

	public static Result total(){
		return ok(evaluation.render());

	}
	public static Result newtotal(){
		Map<String, String[]> params = request().body().asFormUrlEncoded();
		Integer point = Integer.parseInt(params.get("id")[0]);
		Stafftable staffpoint = Stafftable.find.byId(point);
		
		
		List<Card_detail_table> card = Card_detail_table.find.where().eq("receive","staffpoint").findList();
		List<Card_detail_table> total_point = Card_detail_table.find.where().eq("receive","staffpoint").findList();
		total_point = Ebean.createSqlQuery("SELECT SUM(thanks_card_point) FROM Card_detail_table").findlist();
		
		
	}


}
