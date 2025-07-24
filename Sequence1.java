import java.util.Scanner;
public class Sequence1 {

    public static int sum(int a , int b){
        int add = a+b;

        int mul = add *2;
    
        return mul - 10;
        
    }
   

    

    public static void main(String [] args){

        Scanner s = new Scanner(System.in);

        System.out.print("Enter The First Number :");
        int num1 = s.nextInt();

        System.out.print("Enter The Second Number :");
        int num2 = s.nextInt();

        
        System.out.print(sum(num1,num2));

        

        


    }
    
}
