package pl.coderslab.optional;

import java.util.*;
import java.util.stream.*;

public class Main03 {
    public static void main(String[] args) {
        List<Optional<String>> listOfOptionals = Arrays.asList(
                Optional.empty(),
                Optional.of("java"),
                Optional.empty(),
                Optional.of("python"),
                Optional.of("php"),
                Optional.empty(),
                Optional.of("")
        );

        listOfOptionals.stream()
                .filter(Optional::isPresent) // .filter( o -> o.isPresent())
                .map(Optional::get)
                .filter(s -> !s.isEmpty())
                .forEach(System.out::println);

//        List<String> nonEmptyStrings = listOfOptionals.stream()
//                .filter(Optional::isPresent)         // filtruje tylko obecne wartości
                //.map(Optional::get)                  // pobiera wartości String, get to metoda Optionali
                //.filter(s -> !s.isEmpty())     // filtruje niepuste Stringi


                //.collect(Collectors.toList());       // zbiera do listy

        //System.out.println(nonEmptyStrings);
    }
}
