package MySel20Proj.MySel20Proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test  {
	
    public static void main(String[] args) {
        // 用Firefox driver创建一个新的的实例
        //注意:其他的代码依赖于界面
        //不执行
    	//System.setProperty ( "webdriver.chrome.driver","/Applications/Google Chrome.app/Contents/MacOS/Google\\ Chrome" );
        System.setProperty ("webdriver.Firefox.driver","/Applications/Firefox.app/Contents/MacOS");
        WebDriver driver = new FirefoxDriver();// 这里我们可以使用firefox来运行测试用例
        //WebDriver driver = new ChromeDriver();//这是chrome浏览器的驱动
        
        //WebDriver driver = new InternetExplorerDriver(); //这是IE浏览器的驱动
       // WebDriver driver = new HtmlUnitDriver(); //这是一个无界面测试模式，不用打开浏览器，通过后台输入来判断测试用例是否通过
        
        // 现在用这个来访问谷歌
        driver.get("http://www.baidu.com");
        // 也可以用下面的方式访问谷歌
        // driver.navigate().to("http://www.google.com");

        // 找到文本输入元件的名字
        WebElement element = driver.findElement(By.name("q"));

        // 在搜索框内输入“cheese!”
        element.sendKeys("Cheese!");

        // 现在递交表格. WebDriver会发现我们的形式元素
        element.submit();

        // 后台打印输出，检查网页的标题
        System.out.println("Page title is: " + driver.getTitle());
        
        // 谷歌的搜索是渲染过的动态JavaScript. 等待页面加载，暂停10秒
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });

        // Should see: "cheese! - Google Search"
        System.out.println("Page title is: " + driver.getTitle());
        
        //关闭浏览器
        driver.quit();
    }
}