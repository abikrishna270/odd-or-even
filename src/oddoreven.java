import java.util.Scanner;
public class oddoreven {
public static void main(String args[]){
    System.out.println("ENTER THE NUMBER TO BE CHECK:");
    Scanner abi=new Scanner(System.in);
    int num=abi.nextInt();
    if(num%2==0){
        System.out.println("even number");
    }
    else{
        System.out.println("odd number");
    }
}
}
