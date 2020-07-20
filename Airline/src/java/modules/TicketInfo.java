/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules;

import java.util.ArrayList;

/**
 *
 * @author jackl
 */
public class TicketInfo {

    private ArrayList<String> info = new ArrayList<>();

    public TicketInfo() {

    }

    public ArrayList<String> getInfo() {
        return info;
    }

    public void addData(String residence, String residenceLenght) {
        this.info.add(residence);
        this.info.add(residenceLenght);
    }
}
