package day01_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodları {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","KurulumDosyaları/chromedriver-win64");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");
        System.out.println(driver.getTitle());  // Test Otomasyonu - Test Otomasyonu
        System.out.println(driver.getCurrentUrl());  //  https://www.testotomasyonu.com/
        System.out.println(driver.getPageSource());  // tüm html kodlarını getirir
        System.out.println(driver.getWindowHandle());  // 437722AC2787F84853E77FF1402763DB
        // selenium webdriver actıgı her browser için unique bir handle değeri üretir
        // eğer test çalılırken driver objesi ile birden fazla window açıldı ise
        // bu windowlar arasındaki geçişi windowHandle değeri ile yapabiliriz
        System.out.println(driver.getWindowHandles());  // [388C7EDFAF03C437F927838ECCC86A6E]
        // eğer driver birden fazla window açtı ise
        // açık olan tüm window ların windowHandle değerlerini verir



        Thread.sleep(3000);
        driver.quit();
    }
}
