
//Implementing a character finder using the HashMap
public static char findFirstNonRepeatingChar(String str) {
    Map<Character, Integer> map = new HashMap<>();

    var chars = str.toCharArray();
    for (var ch : chars) {
      var count = map.containsKey(ch) ? map.get(ch) : 0;
      map.put(ch, count + 1);
    }

    for (var ch : chars)
      if (map.get(ch) == 1)
        return ch;

    return Character.MIN_VALUE;
  }

//Implementing a character finder using the HashSet

  public static char findFirstRepeatedChar(String str) {
    Set<Character> set = new HashSet<>();
    
        var chars = str.trim().toCharArray();
        for (char ch : chars) {
            if (set.contains(ch))
                return ch;

        set.add(ch);
      }

    return Character.MIN_VALUE;
  }

}

//Implementing HashTable using an array of linklist

package com.company;

import java.util.LinkedList;

public class HashTable {
    private class Entry{
        private int key;
        private String value;

        private Entry(int key, String value){
            this.key = key;
            this.value = value;
        }

        //[LL, LL, LL, LL, LL, LL, LL, LL] --> (K,V)object is stored by the linked list
        private LinkedList<Entry>[] items = new LinkedList[5];

        public void put(int key, String value) {
            var index = hash(key);

            if (items[index] == null)
                items[index] = new LinkedList<>();

            for (var entry : items[index]) {

                if (entry.key == key)
                    entry.value = value;
                return;
            }

            items[index].addLast(new Entry(key, value));
        }

        public String get(int key){
            var index = hash(key);
            var bucket = items[index];
            if(bucket!=null){
                for(var entry : bucket)
                    if(entry.key==key)
                        return entry.value;
            }
            return null;
        }

        public void remove(int key) {
            var index = hash(key);
            var bucket = items[index];
            if (bucket == null)
                throw new IllegalArgumentException();

            for (var entry : bucket) {
                if (key == entry.key) {
                    bucket.remove(entry);
                    return;
                }
            }
            throw new IllegalStateException();
        }

        private int hash(int key){
            return key% items.length;
        }
    }
}
