package shelter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shelter {
     private int capacity ;
    private List<Animal> data;

    public Shelter(int capacity) {
        this.capacity = capacity;
        this.data= new ArrayList<>();
    }

    public void add (Animal animal){
        if(capacity>data.size()) data.add(animal);
    }
    public boolean remove(String name){
        return data.removeIf(animal -> animal.getName().equals(name));
    }

    public Animal getAnimal(String name, String caretaker){
        return data.stream().filter(animal -> animal.getName().equals(name)&&animal.getCaretaker().equals(caretaker)).findAny().orElse(null);
    }

    public Animal getOldestAnimal(){
        return Collections.max(data, Comparator.comparingInt(Animal::getAge));
    }

    public int getCount(){
        return data.size();
    }

    public String getStatistics(){
        StringBuilder sb = new StringBuilder("The shelter has the following animals:");
        for (Animal datum : data) {
            sb.append(System.lineSeparator()).append(datum.getName()).append(" ").append(datum.getCaretaker());

        }
        return sb.toString();

    }


}
