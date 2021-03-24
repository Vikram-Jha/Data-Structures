
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
