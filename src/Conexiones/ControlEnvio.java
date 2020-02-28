package Conexiones;

import Graficos.ChatAcumulator;

public class ControlEnvio {
    public static void Enviar(){
        int Posicion= ChatAcumulator.getChatActual()-1;
        try{
            int Puerto=ChatAcumulator.getPuerto(Posicion);
            Enlace Enviar=new Enlace(Puerto);
            Enviar.ConectarEnviarFijo();
        }
        catch (Exception e){
            Enlace Enviar=new Enlace();
            Enviar.ConectarEnviarVariable();
            
        }

    }

}
