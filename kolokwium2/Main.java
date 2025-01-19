import java.security.Principal;
import java.util.*;

//zad1
class Vehicle{
    String brand;
    String model;

    public Vehicle(String brand,String model){
        this.brand = brand;
        this.model = model;
    }
}

class Car extends Vehicle{
    int numberOfDoors;
    public Car(String brand,String model,int numberOfDoors) {
        super(brand,model);
        this.numberOfDoors = numberOfDoors;
    }

}

//zad2

abstract class WorkTool{
    String name;
    int productionYear;
    public WorkTool(String name,int productionYear){
        this.name = name;
        this.productionYear = productionYear;
    }


    public abstract void use();
}

class Hammer extends WorkTool{
    public Hammer(String name,int productionYear){
        super(name,productionYear);
    }

    @Override
    public void use(){
        System.out.println("Używasz " + name + " z roku:" + productionYear);
    }

}

class Screwdriver extends WorkTool{
    public Screwdriver(String name,int productionYear){
        super(name,productionYear);
    }

    @Override
    public void use(){
        System.out.println("Używasz " + name + " z roku:" + productionYear);
    }

}

class Saw extends WorkTool{
    public Saw(String name,int productionYear){
        super(name,productionYear);
    }

    @Override
    public void use(){
        System.out.println("Używasz " + name + " z roku:" + productionYear);
    }

}

//zad3

interface Sensor{
    public abstract double readValue();
    public abstract String getStatus();
    public abstract void reset();
}

class TemperatureSensor implements Sensor{
    @Override
    public String getStatus() {
        return "działa";
    }

    @Override
    public double readValue() {
        return 13.5;
    }

    @Override
    public void reset() {
        System.out.println("Zresetowano");
    }
}

class PressureSensor implements Sensor{
    @Override
    public String getStatus() {
        return "error";
    }

    @Override
    public double readValue() {
        return 132132;
    }

    @Override
    public void reset() {
        System.out.println("Zresetowano");
    }
}


//zad4

class Triple<T> {
    T first;
    T second;
    T third;

    Triple(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }
}
//zad5

interface Converter{
    abstract double convertToEuro(double amount);
    abstract double convertToUSD(double amount);
    abstract String getConversionRate(String currency);

}
class CurrencyConverter implements Converter{

    @Override
    public double convertToEuro(double amount) {
        return amount*4.5;
    }

    @Override
    public double convertToUSD(double amount) {
        return amount*4.0;
    }

    @Override
    public String getConversionRate(String currency) {
        double kurs = 4.5;
        return "Dzisiejszy kurs " + currency + " to: "+  kurs;
    }
}

class UnitConverter implements Converter{
    @Override
    public double convertToUSD(double amount) {
        return amount*4.0;
    }

    @Override
    public double convertToEuro(double amount) {
        return amount*4.5;
    }

    @Override
    public String getConversionRate(String currency) {
        double kurs = 5.0;
        return "Dzisiejszy kurs " + currency + " to: "+  kurs;
    }
}


//zad6
class Utils {
    public static <T> boolean isEqual(T obj1, T obj2) {
        return Objects.equals(obj1, obj2);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Utils.isEqual("b","bc"));


        Hammer hammer = new Hammer("młot",1992);
        hammer.use();
        Screwdriver screwdriver = new Screwdriver("krzyzak",2024);
        screwdriver.use();
        Saw saw = new Saw("pila",2020);
        saw.use();
        System.out.println();

        Triple triple = new Triple<>("Ala","ma","kota");
        System.out.println(triple.getFirst());
        System.out.println(triple.getSecond());
        System.out.println(triple.getThird());
        System.out.println();

        TemperatureSensor temperatureSensor = new TemperatureSensor();
        System.out.println(temperatureSensor.getStatus());
        System.out.println(temperatureSensor.readValue());
        temperatureSensor.reset();

        UnitConverter unitConverter = new UnitConverter();
        System.out.println(unitConverter.convertToEuro(34));
        System.out.println(unitConverter.getConversionRate("Euro"));


    }


}