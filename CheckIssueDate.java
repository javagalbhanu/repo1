package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;
import page.EnterTimeTrackPage;
import page.LicensePage;
import page.LoginPage;

public class CheckIssueDate extends BaseTest{
@Test(priority=3)
public void testIssueDate() throws InterruptedException {
	String un=XL.getData(XL_PATH,"CheckIssueDate",1,0);
	String pw=XL.getData(XL_PATH, "CheckIssueDate", 1,1);
	String iDate=XL.getData(XL_PATH,"CheckIssueDate", 1,2);
	//Enter valid user name
	LoginPage l=new LoginPage(driver);
	l.setUserName(un);
	//Enter valid password
	l.setPassword(pw);
	//click on login button
	l.clickLogin();
	//Click Settings
	Thread.sleep(2000);
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	e.clickSettings();
	//Click Licenses
	e.clickLicenses();
	//Verify IssueDate
	LicensePage license=new LicensePage(driver);
	license.verifyIssueDate(iDate);
}
}
