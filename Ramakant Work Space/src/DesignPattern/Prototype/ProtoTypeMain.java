package DesignPattern.Prototype;

/**
 * This design patter in used to when we want to create an object for real only once
 * and other times when we create any object it should just be shallow copy of the originally created object
 */

public class ProtoTypeMain {
    public static void main(String[] args) throws InterruptedException {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("12:2344:534555");
        networkConnection.setVeryImportantData("No Fookin Data Here!!!");
        networkConnection.getSomeVeryImportantData();
        System.out.println(networkConnection);
        NetworkConnection networkConnection1 = networkConnection.clone();
        NetworkConnection networkConnection2 = networkConnection.clone();
        try {
            networkConnection.getDomainList().remove(1);
            System.out.println(networkConnection);
            System.out.println(networkConnection1);
            System.out.println(networkConnection2);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
