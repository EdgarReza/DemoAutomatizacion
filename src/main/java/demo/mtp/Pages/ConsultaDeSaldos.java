package demo.mtp.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import demo.mtp.SetUp.Driver;
import junit.framework.Assert;

public class ConsultaDeSaldos extends Driver {

PageObjects consulta;
	
	public ConsultaDeSaldos() {
		super();
        consulta = new PageObjects();
        PageFactory.initElements(driver, consulta);
		
	}
	
	public void consultaSaldo(String nombre, String monto) throws InterruptedException {
       
		
		String cuenta=consulta.cuenta_pesos.getText();
		System.out.println(cuenta);
		Assert.assertEquals("Cuentas en pesos", cuenta);
		String credito=consulta.tarjeta_credito.getText();
		System.out.println(credito);
		Assert.assertEquals("Tarjetas de crédito", credito);
		String dinero=consulta.dinero_creciente.getText();
		Assert.assertEquals("Dinero Creciente", dinero);
		String inversiones=consulta.inversion_plazo.getText();
		Assert.assertEquals("Inversiones plazo", inversiones);
		
		Thread.sleep(4000);
		consulta.click_tar_credito.click();
		Thread.sleep(2000);
		consulta.click_dinero_creciente.click();
		
		String nombre2=consulta.nombre_cuenta.getText();
		System.out.println(nombre);
		Assert.assertEquals(nombre, nombre2);
		
		String monto2=consulta.monto.getText();
		String montoCorto = monto.substring(0, monto2.length() - 4);
		System.out.println(montoCorto);
		Assert.assertEquals(monto, montoCorto);
		
		consulta.super_nomina.click();
		
	}
	
	class PageObjects {

        @CacheLookup
        @FindBy(id = "mx.bancosantander.supermovil:id/tv_title_actionbar")
        public WebElement lbl_saldos;
       
        
        @CacheLookup
        @FindBy(id = "mx.bancosantander.supermovil:id/tv_name")
        public WebElement nombre_cuenta;
       
        
        @CacheLookup
        @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[2]")
        public WebElement monto;
        
        @CacheLookup
        @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
        public WebElement cuenta_pesos;
        
        
        @CacheLookup
        @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.TextView")
        public WebElement tarjeta_credito;
        
        @CacheLookup
        @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.TextView")
        public WebElement dinero_creciente;
        
        @CacheLookup
        @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[5]/android.widget.TextView")
        public WebElement inversion_plazo;
        
        
        @CacheLookup
        @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]")
        public WebElement click_tar_credito;
       
        @CacheLookup
        @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[5]/android.widget.ImageView")
        public WebElement click_dinero_creciente;
        
        @CacheLookup
        @FindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]")
        public WebElement super_nomina;
        
        
        
        
    }
	
}
