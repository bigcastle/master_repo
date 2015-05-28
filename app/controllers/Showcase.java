package controllers;

import play.*;
import play.mvc.*;
import models.*;

import views.html.*;

import java.util.List;

public class Showcase extends Controller {

    public static Result showcase(){

    	List<Card_detail_table> card_list = Card_detail_table.find.all();
    	List<Card_detail_table> ex_card = Card_detail_table.find.all();
    	ex_card = Card_detail_table.find.where().orderBy("thanks_card_point desc,thanks_card_date desc").findList();
    	//ex_card = Card_detail_table.find.where().orderBy("thanks_card_date").findList();

    	return ok(showcase.render(card_list,ex_card));
    }
}