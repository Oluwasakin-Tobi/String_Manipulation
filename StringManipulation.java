/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oluwasakinoluwatobi
 */
public class StringManipulation {
    //Strings are immutable, so we use StringBuilder to manipulate a string and change its content
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(manipulateAString("this is just a manipulation of string and nothing more"));
    }
    
    //This method accepts a string and changes all the vowels in the string to the character 'b'
    public static StringBuilder manipulateAString(String input){
        
        StringBuilder result = new StringBuilder(input);
        String vowels = "aeiou";
        
        for (int i =0; i<result.length(); i++){
            char a = result.charAt(i);
            if (vowels.indexOf(a)>=0){
                result.setCharAt(i, 'b'); //We are replacing all vowels in the string with 'b'
            }
        }
        return result;
        
        
    }
    
}
