public class ProfitLoss{
    public static void main(String[] args){
        int cost =100, sell=150;
        if(sell>cost)
           System.out.println("Profit =" + (sell-cost));
        else if(cost >sell)
           System.out.println("Loss =" + (cost - sell));
        else 
           System.out.println("No Profit No Loss");
    }
}