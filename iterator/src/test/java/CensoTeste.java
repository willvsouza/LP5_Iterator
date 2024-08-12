import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CensoTeste {

    @Test
    void deveContarVeiculosDisponiveisConcessionaria() {
        Concessionaria concessionaria = new Concessionaria(
                new Veiculo("BYD Shark", true),
                new Veiculo("Volkswagen Nivus", true),
                new Veiculo("Peugeot 2008", true),
                new Veiculo("Volvo EX30", false),
                new Veiculo("Volkswagen Amarok", false)
        );
        assertEquals(3, Censo.contarVeiculosDisponiveisConcessionaria(concessionaria));
    }

    @Test
    void deveContarTotalVeiculosConcessionaria() {
        Concessionaria concessionaria = new Concessionaria(
                new Veiculo("BYD Shark", true),
                new Veiculo("Volkswagen Nivus", true),
                new Veiculo("Peugeot 2008", true),
                new Veiculo("Volvo EX30", false),
                new Veiculo("Volkswagen Amarok", false)
        );
        assertEquals(5, Censo.contarTotalVeiculosConcessionaria(concessionaria));
    }

}