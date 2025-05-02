import java.util.Scanner;
class Count_Me_4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int[] freq = new int[26];
        for(int i=0; i<str.length(); i++){
            freq[str.charAt(i)-'a']++;
        }
        for(int i=0; i<26; i++){
            if(freq[i]>0){
                System.out.println((char)(i+'a')+" - "+freq[i]);
            }
        }
    }
}