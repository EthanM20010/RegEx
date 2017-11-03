/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author emendez
 */
public class RegEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pattern phone;
        phone = Pattern.compile("([(]{0,1})([0-9]{3})([.]{0,1}[-]{0,1}[)]{0,1}[ ]{0,1})([0-9]{3})([.]{0,1}[-]{0,1})([0-9]{4})");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a valid phone");
        String number = in.nextLine();
        if(!number.equals("")){
        Matcher phoneN = phone.matcher(number);
        
        if(phoneN.matches())
        {
            String beg = phoneN.group(2);
            String mid = phoneN.group(4);
            String end = phoneN.group(6);
            System.out.println("-----------------");
            System.out.println("("+beg+") "+mid+"-"+end);
            
        }
        else{
            System.out.println("Invalid");
        }
        //System.out.println("Enter valid phone number: ");
        //number = in.nextLine();
        
        }
        else{
            System.out.println("Error 404 not found");
        }
        
    }
    
}
