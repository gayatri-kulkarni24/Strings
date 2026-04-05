import java.util.*;
public class Strings{
    public static String upper(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            ch=str.charAt(i);
            sb.append(Character.toUpperCase(ch));
        }
        return sb.toString();
    }
     public static void main(String args[]){
          System.out.println(upper("abcd hjkjhfjk"));
     }
}
