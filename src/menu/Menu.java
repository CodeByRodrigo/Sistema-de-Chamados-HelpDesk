package menu;

import java.util.List;
import java.util.Scanner;

import model.Ticket;
import service.TicketService;
import model.Prioridade;

public class Menu {
    private TicketService service = new TicketService();
    private Scanner sc = new Scanner(System.in);

    public void exibirMenu() throws InterruptedException {
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("-----SISTEMA HELPDESK-----");
            System.out.println("1 - Abrir chamado");
            System.out.println("2 - Listar chamados");
            System.out.println("3 - Buscar por ID");
            System.out.println("4 - Sair");
            System.out.print("Digite uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome completo: ");
                    String nome = sc.nextLine();

                    System.out.print("Titulo: ");
                    String titulo = sc.nextLine();

                    System.out.print("Descrição: ");
                    String descricao = sc.nextLine();

                    System.out.print("Prioridade (1-BAIXA, 2-MEDIA, 3-ALTA):");
                    int opcaoPrioridade = sc.nextInt();
                    sc.nextLine();

                    Prioridade prioridade;
                    if (opcaoPrioridade == 1) prioridade = Prioridade.BAIXA;
                    else if (opcaoPrioridade == 2) prioridade = Prioridade.MEDIA;
                    else prioridade = Prioridade.ALTA;

                    System.out.print("Data de abertura (aa/aa/aaaa) :");
                    String dataAbertura = sc.nextLine();

                    System.out.println("Aguarde...");
                    Thread.sleep(3000);
                    System.out.println("Chamado efetuado com sucesso!");
                    System.out.println("Aguarde um dos tecnicos.");
                    System.out.println("-----------------------------------");

                    service.abrirChamado(titulo, descricao, prioridade, dataAbertura, nome);
                    break;

                case 2:
                    List<TicketService> listarChamados = service.listarChamados();
                    System.out.println("-----LISTA DE CHAMADOS-----");
                    if (listarChamados == null || listarChamados.isEmpty()){
                        System.out.println("Nenhum chamado em aberto");
                    }else{
                        System.out.println(listarChamados);
                    }
                    System.out.println("-----FIM DOS CHAMADOS-----");
                    break;

                case 3:
                    System.out.print("Digite o ID: ");
                    int idBuscar = sc.nextInt();
                    sc.nextLine();
                    Ticket ticket = service.buscarPorId(idBuscar);
                    if (ticket != null) {
                        System.out.println("Ticket encontrado: " + ticket.getTitulo());
                    } else {
                        System.out.println("Chamado não encontrado!");
                    }
                    break;

                case 4:
                    System.out.print("Até mais, volte sempre que precisar de suporte!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}