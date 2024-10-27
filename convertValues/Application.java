package convertValues;

import java.util.Scanner;

public class Application {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value into BYN");
        double value = scanner.nextDouble();
        ConvertValues convertValues = new ConvertValues(value);
        System.out.println("Enter what currency you want to convert to: 1.USD 2.EUR 3.RUB 4.KZT 5.JPY");
        int toValue = scanner.nextInt();

            switch (toValue) {
                case 1:
                    double convertedValueToUsd = convertValues.getBynToUsd();
                    System.out.println("Result " + convertedValueToUsd);
                    break;

                case 2:
                    double convertedValueToEur = convertValues.getBynToEur();
                    System.out.println("Result " + convertedValueToEur);
                    break;

                case 3:
                    double convertedValueToRub = convertValues.getBynToRub();
                    System.out.println("Result " + convertedValueToRub);
                    break;

                case 4:
                    double convertedValueToKzt = convertValues.getBynToKzt();
                    System.out.println("Result " + convertedValueToKzt);
                    break;

                case 5:
                    double convertedValueToJpy = convertValues.getBynToJpy();
                    System.out.println("Result " + convertedValueToJpy);
                    break;

                default:
                    System.out.println("No correct input data");
            }
            scanner.close();
        }
}
