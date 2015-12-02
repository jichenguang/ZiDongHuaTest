package test51com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

  
public class ByClassName {  
  
     
    public static void main(String[] args) {  
         WebDriver dr = new FirefoxDriver();  
        dr.get("http://www.51.com");  
         WebElement element = dr.findElement(By.className("t"));  
         System.out.println(element.getTagName()); 
         //关闭浏览器
         dr.quit();
  
    }  
}  