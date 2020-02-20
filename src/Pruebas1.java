import Conexiones.EnlaceServidores;

public class Pruebas1 {
    public static void main(String[] args){
        EnlaceServidores Lectura=new EnlaceServidores(4000);
        Lectura.ConectarRecepFijo();
        String Mensaje=Lectura.RecibirMensaje();
        System.out.print(Mensaje);
    }

}
