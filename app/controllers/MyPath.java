package controllers;

import play.mvc.*;
import views.html.*;

public class MyPath extends Controller {

	public Result index() {
		return ok(mypath.render("Here's my route!"));
	}
}
