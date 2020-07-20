/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules;

import java.util.ArrayList;
import java.util.Set;

/**
 *
 * @author jackl
 */
public interface Ticket {

    public ArrayList<String> getInfo(String city);
    public Set<String> getAllCities();

}
