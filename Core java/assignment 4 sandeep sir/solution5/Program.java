package in.solution5;

public class Program {
    public static void main(String[] args) {
        TollBoothRevenueManager manager = new TollBoothRevenueManager(50.0, 100.0, 30.0);
        TollBoothRevenueManagerUtil util = new TollBoothRevenueManagerUtil(manager);
        
        util.menuList();
    }
}
