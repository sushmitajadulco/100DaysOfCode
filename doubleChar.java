package String;
/*

Given a string, return a string where for every char in the original, there are two chars.

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
* */

public class doubleChar {

    public static String doubleChar(String str) {
        int resultSize = str.length()*2;
        char[] ch = new char[resultSize];
        int str_index = 0;
        for(int result_index=0; result_index < resultSize; result_index++) {
                if(result_index%2 == 0 && result_index > 0)
                    str_index++;
                ch[result_index] = str.charAt(str_index);
        }
        return new String(ch);
    }

    public static void main(String [] args){
        System.out.println(doubleChar("The"));
    }
}

/*
*
Alternate Solution:

public String doubleChar(String str) {
  String result = "";
  for (int i = 0; i < str.length(); i++) {
    result = result + str.charAt(i) + str.charAt(i);
    // Alternately:
    // result = result + str.substring(i, i+1) + str.substring(i, i+1);
  }
  return result;
}

* */