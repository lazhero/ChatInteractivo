package Conexiones;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

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
    Enlace(String ip){
        this.ip=ip;
        this.port=4000;
    }
    public ServerSocket ConectarRecepFijo(){
        try{
            ServerSocket Receptor=new ServerSocket(this.port);
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
    public Socket ConectarEnviarFijo(){
        try{
            Socket Receptor=new Socket(this.ip,this.port);
            System.out.println("Conexion Exitosa");
            return Receptor;


        }
        catch(IOException excep){
            System.out.print("El puerto no esta disponible");
            return this.ConectarEnviarVariable();
        }
    }
    public Socket ConectarEnviarVariable(){
        this.port=4000;
        Socket Receptor=null;
        while(this.port<4100) {
            try {
                Receptor = new Socket(this.ip,this.port);
                this.ConectadoS=true;
            } catch (IOException excep) {
                this.port++;
                Receptor=null;

            }
        }
        return Receptor;
    }
}
