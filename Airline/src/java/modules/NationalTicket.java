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
public class NationalTicket implements Ticket {

    private static HashMap<String, String> cities = new HashMap<>();
    private ArrayList<String> info = new ArrayList<>();

    public NationalTicket() {
        NationalTicket.cities.put("Bogota", "");
        NationalTicket.cities.put("Medellin", "");
        NationalTicket.cities.put("Cali", "");
        NationalTicket.cities.put("Manizales", "");
        NationalTicket.cities.put("Pereira", "");
        NationalTicket.cities.put("Neiva", "");
        NationalTicket.cities.put("Cartagena", "");
        NationalTicket.cities.put("Bucaramanga", "");
        NationalTicket.cities.put("Santa Marta", "");
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

        this.info.add(aux);
        this.info.add(NationalTicket.cities.get(aux));
        return this.info;
    }


    public Set<String> getAllCities() {
        return cities.keySet();
    }

}
