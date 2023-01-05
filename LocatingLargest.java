// Name : Hasnat Jani Rafin
// ID : 20172507
import java.util.Scanner;
public class LocatingLargest {
    public static int[] llg(double[][] a) {
        int[] addrss = new int[]{0, 0};
        double lrgst = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (lrgst < a[i][j]) {
                    lrgst = a[i][j];addrss[0] = i;addrss[1] = j;}
            }
        }return addrss;
    }
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        System.out.print("Enter the number of Rows and Columns in the array: ");
        int rows = scrn.nextInt();
        int columns = scrn.nextInt();
        double[][] iArry = new double[rows][columns];
        System.out.println("Enter the array:");
        for (int i = 0; i < iArry.length; i++) {
            for (int j = 0; j < iArry[i].length; j++) {
                iArry[i][j] = scrn.nextDouble(); }}
        int[] addrss = llg(iArry);
        System.out.printf(" The location of the largest element is (%d, %d)%n", addrss[0], addrss[1]);
        }
}
