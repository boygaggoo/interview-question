package String;
/**
 * Implement strStr().
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * @author Siddiq Ahmed Syed
 *
 */
public class StrSTr {
public static void main(String[] args) {
	System.out.println(strStr("hello","ll"));

}

private static int strSTr(String str, String str2) {
	if(str.length()==0){
		return -1;
	}
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)==str2.charAt(0)){
			return i;
		}
	}
	return -1;
}
public static int strStr(String haystack, String needle) {

    int needleLen = needle.length();
    int haystackLen = haystack.length();

    if (needleLen == 0) return 0;
    if (haystackLen == 0) return -1;

    for (int i = 0; i <= haystackLen - needleLen; i++) {
        int k = i, j = 0;
        while (j < needleLen && k < haystackLen && needle.charAt(j) == haystack.charAt(k)) {
            j++;
            k++;
            if (j == needleLen) return i;
        }
    }
    return -1;
}
}
