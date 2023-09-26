package mario;

public class Koopa extends Enemigo {
    public Koopa(int posicion_x, int posicion_y) {
        super(posicion_x, posicion_y);
    }

    @Override
    public void atacar() {
        System.out.println("Koopa se esconde en su caparazón");
    }

    @Override
    public void mover() {
        System.out.println("Koopa se desplaza hacia la derecha");
    }
}
