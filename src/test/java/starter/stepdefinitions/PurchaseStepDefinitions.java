package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text; // Para verificar texto
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.questions.ConfirmationMessage; // Importar la nueva Question
import starter.questions.DisplayedPageTitle; // Importar la nueva Question
import starter.tasks.*;
import starter.ui.CheckoutPage;
import starter.ui.LoginPage;
import starter.ui.ProductsPage;
import starter.ui.CartPage;
import starter.ui.CheckoutOverviewPage;
import starter.ui.ConfirmationPage;
import java.util.List; // Asegúrate de importar List


public class PurchaseStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver aBrowser;

    Actor user = Actor.named("user");

    @Given("que el usuario esta en la pagina de inicio de Saucedemo")
    public void que_el_usuario_esta_en_la_pagina_de_inicio_de_saucedemo() {
        user.can(BrowseTheWeb.with(aBrowser));
        user.attemptsTo(Open.url("https://www.saucedemo.com/"));
    }

    @When("el usuario ingresa el nombre de usuario {string}")
    public void el_usuario_ingresa_el_nombre_de_usuario(String username) {
        user.remember("username", username);
    }

    @And("el usuario ingresa la contrasena {string}")
    public void el_usuario_ingresa_la_contrasena(String password) {
        user.remember("password", password);
    }

    @And("el usuario hace clic en el boton de inicio de sesion")
    public void el_usuario_hace_clic_en_el_boton_de_inicio_de_sesion() {
        String username = user.recall("username");
        String password = user.recall("password");
        user.attemptsTo(Login.withCredentials(username, password));
    }

    @Then("el usuario deberia ser redirigido a la pagina de productos")
    public void el_usuario_deberia_ser_redirigido_a_la_pagina_de_productos() {
        // user.attemptsTo(Ensure.that(ProductsPage.TITLE).isDisplayed());
        Ensure.that(DisplayedPageTitle.isVisible(ProductsPage.TITLE)).isTrue();
    }

    @When("el usuario agrega el producto {string} al carrito")
    public void el_usuario_agrega_el_producto_al_carrito(String productName) {
        user.attemptsTo(AddProductsToCart.named(List.of(productName))); // Usar la tarea
    }

    @And("el usuario hace clic en el icono del carrito")
    public void el_usuario_hace_clic_en_el_icono_del_carrito() {
        user.attemptsTo(ViewCart.clickCartIcon());
    }

    @Then("el usuario deberia ver la pagina del carrito")
    public void el_usuario_deberia_ver_la_pagina_del_carrito() {
        // user.attemptsTo(Ensure.that(CartPage.TITLE).isDisplayed());
        Ensure.that(DisplayedPageTitle.isVisible(CartPage.TITLE)).isTrue();
    }

    @When("el usuario hace clic en el boton {string}")
    public void el_usuario_hace_clic_en_el_boton(String buttonText) {
        if (buttonText.equalsIgnoreCase("Checkout")) {
            user.attemptsTo(ProceedToCheckout.clickCheckoutButton());
        } else if (buttonText.equalsIgnoreCase("Continue")) {
            String firstName = user.recall("firstName");
            String lastName = user.recall("lastName");
            String postalCode = user.recall("postalCode");
            user.attemptsTo(FillCheckoutForm.withDetails(firstName, lastName, postalCode));
        } else if (buttonText.equalsIgnoreCase("Finish")) {
            user.attemptsTo(FinishPurchase.clickFinishButton());
        }
    }

    @Then("el usuario deberia ver la pagina de informacion del checkout")
    public void el_usuario_deberia_ver_la_pagina_de_informacion_del_checkout() {
        // user.attemptsTo(Ensure.that(CheckoutPage.TITLE).isDisplayed());
        Ensure.that(DisplayedPageTitle.isVisible(CheckoutPage.TITLE)).isTrue();
    }

    @When("el usuario ingresa el nombre {string}")
    public void el_usuario_ingresa_el_nombre(String firstName) {
        user.remember("firstName", firstName);
    }

    @And("el usuario ingresa el apellido {string}")
    public void el_usuario_ingresa_el_apellido(String lastName) {
        user.remember("lastName", lastName);
    }

    @And("el usuario ingresa el codigo postal {string}")
    public void el_usuario_ingresa_el_codigo_postal(String postalCode) {
        user.remember("postalCode", postalCode);
    }


    @Then("el usuario deberia ver la pagina de resumen del checkout")
    public void el_usuario_deberia_ver_la_pagina_de_resumen_del_checkout() {
        // user.attemptsTo(Ensure.that(CheckoutOverviewPage.TITLE).isDisplayed());
        Ensure.that(DisplayedPageTitle.isVisible(CheckoutOverviewPage.TITLE)).isTrue();
    }

    @Then("el usuario deberia ver el mensaje de confirmacion {string}")
    public void el_usuario_deberia_ver_el_mensaje_de_confirmacion(String message) {
        // user.attemptsTo(Ensure.that(ConfirmationPage.COMPLETE_HEADER).hasText(message));
        Ensure.that(ConfirmationMessage.textOf(ConfirmationPage.COMPLETE_HEADER)).isEqualTo(message);
    }
}
