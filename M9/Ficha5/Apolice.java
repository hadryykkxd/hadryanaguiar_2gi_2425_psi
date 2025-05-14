public class Apolice {
    private String nomeSegurado;
    private int idadeSegurado;
    private double valorPremio;

    public Apolice(String nomeSegurado, int idadeSegurado, double valorPremio) {
        this.nomeSegurado = nomeSegurado;
        this.idadeSegurado = idadeSegurado;
        this.valorPremio = valorPremio;
    }

public void imprimir() {
        System.out.println("Nome do Segurado: " + nomeSegurado);
        System.out.println("Idade do Segurado: " + idadeSegurado);
        System.out.println("Valor do Prémio: " + valorPremio);
    }

    public void calcularPremioApolice() {
        if (idadeSegurado >= 18 && idadeSegurado <= 25) {
            valorPremio += (valorPremio * 20) / 100;
        } else if (idadeSegurado > 25 && idadeSegurado <= 36) {
            valorPremio += (valorPremio * 15) / 100;
        } else if (idadeSegurado > 36) {
            valorPremio += (valorPremio * 10) / 100;
        }
    }

    public void oferecerDesconto(String cidade) {
        switch (cidade.toLowerCase()) {
            case "lisboa":
                valorPremio -= (valorPremio * 20) / 100;
                break;
            case "porto":
                valorPremio -= (valorPremio * 15) / 100;
                break;
            case "sintra":
                valorPremio -= (valorPremio * 10) / 100;
                break;
            case "coimbra":
                valorPremio -= (valorPremio * 5) / 100;
                break;
        }
    }
}
