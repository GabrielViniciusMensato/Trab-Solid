package sistema.validacao;

public class Validacoes {
    public static boolean validarCPF(String cpf) {

        return true;
    }

    public static boolean validarValor(double valor) {
        return valor >= 0;
    }

    public static boolean validarSenha(int senha) {
        return String.valueOf(senha).length() == 4;
    }
}

