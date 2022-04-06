package questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Platform {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> dep = new ArrayList<>();
        getInputs(arr,dep);
        int p =0;
        int n = arr.size();
        System.out.println("n:main:"+n);
        if (n!=0) {
        	Collections.sort(arr);
            Collections.sort(dep);
            
            p = platforms1(arr, dep);
        }
        
        System.out.println(p);
        // System.out.println("platforms: "+p);
       System.out.println("platforms: "+p);
    }
	
	private static int platforms1(ArrayList<Integer> arr, ArrayList<Integer> dep) {
		
		int platforms =1;
        int trains=1;
        int i=1,j = 0;
        
      while(i<arr.size()&& j< dep.size()){
        
          if(arr.get(i)<dep.get(j)){
            trains++;
            i++;
          }
          else if(arr.get(i)>= dep.get(j)){
              trains --;
              j++;
          }
        platforms = trains>platforms?trains:platforms;
      }
        
        return platforms;
	}

	
	public static void getInputs( ArrayList<Integer> arr, ArrayList<Integer> dep){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("n:getInputs: "+n);
        for (int i=0;i<n;i++){
            String[] arr_dep = sc.nextLine().split(" ");
            arr.add(Integer.parseInt(arr_dep[0]));
            dep.add(Integer.parseInt(arr_dep[1])); 
        }
        
        System.out.println("arr: " + arr);
        System.out.println("dep: " + dep);
        sc.close();
    }
}
