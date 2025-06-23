package bdd.page;
import bdd.webdriver.DOM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class AgProducto extends DOM {
    @FindBy(xpath="//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")
    protected WebElement btnproducto1;

    @FindBy(xpath="//*[@id=\"tbodyid\"]/div[2]/div/a")
    protected WebElement btnconfirma1;


    @FindBy(xpath="//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")
    protected WebElement btnproducto2;



    @FindBy(xpath="//*[@id=\"navbarExample\"]/ul/li[1]/a")
    protected WebElement home;
    @FindBy(xpath="/html/body/div[5]/div/div[1]/div/a[3]")
    protected WebElement catlap;

    @FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/select/option[2]")
    protected WebElement btncoloropcion;
    @FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div[2]/div[2]/button")
    protected WebElement btnAv2;



    public void iniciarNavegador(String url) {
        inciarNavegador(url);
    }
    public void scrollproducto1(){scroll(btnproducto1);}
    public void esperaproducto1() {espera(btnproducto1);}
    public void agregarproducto1(){onclick(btnproducto1);}
    public void esperaproductop1() {espera(btnconfirma1);}
    public void agregarproductop1(){onclick(btnconfirma1);}
    public void home(){onclick(home);}
    public void esperacategoriaLaptop(){espera(catlap);}
    public void categoriaLaptop(){onclick(catlap);}
    public void scrollproducto2(){scroll(btnproducto1);}
    public void esperaproducto2() {espera(btnproducto1);}
    public void agregarproducto2(){onclick(btnproducto1);}


}
