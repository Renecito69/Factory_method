package mario;

public class Goomba extends Enemigo {
    public Goomba(int posicion_x, int posicion_y) {
        super(posicion_x, posicion_y);
    }

    @Override
    public void atacar() {
        System.out.println("Goomba embiste a Mario");
    }

    @Override
    public void mover() {
        System.out.println("Goomba se desplaza hacia la izquierda");
    }
}
