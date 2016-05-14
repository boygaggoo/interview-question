package algorithms;

import java.util.Scanner;

public class TaumBday {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int b = in.nextInt();
            int w = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
           System.out.println(findPrice(b,w,x,y,z));
           }
        
    }

	private static int findPrice(int b, int w, int x, int y, int z) {
		
		//case 2: if b price is less that w price
		if(x<y&&z<=y){
			int bPrice=b*x;
			int wPrice=w*x;
			int convertPrice=w*z;
			return bPrice+wPrice+convertPrice;
		}
		else if (y<x&&z<=x){
			int bPrice=b*y;
			int wPrice=w*y;
			int convertPrice=b*z;
			return bPrice+wPrice+convertPrice;
		}
		else{
			return b*x+w*y;
		}
	}
}
