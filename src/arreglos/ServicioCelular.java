package arreglos;

public class ServicioCelular {
    Cliente cliente;
    private String numero;

    public ServicioCelular(Cliente cliente, String numero) {
        this.cliente = cliente;
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "ServicioCelular{" +
                "cliente=" + cliente +
                ", numero='" + numero + '\'' +
                '}';
    }
}
