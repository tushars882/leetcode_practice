import java.util.*;

public class Lc_49_groupAnagrams {
    static List<List<String>> gpAnag(String[] strs){
        HashMap<String , List<String>> map = new HashMap<>();  //here we have created a map with key string which would be the sorted string and value would be the unsorted string of anagram

        for(String str : strs){
            char[] ch = str.toCharArray();          // here we have converted it to charArray to sort the string to make it the key
            Arrays.sort(ch);
            String sorted = new String(ch);
            if(!map.containsKey(sorted)){          //if map doesn't already contains the key thenn put the key with a value as linked list
                map.put(sorted , new LinkedList<>());
            }
            map.get(sorted).add(str);           //if it contains then simply obtain the value of sorted key and add the string which we are iterating
        }
        return new LinkedList<>(map.values());      //return the value of the key as they are the values of sorted keys
    }

    public static void main(String[] args) {
    }
}


//Basically we have taken sorted string as keys and unsorted strings as values