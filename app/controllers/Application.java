package controllers;

import play.*;
import play.mvc.*;

//import models.Stafftable;

import views.html.*;

public class Application extends Controller {

    public static Result index() {


        return ok(index.render("hi"));
    }


}
