package mario;

public class Enemigo {
    protected int posicion_x;
    protected int posicion_y;

    public Enemigo(int posicion_x, int posicion_y) {
        this.posicion_x = posicion_x;
        this.posicion_y = posicion_y;
    }

    public void atacar() {
        // Método por defecto que puede ser sobrescrito en las subclases
    }

    public void mover() {
        // Método por defecto que puede ser sobrescrito en las subclases
    }
}

