package mario;

public class EnemigoFactory {
    public static Enemigo crearEnemigo(String tipo, int posicion_x, int posicion_y) {
        switch (tipo) {
            case "Goomba":
                return new Goomba(posicion_x, posicion_y);
            case "Koopa":
                return new Koopa(posicion_x, posicion_y);
            case "Boo":
                return new Boo(posicion_x, posicion_y);
            default:
                throw new IllegalArgumentException("Tipo de enemigo no válido");
        }
    }
}

