package mundo;


public class Jarras
{   private int Jarras6, Jarras8;

    public Jarras() 
    { Jarras6 = Jarras8 = 0;
    }

    public Jarras(int j6, int j8) 
    { Jarras6 = j6; Jarras8 = j8;
    }

    public int getJarras6() { 
        return Jarras6; 
    }
    public int getJarras8() { 
        return Jarras8; 
    }

    public void setJarras6(int Jarras6) { 
        this.Jarras6 = Jarras6;
    }
    
    public void setJarras8(int Jarras8) { 
        this.Jarras8 = Jarras8;
    }

    public void llenar6() {
    
        if (Jarras6< 6){
            Jarras6 = 6;
        }
    }    
    
    public void llenar8() {
    
        if (Jarras8 < 8){
            Jarras8 = 8;
        }
    }
    
    public void vaciar6() {
    
        if (Jarras6 > 0){
            Jarras6 = 0;
        }
    }
    public void vaciar8() {
        
        if (Jarras8 > 0){
            Jarras8 = 0;
        }

    }
 
    public void llenar86() {
    
        if (Jarras6 + Jarras8 >= 8){
            Jarras6 = Jarras6 - (8 - Jarras8);
            Jarras8 = 8;
        }
    } 
    
    public void llenar68() {
        
        if (Jarras6 + Jarras8 >= 6){
            Jarras8 = Jarras8 - (6 - Jarras6);
            Jarras6 = 6; 
        }
    } 

    public void vaciar86() {
        
        if (Jarras6 + Jarras8 <= 6){
            Jarras6 = Jarras6 + Jarras8;
            Jarras8 = 0;
        }
    } 
    
    public void vaciar68() {
        
        if (Jarras6 + Jarras8 <= 8){
           Jarras8 = Jarras8 + Jarras6;
            Jarras6 = 0; 
        }
    }
    
 
}
