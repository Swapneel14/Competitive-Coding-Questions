import java.util.Scanner;

public class gameofDoors {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        int tst= sc.nextInt();
        
        for(int i=1;i<=tst;i++){
            int l=sc.nextInt();
        int r=sc.nextInt();
        int L = sc.nextInt();
        int R= sc.nextInt();
            if(r<L||R<l){
                System.out.println(1);
            }
            else if(L==r||l==R){
                System.out.println(2);
            }
            else if(L==l&&r==R){
                System.out.println(R-L);
            }
               else if(l==L||r==R){
                System.out.println(Math.min(r,R)-Math.max(l,L)+1);
               }
               else{
                System.out.println(Math.min(r,R)-Math.max(l,L)+2);
               }
                System.out.println();
            }
            sc.close();
            
        }
    }

