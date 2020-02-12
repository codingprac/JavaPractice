package d3.java8.streams;

import d3.java8.model.Address;
import d3.java8.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();

        users.add(new User(1, new Address("James Wattstraat", Arrays.asList(205,306,703))));
        users.add(new User(2, new Address("Populirenlaan", Arrays.asList(183,184,703))));
        users.add(new User(3, new Address(null, Arrays.asList(999,998,997))));
        users.add(new User(4, new Address(null,Arrays.asList(888,887,886))));

        List<Integer> streamInt = users
                                        .stream()
                                        .flatMap(user -> user.getAddress().getPinCodes().stream())
                                        .collect(Collectors.toList());

        Stream<Address> streamAddress = users.stream().map(user -> user.getAddress());

        Collections.sort(streamInt, (o1, o2) -> o1>o2 ? 1 : o1 < o2 ? -1 : 0);

        streamInt.forEach(System.out::println);
        streamAddress.forEach(System.out::println);
    }
}
