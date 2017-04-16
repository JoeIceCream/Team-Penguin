/**
 * This class is a new class to change the color of Stamina Bar
 */
package nz.ac.aut.ense701.gameModel;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.BoundedRangeModel;
import javax.swing.JComponent;
import javax.swing.JProgressBar;
import javax.swing.plaf.basic.BasicProgressBarUI;
import org.omg.CORBA.ORB;

/**
 *
 * @author Naomi
 */
public class StaminaJProgressBar extends JProgressBar{
    
    private class StaminaProgressUI extends BasicProgressBarUI{
        
        private double warningValue = (1d/5d)*100d;
        
        private JProgressBar jProgressBar;
        
        private StaminaProgressUI(JProgressBar jProgressBar){
            this.jProgressBar = jProgressBar;
        }
        
        protected void paintDeterminate(Graphics g, JComponent c){
            
            double percent = 100d * this.jProgressBar.getValue() / (this.jProgressBar.getMaximum() - this.jProgressBar.getMinimum());
            
            if(percent < warningValue){
                this.jProgressBar.setForeground(Color.red);
            } else{
                this.jProgressBar.setForeground(Color.LIGHT_GRAY);
            }
            super.paintDeterminate(g, c);
        }
        
    }
    
    public StaminaJProgressBar(){
        init();
    }
    
    public StaminaJProgressBar(int orient){
        super(orient);
        init();
    }
    
    public StaminaJProgressBar(int min, int max){
        super(min, max);
        init();
    }
    
    public StaminaJProgressBar(int orient, int min, int max){
        super(orient, min, max);
        init();
    }
    
    public StaminaJProgressBar(BoundedRangeModel newModel){
        super();
        init();
    }
    
    private void init(){
        this.setBorderPainted(false);
        this.setUI(new StaminaProgressUI(this));
    }
}
