package DesignPattern.Observer;

public class ObserverMain {
    public static void main(String[] args) {
        YouTubeChannel youTubeChannel=new YouTubeChannel();
        Subscriber subscriber=new Subscriber("Ramakant");
        youTubeChannel.subscribe(subscriber);
        youTubeChannel.notifyChanges("Learn EveryThing");
        youTubeChannel.unSubscribe(subscriber);
    }
}
