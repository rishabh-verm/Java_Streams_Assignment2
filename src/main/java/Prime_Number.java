import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Prime_Number {

    public static void main(String[] args) {

        //generate 100 random numbers
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < 100 ; i++){
            numbers.add(random.nextInt(100));
        }

        numbers.stream().filter(number -> number != 1 && number > 0 && IntStream.range(2, number).noneMatch(t -> number % t == 0))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}



