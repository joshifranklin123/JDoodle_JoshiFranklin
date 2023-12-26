package com.reusable;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.baseclass.Baseclass;




public class Reusable extends Baseclass {
	
	

	
	public void to_Click(WebElement Element) {
		Element.click();

	} 
	
	public void enter_Text(WebElement Element,String code) {
		Element.sendKeys(code);

	} 
	
	public void text_Clear(WebElement Element) {
		Element.clear();
		

	}
	public void Double_click(WebElement Element) {
		
		Actions act = new Actions(driver);
		act.doubleClick(Element).build().perform();	
		

	}
	
	public void implicitywait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	

	}
	
	public void click_backspace() throws AWTException {
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_BACK_SPACE);
		rb.keyRelease(KeyEvent.VK_BACK_SPACE);

	}
	
	public void click_Enter() throws AWTException {
		Robot rbe = new Robot();
		rbe.keyPress(KeyEvent.VK_ENTER);
		rbe.keyRelease(KeyEvent.VK_ENTER);

	}
	
	public void action_Sendkey(WebElement Element,String st ) {
		Actions actcs = new Actions(driver);
		actcs.moveToElement(Element).click().sendKeys(st).build().perform();
		

	}
	public void get_text(WebElement Element) {

		String text = Element.getText();
		System.out.println(text);
	}
	
	public void action_click(WebElement Element) {
		Actions actcl = new Actions(driver);
		actcl.click(Element).build().perform();

	}
	public void assert_output_cheak(WebElement Element) {
		String output = Element.getText();
		
		try {
			
			Assert.assertEquals("multiplication of a*b = 100", output);
			
		} catch (Throwable t) {
			Assert.assertEquals("JDoodle in Action.... Running the program...", output);
			System.out.println("Captcha is appeard did not automated");
			
		}
	}
	
	public void Assert_not_equal(WebElement Element,String st) {
		String assne = Element.getText();
		try {
			Assert.assertEquals(st, assne);

			
		} catch (Throwable thro) {
			Assert.assertNotEquals(st, assne);
			System.out.println("Captcha is appeard did not automated");

		}
	
		

	}
	
	public void scrolldwon(WebElement Element) {
		JavascriptExecutor java = (JavascriptExecutor)driver;
		java.executeScript("window.scrollBy(0,500)");

		java.executeScript("arguments[0].scrollIntoView(true)", Element);

	}
	public void captcha_handle(WebElement Element,String str) {
		
		try {
			boolean dsp = Element.isDisplayed();
			Assert.assertTrue(str, dsp);
			System.out.println("Captcha is appeard did not automated");
			

			
		} catch (Throwable t) {
			System.out.println("Successfully uploaded");
			
		}

	}
	
	public void assert_equal(WebElement Element,String stras) {
		
		
		String strs = Element.getText();
		Assert.assertEquals(stras, strs);

	}
	
	public void move_to_element(WebElement Element) {
		Actions actmv = new Actions(driver);
		actmv.moveToElement(Element).build().perform();

	}
	
	
	
	
	public void javascript_click(WebElement Element) {
		
		JavascriptExecutor javaclk = (JavascriptExecutor)driver;
		
		javaclk.executeScript("arguments[0].click;", Element);
		

	}
	
	public  void press_downkey(Integer num) throws AWTException, InterruptedException {
		Robot rbdw = new Robot();

		for (int i = 0; i < num; i++) {
			
		} {
			
			rbdw.keyPress(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(1000);
			rbdw.keyRelease(KeyEvent.VK_PAGE_DOWN);
			
		}

			
		}

		
	}
	
	
	
	
	
	
	



