package ComparatorAndComparable;

import java.util.*;

public class Animal implements Comparable<Animal> {
    String name;
    int age;
    int weight;

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Animal o1) {
        if (this.age == o1.age) {
            return this.name.compareTo(o1.name);
        }
        if (this.age > o1.age) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
//        List<Animal> list = new ArrayList<>();
//        list.add(new Animal("Lion", 15, 100));
//        list.add(new Animal("Tiger", 15, 100));
//        list.add(new Animal("Panther", 17, 100));
//        list.add(new Animal("Leopard", 22, 100));
////        Collections.sort(list);
//        Collections.sort(list, (b1, b2) -> {
//            return b1.name.compareTo(b2.name);
//        });
//        Collections.sort(list, (a, b) -> {
//            return Integer.compare(a.age, b.age);
//        });
//        Collections.sort(list, Comparator.comparing(Animal::getAge).thenComparing(Animal::));
//        System.out.println(list);

}}
