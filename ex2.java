class Main {
  public static void main(String[] args) {
    int x,y,z;
    int aux;
    x=10;
    y=23;
    z=76;

    int[] lista ={x,y,z};
    for(int i=1;i<lista.length;i++) {
      for(int j;j<lista.length;j++) {
        if(lista[j]>lista[j+1]){
          aux=lista[j];
          lista[j]=lista[j+1];
          lista[j+1]=aux;
        }
      }  
    }
    int k = 0;
    while(k<lista.length){
      System.out.print(lista[k]+", ");
      k++;
    }
  }
}
