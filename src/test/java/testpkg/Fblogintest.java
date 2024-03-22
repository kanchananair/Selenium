package testpkg;

import org.testng.annotations.Test;

import basepkg.Basepg;
import pagepkg.Fbloginpage;
import utilities.Excelutils;

public class Fblogintest extends Basepg{
	
	@Test
	public void verifyLoginWithValidCred () throws Exception

	{
	            Fbloginpage p1 = new Fbloginpage(driver);

	// Reading the data from excel file by the specified path

	            String xl = "C:\\Users\\lenovo\\Documents\\Book12.xlsx";

	            String Sheet = "Sheet1";

	            int rowCount = Excelutils.getRowCount(xl, Sheet);

	            for (int i=1;i<=rowCount;i++)

	            {

	                        String UserName=Excelutils.getCellValue(xl, Sheet, i, 0);
                               System.out.println("username---"+UserName);
	                        String Pwd=Excelutils.getCellValue(xl, Sheet, i, 1);
                             System.out.println("password---"+Pwd);
	                        //Passing Username and password as parameters
	                        p1.setvalues(UserName, Pwd);
                         //Submitting the data by clicking on login button                   
                             p1.clickLoginButton();
	                        
	                        
	                        
	                        String expectedurl="https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjIwMzg4MTQ0LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
	          			  String actualurl= driver.getCurrentUrl();
	          			  
	          			     if(actualurl.equals(expectedurl))
	          			     {
	          			    	System.out.println("pass");
	          			     }else
	          			     {
	          			    	System.out.println("fail");
	          			     }
	                         

	                        
	            }
}
	

}
