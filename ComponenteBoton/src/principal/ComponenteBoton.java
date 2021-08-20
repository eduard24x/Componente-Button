/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import org.w3c.dom.events.EventTarget;
import org.w3c.dom.events.MouseEvent;
import org.w3c.dom.views.AbstractView;

/**
 *
 * @author Eduard
 */
public class ComponenteBoton extends JButton implements MouseListener {
    
    private Color colorhover=new Color(102,0,51);
    private Color colornormal=new Color(255,0,51);
    
    private Color textohover=new Color(153,0,51);
    private Color textonormal=new Color(255,0,51);
    
    
    public ComponenteBoton(){
        this.setBorder(null);
        this.setContentAreaFilled(false);
        this.setOpaque(true);
        this.setFont(new Font("Tahoma", Font.BOLD, 14));
        this.setBackground(Color.red);
        this.setForeground(Color.white);
        this.setPreferredSize(new Dimension(200,40));
        this.setSize(200,40);
        this.setCursor(new Cursor(12));
        
        addMouseListener((MouseListener) this);
        
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
        
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Color getColorhover() {
        return colorhover;
    }

    public void setColorhover(Color colorhover) {
        this.colorhover = colorhover;
    }

    public Color getColornormal() {
        return colornormal;
    }

    public void setColornormal(Color colornormal) {
        this.colornormal = colornormal;
    }

    public Color getTextohover() {
        return textohover;
    }

    public void setTextohover(Color textohover) {
        this.textohover = textohover;
    }

    public Color getTextonormal() {
        return textonormal;
    }

    public void setTextonormal(Color textonormal) {
        this.textonormal = textonormal;
    }
    
    

    
}
