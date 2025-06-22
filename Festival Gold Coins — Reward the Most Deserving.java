
//Problem 2: Festival Gold Coins — Reward the Most Deserving

import java.util.*;
class Main {
    public static int ans(int n, int c, int [] coins){
        int count=0;
        int sum=0;
        for(int i=0;i<coins.length;i++){
            sum+=coins[i];
            if(sum<=c){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n=5 , c = 10;
        int [] coins = {2,3,5,7,1};
       Arrays.sort(coins);
        System.out.println(ans(n,c,coins));
        
    }
}