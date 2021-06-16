/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

/**
 *
 * @author RojeruSan
 */

import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JFrame;
public class CambiaPanel {
    //
    private JPanel container;
    private JPanel content;
    private JFrame content_2;
    private ActionListener listener;
    /**
     * Constructor de clase
     * @param container
     */
    public CambiaPanel(JPanel container, JPanel content) {
        this.container = container;
        this.content = content;
        this.container.removeAll();
        this.container.revalidate();
        this.container.repaint();
        
        this.container.add(this.content);
        this.container.revalidate();
        this.container.repaint();
    }
   public CambiaPanel(JPanel container, JFrame _content) {
        this.container = container;
        this.content_2 = _content;
        this.container.removeAll();
        this.container.revalidate();
        this.container.repaint();
        
        this.container.add(this.content);
        this.container.revalidate();
        this.container.repaint();
    }
    public CambiaPanel(JPanel container, ActionListener _content) {
        this.container = container;
        this.listener = _content;
        this.container.removeAll();
        this.container.revalidate();
        this.container.repaint();
        
        this.container.add(this.content);
        this.container.revalidate();
        this.container.repaint();
    }
}//--> fin clase
