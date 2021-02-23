package Subpac2;


	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.List;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	 


	public class sub1 {
	    
	 
	    public static void main(String[] args) throws IOException{
	        WebDriver driver = null;
	        String projectPath=System.getProperty("user.dir");
	        System.out.println("Project path is: " +projectPath);
	        System.setProperty("webdriver.chrome.driver",projectPath+
	        		" C:\\Users\\training\\Desktop\\Sub2\\Sub2\\src\\main\\resources\\driver\\chromedriver.exe"); 
	        driver = new ChromeDriver();
	        System.out.println("Driver Open");

	 

	        driver.get("https://maveric-systems.com/");
	        driver.manage().window().maximize();
	        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

	 

	        for(WebElement link:allLinks){
	            System.out.println(link.getText() + " - " + link.getAttribute("href"));
	        }
	         driver.close();
	            driver.quit();
	}}

