package demo.mtp.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demo.mtp.SetUp.Driver;
import demo.mtp.Utility.Utility;

public class LoginPage extends Driver {
	
	PageObjects loginPage;
	
	public LoginPage() {
		super();
        loginPage = new PageObjects();
        PageFactory.initElements(driver, loginPage);
		
	}
	
	public void Btn_Ingresar() {
		
		loginPage.btn_Ingresar.click();
				
		
	}
	
    public boolean ingresar_pass(String pass) throws InterruptedException {
		
		Utility elemento=new Utility();
		
		boolean element;
				
		elemento.elementoPresente(loginPage.binario, 15, driver);
		
		if(loginPage.binario.isDisplayed()) {
			element=true;	
		}
		
		else {
			element=false;	
		}
		
		loginPage.pass.sendKeys(pass);
		Thread.sleep(2000);
		driver.hideKeyboard();
		Thread.sleep(2000);
		loginPage.continuar.click();
		
		
		return element;
		
		
	}
	
	
	class PageObjects {

        @CacheLookup
        @FindBy(id = "mx.bancosantander.supermovil:id/btn_sign_in")
        public WebElement btn_Ingresar;
        
        @CacheLookup
        @FindBy(id = "mx.bancosantander.supermovil:id/tv_login_rsa_wellcome")
        public WebElement binario;
        
        @CacheLookup
        @FindBy(id = "mx.bancosantander.supermovil:id/et_nip")
        public WebElement pass;
        
        @CacheLookup
        @FindBy(id = "mx.bancosantander.supermovil:id/btn_continue")
        public WebElement continuar;
        
        
    }

}
