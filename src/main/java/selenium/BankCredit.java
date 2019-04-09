package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class BankCredit {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.conso.ro/login");
        driver.findElement(By.id("username")).sendKeys("danut.automation.test@gmail.com");
        driver.findElement(By.id("password1")).sendKeys("Parola12!@");
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("navbarCredite"))).build().perform();
        driver.findElement(By.xpath("//div[@aria-labelledby='navbarCredite']/a[@title='Credite Prima Casa']")).click();

        Select select = new Select(driver.findElement(By.xpath("//select[@name='tipcredit']")));
        select.selectByVisibleText("Prima casa");
        driver.findElement(By.id("pret_locuinta")).clear();
        driver.findElement(By.id("pret_locuinta")).sendKeys("380000");
        driver.findElement(By.id("suma-imobiliare")).clear();
        driver.findElement(By.id("suma-imobiliare")).sendKeys("315000");
        driver.findElement(By.id("Telefon")).sendKeys("0761111111");
        driver.findElement(By.id("recalculeaza")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Mai multe credite CEC Bank']")).click();
        List<WebElement> keysFromSpan = new ArrayList<>();
        keysFromSpan = driver.findElements(By.xpath("//div[@class='col-12 logoBanca mt-3']/span"));
        List<WebElement> values = new LinkedList<>();
        values = driver.findElements(By.xpath("//p[text()='Rata lunara']/following-sibling::span[@class='valoare_dae']"));
        List<WebElement> keyFromImg = new LinkedList<>();
        keyFromImg = driver.findElements(By.xpath("//div[@class='col-12 logoBanca mt-3']/img"));
        List<String> namesSpan = new LinkedList<>();
        for (WebElement element : keysFromSpan) {
            namesSpan.add(element.getText());
        }

        List<String> namesImg = new LinkedList<>();
        for (WebElement element : keyFromImg) {
            namesImg.add(element.getAttribute("alt"));
        }

        for (int b = 0; b < namesImg.size(); b++) {
            for (int a = 0; a < namesSpan.size(); a++) {
                if (namesSpan.get(a).equals("")) {
                    namesSpan.set(a, namesImg.get(b));
                    namesImg.remove(b);
                }
            }
        }
        namesSpan.remove(1);
        System.out.println(namesSpan.size());
        System.out.println("All banks: " + namesSpan);
        List<String> rates = new LinkedList<>();
        for (WebElement el : values) {
            rates.add(el.getText());
        }
        rates.remove(1);
        System.out.println(rates.size());
        System.out.println("Monthly rates: " + rates);

        for (String s : rates) {
            if (s.contains(",")) {
                s.replace(",", "");
            }
        }


//        List<Double> ratesDoubleValues=new LinkedList<>();
//        for(String s:rates){
//            ratesDoubleValues.add(Double.parseDouble(s));
//        }

        Map<String, String> map = new LinkedHashMap<>();
        Iterator<String> it1 = namesSpan.iterator();
        Iterator<String> it2 = rates.iterator();
        while (it1.hasNext() && it2.hasNext()) {
            map.put(it1.next(), it2.next());
        }

        System.out.println(map);


        driver.quit();
    }

}
