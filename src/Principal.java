import java.util.Scanner;

public class Principal {
    public static double[] notas = new double[30];
    public static int quantidade = 0;
    public static String[] alunos = new String[30];

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        do {
            exibirCabecalho(); // <== METODO COMPARTILHADO (ponto de conflito)
            exibirMenu();
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    entrada.nextLine();
                    cadastrarAluno(entrada);
                    break;
                case 2:
                    listarAlunos();
                    break;
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
        System.out.println("      BOLETIM ESCOLAR");
        System.out.println("==============================");
    }

    public static void exibirMenu() {
        System.out.println("1 - Cadastrar aluno");
        System.out.println("2 - Listar alunos");
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

    public static void cadastrarAluno(Scanner entrada) {

        if (quantidade >= 30) {
            System.out.println("Limite de alunos atingido!");
            return;
        }

        System.out.print("Nome do aluno: ");
        alunos[quantidade] = entrada.nextLine();

        notas[quantidade] = inserirNotas(
                entrada,
                "Digite a nota do aluno: ");

        quantidade++;

        System.out.println("Aluno cadastrado com sucesso!");
    }

    public static void listarAlunos() {

        if (quantidade == 0) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        System.out.println("\n====== ALUNOS CADASTRADOS ======");

        for (int i = 0; i < quantidade; i++) {
            System.out.println(
                    (i + 1) + " - " +
                            alunos[i] +
                            " | Nota: " +
                            notas[i]);
        }

        System.out.println("==============================");
    }
}
