package TrabalhandoComCollectionsJava.Lists.Aula9;

public class OrdenarList_1 {
    //List de nomes, idade e cor de gatos;
    private String nome, cor;
    private int idade;

    public OrdenarList_1() {}

    public OrdenarList_1(String nome, String cor, int idade) {
        setNome(nome);
        setCor(cor);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\tCor: " + cor +
                "\tIdade: " + idade;
    }
}
