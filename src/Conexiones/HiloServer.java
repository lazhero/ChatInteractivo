package Conexiones;

import Graficos.ChatAcumulator;

public class HiloServer extends Thread {
    private int port;
    private int chatId;
    private EnlaceServidores Server;
    HiloServer(int port,int ChatNumber){
        this.Server=new EnlaceServidores(port);
        this.chatId=ChatNumber;
        this.port=port+1;
    }
    public void run(){
        while(true) {
            String[] Mensaje = this.Server.RecibirMensaje();
           ChatAcumulator.AddChat(Mensaje[0],this.chatId);


        }
    }


}
