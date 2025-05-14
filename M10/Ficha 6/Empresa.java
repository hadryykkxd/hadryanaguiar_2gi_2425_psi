import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empregado> empregados;
    private double valorPorDia;

    public Empresa(double valorPorDia) {
        this.empregados = new ArrayList<>();
        this.valorPorDia = valorPorDia;
    }

    public void inserirEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    public boolean existeEmpregado(int codigo) {
        return empregados.stream().anyMatch(e -> e.getCodigo() == codigo);
    }

    public Empregado getEmpregado(int codigo) {
        return empregados.stream().filter(e -> e.getCodigo() == codigo).findFirst().orElse(null);
    }

    public void inserirListaEmpregados(List<Empregado> lista) {
        empregados.addAll(lista);
    }

    public List<Empregado> getFichasEmpregados() {
        return new ArrayList<>(empregados);
    }

    public double calcularTotalSalarios() {
        return empregados.stream().mapToDouble(Empregado::calcularSalario).sum();
    }

    public long contarGestores() {
        return empregados.stream().filter(e -> e instanceof Gestor).count();
    }

    public long contarEmpregadosPorCategoria(Class<?> categoria) {
        return empregados.stream().filter(categoria::isInstance).count();
    }
}