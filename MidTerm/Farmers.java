import java.util.Scanner;
public class Farmers{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0; i<t; i++){
            int M1=s.nextInt();
            int M2=s.nextInt();
            int D=s.nextInt();
            int x=(M1*D)/(M1+M2);
            D-=x;
            System.out.println(D);
        }
        s.close();
    }
}