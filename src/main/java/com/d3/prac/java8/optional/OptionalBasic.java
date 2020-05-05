package com.d3.prac.java8.optional;

import java.util.Optional;

/**
 * Created by deep.lotia on 07-11-2017.
 * 
 * Optional seems to be a better way of handling null checks and provide pretty printing like "Optional.empty" instead of "null"
 *
 * It provide some methods through which you can nicely develop the code like isPresent(), ifPresent(), map(), orElse(), orElseGet(), orElseThrow()
 * 
 */

public class OptionalBasic {

    int id;
    String name;
    String department;

    public static void main(String args[]) {

        Optional<OptionalBasic> m = Optional.of(new OptionalBasic());
        m.get().id = 1;
        m.get().name = "Deep";
        System.out.println(m.get().id);
        System.out.println(m.get().name);
        //m = null;
        System.out.println("m value: "+Optional.ofNullable(m.get()));

        OptionalBasic m2 = new OptionalBasic();
        m2.id = 2;
        m2.name = "Sayali";
        System.out.println(m2.id);
        System.out.println(m2.name);
        //m2 = null; // uncomment this line and it will give NPE at line 38 and 39
       
        //NPE Scenario
        System.out.println(m2.department); // will give NPE as trying to access a field for null reference
        System.out.println(Optional.ofNullable(m2.department)); // will give NPE as trying to access a field for null reference
        
        //Either Prints Null or Optinal.empty
        System.out.println(m2); // will print null
        System.out.println(Optional.ofNullable(m2)); // will print Optional.empty

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
