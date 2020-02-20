package Conexiones;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

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
    public String RecibirMensaje() throws IOException{
        String Texto="";
        boolean Recibiendo=true;
        try {
            while (Recibiendo) {
                Socket Entrada = this.Server.accept();
                BufferedReader Lector = new BufferedReader(new InputStreamReader(Entrada.getInputStream()));
                Texto = Lector.readLine();
            }

        }
        catch(IOException Exp){
            System.out.print("Matenme");
        }
        return Texto;

    }
}
