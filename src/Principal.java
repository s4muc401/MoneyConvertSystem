import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        Consulta consulta = new Consulta();
        Scanner leitura = new Scanner(System.in);


        while (true) {
            System.out.println("----- MONEY CONVERT SYSTEM -----\n");
            System.out.print("""
                    ESCOLHA A CONVERSÃO A SER FEITA:
                    [0] USD >>>>> BRL
                    [1] BRL >>>>> USD
                    [2] EUR >>>>> BRL
                    [3] BRL >>>>> EUR
                    [4] USD >>>>> EUR
                    DIGITE O NUMERO REFERENTE: """);
            String opcao = leitura.nextLine();

            String moeda1, moeda2 = "";
            double valor = 0;

            if (opcao.equals("0")) {
                System.out.print("INFORME O VALOR EM USD: ");
                valor = leitura.nextDouble();

                try {
                    moeda1 = "USD";
                    moeda2 = "BRL";
                    double cotacao = Double.parseDouble(consulta.Consultando(moeda1,moeda2));
                    double valor_final = valor * cotacao;
                    System.out.println("------System---------------------------------");
                    System.out.println(valor + "USD >>>> " + valor_final + "BRL");
                    System.out.println("------System---------------------------------");
                    String espera = leitura.nextLine();
                } catch (NumberFormatException e) {
                    System.out.println("DIGITE EM UM FORMATO VALIDO");
                }
            } else if (opcao.equals("1")) {
                System.out.print("INFORME O VALOR EM BRL: ");
                valor = leitura.nextDouble();

                try {
                    moeda1 = "BRL";
                    moeda2 = "USD";
                    double cotacao = Double.parseDouble(consulta.Consultando(moeda1,moeda2));
                    double valor_final = valor * cotacao;
                    System.out.println("------System---------------------------------");
                    System.out.println(valor + "BRL >>>> " + valor_final + "USD");
                    System.out.println("------System---------------------------------");
                    String espera = leitura.nextLine();
                } catch (NumberFormatException e) {
                    System.out.println("DIGITE EM UM FORMATO VALIDO");
                }
            } else if (opcao.equals("2")) {
                System.out.print("INFORME O VALOR EM EUR: ");
                valor = leitura.nextDouble();

                try {
                    moeda1 = "EUR";
                    moeda2 = "BRL";
                    double cotacao = Double.parseDouble(consulta.Consultando(moeda1,moeda2));
                    double valor_final = valor * cotacao;
                    System.out.println("------System---------------------------------");
                    System.out.println(valor + "EUR >>>> " + valor_final + "BRL");
                    System.out.println("------System---------------------------------");
                    String espera = leitura.nextLine();
                } catch (NumberFormatException e) {
                    System.out.println("DIGITE EM UM FORMATO VALIDO");
                }
            } else if (opcao.equals("3")) {
                System.out.print("INFORME O VALOR EM BRL: ");
                valor = leitura.nextDouble();

                try {
                    moeda1 = "BRL";
                    moeda2 = "EUR";
                    double cotacao = Double.parseDouble(consulta.Consultando(moeda1,moeda2));
                    double valor_final = valor * cotacao;
                    System.out.println("------System---------------------------------");
                    System.out.println(valor + "BRL >>>> " + valor_final + "EUR");
                    System.out.println("------System---------------------------------");
                    String espera = leitura.nextLine();
                } catch (NumberFormatException e) {
                    System.out.println("DIGITE EM UM FORMATO VALIDO");
                }
            } else if (opcao.equals("4")) {
                System.out.print("INFORME O VALOR EM USD: ");
                valor = leitura.nextDouble();

                try {
                    moeda1 = "USD";
                    moeda2 = "EUR";
                    double cotacao = Double.parseDouble(consulta.Consultando(moeda1,moeda2));
                    double valor_final = valor * cotacao;
                    System.out.println("------System---------------------------------");
                    System.out.println(valor + "USD >>>> " + valor_final + "EUR");
                    System.out.println("------System---------------------------------");
                    String espera = leitura.nextLine();
                } catch (NumberFormatException e) {
                    System.out.println("DIGITE EM UM FORMATO VALIDO");
                }
            } else {
                System.out.println("DIGITE UMA OPÇÃO VALIDA");
            }
        }
    }
}
