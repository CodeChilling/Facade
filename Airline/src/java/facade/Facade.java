/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Set;
import modules.InternationalTicket;
import modules.NationalTicket;
import modules.PersonalInfo;
import modules.Ticket;
import modules.TicketInfo;

/**
 *
 * @author jackl
 */
public class Facade {

    private static Ticket ticket;
    private PersonalInfo personalData;
    private TicketInfo ticketData;
    private int type;
    private ArrayList<String> data = new ArrayList<>();

    public Facade(int type) {
        this.type = type;
        switch (this.type) {
            case 1:
                Facade.ticket = new InternationalTicket();
                break;
            case 2:
                Facade.ticket = new NationalTicket();
                break;
        }
        this.ticketData = new TicketInfo();
        this.personalData = new PersonalInfo();
    }

    public static Set<String> getAllCities() {
        return Facade.ticket.getAllCities();
    }

    public ArrayList createTicket(String residence, String residenceLenght, String ID, String name, String phone, String procedence, String city, String date, String time, String seat) {
        this.ticketData.addData(residence, residenceLenght);
        this.personalData.addData(ID, name, phone, procedence);
        this.data.addAll(this.setCity(city));

        this.data.addAll(ticketData.getInfo());
        this.data.addAll(personalData.getInfo());
        this.data.add(date);
        this.data.add(time);
        this.data.add(seat);
        return this.data;
    }

    public ArrayList setCity(String city) {
        return Facade.ticket.getInfo(city);
    }

    public ArrayList<String> getRandomDate() {
        ArrayList<String> randomDate = new ArrayList<>();
        Random aleatorio = new Random();
        int i = 0;
        int auxA = 0;
        int auxB = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy");
        Calendar unaFecha;
        unaFecha = Calendar.getInstance();
        while (i != 4) {
            auxA = aleatorio.nextInt(1) + 2020;
            if (auxA == 2020) {
                auxB = aleatorio.nextInt(11) + 1;
                while (auxB <= 7) {
                    auxB = aleatorio.nextInt(11) + 1;
                }
                unaFecha.set(auxA, auxB, aleatorio.nextInt(30) + 1);

            }
            randomDate.add(String.valueOf(sdf.format(unaFecha.getTime())));
            i++;
        }

        return randomDate;

    }

    public ArrayList<String> getRandomTime() {
        ArrayList<String> randomTime = new ArrayList<>();
        randomTime.add(this.makeRandom());
        randomTime.add(this.makeRandom());
        randomTime.add(this.makeRandom());
        randomTime.add(this.makeRandom());
        return randomTime;
    }

    public String makeRandom() {
        String time = String.valueOf((int) Math.floor(Math.random() * 24 + 1));
        if (Integer.parseInt(time) <= 9) {
            time = "0" + time;
        }
        String aux = String.valueOf((int) Math.floor(Math.random() * 59 + 1));
        if (Integer.parseInt(aux) <= 9) {
            aux = "0" + aux;
        }
        time = time + ":" + aux;
        return time;
    }

    public ArrayList<String> getRandomSeat() {
        ArrayList<String> randomSeat = new ArrayList<>();
        ArrayList<String> letters = new ArrayList<>();
        for (char c = 'A'; c < 'Z'; c++) {
            letters.add(String.valueOf(c));
        }
        
        randomSeat.add(String.valueOf((int) Math.floor(Math.random() * 32 + 1))+letters.get((int) Math.floor(Math.random() * (letters.size()-1) + 1)));
        randomSeat.add(String.valueOf((int) Math.floor(Math.random() * 32 + 1))+letters.get((int) Math.floor(Math.random() * (letters.size()-1) + 1)));
        randomSeat.add(String.valueOf((int) Math.floor(Math.random() * 32 + 1))+letters.get((int) Math.floor(Math.random() * (letters.size()-1) + 1)));
        randomSeat.add(String.valueOf((int) Math.floor(Math.random() * 32 + 1))+letters.get((int) Math.floor(Math.random() * (letters.size()-1) + 1)));
        return randomSeat;
    }
}
