import java.util.Iterator;

public class Censo {

    public static Integer contarVeiculosDisponiveisConcessionaria(Concessionaria concessionaria) {
        int quantidade = 0;
        for (Veiculo veiculo : concessionaria) {
            if (veiculo.isDisponivel()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalVeiculosConcessionaria(Concessionaria concessionaria) {
        int quantidade = 0;
        for (Iterator a = concessionaria.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}
