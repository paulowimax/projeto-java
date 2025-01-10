public class Pessoa {
    private String nome;
    private Integer idade;
    private String endereco;

    public Pessoa(String nome, Integer idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    // Getters and setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return this.endereco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Endereço: " + endereco;
    }

}
