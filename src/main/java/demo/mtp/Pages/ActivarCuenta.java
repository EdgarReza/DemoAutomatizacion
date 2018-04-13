package demo.mtp.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import demo.mtp.SetUp.Driver;
import demo.mtp.Utility.Utility;


public class ActivarCuenta extends Driver {

PageObjects cuenta;
Utility elemento=new Utility();
	
	public ActivarCuenta() {
		super();
        cuenta = new PageObjects();
        PageFactory.initElements(driver, cuenta);
		
	}
	
	public void activarCuenta(String codigo) throws InterruptedException {
	  	
   	  String label=cuenta.complete_Experiencia.getText();
	  Assert.assertEquals(label, "Complete su experiencia");
   	  cuenta.btn_Acceso.click();
   	  
   	  elemento.elementoPresente(cuenta.lbl_Codigo, 15, driver);
   	  String label_codigo=cuenta.lbl_Codigo.getText();
   	  Assert.assertEquals(label_codigo, "Código de Cliente / N.° Tarjeta / N.° Cuenta");
	  
   	  cuenta.ingresar_Codigo.sendKeys(codigo);
   	  driver.hideKeyboard();
   	  Thread.sleep(2000);
   	  cuenta.btn_Continuar.click();
   	  
	}
	
	public void Deslogueo() {
		
		cuenta.hamburguesa.click();
		elemento.elementoPresente(cuenta.salir, 15, driver);
		cuenta.salir.click();
		elemento.elementoPresente(cuenta.opc_si, 15, driver);
		cuenta.opc_si.click();
		
	}
	
	class PageObjects {

        @CacheLookup
        @FindBy(id = "mx.bancosantander.supermovil:id/btn_login")
        public WebElement btn_Acceso;
        
        @CacheLookup
        @FindBy(id = "mx.bancosantander.supermovil:id/tv_app_list")
        public WebElement complete_Experiencia;
        
        @CacheLookup
        @FindBy(id = "mx.bancosantander.supermovil:id/et_account")
        public WebElement ingresar_Codigo;
        
        @CacheLookup
        @FindBy(id = "mx.bancosantander.supermovil:id/btn_continue")
        public WebElement btn_Continuar;
        
        @CacheLookup
        @FindBy(id = "mx.bancosantander.supermovil:id/tv_login_account")
        public WebElement lbl_Codigo;
        
        @CacheLookup
        @FindBy(id = "mx.bancosantander.supermovil:id/btn_drawer_menu")
        public WebElement hamburguesa;
        
        @CacheLookup
        @FindBy(id = "mx.bancosantander.supermovil:id/menu_logout")
        public WebElement salir;
        
        @CacheLookup
        @FindBy(id = "mx.bancosantander.supermovil:id/btnAccept")
        public WebElement opc_si;
    }
}