import java.util.*;
public class ATMTransactions{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of transaction");
        int n=sc.nextInt();
        int transactions []=new int[n];
        System.out.println("enter the transactions(positive for deposit,negative for withdrawal)");
        for(int i=0;i<n;i++){
            transactions[i]=sc.nextInt();

            
        }
        int balance=0;
        for(int i=0;i<transactions.length;i++){
            balance +=transactions[i];
 
            }
        }
        System.out.println("Final balance: " +balance);



    }
}

