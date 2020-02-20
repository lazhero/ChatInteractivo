package Conexiones;
import java.io.IOException;
import java.net.ServerSocket;
public class EnlaceServidores {
    private  int port;
    private  String ip;
    private boolean ConectadoS=false;
    private ServerSocket Server;
    EnlaceServidores(int port, String ip){
        this.port=port;
        this.ip=ip;
    }
    EnlaceServidores(){
        this.port=4000;
        this.ip="127.0.0.1";
    }
    EnlaceServidores(String ip){
        this.ip=ip;
        this.port=4000;
    }
    public void ConectarRecepFijo(){
        try{
            ServerSocket Receptor=new ServerSocket(this.port);
            System.out.println("Conexion Exitosa");
            this.Server= Receptor;
        }
        catch(IOException excep){
            System.out.print("El puerto no esta disponible");
            this.ConectarRecepVariable();
        }
    }
    public void ConectarRecepVariable(){
        this.port=4000;
        ServerSocket Receptor=null;
        while(this.port<4100) {
            try {
                Receptor = new ServerSocket(this.port);
                this.ConectadoS=true;
            } catch (IOException excep) {
                this.port++;
                Receptor=null;

            }
        }
        this.Server= Receptor;
    }
}
