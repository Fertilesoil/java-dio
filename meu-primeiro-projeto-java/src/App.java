public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        var calculadora = new Calc(30, 60);
        calculadora.imprimirValores();
    }

    public class Calc {
        private int primeiroValor;
        private int segundoValor;



        void constructor(int primeiroValor, int segundoValor) {
            this.primeiroValor = primeiroValor;
            this.segundoValor = segundoValor;
        }

        public void imprimirValores() {
            return System.out.println(primeiroValor + segundoValor);
        }

    }
}
