package DesignPattern.SingleTon;

public class SingletonMain {
    /**
     * Way to break Single Design Patter
     * 1) Use Reflection API
     * Solution 1) Throw Exception from inside the constructor
     *          2) Use Enum
     * 2) Deserialisation
     *   Solution: Implement ReadResolve Method
     *
     * 3) cloning
     *
     */

    public static void main(String[] args) {
        SingleTonLazy singleTonLazy = SingleTonLazy.getSingleTonLazy();
        SingleTonLazy singleTonLazy1 = SingleTonLazy.getSingleTonLazy();
        System.out.println(singleTonLazy.hashCode());
        System.out.println(singleTonLazy1.hashCode());

    }
}
