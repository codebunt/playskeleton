package controllers;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class HomeController extends Controller {

	public Result index() throws Exception {
		return ok();
	}

}
