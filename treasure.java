import java.util.Scanner;
public class treasure {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String s=sc.nextLine();
        int n=s.length();
        int[] prefix=new int[n+1];

        for(int i=1;i<=n;i++){
            prefix[i]=prefix[i-1]+(s.charAt(i-1)=='T'?1:0);
        }
        int x=sc.nextInt();

        for(int i=0;i<x;i++){
           
            int st=sc.nextInt();
            int end=sc.nextInt();
            int treasure=prefix[end]-prefix[st-1];

            System.out.println(treasure);
        }
        sc.close();
    }
}
