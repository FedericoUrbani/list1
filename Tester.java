
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Tester {

    public static List<String> asList(List<String> list){

        return  list = Collections.unmodifiableList(list);
    }
    public static void main(String[] args) {

        List <String> cityNames= new ArrayList<String>();
        cityNames.add("Rome");
        cityNames.add("London");
        cityNames.add("Paris");

        List IcityNames=Tester.asList(cityNames);
        // IcityNames.add("lala"); i can't!!
        // IcityNames.set(1,"Berlin"); another mistake nooooo!!!
        for (Object a: IcityNames){
            System.out.print(a+" ");
        }
        System.out.println("\n-----------------------------------");
        List <String> kingsOfRome= new ArrayList<String>();
        kingsOfRome.add("Romolo");
        kingsOfRome.add("Numa Pompilio");
        kingsOfRome.add("Tullo Ostilio");
        kingsOfRome.add("Anco Marco");
        kingsOfRome.add("Tarquinio Prisco");
        kingsOfRome.add("Servio Tullio");
        kingsOfRome.add("Tarquinio il Superbo");
        for (Object a: kingsOfRome){
            System.out.println(a);
        }
        System.out.println("\n-----------------------------------");
        String [] kingsOfRomeToArray= kingsOfRome.toArray(new String[0]);
        kingsOfRomeToArray[6]="Tarquinius Supercar";
        for (Object a: kingsOfRomeToArray){
            System.out.println(a);
        }
    }

}

/**
 * define a testing class with a main() method where you:
 * create a not mutable List of strings called cityNames using asList() that you populate with 3 city names
 * try to add a 4th city name at the end of the List
 * if you get an exception, try to understand why and eventually comment the faulty code
 * try to change the 2nd item of the array, entering the value Tegucigalpa
 * print the content of cityNames
 * define a mutable empty List of strings called kingsOfRome
 * insert the names of the 7 kings of Rome into the mutable list
 * print the content of kingsOfRome
 * convert kingsOfRome into an array called kingsOfRomeArray, using new String[0] to determine the type of the array
 * change the value of the 7th king in kingsOfRomeArray with the value Lucius Tarquinius Supercar
 * print the content of kingsOfRomeArray
 */
