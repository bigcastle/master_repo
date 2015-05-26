package controllers;

import java.util.*;
import play.data.Form;

import play.*;
import play.mvc.*;

import models.Stafftable;
import models.Card_detail_table;
import views.html.*;

public class Application extends Controller {

	public static Form<Card_detail_table> userForm = Form.form(Card_detail_table.class);
	public static Stafftable user=new Stafftable();
	public static Card_detail_table c =new Card_detail_table ();
	public static List<String> nn=new ArrayList<String>();
    public static Result index() {



        return ok(index.render("hi"));
    }


    public static Result caseveiw(){

    	List<Card_detail_table> card =Card_detail_table.find.all();




    	return ok(Caseview.render(card, nn));
    }


}
