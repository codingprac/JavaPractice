package com.d3.prac.interview.amazon;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {

    int deviceCapacity = 7;

    Map<Integer, Integer> foreGroundProcess = new HashMap<Integer, Integer>() {{
        put(1,2);
        put(2,4);
        put(3,6);
    }};
    Map<Integer, Integer> backGroundProcess = new HashMap<Integer, Integer>() {{
        put(1,2);
    }};

    private Map<Integer,Integer> findOptimalResource(Map<Integer, Integer> foreGroundProcess, Map<Integer, Integer> backGroundProcess) {
        Map.Entry<Integer, Integer> fore = (Map.Entry<Integer, Integer>) foreGroundProcess.entrySet();
        return null;
    }


    public static void main(String[] args) {

    }
}
