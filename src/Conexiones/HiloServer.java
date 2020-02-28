package Conexiones;

import Graficos.ChatAcumulator;
import javafx.application.Platform;

public class HiloServer extends Thread {
   private int posicion=1;
    private int chatId;
    private boolean Running=true;
    private EnlaceServidores Server;
    public HiloServer(int ChatNumber){
        this.Server=new EnlaceServidores();
        this.Server.ConectarRecepVariable();
        this.chatId=ChatNumber+1;

    }
    public void run(){
        while(this.Running) {
            String[] Mensaje = this.Server.RecibirMensaje();
            int chat=this.chatId;
            Platform.runLater(new Runnable() {

                @Override
                public void run() {
                    ChatAcumulator.AddChat(Mensaje[1],chat,posicion);
                }
            });

            posicion++;
        }
    }


}
