import java.util.Arrays;
public class FilterArrayOfString {
    public static void main(String[] args) {
        //create an array of string with some names: Truc, Kelly, Vu, Kado, Marine, Mata
        String[] arrayOfNames = {"Truc","Kelly","Vu","Kado","Marine","Mata"};
        FilterArrayOfString filterArrayOfString = new FilterArrayOfString();

        System.out.println("Change to Uppercase");
        filterArrayOfString.changeToUpperCase(arrayOfNames);

        System.out.println("Replace Mata with Nha");
        filterArrayOfString.replaceMataWithNha(arrayOfNames);

        System.out.println("Replace Vu out of array");
        filterArrayOfString.removeVuOutOfArray(arrayOfNames);

    }

    //
    void changeToUpperCase (String[] arrayOfNames){
        for (String elementString:arrayOfNames) {
            System.out.print(elementString.toUpperCase()+ " ");
        }
    }

    //Replace “Mata” with “Nha”
   void replaceMataWithNha(String[] arrayOfNames){
       for (String elementString:arrayOfNames) {
           if(elementString == "Mata"){
               System.out.print("Nha" + " ");
           } else {
               System.out.print(elementString+ " ");
           }

       }
    }

    //Remove Vu out of the array
    void removeVuOutOfArray(String[] arrayOfNames){
        for (String elementString:arrayOfNames) {
            if(elementString == "Vu"){
               continue;
            }
            System.out.print(elementString+" ");

        }
    }

}
