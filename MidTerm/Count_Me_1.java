import java.util.Scanner;
public class Count_Me_1{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(), two=0, three=0;
        for(int i=0; i<n;i++){
            int x=s.nextInt();
            if(x%2==0) two++;
            if(x%3==0 && x%2!=0) three++;
        }
        System.out.println(two+" "+three);
        s.close();
    }
}