package TestLayer;

import PageLayer.HomePage;

public class HomePageTest {

	
	public static void main(String[] args) {
		
		HomePage homepage=new HomePage();
		
		String a = homepage.getTitle();
		if(a.equals("facebook"))
		{
			System.out.println("Title TC Pass");
		}
		else
		{
			System.err.println("Title TC Fail");
		}
		
		String b = homepage.getCurrentUrl();
		
		if(b.contains("book"))
		{
			System.out.println("Url TC is Pass");
		}
		else
		{
			System.err.println("URL TC is fail");
		}
	}
	
}
