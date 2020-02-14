/*
@author armandosanpon
 */
package p17.function;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P17Function {

    static Scanner keyboard = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.000");
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Author: Armando Sanchez");
        System.out.println();
        keyboard.useDelimiter("\n");
        int option = -1;
        int euro;
        String euro1;
        float euro2;
      
        
        while (option != 0) {

            userMenu();
            option = keyboard.nextInt();
            switch (option) {//start of switch
                case 1:
                    System.out.println("How many euro? ");
                    euro = keyboard.nextInt();
                    float result = Function1(euro);
                    System.out.println(euro + " € " + " = " + df.format(result) + " $");
                    break;
                case 2:
                    System.out.println("How many euro? ");
                    euro = keyboard.nextInt();
                    double result2 = Function2(euro);
                    System.out.println(euro + " € " + " = " + df.format(result2) + " $");
                    break;
                case 3:
                    System.out.println("How many euro? ");
                    euro = keyboard.nextInt();
                    String result3 = Function3(euro);
                    System.out.println(euro + " € " + " = " + df.format(result3) + " $");
                    break;
                case 4:
                    System.out.println("How many euro? ");
                    euro1 = keyboard.next();
                    int result4 = Function4(euro1);
                    System.out.println(euro1 + " € " + " = " + result4 + " $");
                    break;
                case 5:
                    System.out.println("How many euro? ");
                    euro2 = keyboard.nextInt();
                    int result5 = Function5(euro2);
                    System.out.println(df.format(euro2) + " € " + " = " + result5 + " $");
                    break;
                case 6:
                    System.out.println("How many euro? ");
                    euro2 = keyboard.nextFloat();
                    Function6(euro2);
                    break;
                case 7:
                    System.out.print("Tell me a letter: ");
                    char letra = (keyboard.next()).charAt(0);  
                    Function7(letra);          
                    break;
                case 8:
                    
                    System.out.println("Tell me ur name: ");
                        String name = keyboard.next();
                    String result8 = Function8(name);
                        System.out.println(result8);
                    break;
                case 9:
                    int number;
                 do{
                    System.out.println("Tell me a number betweeen 0 and 255: ");
                    number = keyboard.nextInt();
                 }while (number > 255 || number < 0);
                 
                    String result9 = Function9(number);    
                    System.out.println(result9);
                    break;
                case 10:
                    Function10();                                                                          
                    break;
                case 0:
                    P0();
                    System.out.println("Cya");
                    break;
                default:
                    System.out.println("'No valid Option'");
            }//end of switch
            System.out.println("***Press any key to continue***");
            String key = keyboard.next();
        }
    }

    private static void userMenu() {
        System.out.println("Option1: ");
        System.out.println("Option2: ");
        System.out.println("Option3: ");
        System.out.println("Option4: ");
        System.out.println("Option5: ");
        System.out.println("Option6: ");
        System.out.println("Option7: ");
        System.out.println("Option8: ");
        System.out.println("Option9: ");
        System.out.println("Option10: ");
        System.out.println("Option0: Exit:  ");

        System.out.println("\n\nChoose an option");
    }
    private static float Function1(int euro) {
        
        float result = 0;
        result = euro / 0.91f; //cast          
        return result;
        
    }
    private static double Function2(int euro) {
        
        double result2 = 0;
        result2 = euro / (double) 0.91;
        return result2;
        
    }
    private static String Function3(int euro) {
     
        String result3 = "0";
        result3 = String.valueOf(euro /0.91);       
        return result3;
        
    }
    private static int Function4(String euro1) {
        
        int result4 = 0;
        result4 = (int)(Integer.parseInt(euro1) /0.91);
        return result4;
        
    }
    private static int Function5(float euro2) {
        
        int result5 = 0;
        result5 = (int) (euro2 / 0.91);//cast       
        return result5;
        
    }
    private static String Function6(float euro2) {
        
        String result6 = Float.toString(euro2);
        System.out.println(euro2 + " € " + " = " + result6 + " $");

        return result6;
        
    }
    private static void Function7(char letter) {
    
        String letterB = Integer.toBinaryString(letter);
        System.out.println(letter + " = " + letterB);    
        
    }
    private static String Function8(String name) {
       
       String result8 = "";       
       char letter = ' ';
       for(int i = 0; i < name.length(); i++){
            letter = name.charAt(i);
            result8 += Integer.toBinaryString(letter)+ " ";
    }
       
       return result8;
        
    }
    private static String Function9(int number9) {      

        String aChar = new Character((char)number9).toString();       
        return aChar;
        
    }
     private static void Function10() {
         System.out.println("");
         for(int i = 0; i < 255; i++){
             System.out.println(i + "\t" + 
              Integer.toString(i, 16) + " = " + (char)i);    
        }
    }
    private static void P0() {
      
    }
}

/* static Scanner keyboard = new Scanner(System.in);
           double precio = 100, tax = 21, res ;
        
        res = calculo(precio, tax);
        method (res, precio, tax);
        
    }
    //function Calculo PVP
    private static double calculo (double price, double IVA){
        double PVP = 0;
            PVP = price + price*(IVA/100);      
        return PVP;
    }
    private static final String blue = "\033[34m";
    private static final String green = "\033[32m";
    private static final String yellow = "\033[33m";
    
    public static void method(double price, double iva, double resultado){   
       
        System.out.println(blue + "Resultado = " + price);
        System.out.println(green + "Precio = " + iva);
        System.out.println(yellow + "IVA = " + resultado);      
    }
}
 */
