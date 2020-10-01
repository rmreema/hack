import java.util.ArrayList;
import java.util.List;

public class SmallString {


public static void main(String args[]) {
List<String> subStrings =  new ArrayList<>();
subStrings.add("c");
subStrings.add("cc");

subStrings.add("cca");
subStrings.add("cccb");
   System.out.println("lexiographically smallest string = "
                                     + smallestString(subStrings));

}

static String smallestString(List<String> subStrings)
{
String[] arrayList = subStrings.stream().toArray(String[]::new);
int n = subStrings.size();
   sort(arrayList,n);
 
   String answer = "";
   for (int i = 0; i < n; i++)
       answer += arrayList[i];
 
   return answer;
}

static void sort(String a[], int n)
{
     
   for(int i = 0;i < n;i++)
   {
       for(int j = i + 1;j < n;j++)
       {
             
           
           if((a[i] + a[j]).compareTo(a[j] + a[i]) > 0)
           {
               String s = a[i];
               a[i] = a[j];
               a[j] = s;
           }
       }
   }
}
     
}
