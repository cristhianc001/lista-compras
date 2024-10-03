public class Compra implements Comparable<Compra> {

    private double valor;
    private String descripcion;

    public Compra(double valor, String descripcion) {
        this.valor = valor;
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Compra{" + "valor=" + valor +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    @Override
    public int compareTo(Compra otraCompra) {
        // double es una clase primitiva y Double es una clase que le puede dar metodos extras
        // no se puede usar compareTo con clases primitivas, por eso se hizo esto
        return Double.valueOf(this.valor).compareTo(Double.valueOf(otraCompra.valor));
    }
}
