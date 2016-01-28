package random;

import java.util.ArrayList;

public class Matrix {
	public static void main(String[] args) {
	ArrayList<String> result=new ArrayList<>();	
	
  int[][] image=new int [][]{{1,1,1,1},
		  		{1,1,1,1,},		
		  		{0,0,0,0},
		  		{0,0,0,0}};
  
  for(int i=0;i<image.length;i++){
	  for(int j=0;j<image[0].length;j++){
		  if(image[i][j]==0){
			  String s="";
			  s+="("+i+","+j+")";
			  result.add(s);
		  }
	  }
  }
  System.out.println(result);

	}
}
