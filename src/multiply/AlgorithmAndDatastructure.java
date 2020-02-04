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

        if ((numberList.size()%2 != 0 )){
            throw new IllegalArgumentException("List has to contain an even number of elements!");
        }

        long sum = 0;

        /* TODO: Write code that multiplies the first element from the beginning
         * with the first element from the end, the second element from the
         * beginning with the second element from the end etc. Increase the variable
         * sum with the result of each multiplication.
         */

        //loop through the list, adding the numbers and removing the item, until list is empty
        while (!numberList.isEmpty()){
            int number1 = numberList.get(0);                        //get the first element and save a reference to it
            int number2 = numberList.get(numberList.size() - 1);    //get the last element and save a reference to it
            sum += (number1 + number2);                             //add both numbers to the sum
            //ordering is important here, if the call using .size()
            //comes after removing the first number the second remove will throw an index out of bounds
            numberList.remove(numberList.size() - 1);        //remove the last element from the list
            numberList.remove(0);                            //remove the first element from the list
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
        while (numberList.size() > 1){
            int current = numberList.get(0);
            numberList.remove(0);

            int tmpSum = 0;
            for (Integer i : numberList){
                tmpSum += current * i;
            }

            sum += tmpSum;
        }


        return sum;
    }
}