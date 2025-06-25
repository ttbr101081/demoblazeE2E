package bdd.step;
import bdd.page.Checkout;
public class checkoutstep {
    public Checkout checkout() {
        return new Checkout();
    }

    public void clickbtnCheckout() {
        checkout().btnC1();
    }
    public void esperapnombre() {checkout().esperanombre();}
    public void innombre() {checkout().inombre();}
    public void itarjeta(){checkout().itarjeta();}
    public void iyear(){checkout().iyear();}
    public void imes(){checkout().imes();}
    public void inciudad() {
        checkout().iciudad();
    }
    public void bnpais() {checkout().bpais();}
    public void scrollbtnorden(){checkout().scrollbtnorden();}
    public void esprabtncorden(){checkout().esprabtncorden();}
    public void clickbtncorden(){checkout().clickbtncorden();}
}