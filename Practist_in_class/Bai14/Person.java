package Bai14;

public class Person {
    protected String name, ns, place;

    public Person() {
    }

    public Person(String name, String ns, String place) {
        this.name = name;
        this.ns = ns;
        this.place = place;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String toString(){
        return "Name: " + this.name + " " + "Ngay Sinh: " + this.ns + "Que Quan: " + this.place;
    }
}
