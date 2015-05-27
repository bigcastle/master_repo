package controllers;

import play.*;
import play.mvc.*;
import models.Stafftable;
import models.Card_detail_table;
import models.DEPARTMENT_TABLE;
import models.Thanks_card_table;
import views.html.*;

import java.util.List;

public class Application extends Controller {

    public static Result index() {


        return ok(index.render("hi"));
    }





}
