package Conexiones;

public class HiloServer extends Thread {
    private int port;
    private int chatId;
    private EnlaceServidores Server;
    HiloServer(int port,int ChatNumber){
        this.Server=new EnlaceServidores(port);
        this.chatId=ChatNumber;
        this.port=port;
    }
    public void run(){
        while(true){
            String[] Mensaje=this.Server.RecibirMensaje();

        }
    }


}
