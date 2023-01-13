import java.util.ArrayList;

public class Banco {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Yoo Ji-min", 500);
        Cuenta cuenta2 = new Cuenta("Hwang Ye-ji", 500);

        cuenta1.ingresar(200);
        cuenta1.ingresar(100);

        ArrayList<Cuenta> lista = new ArrayList<Cuenta>();
        lista.add(cuenta1);
        lista.add(cuenta2);


        //agregando 2000 a todos los usuarios
        lista.forEach((item) -> item.ingresar(2000));
        //imprimiendo todos los usuarios
        lista.forEach((item) -> System.out.println(item.getTitular()+ "  "+item.getCantidad()));
    }
}
