package HackerRank.src.weekof31;

/**
 * Created by ssyed on 4/12/2017.
 */
public class BeautifulWord {
    public static void main(String[] args) {
        System.out.println(isBeautiful("batman"));
        System.out.println(isBeautiful("apple"));
    }

    private static String isBeautiful(String batman) {
       for(int i=0;i<batman.length()-1;i++){
           int j=i+1;
           if(batman.charAt(i)==batman.charAt(j)){
               return  "No";
           }
           if(isVowel(batman.charAt(i))&&isVowel(batman.charAt(j))){
               return "No";
           }
       }
        return "Yes";
    }
    public static boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='y'){
            return true;
        }
        return false;
    }

}
