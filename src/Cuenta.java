
public class Cuenta{

    private String titular;
    private double cantidad;

    //contructor con parametros
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    /*
     * Ingresar a la cuenta dinero siempre y cuando sea una cantidad positiva
     */
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad = this.cantidad + cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = this.cantidad- cantidad;
        }
    }


    @Override
    public String toString() {
        return "El titular "+titular+ " tiene "+"$"+ cantidad;
    }

}