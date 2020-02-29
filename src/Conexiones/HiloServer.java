package Conexiones;

import Graficos.ChatAcumulator;
import javafx.application.Platform;

import java.util.ArrayList;

public class HiloServer extends Thread {
    private int posicion=1;
    private int chatId;
    private boolean Running=true;
    private EnlaceServidores Server;
    private int MensajesRecibidos=0;
    public static ArrayList<Integer> PuertosServidores=new ArrayList<Integer>();
    public HiloServer(int ChatNumber){
        this.Server=new EnlaceServidores();
        this.Server.ConectarRecepVariable();
        this.chatId=ChatNumber+1;
        PuertosServidores.add(this.Server.getPort());
        try{
            ChatAcumulator.getPuerto(ChatNumber-2);
            MensajesRecibidos++;
        }
        catch (Exception e){
            MensajesRecibidos=0;
        }

    }
    public void run(){
        while(this.Running) {
            System.out.println("Estoy aqui");
            String[] Mensaje = this.Server.RecibirMensaje();
            this.MensajesRecibidos++;
            int CantidadMensajes=this.MensajesRecibidos;
            int chat=this.chatId;
            Platform.runLater(new Runnable() {

                @Override
                public void run() {
                    ChatAcumulator.AddChat(Mensaje,chat);
                }
            });


        }
    }
    public static int getPort(int indice){
        return PuertosServidores.get(indice);
    }


}