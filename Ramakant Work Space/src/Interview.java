import java.util.stream.IntStream;

public class Interview {
    public static void main(String[] args) {
        IntStream.range(1,20).filter(s->s%2!=0).limit(10).forEach(System.out::println);
    }
}
