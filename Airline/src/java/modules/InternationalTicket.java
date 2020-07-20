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

        InternationalTicket.cities.put("Manchester", "https://dondehospedarse.com/img/donde-alojarse-manchester.jpg");
        InternationalTicket.cities.put("Londres", null);
        InternationalTicket.cities.put("Estambul", null);
        InternationalTicket.cities.put("Tokyo", null);
        InternationalTicket.cities.put("Okinawa", null);
        InternationalTicket.cities.put("Bangkok", "https://a.cdn-hotels.com/gdcs/production172/d459/3af9262b-3d8b-40c6-b61d-e37ae1aa90aa.jpg");
        InternationalTicket.cities.put("Rio de Janeiro", null);
        InternationalTicket.cities.put("Roma", null);
        InternationalTicket.cities.put("Paris", null);
        InternationalTicket.cities.put("Praga", null);
        InternationalTicket.cities.put("Budapest", null);
        InternationalTicket.cities.put("Berlin", null);
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
