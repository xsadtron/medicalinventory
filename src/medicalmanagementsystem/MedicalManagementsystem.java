
package medicalmanagementsystem;


public class MedicalManagementsystem {

    
    public static void main(String[] args) {
        Splash s = new Splash();
        s.setVisible(true);
        
        try {
            for (int i = 0; i <= 100; i++) 
            {
                Thread.sleep(i);
                s.jProgressBar1.setValue(i);
                s.jLabel3.setText(Integer.toString(i)+"%");
                if(i==100)
                {
                    
                    LogIn lg = new LogIn();
                    lg.setVisible(true);
                   break ; 
                }
              
           }
            s.setVisible(false);
        } catch (Exception e) {
            System.out.println(false);
        }
        
    }
    
}
