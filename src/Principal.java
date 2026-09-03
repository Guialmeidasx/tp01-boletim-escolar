import java.util.Scanner;

public class Principal {
    public static double[] notas = new double[30];
    int quantidade;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        do {
            exibirCabecalho(); // <== METODO COMPARTILHADO (ponto de conflito)
            exibirMenu();
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    /* funcionalidade do Desenvolvedor A */ break;
                case 2:
                    /* funcionalidade do Desenvolvedor B */ break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcao != 0);
        entrada.close();
    }

    public static void exibirCabecalho() {
        System.out.println("==============================");
        System.out.println(" NOME DO SISTEMA ");
        System.out.println("==============================");
    }

    public static void exibirMenu() {
        System.out.println("1 - ...");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");
    }

    public static double inserirNotas(Scanner entrada, String mensagem) {

        double nota;

        do {
            System.out.print(mensagem);
            nota = entrada.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("A nota deve estar entre 0 e 10!");
            }

        } while (nota < 0 || nota > 10);

        return nota;
    }

}
