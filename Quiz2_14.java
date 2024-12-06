public class Quiz2_14 {
    public static void main(String[] args) {
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
       int totalBorrowable = 0;
       for (int i = 0; i < stock.length; i++) {
               totalBorrowable += stock[i][0]; 
           }
       System.out.println("\nTotal books that can still be borrowed: " + totalBorrowable);
       int maxBorrowable = 0;
       String maxBook = "";
       for (int i = 0; i < stock.length; i++) {
           if (stock[i][0] > maxBorrowable) {
               maxBorrowable = stock[i][0];
               maxBook = books[i];
           }
       }
       System.out.println("The book with the largest number of books that can be borrowed is: " + maxBook);
       System.out.println("\nBooks that are heavily borrowed:");
       for (int i = 0; i < stock.length; i++) {
           if (stock[i][0] > 30) { 
               System.out.println(books[i]);
           }
       }
   }
   
   
}