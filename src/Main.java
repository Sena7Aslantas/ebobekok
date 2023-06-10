import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1,n2;
        Scanner input=new Scanner(System.in);
        System.out.print("n1 sayısıni girin:");
        n1=input.nextInt();
        System.out.print("n2 sayısıni girin:");
        n2=input.nextInt();
        int i=1;

        int ebob=1;
        int ekok=1;

        if(n1<n2){
            while(i<=n1){
                if(n1%i==0 && n2%i==0){

                    ebob=i;
                }

                 i++;

            }
            System.out.print("Ebob:"+ebob);
        }else if(n2<n1){
            while(i<=n2){
                if(n1%i==0 && n2%i==0){

                    ebob=i;
                }

                i++;

            }
            System.out.print("Ebob:"+ebob);
        }
        ekok=(n1*n2)/ebob;
        System.out.print("Ekok:"+ekok);



    }

    }
