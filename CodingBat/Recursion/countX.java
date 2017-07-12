//Problem: http://codingbat.com/prob/p170371

public int countX(String str) {
  if(str.length() < 1){
    return 0;
  }else if(str.length() == 1 && str.charAt(0) == 'x'){
    return 1;
  }
  if(str.length() > 1 && str.charAt(0) == 'x'){
    return 1 + countX(str.substring(1));
  }else{
    return 0 + countX(str.substring(1));
  }
}
