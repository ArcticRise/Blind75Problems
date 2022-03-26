package Binary_Ques;

public class SumTwoIntegers {
    public static void main (String [] args){
        System.out.println(getSum(9,11));
    }
    public static int getSum(int a, int b) {
        //B is the carry
        // A is the result
        while(b!=0){
            int temp = (a&b) << 1;
            a ^= b;
            b = temp;
        }
        return a;
    }
}
