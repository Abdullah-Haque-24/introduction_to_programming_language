import java.util.Scanner;
class Count_Me_3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=0; i<t; i++){
            String str=sc.nextLine();
            int cap=0, small=0, num=0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j)>='A' && str.charAt(j)<='Z') cap++;
                if(str.charAt(j)>='a' && str.charAt(j)<='z') small++;
                if(str.charAt(j)>='0' && str.charAt(j)<='9') num++;
            }
            System.out.println(cap+" "+small+" "+num);
        }
        sc.close();
    }
}