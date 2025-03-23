import java.util.*;
public class smartclassromm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] readings=new int[5][4];

        int total=20;
        int[] input=new int[total];

        for(int i=0;i<total;i++){
            if(!sc.hasNextInt()){
                System.out.println("INVALID INPUT");
                return;
            }
            int value=sc.nextInt();

            if(value<10 || value>200){
                System.out.println("INVALID INPUT");
                return;
            }
            input[i]=value;
        }
        int idx=0;
        for(int t=0;t<4;t++){
            for(int s=0;s<5;s++){
                readings[s][t]=input[idx++];
            }
        }
        int[] avg=new int[5];
        int highavg=0;

        for(int s=0;s<5;s++){
            int sum=0;
            for(int t=0;t<4;t++){
                sum+=readings[s][t];
            }
            avg[s]=Math.round((float)sum/4);
            if(avg[s]>highavg){
                highavg=avg[s];
            }
        }
        if(highavg<50){
            System.out.println("Energy consumption is optimal");
        }
        else{
            for(int i=0;i<5;i++){
                if(avg[i]==highavg){
                    System.out.println("Sensor Number: "+ (i+1));
                }
            }
        }
    }
}