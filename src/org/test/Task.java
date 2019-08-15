package org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task {
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-kk\\Airline1\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.united.com/en/us");
			driver.manage().window().maximize();
			WebElement from= driver.findElement(By.xpath("//input[@id='bookFlightOriginInput']"));
	        from.sendKeys("Chennai");
			WebElement btn = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			btn.click();
			WebElement to=driver.findElement(By.xpath("//div[text()='Fairbanks, AK, US (FAI)']"));
			to.click();
			WebElement calen=driver.findElement(By.xpath("(//input[@class='DateInput_input DateInput_input_1'])[1]"));
			calen.click();
			WebElement dat=driver.findElement(By.xpath("(//td[text()='21'])[2]"));
			dat.click();
			WebElement calen1=driver.findElement(By.xpath("//input[@id='ReturnDate']"));
			calen1.click();
			WebElement dat1=driver.findElement(By.xpath("(//td[text()='30'])[3]"));
			dat1.click();
			WebElement chk=driver.findElement(By.xpath("//span[text()='Find flights']"));
			chk.click();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			WebElement sr=driver.findElement(By.xpath("//input[@aria-describedby='sr_product_MIN-BUSINESS-OR-FIRST_264-834|83|1280|167-UK']"));
			sr.click();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			WebElement btn1=driver.findElement(By.xpath("//input[@aria-describedby='sr_product_MIN-BUSINESS-OR-FIRST_303-194|1104|182|9130-AS']"));
			btn1.click();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			WebElement btn2=driver.findElement(By.xpath("//button[@class='modalCloseImg simplemodal-close']"));
			btn2.click();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			WebElement btn3=driver.findElement(By.xpath("//button[@id='btn-continue']"));
			btn3.click();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			WebElement fname=driver.findElement(By.xpath("//input[@data-val-length='First name must be no more than 30 characters.<!--EC:V142-->']"));
			fname.sendKeys("kranti");
			WebElement mid=driver.findElement(By.xpath("//input[@name='TravelerViewModels[0].MiddleName']"));
			mid.sendKeys("kk");
			WebElement lname=driver.findElement(By.xpath("//input[@data-val-length='Last name must be no more than 30 characters.<!--EC:V142-->']"));		
			lname.sendKeys("kiran");
			WebElement dropdn=driver.findElement(By.xpath("//select[@id='TravelerViewModels_0__DOB_BirthMonth']"));
			dropdn.click();
			Select s=new Select(dropdn);
			s.selectByIndex(7);
			WebElement DD=driver.findElement(By.xpath("//input[@id='TravelerViewModels_0__DOB_BirthDay']"));
			DD.sendKeys("21");
			WebElement Dy=driver.findElement(By.xpath("//input[@name='TravelerViewModels[0].DOB.BirthYear']"));
			Dy.sendKeys("1993");
			WebElement gender=driver.findElement(By.xpath("//select[@id='TravelerViewModels_0__Gender']"));
			gender.click();
			Select s1=new Select(gender);
			s1.selectByIndex(1);
			WebElement country=driver.findElement(By.xpath("//input[@id='TravelerViewModels_0__GSTBusinessInformation_GSTBusinessAddress_Country']"));
			country.sendKeys("India");
			WebElement state=driver.findElement(By.xpath("//input[@id='TravelerViewModels_0__GSTBusinessInformation_GSTBusinessAddress_State']"));
			state.sendKeys("TamilNadu");
			WebElement mob=driver.findElement(By.xpath("//input[@id='TravelerViewModels_0__PrimaryTravelerPhoneNumber_Input']"));
			mob.sendKeys("8608578638");
			WebElement mail=driver.findElement(By.xpath("//input[@autocomplete='email']"));
			mail.sendKeys("kranthikiran@gmail.com");
			WebElement con=driver.findElement(By.xpath("//button[@id='btnContinue']"));
			con.click();
			WebElement conbtn=driver.findElement(By.xpath("//button[@id='btnContinue']"));
			conbtn.click();
			
			
		}

	}



