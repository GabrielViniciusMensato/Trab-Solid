package sistema.validacao;

import java.util.Random;

public class GeraNumero {
    private static Random rand = new Random();

    public static int gerarNumero() {
        return 100000 + rand.nextInt(900000);
    }
}
