/*
 * JavaUtveckling 2018
 */
package radie;


import javax.swing.JOptionPane;
/**
 *
 * @author admin
 */
public class Radie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double radie;
        double omkrets;
        double area;
    
    
        radie = Double.parseDouble(JOptionPane.showInputDialog("Ange radie?"));;
        
        omkrets = 2 * Math.PI * radie;
        area = Math.PI * radie * radie;
        
                
                //omkretsen=2⋅π⋅radien 
                //Area = π⋅r ⋅r = πr 2
        
        JOptionPane.showMessageDialog(null, "omkrets: " + omkrets + " och area: " + area);
        
    }
    
}
