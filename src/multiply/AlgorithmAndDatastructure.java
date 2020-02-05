package multiply;

import java.util.List;

/**
 * Class containing method that tests execution time of algorithmic
 * operations involving multiplication on Integers using different data structures.
 */
public class AlgorithmAndDatastructure {

    /**
     * Construct a MultiplyAndDatastructure.
     */
    public AlgorithmAndDatastructure() {	}

    /**
     * Multiplies the first element from the beginning with the first element from
     * the end, the second element from the beginning with the second element from
     * the end etc and returns the sum of all multiplications.
     *
     * @param numberList a List containing Integers
     * @return the sum
     */
    public long multiplySome(List<Integer> numberList) {
        //check that the list contains an even amount of elements
        if ((numberList.size()%2 != 0 )){
            throw new IllegalArgumentException("List has to contain an even number of elements!");
        }

        long sum = 0;

        /* TODO: Write code that multiplies the first element from the beginning
         * with the first element from the end, the second element from the
         * beginning with the second element from the end etc. Increase the variable
         * sum with the result of each multiplication.
         */
        for (int i = 0; i < (numberList.size() / 2); i++) {
            int number1 = numberList.get(i);                           //get and save a reference to the left-side element
            int number2 = numberList.get(numberList.size() - (i + 1)); //get and save a reference to the right-side element
            sum += (number1 * number2);                                //add both numbers to the sum
        }

        return sum;
    }
    /**
     * Multiplies all elements in the List with all the other elements
     * and returns the sum of all multiplications.
     *
     * @param numberList a List containing Integers
     * @return the sum
     */
    public long multiplyAll(List<Integer> numberList) {
        if ((numberList.size()%2 != 0 )){
            throw new IllegalArgumentException("List has to contain an even number of elements!");
        }

        long sum = 0;

        /* TODO: Write code that multiplies all elements in the List
         * with all the other elements. Increase the variable
         * sum with the result of each multiplication.
         */
        //this outer loop keeps track of which element in the order is being multiplied with all subsequent elements
        for (int i = 0; i < numberList.size(); i++){
            int current = numberList.get(i);
            int tmpSum = 0;
            /*
             * This inner loop keeps track of the current element being multiplied with,
             * the only confusing thing going on here is that in order to only multiply
             * with the numbers on the right side of the current number from the outer loop
             * instead of with all numbers in the list the numberIndex must be set to i + 1.
             * The +1 makes sure we don't multiply the number with itself.
             */
            for (int numberIndex = i + 1; numberIndex < numberList.size(); numberIndex++){
                //current is the static numberIndex from the out loop, numberIndex is the index of the current item to be multiplied with
                tmpSum += (current * numberList.get(numberIndex));
            }
            sum += tmpSum;

        }
        return sum;
    }
}