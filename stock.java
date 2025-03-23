import java.util.Scanner;

public class stock{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No. of days: ");
        int n=sc.nextInt();

        int[] prices=new int[n];
        System.out.println("Enter the Stock prices: ");
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }

        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0;i<n;i++){
            if(prices[i]<minprice){
                minprice=prices[i];
            }
            else{
                int profit=prices[i]-minprice;
                if(profit>maxprofit){
                    maxprofit=profit;
                }
            }
        }
        System.out.println("The maximum profit is: "+ maxprofit);
    }
}