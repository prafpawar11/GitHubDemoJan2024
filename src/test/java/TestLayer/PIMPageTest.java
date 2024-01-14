package TestLayer;

import PageLayer.PIMPage;

public class PIMPageTest {

	public static void main(String[] args) {

		PIMPage pimpage = new PIMPage();

		if (pimpage.getUrl().contains("pim")) {
			System.out.println("URL TC Pass");
		} else {
			System.out.println("URL TC fail");
		}

		pimpage.clickonAddEmployee();

		pimpage.searchEmployee();

		pimpage.deleteEmployee();
		
		pimpage.validateEmployeeDelete();
	}

}
