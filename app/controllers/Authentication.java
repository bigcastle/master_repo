//ログインページつくろうね
//社員ＩＤとパスワードを入力する　→　認証　→　ログインできる
//Authentication　認証の意
package controllers;

import models.Stafftable;
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
			return Stafftable.authenticate(staffId, passWord);
		}
	}

	public static Form<Login> loginForm = Form.form(Login.class);

	public static Result index() {
		if (session("login") != null){
			//return redirect(routes.Mypage.mypage(login.staffId));
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
    		int a=login.staffId;
    		String b=String.valueOf(a);
    		session("login", b);


    		//return redirect(routes.Mypage.mypage(session("login")));
    		return redirect(routes.Mypage.mypage());
    	}

    }

    //ログアウトの処理
    public static Result logout() {
        session().clear();
        return redirect(routes.Authentication.index());
    }
}
