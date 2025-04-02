package org.example;

import java.util.*;

public class URLShortener {
    public static List<List<String>> getActualUrls(List<String> database, List<String> requests) {
        Map<String, String> urlForMap = new HashMap<>();
        Map<String, Integer> accessByCount = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        // Process the database entries
        for (String entry : database) {
            String[] parts = entry.split(" ");
            String userId = parts[0];
            String shortUrl = parts[1];
            String actualUrl = parts[2];
            String key = userId + "_" + shortUrl;
            urlForMap.put(key, actualUrl);
        }

        // Process the requests
        for (String query : requests) {
            String[] parts = query.split(" ");
            String userId = parts[0];
            String shortUrl = parts[1];
            String key = userId + "_" + shortUrl;

            if (urlForMap.containsKey(key)) {
                accessByCount.put(key, accessByCount.getOrDefault(key, 0) + 1);
                List<String> response = new ArrayList<>();
                response.add(urlForMap.get(key));
                response.add(String.valueOf(accessByCount.get(key)));
                result.add(response);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> database = Arrays.asList(
                "0 ggl www.google.com",
                "0 fbok www.facebook.com",
                "2 lefts www.hackerrank.com",
                "0 hckrk www.hackerrank.com"
        );

        List<String> requests = Arrays.asList("0 hckrk", "2 lefts");

        List<List<String>> output = getActualUrls(database, requests);

        // Print output as list of lists
        for (List<String> line : output) {
            System.out.println(line);
        }
    }
}
