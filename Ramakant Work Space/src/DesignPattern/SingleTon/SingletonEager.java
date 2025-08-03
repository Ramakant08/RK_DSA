package DesignPattern.SingleTon;

public class SingletonEager {
    private static SingletonEager singletonEager=new SingletonEager();
    public  static SingletonEager getSingletonEager(){
        return singletonEager;
    }
}
