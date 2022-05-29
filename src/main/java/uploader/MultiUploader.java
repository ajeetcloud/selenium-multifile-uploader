package uploader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class MultiUploader {
    public static void main(String[] args) {
        WebDriver driver = getWebDriver();
        performUploads(driver);
        driver.close();
    }

    public static WebDriver getWebDriver() {
        System.setProperty("webdriver.chrome.driver", "chrome_driver_path");
        WebDriver driver = new ChromeDriver();

        return driver;
    }

    public static void performUploads(WebDriver driver) {
        // <input type="file">
        WebElement multiFileInput = driver.findElement(By.id("fileToUpload"));
        List<String> filePaths = new ArrayList<>();
        for (String path : filePaths) {
            multiFileInput.sendKeys(path);
        }
        // Here you can go ahead and perform rest of the actions like submitting the form.
    }
}
