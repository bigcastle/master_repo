package controllers;
import java.util.List;

import play.data.Form;
import play.mvc.*;
import views.html.Mypage;
import views.html.thanks_card;



public class Create extends Controller {

	public static Result thanks_card() {
	    return ok(thanks_card.render());
	}


	public static Result Mypage(){
    	return ok(Mypage.render());
    }

	public static Result create_card(){

	}
}
