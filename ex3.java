import java.util.Scanner;
class Main{
  public static void main (String[] args){
  Scanner n = new Scanner(System.in);

    int num = n.nextInt();
    long fatorial = 1;
    for(int i=1 ; i <= num ;i++){
      fatorial = fatorial * i;
  }

  System.out.println("O fatorial de " + num +" é igual a: " + fatorial);
  }
}
