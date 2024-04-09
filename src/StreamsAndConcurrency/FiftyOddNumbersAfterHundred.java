package StreamsAndConcurrency;
import java.util.stream.IntStream;
public class FiftyOddNumbersAfterHundred {
    public static void main(String args[]){
        IntStream.iterate(101,x->x+2).limit(50).forEach(System.out:: println);
    }
}
