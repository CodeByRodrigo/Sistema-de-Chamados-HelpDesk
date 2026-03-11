package service;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import model.Prioridade;
import model.Ticket;

public class TicketService {
    private ArrayList<Ticket> chamados;
    private int proximoId;

    public TicketService() {
        this.chamados = new ArrayList<>();
        this.proximoId = 1;
    }

    public void abrirChamado(String titulo, String descricao, Prioridade prioridade, String nomeSolicitante) {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dataAbertura = agora.format(formatter);

        Ticket ticket = new Ticket(proximoId, titulo, descricao, prioridade, dataAbertura, nomeSolicitante);
        chamados.add(ticket);
        proximoId++;
    }

    public List<Ticket> listarChamados() {
        return chamados;
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