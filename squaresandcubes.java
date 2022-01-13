/*
ID: theclassictechno
LANG: JAVA
TASK: squaresandcubes
*/

import java.util.*;

import java.io.*;
public class squaresandcubes {
	static int SquareCube(long N)
    {
     
        int cnt = 0, i = 1;
     
        while ((int)(Math.pow(i, 6)) <= N) {
            ++cnt;
            ++i;
        }
     
        return cnt;
    }
 
    public static void main(String[] args) throws IOException {
    	//standard io
        BufferedReader fin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter fout = new PrintWriter(System.out);
        
        //file io
        //String file = "diamond";
		
//        BufferedReader fin = new BufferedReader(new FileReader(file+".in"));
//       PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter(file+".out")));
//       
       
        StringTokenizer st = new StringTokenizer(fin.readLine());
 
        int t = Integer.parseInt(st.nextToken());
 
        //int[] x_coordinates = new int[n];
        int[] n = new int[t];
        int[] loves=new int[t];
        
        for (int i = 0; i < t; i++) {
        	st = new StringTokenizer(fin.readLine());
            n[i] = Integer.parseInt(st.nextToken());
            //System.out.println(n[i]);
        }
        
        int howManyS=0;int howManyC=0;  int both=0;
        for (int i = 0; i < t; i++) {
        	
	        howManyS=(int)Math.sqrt(n[i]);
	    	howManyC=(int)Math.cbrt(n[i])-1;
	    	both=(SquareCube(n[i])-1) ;
	    	loves[i]=howManyS+howManyC-both;
        }
        	
//	        for (int j = 1; j <= n[i]; j++) {
//	        	//int cube = n[i] * n[i] * n[i];
//	        	//System.out.println(n[i]);
//	        	//System.out.println("cbr"+Math.cbrt(j));
//	        	//System.out.println("sqr"+Math.sqrt(j));
//	        	
//	            if (((Math.cbrt(j)) )% 1 == 0) {
//	                loves[i]++;
//	                //System.out.println(loves[i]);
//	            }
//	            
//	            else if (((Math.sqrt(j)) %1 == 0)) {
//	            	loves[i]++;
//	            	//System.out.println(loves[i]);
//	            }
//	        }
//        }
        
        for (int i = 0; i < n.length; i++) {
        	fout.println(loves[i]);
        }
        fin.close();
        fout.close();
 
    }
 
}