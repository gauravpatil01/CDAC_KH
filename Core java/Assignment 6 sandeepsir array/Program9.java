package in.solution1;

/*You need to implement a system to manage airplane seat assignments.
*The airplane has seats arranged in rows and columns. Implement functionalities to:
Initialize the seating arrangement with a given number of rows and columns.
Book a seat to mark it as occupied.
Cancel a booking to mark a seat as available.
Check seat availability to determine if a specific seat is available.
Display the current seating chart.
*/
public class Program9 {
	String[][] setting;
	private int row;
	private int cols;

	public Program9(int row, int cols) {
		this.row = row;
		this.cols = cols;
		setting = new String[row][cols];

		// all seat at first available
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				setting[i][j] = "Available";
			}

		}

	}

	// available seat
	public void availableSeat(int row, int cols) {
		if (setting[row][cols].equals("Available")) {

			System.out.println("seat is  available");
		} else {
			System.out.println("seat is not available");
		}
	}

	public void bookSeat(int row, int cols) {
		if (setting[row][cols].equals("Available")) {
			setting[row][cols] = "occupied";
			System.out.println("you booked your seat");
		} else {
			System.out.println("seat occupied try for another one ");
		}
	}

	public void cancleBooking(int row, int cols) {
		if (setting[row][cols].equals("occupied")) {
			setting[row][cols] = "Available";
			System.out.println("you cancled your seat");
		} else {
			System.out.println("you not cancle your ticket now ");
		}
	}

	public void displayBooking() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(setting[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Program9 check = new Program9(10, 6);
		check.bookSeat(2, 3);
		check.availableSeat(2, 3);
		check.cancleBooking(2, 3);
		check.displayBooking();

	}

}
