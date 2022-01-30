package uk.auc.amazonUkCart.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;

    public void initialise() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\varsha.pervaram\\ukaucamazonUkCart\\chromedriver.exe");
        driver = new ChromeDriver();

        //Implicit wait has been implemented to wait for Browser to instantiate
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.amazon.co.uk/");
        driver.findElement(By.xpath("//span[@class='a-button a-button-primary']")).click();
        driver.manage().window().maximize();
    }

    public void bestSellers(){
        driver.getPageSource().contains("Amazon Best Sellers");
    }

    public void addToBasket(){
        driver.findElement(By.cssSelector("input#add-to-cart-button")).click();
        System.out.println("Added first best seller to basket");
        driver.findElement(By.cssSelector("#sw-gtc > span")).click();
    }

    public void deleteLinkFirstBestSeller(){
        System.out.println("Deleting the first best seller from basket");
        driver.findElement(By.xpath("//*[@class='a-size-small sc-action-delete']")).click();
    }

    public void basket(){
        driver.getPageSource().contains("Your Amazon Basket is empty.");
        System.out.println("Empty basket message verified.");
    }

    public void giftIdea(){
        driver.getPageSource().contains("Gifts for Everyone");
    }

    public void addToBasketSideSheet(){
        driver.findElement(By.cssSelector("input#add-to-cart-button")).click();
        System.out.println("User verifies item added in sidesheet section");
        //Clicking on Basket button from sidesheet section
        driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button']")).click();
    }

    public void eighthGiftIdeaInBasket(){
        driver.findElement(By.xpath("//*[@class='a-section a-spacing-mini sc-list-body sc-java-remote-feature']")).isDisplayed();
    }

    public void buttonAddToBasket(){
        driver.findElement(By.cssSelector("input#add-to-cart-button")).click();
    }

    public void itemAddedInBasket(){
        driver.findElement(By.xpath("//*[@id='attachSiAddCoverage']/span/input")).click();
    }

    public void basketButton(){
        driver.findElement(By.xpath("//*[@id='attach-sidesheet-view-cart-button']/span/input")).click();
    }

    public void clickNoThanks(){
        System.out.println("User clicks on no thanks button in sidesheet");
        driver.findElement(By.cssSelector("#attachSiNoCoverage > span > input")).click();
    }

    public void saveForLater(){
        System.out.println("Saved the best seller for later from basket");
        driver.findElement(By.xpath("//*[@class='a-size-small sc-action-save-for-later']")).click();
    }

    public void laptopEnteredAsSearchText(){
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("div.nav-search-field>input#twotabsearchtextbox.nav-input")).sendKeys("Laptop");
        driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.getPageSource().contains("RESULTS");
        driver.findElement(By.xpath("//*[@class='a-section']/div/div[2]/div/div/div/h2/a/span")).click();
    }

    public void searchProduct(){
        Actions action = new Actions(driver);
        driver.findElement(By.cssSelector("div.nav-search-field>input#twotabsearchtextbox.nav-input")).sendKeys("game for kids");
        action.moveToElement(driver.findElement(By.cssSelector("div.nav-search-field>input#twotabsearchtextbox.nav-input"))).sendKeys(Keys.ENTER).build().perform();
    }

    public void firstGameSelected(){
        driver.getPageSource().contains("RESULTS");
        driver.findElement(By.xpath("//*[@id='search']/div/div/div/span[3]/div[2]/div[3]")).click();
    }

    public void addToBasketOnSide(){
        //Clicking on Basket button from sidesheet pane
        driver.findElement(By.xpath("//*[@id='attachSiAddCoverage']/span/input")).click();
    }

    public void quitApp(){
        driver.quit();
    }
}
