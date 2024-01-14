package TestLayer;

import PageLayer.LoginPage;

public class LoginPageTests {

	public static void main(String[] args) {

		LoginPage login = new LoginPage();

		login.loginFunctionality("Admin", "admin123");

	}
}
