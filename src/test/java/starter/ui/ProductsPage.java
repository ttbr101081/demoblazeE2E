package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductsPage {
    public static final Target TITLE = Target.the("products page title")
            .located(By.xpath("//span[@class='title' and text()='Products']"));

    public static Target addToCartButtonFor(String productName) {
        String xpath = String.format("//div[text()='%s']/ancestor::div[@class='inventory_item_description']//button[text()='Add to cart']", productName);
        return Target.the("add to cart button for " + productName)
                .located(By.xpath(xpath));
    }

    public static final Target SHOPPING_CART_ICON = Target.the("shopping cart icon")
            .located(By.id("shopping_cart_container"));
}
