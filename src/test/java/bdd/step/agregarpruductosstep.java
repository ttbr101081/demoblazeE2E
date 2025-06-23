package bdd.step;
import bdd.page.AgProducto;

public class agregarpruductosstep {
    public AgProducto agProducto() {
        return new AgProducto();
    }
    public void stepIniciarNavegador(String url) {
        agProducto().iniciarNavegador(url);
    }
    public void scrollproducto1(){agProducto().scrollproducto1();}
    public void esperaproducto1(){agProducto().esperaproducto1();}
    public void agregarproducto1(){agProducto().agregarproducto1();}
    public void esperacomproducto1(){agProducto().esperaproductop1();}
    public void agregarcomproducto1(){agProducto().agregarproductop1();}
    public void home(){agProducto().home();}
    public void esperacategoriaLaptop(){agProducto().esperacategoriaLaptop();}
    public void categoriaLaptop(){agProducto().categoriaLaptop();}
    public void scrollproducto2(){agProducto().scrollproducto2();}
    public void esperaproducto2(){agProducto().esperaproducto2();}
    public void agregarproducto2(){agProducto().agregarproducto2();}

}