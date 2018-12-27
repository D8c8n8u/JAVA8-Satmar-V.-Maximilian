/*
 * Aritmetical and logical unit
 */
package OOPCalculator;

/**
 *
 * @author Satmar
 */
public class Alu {

    private Integer operandUnu; 
    private Integer operandDoi; 
    private Character operand; 
    private Character operator; 
    private Integer rezultat; 
    
     public Character getOperand() { 
        return operand; 
     }
     
    public Character getOperator() { 
        return operator; 
    }  
     
    public void setOperand(Character operand) { 
        this.operand = operand; 
    }
    
        
    public void setOperator(Character operator) { 
        this.operator = operator; 
    }
        public Integer getOperandUnu() { 


         return operandUnu;


     }

     public void setOperandUnu(Integer operandUnu) {


         this.operandUnu = operandUnu;


     }

     public Integer getOperandDoi() {


         return operandDoi;


     }

     public void setOperandDoi(Integer operandDoi) {


         this.operandDoi = operandDoi;


     }

     public Integer getRezultat() {


         return rezultat;


     }

     public void setRezultat(Integer rezultat) {


         this.rezultat = rezultat;


     }

    public void calculeaza(){ 

  
        switch (operator){ 

            case '+':  


                rezultat = operandUnu + operandDoi; 


                 break;

             case '-': 


                 rezultat = operandUnu - operandDoi;


                 break;


             case '*': 


                 rezultat = operandUnu * operandDoi;

                 break;


             case '/': 


                 rezultat = operandUnu / operandDoi;

                 break;

             default: 


                 System.out.println("Operatorul este incorect. Folositi +, -, * sau /");


         }


     }


 }


