package Conexiones;

import Graficos.ChatAcumulator;

public class ControlEnvio {
    public static void Enviar(String Mensaje){
        int Posicion= ChatAcumulator.getChatActual()-1;
        Enlace Enviar;
        try{
            int Puerto=ChatAcumulator.getPuerto(Posicion);
            Enviar=new Enlace(Puerto);
            Enviar.ConectarEnviarFijo();
        }
        catch (Exception e){
            Enviar=new Enlace();
            Enviar.ConectarEnviarVariable();
            ChatAcumulator.AddPuerto(Enviar.getPort());
        }
        String MensajeFinal=Integer.toString(HiloServer.getPort(Posicion))+"~"+Mensaje;
        Enviar.EnviarMensaje(MensajeFinal);


    }

}
