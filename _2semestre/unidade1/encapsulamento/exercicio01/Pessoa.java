public class Pessoa {
    private double altura;
    private double peso;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura () {
        return altura;
    }

    public void setaltura (double altura) {
        this.altura = altura;
    }

    public double calcularImc() {
        return peso / (altura * altura);
    }
    
}
