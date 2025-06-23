package bdd.stepdefinition;
import bdd.step.confirmacionstep;
import bdd.step.agregarpruductosstep;
import bdd.step.carritostep;
import bdd.step.checkoutstep;
import bdd.webdriver.DOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

public class CompSetepDefinition {

    private final agregarpruductosstep agPruductosstep  = new agregarpruductosstep();
    private final DOM dom = new DOM();
    private final carritostep carro = new carritostep();
    private final confirmacionstep con = new confirmacionstep();
    private final checkoutstep check = new checkoutstep();


    @Given("Agregar dos productos al carrito {string}")
    public void agregarDosProductosAlCarrito(String url) {
        agPruductosstep.stepIniciarNavegador(url);

        agPruductosstep.esperaproducto1();
        agPruductosstep.scrollproducto1();
        agPruductosstep.agregarproducto1();
        agPruductosstep.esperacomproducto1();
        agPruductosstep.agregarcomproducto1();
        dom.alerta();
        agPruductosstep.home();
        agPruductosstep.esperacategoriaLaptop();
        agPruductosstep.categoriaLaptop();
        agPruductosstep.esperaproducto2();
        agPruductosstep.scrollproducto2();
        agPruductosstep.agregarproducto2();
        agPruductosstep.esperacomproducto1();
        agPruductosstep.agregarcomproducto1();
        dom.alerta();
    }
    @When("Visualizar el carrito {string}")
    public void visualizarElCarrito(String texto) {
        carro.scrollcarrito();
        carro.botoncarrito();
        carro.esperacarrito();
        String t=carro.verifica();
        Assertions.assertEquals(t,texto);
    }
    @And("Completar el Place order")
    public void completarElPlaceOrder() {
        check.clickbtnCheckout();
        check.esperapnombre();
        check.innombre();
        check.bnpais();
        check.inciudad();
        check.itarjeta();
        check.imes();
        check.iyear();
        check.scrollbtnorden();
        check.esprabtncorden();
        check.clickbtncorden();
    }


    @Then("Finalizar la compra  {string}")
    public void finalizarLaCompra(String texto) {
        con.esperav();
        String t= con.verificaf();
        System.out.println(t+"esto es");
        Assertions.assertEquals(t,texto);
        dom.quitDriver();
    }
}
