package com.codewithmosh;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharFinder {
  public char findFirstNonRepeatingChar(String str) {
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

  public char findFirstRepeatedChar(String str) {
    Set<Character> set = new HashSet<>();

    for (var ch : str.toCharArray()) {
      if (set.contains(ch))
        return ch;

      set.add(ch);
    }

    return Character.MIN_VALUE;
  }

}


//HashTable construction using hashmap

package com.codewithmosh;

import java.util.LinkedList;

public class HashTable {
  private class Entry {
    private int key;
    private String value;

    public Entry(int key, String value) {
      this.key = key;
      this.value = value;
    }
  }

  private LinkedList<Entry>[] entries = new LinkedList[5];

  public void put(int key, String value) {
    var entry = getEntry(key);
    if (entry != null) {
      entry.value = value;
      return;
    }

    getOrCreateBucket(key).add(new Entry(key, value));
  }

  public String get(int key) {
    var entry = getEntry(key);

    return (entry == null) ? null : entry.value;
  }

  public void remove(int key) {
    var entry = getEntry(key);
    if (entry == null)
      throw new IllegalStateException();
    getBucket(key).remove(entry);
  }

  private LinkedList<Entry> getBucket(int key) {
    return entries[hash(key)];
  }

  private LinkedList<Entry> getOrCreateBucket(int key) {
    var index = hash(key);
    var bucket = entries[index];
    if (bucket == null)
      entries[index] = new LinkedList<>();

    return bucket;
  }

  private Entry getEntry(int key) {
    var bucket = getBucket(key);
    if (bucket != null) {
      for (var entry : bucket) {
        if (entry.key == key)
          return entry;
      }
    }
    return null;
  }

  private int hash(int key) {
    return key % entries.length;
  }
}

//HashTableExcercise Solutions

package com.codewithmosh;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashTableExercises {

    // O(n)
    public int[] twoSum(int[] numbers, int target) {
        // This problem is a variation of the previous problem
        // (countPairsWithDiff).
        //
        // If a + b = target, then b = target - a.
        //
        // So we iterate our array, and pick (a). Then,
        // we check to see if we have (b) in our array.
        // Similar to the last problem, this would be an O(n^2)
        // operation, because we'll need two nested loops for
        // looking up (b).
        //
        // We can optimize this by using a hash table. In this
        // hash table, we store numbers and their indexes.
        //
        // There is no need to store all the numbers in the hash table
        // first. If we find two numbers that add up to the target,
        // we simply return their indexes.

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(numbers[i], i);
        }

        // Time complexity of this method is O(n) because we need to iterate
        // the array only once.

        return null;
    }

    // O(n)
    public int mostFrequent(int[] numbers) {
        // To find the most frequent item in an array, we have to count the
        // number of times each item has been repeated. We can use a hash
        // table to store the items and their frequencies.
        Map<Integer, Integer> map = new HashMap<>();
        for (var number : numbers) {
            var count = map.getOrDefault(number, 0);
            map.put(number, count + 1);
        }

        // Once we've populated our hash table, we need to iterate over all
        // key/value pairs and find the one with the highest frequency.
        int max = -1;
        int result = numbers[0];
        for (var item : map.entrySet()) {
            if (item.getValue() > max) {
                max = item.getValue();
                result = item.getKey();
            }
        }

        // Runtime complexity of this method is O(n) because we have to
        // iterate the entire array to populate our hash table.

        return result;
    }

    // O(n)
    public int countPairsWithDiff(int[] numbers, int difference) {
        // For a given number (a) and difference (diff), number (b) can be:
        //
        // b = a + diff
        // b = a - diff
        //
        // We can iterate over our array of numbers, and for each number,
        // check to see if we have (current + diff) or (current - diff).
        // But looking up items in an array is an O(n) operation. With this
        // algorithm, we need two nested loops (one to pick a,
        // and the other to find b). This will be an O(n^2) operation.
        //
        // We can optimize this by using a set. Sets are like hash tables
        // but they only store keys. We can look up a number in constant time.
        // No need to iterate the array to find it.

        // So, we start by adding all the numbers to a set for quick look up.
        Set<Integer> set = new HashSet<>();
        for (var number : numbers)
            set.add(number);

        // Now, we iterate over the array of numbers one more time,
        // and for each number check to see if we have (a + diff) or
        // (a - diff) in our set.
        //
        // Once we're done, we should remove this number from our set
        // so we don't double count it.
        var count = 0;
        for (var number : numbers) {
            if (set.contains(number + difference))
                count++;
            if (set.contains(number - difference))
                count++;
            set.remove(number);
        }

        // Time complexity of this method is O(n).

        return count;
    }

}

//Hash Map Solutions

package com.codewithmosh;

import java.util.Arrays;

public class HashMap {

    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    private Entry[] entries = new Entry[5];
    private int count;

    public void put(int key, String value) {
        var entry = getEntry(key);
        if (entry != null) {
            entry.value = value;
            return;
        }

        if (isFull())
            throw new IllegalStateException();

        entries[getIndex(key)] = new Entry(key, value);
        count++;
    }

    public String get(int key) {
        var entry = getEntry(key);
        return entry != null ? entry.value : null;
    }

    public void remove(int key) {
        var index = getIndex(key);
        if (index == -1 || entries[index] == null)
            return;

        entries[index] = null;
        count--;
    }

    public int size() {
        return count;
    }

    private Entry getEntry(int key) {
        var index = getIndex(key);
        return index >= 0 ? entries[index] : null;
    }

    private int getIndex(int key) {
        int steps = 0;

        // Linear probing algorithm: we keep looking until we find an empty
        // slot or a slot with the same key.

        // We use this loop conditional to prevent an infinite loop that
        // will happen if the array is full and we keep probing with no
        // success. So, the number of steps (or probing attempts) should
        // be less than the size of our table.
        while (steps < entries.length) {
            int index = index(key, steps++);
            var entry = entries[index];
            if (entry == null || entry.key == key)
                return index;
        }

        // This will happen if we looked at every slot in the array
        // and couldn't find a place for this key. That basically means
        // the table is full.
        return -1;
    }

    private boolean isFull() {
        return count == entries.length;
    }

    private int index(int key, int i) {
        return (hash(key) + i) % entries.length;
    }

    private int hash(int key) {
        return key % entries.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(entries);
    }
}
