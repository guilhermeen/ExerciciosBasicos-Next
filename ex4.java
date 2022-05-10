import java.util.Scanner;

public class Main{
public static void main (String[] args) {
    Scanner n = new Scanner(System.in);
    System.out.print("Digite o valor maximo da sequencia. ");
    int num = n.nextInt();
    
    int first =0;
    int second =1;
    int next;
    
    System.out.print(first+" "+second+" ");
    
    for(int i=2;i<num;i++){
        next=first+second;
        
        System.out.print(next+ " ");
    
        first=second;
        second=next;
        
    }
    }
}
