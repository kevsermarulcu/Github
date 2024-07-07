package day01_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_İlkOtomasyon {
    public static void main(String[] args) throws InterruptedException {

        /*
           kurulum dosyalarını proje altına kopyalamak
           selenium ve chrome driver ı projeye eklemek için yeterli değildir

           Selenium u kurmak için jar dosyalarını
           olusturduğumuz her projede 1 kez projeye tanıtmalıyız
           file>Project Structure>Modules



         */

        /*
            Selenium bizim istediğimiz tüm otomasyonları
            olusturacağımız webdriver objesi ile yapar

            selenium ile otomasyon yapılacaksa
            önce webdriver objesi olusturulmalıdır


         */

        System.setProperty("Webdriver.chrome.driver","KurulumDosyaları/chromedriver-win64");
        WebDriver driver = new ChromeDriver();
        // 32.satır calıstıgında selenium bilgisayarımızda var olan browserlardan
        // sectigimiz bir kopyasını olusturup otomasyon için bizim kodlarımızı bekler

        driver.get("https://www.testotomasyonu.com");
        /*
            otomasyonla bir url e gitmek için tüm url i yazmamız gerekir
            url de https:// kullanılmazsa selenium verilen url e gitmez
            ama www kullanılmasa da olabilir

         */


        Thread.sleep(5000);
        driver.close();
        // driver olusturulurken acılan window u kapatır
        // driver.quit();
        // driver calıstıgı müddetce acılan tüm window ları kapatır



    }
}
