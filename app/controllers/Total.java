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
		Stafftable staff_id = new Stafftable();
		List<Card_detail_table> card=Card_detail_table.find.all();

		List<Stafftable> staff = Stafftable.find.all();
		total =0;

		return ok(evaluation.render(card,staff,total,i,staff_id));


	}

	public static Result newtotal(){
		List<Stafftable> staff = Stafftable.find.all();

		Map<String, String[]> params = request().body().asFormUrlEncoded();
		Integer id = Integer.parseInt(params.get("id")[0]);
		Stafftable staff_id = Stafftable.find.byId(id);

		int total=0;
		int i =1;

		Calendar calendar = Calendar.getInstance();
	    int year = calendar.get(Calendar.YEAR);
	    String day_years = year+"%";



	    List<Card_detail_table> card = Card_detail_table.find.where().eq("receive",staff_id).like("thanks_card_date ", day_years).findList();

		for(int j=0;j<card.size();j++){
			total +=card.get(j).thanks_card_point;
		}





		return ok(evaluation.render(card,staff,total,i,staff_id));
	}




}