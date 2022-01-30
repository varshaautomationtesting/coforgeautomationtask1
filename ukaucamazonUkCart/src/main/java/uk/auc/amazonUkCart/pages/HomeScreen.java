package uk.auc.amazonUkCart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import uk.auc.amazonUkCart.framework.BaseTest;

public class HomeScreen extends BaseTest {

    private WebElement allMenuTab;
    private WebElement bestSellersTab;
    private WebElement basketIcon;
    private WebElement giftIdeasTab;
    private WebElement todaysDealTab;
    private WebElement searchTextfield;

    public WebElement getAllMenuTab(){ return allMenuTab; }
    public WebElement getBestSellersTab(){ return bestSellersTab; }
    public WebElement getBasketIcon(){ return basketIcon; }
    public WebElement getGiftIdeasTab(){ return giftIdeasTab; }
    public WebElement getTodaysDealTab(){ return todaysDealTab; }
    public WebElement getSearchTextfield(){ return searchTextfield; }

    public HomeScreen(){
        allMenuTab = driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']/span"));
        bestSellersTab = driver.findElement(By.xpath("//*[@class='nav-a  ']"));
        basketIcon = driver.findElement(By.xpath("//*[@id='nav-cart']"));
        giftIdeasTab = driver.findElement(By.xpath("//*[@class='nav-progressive-content']/a[3]"));
        todaysDealTab = driver.findElement(By.xpath("//*[@class='nav-progressive-content']/a[5]"));
        searchTextfield = driver.findElement(By.xpath("//*[@id='nav-search']"));
    }
}
