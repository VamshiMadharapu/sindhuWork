package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class SpinLoadChangesTo implements ExpectedCondition<Boolean> {
    String state;

    public SpinLoadChangesTo(String state){
        super();
        this.state = state;
    }

    @Override
    public Boolean apply(WebDriver driver) {
        if (driver.findElement(By.xpath("//*[@id='overlay-container'][@class='overlayContainer']")).getAttribute("style").equals(state)){
            return Boolean.TRUE;
        }
        else {
            System.out.println("current spin state: " + driver.findElement(By.xpath("//*[@id='overlay-container'][@class='overlayContainer']")).getAttribute("style"));
        }
        return null;
    }
}
