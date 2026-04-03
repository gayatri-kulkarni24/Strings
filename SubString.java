import java.util.*;
public class Strings{
    public static String SubString(String str,int si,int ei){
        String sub="";
        for(int i=si;i<ei;i++){
            sub+=str.charAt(i);
        }
        return sub;
    }
     public static void main(String args[]){
        System.out.println(str.substring(0,5));//ei=exclude //inbuilt
        System.out.println(SubString("abcdegf",0,5)); //userdefined
     }
}
