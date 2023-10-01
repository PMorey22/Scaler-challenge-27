import java.util.ArrayList;

public class GFG_changebit {
    public static void main(String[] args) {
        int N = 29, D = 2;
        System.out.println(rotate(N,D));
    }

    static ArrayList<Integer> rotate(int N, int D) {
        ArrayList<Integer> result = new ArrayList<>();
        
        // Ensure D is within bounds
        D = D % 16;
        
        // Convert N to binary representation as a string
        String binaryN = String.format("%16s", Integer.toBinaryString(N)).replace(' ', '0');
        
        // Perform left rotation
        String leftRotatedBinary = binaryN.substring(D) + binaryN.substring(0, D);
        int leftRotatedDecimal = Integer.parseInt(leftRotatedBinary, 2);
        result.add(leftRotatedDecimal);
        
        // Perform right rotation
        String rightRotatedBinary = binaryN.substring(16 - D) + binaryN.substring(0, 16 - D);
        int rightRotatedDecimal = Integer.parseInt(rightRotatedBinary, 2);
        result.add(rightRotatedDecimal);
        
        return result;
    }
}
