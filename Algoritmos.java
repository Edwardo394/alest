import java.util.Scanner;
public class Algoritmos{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        for(int i=0;i<=n;i=i+10){
            int op=algoritmo1(i);
            System.out.println(i + " - " + op);
        }
}
public static int algoritmo1(int n){
            // Algoritmo 1
            
        
            int f = n;
            int i, j, k, res = 0;
            int cont_op = 0;
            for( i = n/2; i <= n; i += 3 ) {
            for( j = i; j <= i*i; j += 2 ) {
            for( k = i; k <= 2*j; k += 1 ) {
            res = res + n+j;
            cont_op++;
                        }
                    }
                }
            return cont_op;   
            }     
}