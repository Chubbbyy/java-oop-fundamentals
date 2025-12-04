import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n=== GERENCIADOR DE TAREFAS ===");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Concluir Tarefa");
            System.out.println("4. Remover Tarefa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    gerenciador.adicionarTarefa(descricao);
                    break;
                case 2:
                    gerenciador.listarTarefas();
                    break;
                case 3:
                    gerenciador.listarTarefas();
                    System.out.print("Digite o número da tarefa a concluir: ");
                    int idConcluir = scanner.nextInt();
                    gerenciador.concluirTarefa(idConcluir);
                    break;
                case 4:
                    gerenciador.listarTarefas();
                    System.out.print("Digite o número da tarefa para remover: ");
                    int idRemover = scanner.nextInt();
                    gerenciador.removerTarefa(idRemover);
                    break;
                case 5:
                    rodando = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}
