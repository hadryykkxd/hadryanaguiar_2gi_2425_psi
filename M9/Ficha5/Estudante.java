public class Estudante {
    private String nome;
    private String turma;
    private int numero;
    private double nota;

    public Estudante(String nome, String turma, int numero, double nota) {
        this.nome = nome;
        this.turma = turma;
        this.numero = numero;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // Método para imprimir dados do estudante
    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Turma: " + turma);
        System.out.println("Número: " + numero);
        System.out.println("Nota: " + nota);
    }

    // Método para verificar aprovação
    public String verificarAprovacao() {
        return nota >= 9.5 ? "Aprovado" : "Reprovado";
    }
}