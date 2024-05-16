public class MinhaClasse {
  public static void main(String[] args) {

    int a, b;
    a = 7;
    b = 9;

    String resultado = a == b ? "Verdadeiro" : "Falso";

    System.out.println(resultado);
  }

  public static String nomeCompleto(String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);
  }
}
