
import java.util.Scanner;
public class AccountTest{
    public static void main(String[] args){
        String input;
        Scanner scanner = new Scanner(System.in);
        Account acc = new Account();
        do{  
               System.out.println("***Main Menu***");
               System.out.println("1)開戶");
               System.out.println("2)存款");
               System.out.println("3)提款");
               System.out.println("4)目前餘額");
               System.out.print("please enter a number in [1,2,3,4,0]:");
               input = scanner.next(); //獲取用戶輸入 
               int num = Integer.parseInt(input); //型別轉換integer  
               int a; 
               
               switch(num){
               case 1:      //開戶            
                   if(acc.money==0){
                       System.out.println("請輸入開戶金額");
                       input = scanner.next();
                       if(acc.isNumeric(input)){ //使用者如果不是輸入數字就false
                            a = Integer.parseInt(input);
                            acc.open(a);    
                       }
                       else{
                           System.out.println("開戶失敗!請輸入正確金額!");
                       }                                                                                    
                   }
                   else{
                       System.out.println("已開戶！");
                   }
                   break;
               case 2:  //存款
                   System.out.println("請輸入存款金額：");
                   input = scanner.next();
                   int money_save = Integer.parseInt(input);
                   acc.save(money_save);
                   break;
               case 3:  //提款
                   System.out.println("請輸入提款金額：");
                   input = scanner.next();
                   int money_withdraw = Integer.parseInt(input);
                   acc.withdraw(money_withdraw);
                   break;
               case 4: //顯示目前餘額
                   if(acc.money!=0){
                       acc.show();
                   }
                   else{
                       System.out.println("未開戶！");
                   }
               }
        }while(!input.equals("0")); //如果按0就結束
    }
}

