package Part2;

/**
 * Created by Kye_Cook on 22/08/2016.
 */
public class CountByThrees {
    public static void main(String[] args) {

//        while (num < 300)
//            System.out.println(num+=3);
//    }

        for (int num = 3; num < 300; num += 3) {
            System.out.print(num + ", ");
            if(num % 30 == 0)
                    System.out.println("");
        }
    }
}