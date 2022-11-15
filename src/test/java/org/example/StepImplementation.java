package org.example;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;

public class StepImplementation extends BaseTest {
    @Step("<second> saniye kadar bekle")
    public void waitForSecond(int second) throws  InterruptedException{
        Thread.sleep(1000*second);


    }
    @Step("Skip butonuna bas")
    public void clickAcceptbutton(){
        if (appiumDriver.findElements(By.id("com.m.qr:id/onboarding_skip_button")).isDisplayed()){
            appiumDriver.findElements(By.id("com.m.qr:id/onboarding_skip_button")).click();
            waitForSecond(3);

        }else {
            System.out.println("Skip gelmedi");
        }
    }

    @Step("<xpath> li elemena tıkla");
    public void assertElement(String xpath ,String text){
        MobileElement element = appiumDriver.findElement(By.xpath(xpath));
        element.click();
        System.out.println(element + "elemente tıklandı");


    }
    @Step("<xpath> li elemente tıkla")
    public void clickElementByXpath(String xpath, ){
        MobileElement element =appiumDriver.findElement(By.xpath(xpath));
        element.click();
        System.out.println(element +"elemenete tıkladı");
    }

    @Step("<xpath> li elemena tıkla");
    public void assertElement(String xpath ,String text) {
        MobileElement element = appiumDriver.findElement(By.xpath(xpath));
        element.click();
        System.out.println(element + "elemente tıklandı");
    }
    @Step("<xpath> li elemente tıkla")
    public void clickElementByXpath(String xpath, ){
        MobileElement element =appiumDriver.findElement(By.xpath(xpath));
        element.click();
        System.out.println(element +"elemenete tıkladı");
    }
    @Step()




}
