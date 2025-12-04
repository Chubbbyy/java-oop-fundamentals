import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeTarefas {
    private List<Tarefa> tarefas;

    public GerenciadorDeTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        Tarefa novaTarefa = new Tarefa(descricao);
        tarefas.add(novaTarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa na lista.");
        } else {
            System.out.println("\n--- Lista de Tarefas ---");
            for (int i = 0; i < tarefas.size(); i++) {
                // Imprime o índice + 1 para ficar amigável ao usuário
                System.out.println((i + 1) + ". " + tarefas.get(i));
            }
        }
    }

    public void concluirTarefa(int indice) {
        int indiceReal = indice - 1;
        if (indiceReal >= 0 && indiceReal < tarefas.size()) {
            tarefas.get(indiceReal).setConcluida(true);
            System.out.println("Tarefa marcada como concluída!");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void removerTarefa(int indice) {
        int indiceReal = indice - 1;
        if (indiceReal >= 0 && indiceReal < tarefas.size()) {
            tarefas.remove(indiceReal);
            System.out.println("Tarefa removida.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
