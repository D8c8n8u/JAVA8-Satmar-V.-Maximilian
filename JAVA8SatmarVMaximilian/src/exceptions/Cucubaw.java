/*
 * Converteste varsta in ani si arunc exceptie daca nu e ceva corect
 */
package exceptions;

/**
 *
 * @author famili
 */
public class Cucubaw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            try { 
                System.out.println(ageInMonths(Integer.parseInt(args[0])));
            } 
            catch (NumberFormatException e) {
                System.out.println("first program argument needs to be an int"); 
            }
            catch (IllegalArgumentException e) { 
                System.out.println(e.getMessage());
            }
        } 
static int ageInMonths(int age) { 
    if (age < 0) { 
        throw new IllegalArgumentException("age should be >= 0");
    }
    return age * 12; 
}
    
} 

    
    
