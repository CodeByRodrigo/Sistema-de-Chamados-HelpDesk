package model;

public class Ticket {
    private int id;
    private String titulo;
    private String descricao;
    private Prioridade prioridade;
    private String dataAbertura;
    private String nomeSolicitante;

    public Ticket(int id, String titulo, String descricao, Prioridade prioridade, String dataAbertura, String nomeSolicitante) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.dataAbertura = dataAbertura;
        this.nomeSolicitante = nomeSolicitante;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public Prioridade getPrioridade(){
        return this.prioridade;
    }

    public void setPrioridade(Prioridade prioridade){
        this.prioridade = prioridade;
    }

    public String getDataAbertura(){
        return this.dataAbertura;
    }

    public void setDataAbertura(String dataAbertura){
        this.dataAbertura = dataAbertura;
    }

    public String getNomeSolicitante(){
        return this.nomeSolicitante;
    }

    public void setNomeSolicitante(String nomeSolicitante){
        this.nomeSolicitante = nomeSolicitante;
    }
}
