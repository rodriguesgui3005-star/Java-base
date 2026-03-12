public abstract class Funcionario {

    private String nome;
    private double salario;
    private String rg;

    public Funcionario(){

    }

    public Funcionario(String nome, double salario, String rg) {
        this.nome = nome;
        this.salario = salario;
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double  calcularSalario(double valor);
}


