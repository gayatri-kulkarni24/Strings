import java.util.*;
public class Strings{
    public static boolean isPalindrome(){
        String str="racear";
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
           
        }
         return true;
    }
     public static void main(String args[]){
        System.out.println(isPalindrome());

       //Strings basics
        char arr[]={'a','b','c'};
        for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
        }
        String str="kzsjfkh";
        String str2=new String("hjdfglkmdl");
        System.out.println(str);
        System.out.println(str2);
        Scanner sc=new Scanner(System.in);
        String name=sc.next(); 
       String name=sc.nextLine();
       System.out.println(name);
       System.out.println(name.length());

     }
}
