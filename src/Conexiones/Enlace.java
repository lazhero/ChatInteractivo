package Conexiones;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Enlace {
    private  int port;
    private  String ip;
    private Socket client;
    private boolean ConectadoS=false;
    public Enlace(int port, String ip){
        this.port=port;
        this.ip=ip;
    }
    public Enlace(){
      this.port=40000;
      this.ip="127.0.0.1";
    }
    public Enlace(String ip){
        this.ip=ip;
        this.port=40000;
    }

    public void ConectarEnviarFijo(){
        try{
            Socket Receptor=new Socket(this.ip,this.port);
            System.out.println("Conexion Exitosa");
            this.client= Receptor;


        }
        catch(Exception excep){
            System.out.print("El puerto no esta disponible");
            this.ConectarEnviarVariable();
        }
    }
    public void ConectarEnviarVariable(){
        this.port=40000;
        Socket Receptor=null;
        while(this.port<40100) {
            try {
                Receptor = new Socket(this.ip,this.port);
                this.ConectadoS=true;
                System.out.println("Puerto encontrado");
            } catch (IOException excep) {
                this.port++;
                Receptor=null;

            }
        }
        this.client= Receptor;
    }
    public void EnviarMensaje(String Mensaje){
        try {
            OutputStreamWriter Escritura = new OutputStreamWriter(this.client.getOutputStream());
            Escritura.write(Mensaje + "\n");
            Escritura.flush();
            this.client.close();
        }
        catch(IOException excep){
            System.out.print("Error");
        }
    }

}
