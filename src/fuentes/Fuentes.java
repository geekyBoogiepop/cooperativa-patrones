/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fuentes;

import java.awt.*;
import java.io.InputStream;

/**
 *
 * @author tempo
 */
public class Fuentes {
    private Font font = null;
    public String RobotoB = "Roboto-Bold.ttf";
    
    public Font fuente(String FontName, int estilo, float tam){
        try{
            InputStream is = getClass().getResourceAsStream(FontName);
            font = Font.createFont(font.TRUETYPE_FONT, is);
        }
        catch(Exception ex){
            System.out.println(FontName + ": No se cargo la fuente");
            font = new Font("Arial", Font.PLAIN, 14);
        }
        Font tfont = font.deriveFont(estilo,tam);
        return tfont;
    }
}
