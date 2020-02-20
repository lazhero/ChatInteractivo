package Graficos;

import javax.swing.*;

public class InterfazG {
    private JFrame MainWdw;
    public InterfazG(String texto,int width,int height){
        MainWdw= new JFrame(texto);
        MainWdw.setSize(width,height);
        MainWdw.setLayout(null);//using no layout managers
        MainWdw.setVisible(true);
    }
    
}
