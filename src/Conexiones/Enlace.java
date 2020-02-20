package Conexiones;

import java.io.IOException;
import java.net.ServerSocket;

public class Enlace {
    private  int port;
    private  String ip;
    private boolean ConectadoS=false;
    Enlace(int port, String ip){
        this.port=port;
        this.ip=ip;
    }
    Enlace(){
      this.port=4000;
      this.ip="127.0.0.1";
    }
    public ServerSocket ConectarRecepFijo(){
        try{
            ServerSocket Receptor=new ServerSocket(port);
            System.out.println("Conexion Exitosa");
            return Receptor;
        }
        catch(IOException excep){
            System.out.print("El puerto no esta disponible");
            return this.ConectarRecepVariable();
        }
    }
    public ServerSocket ConectarRecepVariable(){
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
        return Receptor;
    }
}
