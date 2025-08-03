package DesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {
    List<Observer> list = new ArrayList<>();

    @Override
    public void subscribe(Observer ob) {
        list.add(ob);
    }

    @Override
    public void unSubscribe(Observer ob) {
        list.remove(ob);

    }

    @Override
    public void notifyChanges(String name) {
        for (Observer ob : list) {
            ob.notified(name);
        }
    }
}
