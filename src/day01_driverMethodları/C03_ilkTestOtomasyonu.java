package day01_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ilkTestOtomasyonu {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","KurulumDosyaları/chromedriver-win64");
        WebDriver driver = new ChromeDriver();

        //1. testotomasyonu sayfasina gidelim. https://www.testotomasyonu.com/
        driver.get("https://www.testotomasyonu.com/");

        //2. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());

        //3. Sayfa basliginin “Test Otomasyonu” icerdigini test edin
        String expectedTitleİçerik = "Test Otomasyonu";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitleİçerik)){
            System.out.println("Title testi passed");
        }else System.out.println("Title testi failed");

        //4. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());

        //5. Sayfa url’inin https://testotomasyonu.com/ oldugunu test edin.
        String expectedUrl = "https://testotomasyonu.com/";
        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("Url testi passed");
        }else System.out.println("Url testi failed");

        //6. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());

        //7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin
        String expectedHTMLiçerik = "otomasyon";
        String actualSayfaKaynagı = driver.getPageSource();

        if (actualSayfaKaynagı.contains(expectedHTMLiçerik)){
            System.out.println("Sayfa kaynagı testi passed");
        }else System.out.println("Sayfa kaynagı testi failed");

        //8. Sayfayi kapatin.
        Thread.sleep(3000);
        driver.quit();





    }
}
