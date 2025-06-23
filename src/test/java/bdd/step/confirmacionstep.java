package bdd.step;
import bdd.page.confirmacion;

public class confirmacionstep {
    public confirmacion confirmacion() {
        return new confirmacion();
    }
    public void esperav() {
        confirmacion().esperav();
    }
    public String verificaf() {
        String t;
        return t = confirmacion().verificaf();
    }
}
