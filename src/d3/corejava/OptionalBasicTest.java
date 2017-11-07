import java.util.Optional;

/**
 * Created by deep.lotia on 07-11-2017.
 */
public class MainTest {

    int id;
    String name;
    String department;

    public static void main(String args[]) {

        Optional<MainTest> m = Optional.of(new MainTest());
        m.get().id = 1;
        m.get().name = "Deep";
        System.out.println(m.get().id);
        System.out.println(m.get().name);
        //m = null;
        System.out.println(Optional.ofNullable(m.get()));

        MainTest m2 = new MainTest();
        m2.id = 1;
        m2.name = "Deep";
        System.out.println(m2.id);
        System.out.println(m2.name);
        //m2 = null;
        System.out.println(m2.department);
        System.out.println(Optional.ofNullable(m2.department));

        m2.testSomeValue();
    }

    public void testSomeValue(){
        Optional<String> string = getSomeValue();
        Optional<String> string1 = getSomeValue1();
        Optional<String> string2 = getSomeValue2();
    }
    
    Optional<String> getSomeValue() {
        // returns an empty Optional type;
        return Optional.empty();
    }

    Optional<String> getSomeValue1() {
        String value = "Deep";
        // With this method, value cannot be null
        // or else an exception would be thrown
        return Optional.of(value);
    }

    Optional<String> getSomeValue2() {
        String value = null;
        // With this method, value may be null
        // if null, then Optional.empty is returned
        return Optional.ofNullable(value);
    }
}
