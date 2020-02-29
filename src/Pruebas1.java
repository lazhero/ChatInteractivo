import Conexiones.EnlaceServidores;

public class Pruebas1 {
    public static void main(String[] args){
        EnlaceServidores Lectura=new EnlaceServidores(40000);
        Lectura.ConectarRecepVariable();
        String[] Mensaje=Lectura.RecibirMensaje();
        System.out.print(Mensaje[0]+ "segundo "+Mensaje[1]);
    }

}
