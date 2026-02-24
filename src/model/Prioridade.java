package model;

public enum Prioridade {
    BAIXA(1), MEDIA (2), ALTA(3);

    private int complexidade;

    Prioridade(int complexidade){
        this.complexidade = complexidade;
    }

    public int getComplexidade() {
        return complexidade;
    }
}

