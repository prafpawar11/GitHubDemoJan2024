package PageLayer;

public class LoginPage {

	public void loginFunctionality(String uname, String pass) {
		if (uname.equals("Admin") && (pass.equals("admin123"))) {
			System.out.println("user is on hom page ");
		} else {
			System.err.println("User is on Error page");
		}

	}

}
