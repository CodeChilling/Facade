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
public class PersonalInfo {

    private ArrayList<String> info = new ArrayList<>();

    public PersonalInfo() {

    }

    public ArrayList<String> getInfo() {
        return info;
    }

    public void addData(String ID, String name, String phone, String procedence) {

        this.info.add(ID);
        this.info.add(name);
        this.info.add(phone);
        this.info.add(procedence);
    }

}
