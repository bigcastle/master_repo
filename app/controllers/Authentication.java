//ログインページつくろうね
//社員ＩＤとパスワードを入力する　→　認証　→　ログインできる
//Authentication　認証の意
package controllers;

import play.data.Form;
import play.mvc.*;
import views.html.authentication.*;
import play.data.validation.Constraints.*;

public class Authentication extends Controller{

	public static class Login {
		//public String staffId;
		public int staffId;
		public String passWord;


		//認証
		public String validate() {
            if (authenticate(staffId, passWord)) {
                return null;
            }
            return "Invalid username and password";
        }


		//社員ＩＤ、パスワードともにあっていればＯＫ
		private Boolean authenticate(Integer staffId, String passWord){
		//private Boolean authenticate(String staffId, String passWord){
			//return (staffId.equals("aika") && passWord.equals("mi"));
			return (staffId.equals(101304) && passWord.equals("aika"));
			//return (staffId.equals(staffId) && passWord.equals(passWord));
			//DBのデータとひかくしなきゃ
		}
	}

	public static Form<Login> loginForm = Form.form(Login.class);


	/**********************画面遷移ゾーン*************************/
	public static Result mypage(Integer staffId) {
		return ok(mypage.render());
	}


	public static Result index() {
		if (session("login") != null){
			return ok("あなたは既に" + session ("login") + "としてログインしています");
		}
		return ok(index.render(loginForm));
    }

    public static Result authenticate() {
    	Form<Login> form = loginForm.bindFromRequest();

    	if (form.hasErrors()) {
    		return badRequest(index.render(form));	//認証失敗：再度ログインページに
    	}
    	else {
    		Login login = form.get();
    		session("login", "login.staffId");

    		return redirect(routes.Authentication.mypage(login.staffId));
    	}

    }

    //ログアウトの処理
    public static Result logout() {
        session().clear();
        return redirect(routes.Authentication.index());
    }
}
