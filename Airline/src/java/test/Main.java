/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import facade.Facade;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

/**
 *
 * @author jackl
 */
public class Main {

    public static void main(String[] args) {
        Facade fachada = new Facade(1);
        /*ArrayList<String> data = fachada.createTicket("Hotel Old Trafford", 5, "1231561", "Pepito Perez", "2341512","Manchester");
         for(String word: data){
         System.out.println(word);
         }*/
        for (String item : fachada.getRandomDate()) {
            System.out.println(item);
        }

    }

}
