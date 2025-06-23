package bdd.page;

import bdd.webdriver.DOM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout extends DOM {
    private static String nombre = "Rodrigo Teran";
    private static String year = "2026";
    private static String ciudad = "Quito";
    private static String creditcard = "170562";
    private static String bpais="Ecuador";
    private static String mes="07";

    @FindBy(xpath="/html/body/div[6]/div/div[2]/button")
    protected WebElement btncheckout;


    @FindBy(xpath="/html/body/div[3]/div/div/div[2]/form/div[1]/input")
    protected WebElement inputnombre;
    @FindBy(xpath="//*[@id=\"year\"]")
    protected WebElement intyear;
    @FindBy(xpath="//*[@id=\"month\"]")
    protected WebElement intmes;

    @FindBy(xpath="/html/body/div[3]/div/div/div[2]/form/div[4]/input")
    protected WebElement inputcreditc;

    @FindBy(xpath="/html/body/div[3]/div/div/div[2]/form/div[3]/input")
    protected WebElement inputciudad;

    @FindBy(xpath="//*[@id=\"country\"]")
    protected WebElement dropPais;



    @FindBy(xpath="//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")
    protected WebElement btncorden;


    public void btnC1(){onclick(btncheckout);}
    public void esperanombre(){espera(inputnombre);}
    public void inombre(){type(inputnombre,nombre);}
    public void iyear(){type(intyear,year);}
    public void imes(){type(intmes,mes);}
    public void itarjeta(){type(inputcreditc,creditcard);}
    public void iciudad(){type(inputciudad,ciudad);}
    public void bpais(){type(dropPais,bpais);}
    public void scrollbtnorden(){scroll(btncorden);}
    public void esprabtncorden(){espera(btncorden);}
    public void clickbtncorden(){onclick(btncorden);}
}
