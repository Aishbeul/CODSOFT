import java.util.Scanner;

public class CurrencyConverter {

    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter!");

        // Display supported currencies and their exchange rates to INR
        System.out.println("Supported currencies and their exchange rates to INR:\n" +
                "US Dollar: 0.011987\n" +
                "Euro: 0.011152\n" +
                "British Pound: 0.009421\n" +
                "Australian Dollar: 0.0179631\n" +
                "Canadian Dollar: 0.016433\n" +
                "Singapore Dollar: 0.016190\n" +
                "Swiss Franc: 0.010595\n" +
                "Malaysian Ringgit: 0.056428\n" +
                "Japanese Yen: 1.893112\n" +
                "Chinese Yuan Renminbi: 0.086987\n"+"Indian Rupee: 1");

        // Array of currency names
        String[] cn = {
            "US Dollar",
            "Euro",
            "British Pound",
            "Australian Dollar",
            "Canadian Dollar",
            "Singapore Dollar",
            "Swiss Franc",
            "Malaysian Ringgit",
            "Japanese Yen",
            "Chinese Yuan Renminbi","Indian Rupee"
        };

        // Array of exchange rates
        double[] er = {
            0.011987,    // US Dollar
            0.011152,    // Euro
            0.009421,    // British Pound
            0.0179631,   // Australian Dollar
            0.016433,    // Canadian Dollar
            0.016190,    // Singapore Dollar
            0.010595,    // Swiss Franc
            0.056428,    // Malaysian Ringgit
            1.893112,    // Japanese Yen
            0.086987,    // Chinese Yuan Renminbi
            1.000000     //Indian Rupee
        };

        // Input amount and currency to convert from
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();  // Consume newline left-over

        System.out.print("Enter the currency to convert from (e.g., US Dollar,Singapore Dollar,Euro,etc): ");
        String fromCurrency = scanner.nextLine();

        // Input currency to convert to
        System.out.print("Enter the currency to convert to (e.g., US Dollar,Singapore Dollar,Euro,etc): ");
        String toCurrency = scanner.nextLine();

        // Find indices for fromCurrency and toCurrency
        int m = -1, n = -1;
        for (int i = 0; i < cn.length; i++) {
            if (fromCurrency.equals(cn[i])) {
                m = i;
            }
            if (toCurrency.equals(cn[i])) {
                n = i;
            }
            // Exit loop early if both indices are found
            if (m != -1 && n != -1) {
                break;
            }
        }

        // Validate if currencies are found
        if (m == -1 || n == -1) {
            System.out.println("One or both currencies are not supported.");
        } else {
            // Convert the amount
            double convertedAmount = (amount / er[m]) * er[n];

            // Display the result
            System.out.println(amount + " " + fromCurrency + " = " + convertedAmount + " " + toCurrency);
        }

    }
}