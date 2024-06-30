import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		driver.get("https://mail.google.com/mail");

		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("hospitaltestscript@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();

		WebElement passwd = driver.findElement(By.xpath("//input[@name='Passwd']"));
		passwd.sendKeys("Hospital123");
		driver.findElement(By.xpath("//span[text()='Next']")).click();

		WebElement compose = driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']"));
		compose.click();

		WebElement toAddress = driver.findElement(By.xpath("//input[@aria-label='To recipients']"));
		toAddress.sendKeys("hospitaltestscript@gmail.com");

		WebElement subject = driver.findElement(By.name("subjectbox"));
		subject.sendKeys("Test Mail");

		WebElement bodyField = driver.findElement(By.cssSelector("div[aria-label='Message Body']"));
		bodyField.sendKeys("Test Email Body");

		WebElement moreOptionsButton = driver.findElement(By.cssSelector("div[aria-label='More options']"));
		moreOptionsButton.click();

		Actions act = new Actions(driver);
		WebElement labelButton = driver.findElement(By.xpath("//div[text()='Label']"));
		act.moveToElement(labelButton).click().perform();

		WebElement socialLabel = driver.findElement(By.xpath("//div[@title='Social' and @role='menuitemcheckbox']"));
		socialLabel.click();

		WebElement sendButton = driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']"));
		sendButton.click();

		WebElement inboxLink = driver.findElement(By.xpath("//a[text()='Inbox']"));
		inboxLink.click();

		WebElement selectSocial = driver.findElement(By.xpath("//div[@aria-label='Social']"));
		selectSocial.click();

		WebElement received = driver.findElement(By.xpath("(//span[text()='Test Email Body'])[1]"));
		received.click();

		WebElement starIcon = driver.findElement(By.xpath("//span[@class='T-KT']"));
		starIcon.click();
		
		driver.quit();
	}

}
