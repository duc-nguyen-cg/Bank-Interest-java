public class bankInterest {
    public static void main(String[] args){
        double money = 100000000;
        int month = 3;
        double interest_rate = 0.055;
        double total = money;
        for (int i=1; i <= month; i++){
            total += money*(interest_rate/12)*month;
        }
        System.out.println("Total Interest = "+total);
    }
}
