//Problem: http://codingbat.com/prob/p118182

public boolean strCopies(String str, String sub, int n) {
  if(str.length() < sub.length()) return (n<=0);
  if(str.substring(0,sub.length()).equals(sub)){
    return strCopies(str.substring(1),sub,n-1);
  }
  return strCopies(str.substring(1),sub,n);
}
