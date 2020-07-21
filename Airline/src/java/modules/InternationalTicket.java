/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author jackl
 */
public class InternationalTicket implements Ticket {

    private static HashMap<String, String> cities = new HashMap<>();
    private ArrayList<String> info = new ArrayList<>();

    public InternationalTicket() {

        InternationalTicket.cities.put("Manchester", "");
        InternationalTicket.cities.put("Londres", "");
        InternationalTicket.cities.put("Estambul", "");
        InternationalTicket.cities.put("Tokyo", "");
        InternationalTicket.cities.put("Okinawa", "");
        InternationalTicket.cities.put("Bangkok", "");
        InternationalTicket.cities.put("Rio de Janeiro", "");
        InternationalTicket.cities.put("Roma", "");
        InternationalTicket.cities.put("Paris", "");
        InternationalTicket.cities.put("Praga", "");
        InternationalTicket.cities.put("Budapest", "");
        InternationalTicket.cities.put("Berlin", "");
    }

    public HashMap<String, String> getCities() {
        return cities;
    }

    @Override
    public ArrayList<String> getInfo(String city) {
        String aux = " ";

        for (String key : cities.keySet()) {

            if (key.equals(city)) {
                aux = key;
            }
        }
        this.info.add(InternationalTicket.cities.get(aux));
        this.info.add(aux);
        
        return this.info;
    }
    
   
    public Set<String> getAllCities(){
        return cities.keySet();
    }

}
