package bdd.step;

import bdd.page.Carrito;
public class carritostep {

    public Carrito carrito() {
        return new Carrito();
    }
    public void scrollcarrito() {
        carrito().scrollcarrito();
    }
    public void esperacarrito() {
        carrito().ecarro();
    }
    public void botoncarrito() {
        carrito().carro();
    }
    public String verifica() {
        String t;
        return t =carrito().verifica();
    }
}
