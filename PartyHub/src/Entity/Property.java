package Entity;

import java.util.ArrayList;

public class Property {
    public String id;
    public String name;
    public String type;
    public String capacity;
    public String square_meters;
    public Owner owner;
    public String about;
    public String rules;
    public String address;
    private ArrayList<Reservation> Reservations;
    public int Reservation_counter=0;

    
    // Construtor
    public Property(String id,String name, String type, String capacity, String square_meters, Owner owner, String about, String rules, String address) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.square_meters = square_meters;
        this.owner = owner;
        this.about = about;
        this.rules = rules;
        this.address = address;
        this.Reservations = new ArrayList<>();
        
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getSquare_meters() {
        return square_meters;
    }

    public void setSquare_meters(String square_meters) {
        this.square_meters = square_meters;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Reservation> getReservations() { 
        return Reservations;
    }
    
    // Chamada pelo user ao fazer uma reserva
    public void addReservation(Reservation reservation) {
        Reservations.add(reservation);
        Reservation_counter++;
    }

    // Função para remover uma reserva, chamada pelo ctl
    public void removeReservation(Reservation reservation) {
        Reservations.remove(reservation);
        Reservation_counter--;
    }
    
    @Override
    public String toString() {
        return "Property [id=" + id + ", name=" + name + ", type=" + type + ", capacity=" + capacity
                + ", square_meters=" + square_meters + ", about=" + about + ", rules=" + rules + ", address=" + address
                + "]";
    }
}
