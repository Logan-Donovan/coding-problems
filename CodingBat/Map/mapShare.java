//Problem: http://codingbat.com/prob/p148813

public Map<String, String> mapShare(Map<String, String> map) {
  if(map.get("a") != null){
    map.put("b",map.get("a"));
  }
  if(map.containsKey("c")){
    map.remove("c");
  }
  return map;
}
