package bdd.page;
import bdd.webdriver.DOM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Carrito extends DOM{

    @FindBy(xpath="//*[@id=\"navbarExample\"]/ul/li[4]/a")
    protected WebElement btncarrito;

    @FindBy(xpath="//*[@id=\"page-wrapper\"]/div/div[2]/h2")
    protected WebElement txtcarrito;
    @FindBy(xpath="//*[@id=\"tbodyid\"]/tr[1]/td[4]/a")
    protected WebElement esperacarrito;

    public  void scrollcarrito(){scroll(btncarrito);}
    public void ecarro(){espera(esperacarrito);}
    public void carro(){onclick(btncarrito);}
    public String verifica(){
        String t;
        return t = getText(txtcarrito);
    }

}
