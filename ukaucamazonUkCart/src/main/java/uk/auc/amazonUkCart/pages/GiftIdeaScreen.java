package uk.auc.amazonUkCart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import uk.auc.amazonUkCart.framework.BaseTest;

public class GiftIdeaScreen extends BaseTest {

    private WebElement eighthGiftItem;

    public WebElement getEighthGiftItem(){ return eighthGiftItem; }

    public GiftIdeaScreen(){
        eighthGiftItem = driver.findElement(By.xpath("//*[@class='sc-1koy58b-0 jChBdP']/div[8]"));
    }
}
