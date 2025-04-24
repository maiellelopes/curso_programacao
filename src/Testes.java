import java.util.Locale;

public class Testes {

    // testes de alguns comandos como o do Locale e o as casas decimais.

    public static void main(String[] args) {

        System.out.println("Good morning!");

        int y = 32;
        double x = 10.35784;
        System.out.println(x);
        System.out.println(y);

        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

        Locale.setDefault(Locale.US);

        System.out.printf("%.4f%n", x);
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f metros%n ", x);

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);



    }
}


