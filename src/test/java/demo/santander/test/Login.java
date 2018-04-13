package demo.santander.test;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import demo.mtp.Pages.ActivarCuenta;
import demo.mtp.Pages.ConsultaDeSaldos;
import demo.mtp.SetUp.SetUp;
import demo.mtp.Utility.Utility;
import demo.mtp.Pages.*;


import junit.framework.Assert;

public class Login {
	
	 
	@BeforeClass
	public void Inicio() throws MalformedURLException {
	SetUp inicio=new SetUp();
	inicio.setUp();
	
		
	}
	
	@Test
	    public void testLogin() throws Exception
	    {
	        LoginPage loginPage = new LoginPage();
	        ConsultaDeSaldos consulta=new ConsultaDeSaldos();
	        Cuentas cuenta=new Cuentas();
	        ActivarCuenta salir=new ActivarCuenta();
	        
	        Utility.setExcelFile();
			String pass = Utility.getCellData(1, 1);
			loginPage.Btn_Ingresar();
	        boolean prueba=loginPage.ingresar_pass(pass);
	        Assert.assertTrue(prueba);
	        
	        Utility.setExcelFile();
			String nombre = Utility.getCellData(1, 2);
			
			String monto = Utility.getCellData(1, 3);
	        consulta.consultaSaldo(nombre,monto);
	        
	        cuenta.consultaCuentas();
	        salir.Deslogueo();

     }
	
	@AfterClass
	public void terminar() {
		//SetUp terminar=new SetUp();	
		//terminar.End();
	}
	
	
	
}
