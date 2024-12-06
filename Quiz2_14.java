import java.util.Scanner;
public class Quiz2_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String[] books = {"Database", "Mathematics", "Algorithm"};
        int[][] stock = {
                {20, 4, 1},
                {40, 7, 0}, 
                {50, 20, 10}
        };
        System.out.println("Book\t\tIn Stock\tDamaged Stock\tOut-of-stock");
        for (int i = 0; i < stock.length; i++) {
            System.out.println(books[i] + "\t\t" + stock[i][0] + "\t\t" + stock[i][1] + "\t\t" + stock[i][2]);
        }
        int i = 0;
        i += 20;
        i -= 4;
        i -= 1;
        i += 40;
        i -= 7;
        i += 50;
        i -= 20;
        i -= 10;
        System.out.println("Total book in the library can still borrowed : " + i);
        System.out.println("The book with largest number can be borrowed is : " + books[2]);
        System.out.println("Name of book that are heavily borrowed : " + books[0]);
    }
}
       