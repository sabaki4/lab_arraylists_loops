import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Tiree");
        scottishIslands.add("Jura");
        scottishIslands.add("Islay");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");
        scottishIslands.add("Coll");
        scottishIslands.remove("Tresco");
        scottishIslands.remove(5);
        Collections.sort(scottishIslands);

        for (int i = 0; i < scottishIslands.size(); i++) {
            System.out.println(scottishIslands.get(i));
        }

//        1. Add "Coll" to the end of the list
//        2. Add "Tiree" to the start of the list
//        3. Add "Islay" after "Jura" and before "Mull"
//        4. Print out the index position of "Skye"
//        5. Remove "Tresco" from the list by name
//        6. Remove "Arran" from the list by index
//        7. Print the number of islands in your arraylist
//        8. Sort the list alphabetically
//        9. Print out all the islands using a for loop

        System.out.println(scottishIslands.get(4));
        System.out.println(scottishIslands);
        System.out.println(scottishIslands.size());
        System.out.println("Sorted ArrayList " + "in Ascending order : " + scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for(int i = 0; i< numbers.size();i++) {
            if (numbers.get(i)%2 == 0) {
                evenNumbers.add(numbers.get(i));
            }
        }
        System.out.println(evenNumbers);

//        2. Print the difference between the largest and smallest value
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        int result = max - min;

        System.out.println("Result: " + result);

//        3. Print True if the list contains a 1 next to a 1 somewhere.
       boolean value = false;
        for(int i = 0; i< numbers.size();i++) {
            if (numbers.get(i) == 1 && numbers.get(i+1) == 1) {
                value = true;
            }

        }
        System.out.println(value);
//        4. Print the sum of the numbers,
        int sum = 0;
        for(int i = 0; i< numbers.size();i++) {
            sum = sum + numbers.get(i);
        }
        System.out.println(sum);
//        5. Print the sum of the numbers...
        int sum2 = 0;
        for(int i = 0; i< numbers.size();i++) {
            if (numbers.get(i) == 13) {
                break;
            }
            else {
                sum2 = sum2 + numbers.get(i);
            }
        }
        System.out.println(sum2);
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.

    }

}
