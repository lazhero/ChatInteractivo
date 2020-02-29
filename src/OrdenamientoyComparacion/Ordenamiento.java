package OrdenamientoyComparacion;

import java.util.ArrayList;

public class Ordenamiento {
    public static boolean Difiere(int Elemento, ArrayList<Integer> Lista){
        for(int i=0;i<Lista.size();i++){
            if (Elemento==Lista.get(i))return false;
        }
        return true;
    }
}
