import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<String> tasks;
    private Scanner scanner;

    // Construtor para inicializar a lista de tarefas e o scanner
    public Main() {
        tasks = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Método para adicionar uma tarefa
    public void addTask() {
        System.out.print("Digite a nova tarefa: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Tarefa adicionada com sucesso!\n");
    }

    // Método para remover uma tarefa
    public void removeTask() {
        listTasks();
        System.out.print("Digite o número da tarefa que deseja remover: ");
        int taskIndex = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        if (taskIndex > 0 && taskIndex <= tasks.size()) {
            tasks.remove(taskIndex - 1);
            System.out.println("Tarefa removida com sucesso!\n");
        } else {
            System.out.println("Número inválido!\n");
        }
    }

    // Método para listar todas as tarefas
    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Nenhuma tarefa na lista!\n");
        } else {
            System.out.println("Lista de Tarefas:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
            System.out.println();
        }
    }

    // Método para mostrar o menu de opções
    public void showMenu() {
        System.out.println("===== TO-DO LIST =====");
        System.out.println("1. Adicionar tarefa");
        System.out.println("2. Remover tarefa");
        System.out.println("3. Listar tarefas");
        System.out.println("4. Sair");
        System.out.println("======================");
        System.out.print("Escolha uma opção: ");
    }

    // Método principal para executar a aplicação
    public void run() {
        int option;
        do {
            showMenu();
            option = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer após ler o número
            switch (option) {
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    listTasks();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!\n");
            }
        } while (option != 4);
    }

    public static void main(String[] args) {
        Main toDoList = new Main();
        toDoList.run();
    }
}
