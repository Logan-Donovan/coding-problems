//Problem: http://codingbat.com/prob/p107259

public Map<String, String> mapAB(Map<String, String> map) {
  if(map.containsKey("a") && map.containsKey("b")){
    String append = map.get("a")+(map.get("b"));
    map.put("ab", append);
  }
  return map;
}
