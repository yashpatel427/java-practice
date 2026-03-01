public class twodarr{
    public static void main(String[] args) {
       /* String[][] groceries ={{"apple", "banana", "kiwi"},
                               {"carrot", "onion", "tomato"},
                               {"meat", "fish", "prons"}};

        groceries[0][0] = "watermelon";

        for( String[] food : groceries){
            for( String foods : food){

            System.out.print(foods + " ");
            }
            System.out.println();
        }*/
       char [][] telephone = {{'1', '2', '3'},
                              {'4', '5', '6'},
                              {'7', '8', '9'},
                              {'*', '0', '#'}};
    
     for(char[] row : telephone){
        for (char numbers : row) {
          System.out.print(numbers + " ");  
        }
        System.out.println();
     }
    }
}