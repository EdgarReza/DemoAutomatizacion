package demo.mtp.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import demo.mtp.SetUp.Driver;
import demo.mtp.Utility.Utility;
import junit.framework.Assert;

public class Cuentas extends Driver {

PageObjects cuentas;
	
	public Cuentas() {
		super();
        cuentas = new PageObjects();
        PageFactory.initElements(driver, cuentas);
		
	}
	
	public void consultaCuentas() throws InterruptedException {
       
        Utility elemento=new Utility();
						
		elemento.elementoPresente(cuentas.mis_finanzas, 15, driver);
		
		String cuenta=cuentas.mis_finanzas.getText();
		System.out.println(cuenta);
		Assert.assertEquals("Mis finanzas", cuenta);
		
		String mov=cuentas.movimientos.getText();
		System.out.println(mov);
		Assert.assertEquals("Movimientos", mov);

		String trans=cuentas.transferencia.getText();
		System.out.println(trans);
		Assert.assertEquals("Realizar transferencia", trans);
		
		String pagos=cuentas.pagos.getText();
		System.out.println(pagos);
		Assert.assertEquals("Realizar pagos", pagos);
		
		String asociar=cuentas.asociar_cuenta.getText();
		System.out.println(asociar);
		Assert.assertEquals("Asociar cuenta a número celular", asociar);
		
		String info=cuentas.info_cuenta.getText();
		System.out.println(info);
		Assert.assertEquals("Información de la cuenta", info);
		
		driver.swipe(212, 950, 212, 200, 1000);
		
		String alias=cuentas.cambiar_alias.getText();
		System.out.println(alias);
		Assert.assertEquals("Cambiar alias", alias);
		
	}
	
	class PageObjects {

        @CacheLookup
        @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView")
        public WebElement mis_finanzas;
       
        
        @CacheLookup
        @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.TextView")
        public WebElement movimientos;
       
        
        @CacheLookup
        @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.TextView")
        public WebElement transferencia;
        
        @CacheLookup
        @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[4]/android.widget.TextView")
        public WebElement pagos;
        
        
        @CacheLookup
        @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[5]/android.widget.TextView")
        public WebElement asociar_cuenta;
        
        @CacheLookup
        @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[6]/android.widget.TextView")
        public WebElement info_cuenta;
        
        @CacheLookup
        @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[7]/android.widget.TextView")
        public WebElement cambiar_alias;
            
        
        
        
    }
	
}

