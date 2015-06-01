package controllers;


import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import models.Card_detail_table;
import models.Stafftable;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.evaluation;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlQuery;
import com.avaje.ebean.SqlRow;


public class Total extends Controller{

	public static Result total(){
		int i =0;
		int total=0;

		List<Card_detail_table> card=Card_detail_table.find.all();

		List<Stafftable> staff = Stafftable.find.all();
		total =0;

		return ok(evaluation.render(card,staff,total,i));


	}
	public static Result newtotal(){
		List<Stafftable> staff = Stafftable.find.all();
		Map<String, String[]> params = request().body().asFormUrlEncoded();
		Integer id = Integer.parseInt(params.get("id")[0]);
		Stafftable staff_id = Stafftable.find.byId(id);
		int total=0;
		int i =1;
		List<Card_detail_table> card = Card_detail_table.find.where().eq("receive",staff_id).findList();
	//	List<Card_detail_table> total_point = Card_detail_table.find.where().eq("receive",staffpoint).findList();
		for(int j=0;j<card.size();j++){
			total +=card.get(j).thanks_card_point;
		}
	//	SqlQuery totalp = Ebean.createSqlQuery("SELECT SUM(thanks_card_point) FROM Card_detail_table");

		return ok(evaluation.render(card,staff,total,i));
	}


}
