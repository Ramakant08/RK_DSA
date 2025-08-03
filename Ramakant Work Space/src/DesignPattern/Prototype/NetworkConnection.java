package DesignPattern.Prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {
    String ip;
    String veryImportantData;
    List<String> domainList=new ArrayList<>();

    public List<String> getDomainList() {
        return domainList;
    }

    public void setDomainList(List<String> domainList) {
        this.domainList = domainList;
    }

    public NetworkConnection() {

    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getVeryImportantData() {
        return veryImportantData;
    }

    public void setVeryImportantData(String veryImportantData) {
        this.veryImportantData = veryImportantData;
    }

    public void getSomeVeryImportantData() throws InterruptedException {
        System.out.println("Getting Some Very Very Important Data");
        this.domainList.add("www.google.com");
        this.domainList.add("www.yahoo.com");
        this.domainList.add("www.gmail.com");
        this.domainList.add("www.firefox.com");
        Thread.sleep(3000);
    }

    @Override
    public String toString() {
        return "{" + this.ip + " : " + this.veryImportantData + " : " + this.domainList + "}";

    }

    @Override
    public NetworkConnection clone() {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setVeryImportantData(this.getVeryImportantData());
        for (String d : this.getDomainList()) {
            networkConnection.getDomainList().add(d);
        }

        return networkConnection;
    }
}
