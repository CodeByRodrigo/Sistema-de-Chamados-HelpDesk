package service;

import java.util.ArrayList;
import java.util.List;

import model.Prioridade;
import model.Ticket;

public class TicketService {
    private ArrayList<Ticket> chamados;
    private int proximoId;

    public TicketService() {
        this.chamados = new ArrayList<>();
        this.proximoId = 1;
    }

    public void abrirChamado(String titulo, String descricao, Prioridade prioridade, String dataAbertura, String nomeSolicitante) {
        Ticket ticket = new Ticket(proximoId, titulo, descricao, prioridade, dataAbertura, nomeSolicitante);
        chamados.add(ticket);
        proximoId++;
    }

    public List<TicketService> listarChamados() {
        for (Ticket ticket : chamados) {
            System.out.println("ID: " + ticket.getId());
            System.out.println("Titulo: " + ticket.getTitulo());
            System.out.println("Descrição: " + ticket.getDescricao());
            System.out.println("Prioridade: " + ticket.getPrioridade());
            System.out.println("Complexidade: " + ticket.getPrioridade().getComplexidade());
            System.out.println("Data de abertura: " + ticket.getDataAbertura());
            System.out.println("Nome do solictante: " + ticket.getNomeSolicitante());
        }
        return null;
    }

    public Ticket buscarPorId(int id) {
        for (Ticket ticket : chamados) {
            if (ticket.getId() == id) {
                return ticket;
            }
        }
        return null;
    }
}