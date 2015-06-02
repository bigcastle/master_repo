package controllers;

import play.*;
import play.data.Form;
import play.mvc.*;
import models.*;
import views.html.*;

import java.util.List;
import java.util.Map;

public class Create extends Controller {

    public static Result create(){

    	//Integer id = Integer.parseInt(session("login"));
    	List<Stafftable> staff_list = Stafftable.find.all();
    	List<Department_table> department_list = Department_table.find.all();




    	return ok(create.render(staff_list,department_list));
    }


    public static Result cardcreate(){

    	Integer id = Integer.parseInt(session("login"));
    	Map<String,String[]> card =request().body().asFormUrlEncoded();

    	Card_detail_table newcard = new Card_detail_table();

    	newcard.thanks_card_date = card.get("date")[0];

        Integer re_staff =Integer.parseInt(card.get("name")[0]);
    	Stafftable re_staff2 =Stafftable.find.byId(re_staff);
    	newcard.receive= re_staff2;

    	Integer se_staff = id ;
    	Stafftable se_staff2 =Stafftable.find.byId(se_staff);
    	newcard.send=se_staff2;

    	newcard.thanks_card_help = card.get("comment")[0];
    	newcard.thanks_card_word = card.get("thanks_card")[0];

    	newcard.thanks_card_point = 0;
    	newcard.thanks_card_totalpoint =0;

    	newcard.save();



    	//Card_detail_table newcard =Form.form(Card_detail_table.class).bindFromRequest().get();
    	//newcard.save();
    	return redirect(routes.Create.cardcreate());
    }


}