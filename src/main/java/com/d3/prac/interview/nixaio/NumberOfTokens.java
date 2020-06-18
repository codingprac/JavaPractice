package com.d3.prac.interview.nixaio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfTokens {

    public static int numberOfTokens(int expiryLimit, List<List<Integer>> commands) {

        int activeTokens = 0;
        int expiry = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (List<Integer> command : commands) {
            int task = command.get(0);
            int tokenId = command.get(1);
            int T = command.get(2);

            //map.put(tokenId, 0);

            if (task == 0) {
                activeTokens++;
                map.put(tokenId, T + expiryLimit);
                continue;
            }

            if (task == 1 && T <= map.get(tokenId)) {
                expiry = map.get(tokenId);
                map.put(tokenId, expiry + expiryLimit);
                continue;
            }

            if (task == 1 && T > map.get(tokenId)) {
                activeTokens--;
                map.remove(tokenId);
            }
        }

        return activeTokens;

        /*for (List<Integer> command : commands) {
            int task = command.get(0);
            int tokenId = command.get(1);
            int T = command.get(2);

            if (task == 0) {
                activeTokens++;
                expiry = T + expiryLimit;
                continue;
            }

            if (task == 1 && T <= expiry) {
                expiry = T + expiryLimit;
            }

            if(task == 1 && T > expiry) {
                activeTokens--;

            }

        }
        return activeTokens;*/


    }

}
