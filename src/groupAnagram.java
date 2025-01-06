import java.util.*;

public class groupAnagram {

    public static void main(String[] args) {
        String[] input = {"eate", "etea", "tan", "ate", "nat", "bat"};

        List<List<String>> result = (groupAnagrams(input));

        for (List<String> group : result) {
            System.out.println(group);
        }
    }

    private static ArrayList<List<String>> groupAnagrams(String[] arr) {


        Map<String, List<String>> anagramGroups = new HashMap<>();

        for(String ar : arr)
        {
            char[] chaArray = ar.toCharArray();
            Arrays.sort(chaArray);
            String sortedKey = new String(chaArray);

            if (!anagramGroups.containsKey(sortedKey)) {
                anagramGroups.put(sortedKey, new ArrayList<>());
            }
            anagramGroups.get(sortedKey).add(ar);

        }
        return new ArrayList<>(anagramGroups.values());
    }
}
