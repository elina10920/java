
public class Account {
    public int money ; //放使用者餘額
    public void open(int a)
    {
        if(a<1000){ //開戶金額不能小於1000
            System.out.println("開戶金額不足");
        }
        else{
            System.out.println("開戶成功！存入$"+a+"元");
            money+=a;
        }
    }
    public void save(int b){
        if(b<0){ //存錢的金額不能是負數
            System.out.println("存款失敗！請輸入非負數值！");
        }
        else{
            System.out.println("成功存入＄"+b+"元");
            money+=b;
        }
    }
    public void withdraw(int c){
        if(c>money){ //不能領高於自己存款的錢
            System.out.println("提款失敗！提領金額大於目前餘額！");
        }
        else{
            System.out.println("成功提領出＄"+c+"元");
            money-=c;
        }
    }
    public void show (){ //顯示目前餘額
        System.out.println("目前餘額為＄"+money+"元");
    }
public static boolean isNumeric(String str){  //用來判斷是否為數字
    for (int i = str.length();--i>=0;){    
        if (!Character.isDigit(str.charAt(i))){  
            return false;  
        }  
    }  
    return true;  
}  
}
