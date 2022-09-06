package NewtonBasics;
import java.util.*;

/*After the decimation, all world went into chaos. People had to rebuild the planet
 so Shield came up with a donation strategy. They feel all the rich guys need to donate
  more than the poor guys. So, they make a rule. They would make a donation list in which 
  the donation of each person would be shown. But the rule is that a person can’t pay less
   than what has already been paid before them. Find the extra amount each person will pay,
    and also, tell shield the total amount of donation.
    
    Sample Input:-
10
1 2 3 2 4 3 6 6 7 6

Sample Output:-
0 0 0 1 0 1 0 0 0 1
43

Sample Input:-
7
10 20 30 40 30 20 10

Sample Output:-
0 0 0 0 10 20 30
220*/


public class ArrayAsignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //array initializaation
        int[] arr = new int[n];
        int temp=0;
        long totalDonation=0;
 
        for(int i = 0; i<n; i++){
            //taking input in an array
            arr[i]= sc.nextInt();
            //temp takes out maximum value out of two prevoius value temp and new arr[i] value
               temp =Math.max(temp,arr[i]);
               //temp-arr[i] is money that is to be paid to compensate for paying lower than prevoius person 
                 System.out.print(temp-arr[i]+" ");
                 // totalDonation adds the final donation after compensation done 
                    totalDonation=totalDonation+temp;
        }
        System.out.println();
        System.out.println(totalDonation);
 
    }
}
