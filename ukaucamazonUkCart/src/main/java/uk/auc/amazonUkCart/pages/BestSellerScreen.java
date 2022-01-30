package uk.auc.amazonUkCart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import uk.auc.amazonUkCart.framework.BaseTest;

public class BestSellerScreen extends BaseTest {
    private WebElement firstBook;
    private WebElement fourthBook;

    public WebElement getFirstBook(){ return firstBook; }
    public WebElement getFourthBook(){ return fourthBook; }

    public BestSellerScreen(){
        firstBook = driver.findElement(By.xpath("//*[@id='anonCarousel1']/ol/li[1]/div[2]/div/a[2]/span"));
        fourthBook = driver.findElement(By.xpath("//div[@id='anonCarousel1']/ol/li[4]/div[2]/div/a[1]"));
    }
}
