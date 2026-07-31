package practice21;
import java.util.Scanner;


public class FrequencyCheck {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Enter your number to store in Array: ");
        long num = sc.nextLong() ;
        int[] count =new int[10];

        while(num>0){
            int digit = (int)(num%10);
            count[digit]++;
            num = num/10;
        }

        for(int i = 0; i<count.length;i++){
            if(count[i]>0){
                System.out.println(" Digit " + i + ":" + count[i] + "times");
        }

    }
    
}
}

