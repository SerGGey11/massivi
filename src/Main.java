public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {
        int[] n1 = {1, 2, 3};
        double[] n2 = {1.57, 7.654, 9.986};
        int[] n3 = {90, 91, 93, 92, 85, 87, 84, 83, 0, 0, 0, 0};
    }

    public static void task2() {
        int[] n1 = {1, 2, 3};
        for (int i = 0; i < n1.length; i++) {
            if (i == n1.length - 1) {
                System.out.println(n1[i]);
                break;
            }
            System.out.print(n1[i] + ", ");
        }
    }

    public static void task3() {
        double[] n2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < n2.length; i++) {
            if (i == n2.length - 1) {
                System.out.println(n2[i]);
                break;
            }
            System.out.print(n2[i] + ", ");
        }
    }

    public static void task4() {
        int[] n3 = {90, 91, 93, 92, 85, 87, 84, 83, 0, 0, 0, 0};
        for (int i = 0; i < n3.length; i++) {
            if (i == n3.length - 1) {
                System.out.println(n3[i]);
                break;
            }
            System.out.print(n3[i] + ", ");
        }
    }

    public static void task5() {
        int[] n1 = {1, 2, 3};
        for(int i = n1.length - 1; i >= 0; i--){
            if (i == 0){
                System.out.println(n1[i]);
                break;
            }
            System.out.print(n1[i] + ", ");
        }
    }
    public static void task6(){

    }
}



