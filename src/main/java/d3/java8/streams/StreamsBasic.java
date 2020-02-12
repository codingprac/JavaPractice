package d3.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsBasic {

    public static void main(String[] args) {

        //Normal Streams
        Stream<String> stream = Stream.of("aaa","bbbb","aaaa", "ccc", "abc");
        List<String> filtered = stream.filter(s -> s.contains("a")).collect(Collectors.toList()); // stream used once.

        //System.out.println("stream count = " + stream.distinct().count()); // same stream cannot be reused and it will give IAE exception.
        System.out.println("filtered stream count = " + filtered.stream().distinct().count());

        //Supplier Streams
        Stream<String> stream2 = Stream.of("aaa","bbbb","aaaa", "ccc", "abc", "aabbcc");
        Supplier<Stream<String>> streamSupplier = () -> stream2;
        List<String> filtered2 = streamSupplier.get().filter(s -> s.contains("a")).collect(Collectors.toList()); // stream used once.

        System.out.println("supplier stream count = " + streamSupplier.get().distinct().count()); // This will work
        System.out.println("filtered2 stream count = " + filtered2.stream().distinct().count());

        Stream<String> partStream = Arrays.stream(new String[]{"1", "2", "3", "4", "5"}, 1, 5);

        partStream.forEach(System.out::println);
    }
}
