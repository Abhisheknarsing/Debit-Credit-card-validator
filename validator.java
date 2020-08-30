import java.util.Scanner;
public class Validator
{

     public static void main(String []args)
     {
        System.out.println("Enter Card Number\n");
        String s = new Scanner(System.in).nextLine();
        System.out.println(validataCard(s));
     }
     public static boolean validataCard(String sixteenDigitString)
     {
        int sum = 0;
        if (sixteenDigitString.length() != 16){
            return false;
        }
        else{
            for (int temp=0;temp<16;temp++){ 
                if(temp%2==0){    
                    int value = Character.getNumericValue(sixteenDigitString.charAt(temp));
                    value = value+value;
                    if(value>9){
                        sum = sum+1+value%10;
                    }
                    else{
                        sum=sum+value;
                    }
                }
                else{     
                    sum=sum+Character.getNumericValue(sixteenDigitString.charAt(temp));
                }
            }            
        }
        return sum%10==0;
     }
}
