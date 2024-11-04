import java.util.Scanner;
public class RunBloodData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter blood type of patient (O, A, B, AB): ");
        String inputBloodType = scan.nextLine().trim();
        
        System.out.print("Enter the Rhesus factor (+ or -): ");
        String inputRhFactor = scan.nextLine().trim();
        
        BloodData bd;
        if (!inputBloodType.isEmpty() && !inputRhFactor.isEmpty()) {
            bd = new BloodData(inputBloodType, inputRhFactor);
        } else {
            bd = new BloodData();
        }
        bd.display();
        scan.close();
    }
}