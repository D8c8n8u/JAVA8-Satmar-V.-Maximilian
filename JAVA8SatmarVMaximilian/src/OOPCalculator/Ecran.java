/*
 *Ecranul calculatorului
 */
package OOPCalculator;

/**
 *
 * @author famili
 */
public class Ecran {
    
      private String afisaj = "0"; 
    private Carcasa stapana; 
    
    public Ecran(Carcasa nouaStapana) { 
        this.stapana = nouaStapana; 
    } 
 
    public String getAfisaj() { 
        return afisaj; 
    } 
    public void setAfisaj(String afisaj) { 
        switch (afisaj) { 
            case "+": 
                operatiuneLocala('+'); 
                break; 
            case "-": 
                operatiuneLocala('-'); 
                break; 
            case "*": 
                operatiuneLocala('*'); 
                break;     
            case "/": 
                operatiuneLocala('/'); 
                break;     
            case "=": 
                break;   
            default:     
        } 
        this.afisaj = afisaj; 
    } 
    
    
    
    public void operatiuneLocala(char c) {
       stapana.getAlu().setOperandUnu(Integer.getInteger(afisaj)); 
        stapana.getAlu().setOperator(c); 
        afisaj = Character.toString(c); 
    }
 
}
