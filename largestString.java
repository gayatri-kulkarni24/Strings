import java.util.*;
public class Strings{
  public static void largestString(){
        String fruits[]={"apple","mango","banana","pineapple"};
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
   public static void main(String args[]){
        largestString();
    }
}
