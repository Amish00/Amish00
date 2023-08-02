package Arrays;

public class ARRAYexample {
    public void displayArray(){
        int numbers [] = new int[10];
        int sum = 0, total = 0;
        numbers[0] = 1;
        numbers[1] = 5;
        numbers[2] = 10;

        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

        for(int i=0; i<numbers.length;i++){
             sum = sum + numbers[i];
        }
        System.out.println("Sum of number[] = " + sum);

        for (int i: numbers) {
            total+=i;
            System.out.println(i);
        }
        System.out.println("Sum of number[] = " + total);
    }

    public void displayStringarray(){
        String stringArray[]={"Kist","Nccs","Virinchi"};
        System.out.println("This is index1 value = " + stringArray[1]);
        for (String s:stringArray
             ) {
            System.out.println(s);
        }
        for (String s: stringArray
             ) {
            if (s.equalsIgnoreCase("Nccs")){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
    }

    public void multidimensionArray(){
        String[][] array = {{"Java","C#", "C"}, {"Python","Js", "C++"}};
        System.out.println(array[0][0]);
        System.out.println(array[0][1]);
    }
}
