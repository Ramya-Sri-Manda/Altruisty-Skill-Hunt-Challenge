import java.util.Scanner;
public class swapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        String A=sc.next();
        String B=sc.next();

        if(n!=A.length() || n!=B.length()){
            System.out.println(-1);
            return;
        }

        if(!areAnagrams(A,B)){
            System.out.println(-1);
            return;
        }

        char[] a=A.toCharArray();

        int swap=0;
        for(int i=0;i<n;i++){
            if(a[i]==B.charAt(i)){
                continue;
            }
            int j=i+1;
            while(j<n && a[j]!=B.charAt(i)){
                j++;
            }
            if(j==n){
                System.out.println(-1);
                return;
            }
            for(int k=j;k>i;k--){
                char temp=a[k];
                a[k]=a[k-1];
                a[k-1]=temp;
                swap++;
            }

        }
        System.out.println(swap);
    }
    private static boolean areAnagrams(String A,String B){
        int[] f=new int[256];

        for(char c:A.toCharArray())f[c]++;
        for(char c:B.toCharArray())f[c]--;
        for(int freq:f)if(freq!=0) return false;
        return true;
    }
}
