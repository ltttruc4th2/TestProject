public class FilterArrayOfInteger {
    public static void main(String[] args) {
        int arrayInt[] = {1,5,3,7,6,10,20,30,40, 17, 22, 25, 27, 1,2};
        FilterArrayOfInteger filterArrayOfInteger = new FilterArrayOfInteger();

        System.out.println("This is to print Odd numbers");
        filterArrayOfInteger.printOddNumbers(arrayInt);

        System.out.println();

        System.out.println("This is to print Even numbers");
        filterArrayOfInteger.printEvenNumber(arrayInt);

        System.out.println();

        System.out.println("This is to print a new array contain element > 10");
        filterArrayOfInteger.printGreaterThanTenNumbers(arrayInt);

        System.out.println();

        System.out.println("This is to return a new array that plus each member of array to 100");
        filterArrayOfInteger.printNewArrayOfNewNumbers(arrayInt);

        /*System.out.println("This is to find and remove duplicate numbers");
        filterArrayOfInteger.findAndRemoveDuplicateNumbers(arrayInt);*/


    }

    //Print out all Odd numbers
    void printOddNumbers(int arrInt[]){
        for (int elementNumber:arrInt) {
            if(elementNumber % 2 != 0){ //check if odd number
                System.out.print(elementNumber + " ");
            }
        }
    }

    //Print out even numbers
    void printEvenNumber(int arrInt[]){
        for (int elementNumber:arrInt) {
            if(elementNumber % 2 == 0) { //check if even number
                System.out.print(elementNumber + " ");
            }
        }
    }

    //This function is to print out all numbers which are greater than 10 in the array
    void printGreaterThanTenNumbers(int arrInt[]){
        for (int elementNumber:arrInt){
            if(elementNumber > 10){
                System.out.print(elementNumber + " ");
            }
        }
    }
    //Return a new array that plus each member of array to 100
    void printNewArrayOfNewNumbers (int[] arrInt){
        int newInteger;
        for (int elementNumber:arrInt){
            newInteger = elementNumber + 100;
            System.out.print(newInteger + " ");
        }
    }

    /*void printArray(int arrInt[]){
        for (int elementNumber:arrInt){
                System.out.print(elementNumber + " ");
        }
    }*/

    //Filter a new array that not contain duplicated items
    void findAndRemoveDuplicateNumbers(int arrInt[]){
        int[] newArrayNoDuplicateItems;
        for (int countElement = 0; countElement < arrInt.length-1; countElement++)
        {
            for (int countOfNumberToCheck = countElement+1; countElement < arrInt.length; countOfNumberToCheck++)
            {
                if ((arrInt[countElement] == arrInt[countOfNumberToCheck]) && (countElement != countOfNumberToCheck))
                {
                    //Remove the integer.
                }
            }
        }

    }
}
