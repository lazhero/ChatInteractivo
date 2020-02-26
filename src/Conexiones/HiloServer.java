package Conexiones;

import Graficos.ChatAcumulator;

public class HiloServer extends Thread {
   private int posicion=1;
    private int chatId;
    private boolean Running=true;
    private EnlaceServidores Server;
    public HiloServer(int ChatNumber){
        this.Server=new EnlaceServidores();
        this.Server.ConectarRecepFijo();
        this.chatId=ChatNumber+1;

    }
    public void run(){
        while(this.Running) {
            String[] Mensaje = this.Server.RecibirMensaje();
           ChatAcumulator.AddChat(Mensaje[1],this.chatId,posicion);
            posicion++;
        }
    }


}
