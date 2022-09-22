package NewtonBasics;
import java.util.*; 
/*if we can cross building with m energy then it is possible that we can cross m+... height so we'll discard
 * that right part and look for left part cause we have to find the minimum m i.e. energy possible, so we'll keep 
 * om looking towards left i.e. m-.... 
*/

public class guardiansOfGalaxy {
    public static boolean buildingsCrossed(int arr[],int n,int energy){
        //n is number of building 
        for(int i=0;i<n;i++){
            energy=2*energy - arr[i];
            if(energy >=100000){  /*1 lakh is max energy so if energy.= 1 lakh we know that
                it'll be enough to jump all other building so we'll return it true  */
                return true;
            }
            if(energy<0){
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //  1 find max height
        // 2 see whjat is max possible heitgh 100000
        //  0 - 100000

        int l=0;
        int r=100000;
        int ans=0;

        while(l<=r){ // binary search algorithm
            int m=l+(r-l)/2;
            if(buildingsCrossed(arr,n,m)){
                r=m-1;// discard right and check left keeping r as a last num or max energy 
                ans=m; // update m i.e. energy as it'l keep on decreasing and we also need min energy
            }
            else{
                l=m+1;
            }
        }
        System.out.println(ans);
    }
}
