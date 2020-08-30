package ru.sfedu.vetClinicH.lab3.SingleTable;

import javax.persistence.*;

@Entity(name = "Mammals")
@Table(schema = "singleTable")
@DiscriminatorValue("MAMMALS")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Mammals extends  Animal{

    private int woolLength;
    private String type;

    public Mammals() {
    }

    public Mammals(long id, String name, String breed, String gender, int age, int weight, boolean vac, int woolLength, String type) {
        super(id, name, breed, gender, age, weight, vac);
        this.woolLength = woolLength;
        this.type = type;
    }

    public Mammals(String name, String breed, String gender, int age, int weight, boolean vac, int woolLength, String type) {
        super(name, breed, gender, age, weight, vac);
        this.woolLength = woolLength;
        this.type = type;
    }

    public int getWoolLength() {
        return woolLength;
    }

    public void setWoolLength(int woolLength) {
        this.woolLength = woolLength;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", vac=" + vac +
                ", woolLength=" + woolLength +
                ", type=" + type +
                '}';
    }
}
