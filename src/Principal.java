import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        // inicializando
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba el limite de la tarjeta");
        double limite = lectura.nextDouble();
        TarjetaDeCredito tarjeta = new TarjetaDeCredito(limite);

        int salir = 1;
        while (salir!=0){
            System.out.println("Escriba descripcion de la compra");
            String descripcion = lectura.next();

            System.out.println("Escriba el valor de la compra");
            double valor = lectura.nextDouble();

            // se crea una nueva compra
            Compra compra = new Compra(valor, descripcion);
            // este me dice si la compra se puede realizar o no
            boolean compraRealizada = tarjeta.lanzarCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada");
                System.out.println("Escriba 0 para salir o 1 para continuar");
                salir = lectura.nextInt();
            } else {
                System.out.println("Saldo insuficiente");
                salir = 0;
            }
        }
        System.out.println("**************************************************");
        System.out.println("Compras realizadas: \n");

        // ordenar la lista de compras
        Collections.sort(tarjeta.getListaDeCompras());



        // mostrar compras
        for (Compra compra: tarjeta.getListaDeCompras()){
            System.out.println(compra.getDescripcion() + " - " + compra.getValor());
        }
        System.out.println("\n**************************************************\n");
        System.out.println("Saldo de la tarjeta: " + tarjeta.getSaldo());

    }
}
