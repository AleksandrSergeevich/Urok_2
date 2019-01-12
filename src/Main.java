public class Main {

    public static void main(String[] args) {
        arr();
        arrOne();
        arrMultiply();
        arrMany();
    }

    public static void arr() {
        int [] a = new int[] {1,0,1,0,1,0,0,0,0,1,1};
        // выводит индекс масива
        for (int i = 0; i < a.length ; i++) {
            System.out.print(i);
        }
        // выводит то что находится в масиве вариант №1
        System.out.println();
            for (int i = 0; i < a.length ; i++){
                System.out.print(a[i]);
            }
        // выводит то что находится в масиве вариант №2
        System.out.println();
        for (int i : a){
            System.out.print(i);
        }
        // инверсирует значение масива
        System.out.println();
        for(int i = 0; i < a.length; i++)
            if(a[i] == 1) {
                a[i] = 0;
            }else a[i] = 1;
        for(int i = 0; i < a.length; i++){
            System.out.print ( a[i]);
        }
        System.out.println();
        System.out.println();
    }
    
    public static void arrOne(){
        int [] a = new int[8];
        int j = 0;
        for (int i = 0; i <a.length ; i++, j =j +3) {
           a[i] = j;
            System.out.print(a[i] +" ");
        }
        System.out.println();
        System.out.println();
    }
    public static void arrMultiply(){
        int[] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i <arr.length ; i++) {
           if (arr[i] < 6)
               arr[i] = arr[i]*2;
        }
        for (int i = 0; i <arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void arrMany() {
        int[][] table = new int[4][4];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (i < j) {
                    table[i][j] = 0;
                } else if (i > j) {
                    table[i][j] = 0;
                } else if (i < j){
                    table[i][j] = 1;
                } else if (i > j) {
                    table[i][j] = 0;
                } else{
                    table[i][j] = 1; }
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

    }
}