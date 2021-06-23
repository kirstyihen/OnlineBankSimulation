import java.util.Scanner;
public class DepositGrowth{
    
    public static void main(String[] ags){
      
      double interestRate= 0.005;
      Scanner input= new Scanner(System.in);
      System.out.println("Welcome to FinTech Bank valued customer! Enter balance:
                         ");
      int balance= input.nextInt();
      double firstMonth= (int)balance + (int)balance * interestRate;
      double secondMonth= firstMonth + firstMonth * interestRate;
      double thirdMonth= secondMonth+ secondMonth * interestRate;
      System.out.println("Annual interest rate="+interestRate*100+"%");
      System.out.println("After first month:"+firstMonth);
      System.out.println("After second month:"+secondMonth);
      System.out.println("After third month:"+thirdMonth);
                       
