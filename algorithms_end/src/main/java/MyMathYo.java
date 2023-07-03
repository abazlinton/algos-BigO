public class MyMathYo {

    // O(n²) - exponential time complexity ❤️
    public static int squareByCounting(int n){
        int count = 0;
        for(int column = 0; column < n; column++){
            for(int row = 0; row < n; row++){
                count++;
            }
        }
        return count;
    }

    //  O(n) - linear time complexity
    public static int squareByAddition(int n){
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + n;
        }
        return sum;
    }

    // O(1) - constant time complexity
    public static int squareByLookup(int n){
        int[] lookupTable = { 0, 1, 4, 9, 16, 25 };
        return lookupTable[n];
    }

}
