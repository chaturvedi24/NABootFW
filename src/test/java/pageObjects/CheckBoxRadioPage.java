package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckBoxRadioPage {

    public CheckBoxRadioPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".ui-checkboxradio-radio-label>span.ui-checkboxradio-icon") //to get counts
    List<WebElement> allRadios;

    @FindBy(xpath = "//legend[text()='Hotel Ratings: ']/following-sibling::label[contains(@for,'checkbox')]/span[1]")
    List<WebElement> allRatings;

    @FindBy(xpath = "//legend[text()='Bed Type: ']/following-sibling::label[contains(@for,'checkbox')]/span[1]")
    List<WebElement> allBedTypes;

    @FindBy(css = ".ui-checkboxradio-radio-label") // new locator to find elements and click
    List<WebElement> allRadios1;

    public int elementSize(String type) {
        int size = 0;
        switch (type) {
            case "radios":
                size = allRadios.size();
                break;
            case "ratings":
                size = allRatings.size();
                break;
            case "bedTypes":
                size = allBedTypes.size();
                break;
        }
        return size;
    }

    public boolean selectRadio(String city) throws InterruptedException {
        boolean isRadioSelected = false;
        for (WebElement eachRadio: allRadios1) {
            if(eachRadio.getText().equals(city)) {
                eachRadio.click();
                Thread.sleep(5000);
                isRadioSelected = eachRadio.findElement(By.xpath("following-sibling::input[1]")).isSelected();
                break;
            }
        }
        return isRadioSelected;
    }

    public void selectRadioOnly(String city) throws InterruptedException {
        for (WebElement eachRadio: allRadios1) {
            if(eachRadio.getText().equals(city)) {
                eachRadio.click();
                break;
            }
        }
    }

    public boolean validateSelection(String button) throws InterruptedException {
        boolean isRadioSelected = false;
        for (WebElement eachRadio: allRadios1) {
            if(eachRadio.getText().equals(button)) {
                isRadioSelected = eachRadio.findElement(By.xpath("following-sibling::input[1]")).isSelected();
                break;
            }
        }
        return isRadioSelected;
    }

}
