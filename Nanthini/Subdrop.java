package Subpac2;

public class Subdrop {
		 public static void main(String[] args) { 
		     WebDriver driver= null;
		      String projectPath=System.getProperty("user.dir");
		      System.out.println("Project path is: " +projectPath);
		      System.setProperty("webdriver.chrome.driver",projectPath+
		      "/src/test/resources/drivers/chromedriver.exe"); 
		      driver = new ChromeDriver();
		        String baseURL = "http://demo.guru99.com/test/newtours/register.php";
		        driver.get(baseURL);
		        Select dropdown = new Select(driver.findElement(By.name("country")));
		        List<WebElement> dd = dropdown.getOptions();
		        System.out.println(dd.size());
		        for (int j = 0; j < dd.size(); j++) {
		            System.out.println(dd.get(j).getText());

		 

		        }
		        driver.close();
		 }
		}

}
