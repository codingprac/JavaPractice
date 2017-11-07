import java.util.Optional;

/**
 * Created by deep.lotia on 07-11-2017.
 */
public class OptionalBasicTest {

    int id;
    String name;
    String department;

    public static void main(String args[]){

        Optional<MainTest> m = Optional.of(new MainTest());
        m.get().id=1;
        m.get().name="Deep";
        System.out.println(m.get().id);
        System.out.println(m.get().name);
        m=null;
        System.out.println(Optional.ofNullable(m.get().department));

        MainTest m2 = new MainTest();
        m2.id=1;
        m2.name="Deep";
        System.out.println(m2.id);
        System.out.println(m2.name);
        m2=null;
        System.out.println(m2.department);
        System.out.println(Optional.ofNullable(m2.department));

    }
}
