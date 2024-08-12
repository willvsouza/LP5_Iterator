import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Concessionaria implements Iterable<Veiculo> {

    private List<Veiculo> veiculos = new ArrayList<Veiculo>();

    public Concessionaria(Veiculo... veiculos) {
        this.veiculos = Arrays.asList(veiculos);
    }

    @Override
    public Iterator<Veiculo> iterator() {
        return veiculos.iterator();
    }
}
