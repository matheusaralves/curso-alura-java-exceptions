public class FluxoComErro {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch(ArithmeticException | NullPointerException | MinhaExcecao ex) {
            String msg = ex.getMessage(); // imprime a mensagem de erro
            System.out.println("Exception " + msg);
            ex.printStackTrace(); // imprime o rastro do erro
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("ini do método 2");
        metodo2();
        System.out.println("fim do metodo 2");
    }
}