package DesignPattern.SingleTon;

public class SingleTonLazy {
    private static SingleTonLazy singleTonLazy;

    private SingleTonLazy() {

    }

    public static SingleTonLazy getSingleTonLazy() {
        if (singleTonLazy == null) {
            synchronized (SingleTonLazy.class) {

                singleTonLazy = new SingleTonLazy();

            }
        }
        return singleTonLazy;
    }
}
