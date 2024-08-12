public class Veiculo {

    private String modelo;
    private boolean disponivel;

    public Veiculo(String modelo, boolean disponivel) {
        this.modelo = modelo;
        this.disponivel = disponivel;
    }

    public String getModelo() {
        return modelo;
    }

    public Veiculo setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public Veiculo setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
        return this;
    }
}
