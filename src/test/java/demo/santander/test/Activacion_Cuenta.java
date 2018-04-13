package demo.santander.test;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import demo.mtp.Pages.LoginPage;
import demo.mtp.Pages.ActivarCuenta;
import demo.mtp.SetUp.SetUp;
import demo.mtp.Utility.Utility;


public class Activacion_Cuenta {
	
	 
	@BeforeClass
	public void Inicio() throws MalformedURLException {
	SetUp inicio=new SetUp();
	inicio.setUp();
	
		
	}
	
	@Test
	    public void testActivarCuenta() throws Exception
	    {
		    LoginPage pass=new LoginPage();
	        ActivarCuenta cuenta = new ActivarCuenta();
	        Utility.setExcelFile();
			String codigo = Utility.getCellData(1, 0);
	        cuenta.activarCuenta(codigo);
	        Utility.setExcelFile();
			String password = Utility.getCellData(1, 1);
	        pass.ingresar_pass(password);
	        cuenta.Deslogueo();
	        
     }
	
	@AfterClass
	public void terminar() {
		SetUp terminar=new SetUp();	
		terminar.End();
	}
	
	
	
}
