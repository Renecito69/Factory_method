package mario;

import java.util.Scanner;

public class MARIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecciona un enemigo (Goomba, Koopa, Boo):");
        String tipoEnemigo = scanner.nextLine();

        Enemigo enemigo = EnemigoFactory.crearEnemigo(tipoEnemigo, 100, 200);
        enemigo.atacar();
        enemigo.mover();
    }
}
