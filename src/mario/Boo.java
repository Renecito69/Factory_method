package mario;

public class Boo extends Enemigo {
    public Boo(int posicion_x, int posicion_y) {
        super(posicion_x, posicion_y);
    }

    @Override
    public void atacar() {
        System.out.println("Boo te persigue si te das la vuelta");
    }

    @Override
    public void mover() {
        System.out.println("Boo se mueve sigilosamente");
    }
}

