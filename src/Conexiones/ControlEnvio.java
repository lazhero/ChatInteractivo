package Conexiones;

import Graficos.ChatAcumulator;



public class ControlEnvio {
    public static void Enviar(String Mensaje){
        int Posicion= ChatAcumulator.getChatActual();
        Enlace Enviar;
        try{
            int Puerto=ChatAcumulator.getPuerto(Posicion);
            Enviar=new Enlace(Puerto);
            Enviar.ConectarEnviarFijo();
            System.out.println("El puerto es"+Enviar.getPort());
        }
        catch (Exception e){
            System.out.println("He fallado");
            Enviar=new Enlace();
            Enviar.ConectarEnviarVariable();
            ChatAcumulator.AddPuerto(Enviar.getPort());
            System.out.println("El puerto escogido es "+Enviar.getPort());
        }
        String MensajeFinal=Integer.toString(HiloServer.getPort(Posicion))+"~"+Mensaje;
        Enviar.EnviarMensaje(MensajeFinal);
        System.out.println("pos he llegado");
        ChatAcumulator.increase(Posicion);
        ChatAcumulator.AddChat(Mensaje,Posicion);






    }

}
