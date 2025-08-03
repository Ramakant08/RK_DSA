package DesignPattern.Observer;

public interface Subject {
    public void subscribe(Observer ob);

    public void unSubscribe(Observer ob);

    public void notifyChanges(String name);
}
