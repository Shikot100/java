package action;

import org.openqa.selenium.WebDriver;

import base.BaseAction;
import model.DeshecartModel;

public class ActionDeshecartClick extends BaseAction{
	DeshecartModel dehecartModel;
	public ActionDeshecartClick(WebDriver driver) {
		super(driver);
		dehecartModel = new DeshecartModel(driver);
	}
	public void getLogin(String id, String pwd)throws Exception{
		Thread.sleep(1000);
		dehecartModel.loginButton().click();
		Thread.sleep(1000);
		dehecartModel.uid().sendKeys("nahidbabu6@gmail.com");
		dehecartModel.password().sendKeys("nahid1234");
	}
}
