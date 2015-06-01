package controllers;

import play.*;
import play.mvc.*;
import models.*;
import views.html.*;

import java.text.DateFormat;
import java.util.*;

public class Showcase extends Controller {

    public static Result showcase(){

    	//先月が何月かを取得
    	Date dDate = new Date();
    	String sysDateYMD = DateFormat.getDateInstance(DateFormat.LONG,Locale.JAPAN).format(dDate).replaceAll("/","");
    	Calendar calc = Calendar.getInstance();
    	calc.set(Integer.parseInt(sysDateYMD.substring(0,4)),Integer.parseInt(sysDateYMD.substring(4,6)) -1 ,1);
    	calc.add(Calendar.DATE,-1);
    	String lastDayYMD = DateFormat.getDateInstance(DateFormat.LONG,Locale.JAPAN).format(calc.getTime());

    	//YYYY/MMを取得
    	String last_M=lastDayYMD.substring(0, 7);

    	String last =last_M+"%";


    	List<Card_detail_table> card_list = Card_detail_table.find.where()
    			.like("thanks_card_date ", last).orderBy("thanks_card_date desc").findList();


    	List<Card_detail_table> ex_card = Card_detail_table.find.where().gt("thanks_card_point",8)
    			.like("thanks_card_date ", last).orderBy("thanks_card_point desc,thanks_card_date desc").findList();


    	return ok(showcase.render(card_list,ex_card));
    }

}