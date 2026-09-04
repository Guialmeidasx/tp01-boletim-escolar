
import java.util.Scanner;

public class Principal {

    public static double[] nota1 = new double[30];
    public static double[] nota2 = new double[30];
    public static double[] medias = new double[30];
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

                case 3:
                    exibirRelatorio();
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

        System.out.println("********************************");
        System.out.println("        BOLETIM ESCOLAR");
        System.out.println("        RELATORIO DA TURMA");
        System.out.println("********************************");
    }

    public static void exibirMenu() {
        System.out.println("1 - Cadastrar aluno");
        System.out.println("2 - Listar alunos");
        System.out.println("3 - Exibir boletim");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");
    }

    public static double calcularMedia(double nota1, double nota2) {

        double media = (nota1 + nota2) / 2;

        return media;
    }

    public static String definirSituacao(double media) {

        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperacao";
        } else {
            return "Reprovado";
        }
    }

    public static void exibirRelatorio() {

        if (quantidade == 0) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        double soma = 0;

        double maior = medias[0];
        double menor = medias[0];

        System.out.println("\n====== BOLETIM ESCOLAR ======");

        for (int i = 0; i < quantidade; i++) {

            System.out.println("Aluno: " + alunos[i]);
            System.out.println("Nota 1: " + nota1[i]);
            System.out.println("Nota 2: " + nota2[i]);
            System.out.println("Media: " + medias[i]);
            System.out.println("Situacao: " + definirSituacao(medias[i]));
            System.out.println("------------------------------");

            soma = soma + medias[i];

            if (medias[i] > maior) {
                maior = medias[i];
            }

            if (medias[i] < menor) {
                menor = medias[i];
            }
        }

        double mediaGeral = soma / quantidade;

        System.out.println("Media geral da turma: " + mediaGeral);
        System.out.println("Maior media: " + maior);
        System.out.println("Menor media: " + menor);
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

        nota1[quantidade] = inserirNotas(
                entrada,
                "Digite a nota 1 do aluno: ");

        nota2[quantidade] = inserirNotas(
                entrada,
                "Digite a nota 2 do aluno: ");

        medias[quantidade] = calcularMedia(
                nota1[quantidade],
                nota2[quantidade]);

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
                            " | Nota 1: " +
                            nota1[i] +
                            " | Nota 2: " +
                            nota2[i] +
                            " | Media: " +
                            medias[i]);
        }

        System.out.println("==============================");
    }
}
