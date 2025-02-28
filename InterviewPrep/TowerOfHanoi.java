public class TowerOfHanoi {
    public static void towerOfHanoi(int total_disk, String src, String helper, String destination) {

        if(total_disk==1){
            System.out.println("Transfer disk " + total_disk + " from " + src + " to " + destination);
            return;
        }
        towerOfHanoi(total_disk - 1, src, destination, helper);
        System.out.println("Transfer disk " + total_disk + " from " + src + " to " + destination);

        towerOfHanoi(total_disk - 1, helper, src, destination);
    }

    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "S ","H ","D ");
    }
}
