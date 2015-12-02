package test51com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;	
import org.openqa.selenium.support.ui.WebDriverWait;


public class ByUserId {  
	  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        WebDriver dr = new FirefoxDriver();  
        dr.get("http://adminq.700paper.cn/index");  
          
        WebElement elementName = dr.findElement(By.id("txtUserName"));
        System.out.println(elementName.getAttribute("value")); 	
        System.out.println(elementName.getTagName());
        
        
        WebElement elementPassword = dr.findElement(By.id("txtPassword"));
        System.out.println(elementPassword.getAttribute("value")); 
        //System.out.println(elementPassword.getTagName());
       
        
        //关闭浏览器
        dr.quit();
    }
}


