package driverConfig;

import constants.Navegador;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;



public class DriverManager {
    private WebDriver driver;
    private DesiredCapabilities capabilities = new DesiredCapabilities();
    private File root = new File("driverNavegador");
    private String extensionDriver = "";

    protected void resolveDriver(Navegador nav, String ambURL) {
        File driverPath;
        String os = System.getProperty("os.name").toLowerCase();
        System.out.println("\nSistema operativo ->" + System.getProperty("os.name").toLowerCase() + " " +System.getProperty("os.version").toLowerCase() +"\n");
        if (!os.contains("mac"))
            this.extensionDriver = ".exe";
        System.out.println(nav);
        //Habia switch
        if (nav == Navegador.Chrome) {
            System.out.println("Se selecciona Chrome");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*");
            if (os.contains("linux")) {
                System.out.println("entre a linux");
                System.out.println(System.getProperty("user.name"));
            }
            WebDriverManager.chromedriver().setup();

            this.driver = (WebDriver) new ChromeDriver(chromeOptions);
            this.driver.manage().deleteAllCookies();
        } else {
            System.out.println("No es posible lanzar el navegador, no se reconoce el navegador: " + nav);
        }
        this.driver.manage().window().maximize();
        //abria google

    }


    protected WebDriver getDriver() {
        if (driver == null) {
            return driver;
        } else {
            return driver;
        }

    }

}
