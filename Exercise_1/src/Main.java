import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Question 1 (calculate IBM)
        System.out.println("Please enter your weight");
        double weight = input.nextDouble();
        System.out.println("Please enter your height");
        double height = input.nextDouble();

        double power = Math.pow(height,2);
        double bmi = weight/power ;

        System.out.println("Your BMI = "+bmi);

        //******************************************************
        //Question 2 (Calculate Percentage)
        System.out.println("Please enter obtained mark");
        double obtained = input.nextDouble();
        System.out.println("Please enter total marks");
        double total = input.nextDouble();

         double calculatePercentage = obtained * 100 / total;

        System.out.println("Percentage = "+calculatePercentage+"%");


        //*********************************************************
        //Question 3 (Convert currency)
        System.out.println("Please enter the first currency amount ");
        double currency1 = input.nextDouble();
        System.out.println("Please enter exchange rate");
        double exchange = input.nextDouble();

        double output_Of_Convert = currency1*exchange;
        System.out.println("Expected output = "+output_Of_Convert);

        //*********************************************************
        //Question 4(Find length and reverse)

        System.out.println("Please enter String");
        StringBuilder  str  = new StringBuilder(input.nextLine());
        System.out.println("String length : "+str.length());
        System.out.printf("Reversed String : "+str.reverse());

        //*********************************************************
        //Question 5 (Extract substring)
        System.out.println("Please enter String");
        String str1 = input.nextLine();

        System.out.println("Please enter start index");
        int start = input.nextInt();

        System.out.println("Please enter end index");
        int end = input.nextInt();

        System.out.println("Substring is: "+str1.substring(start,end));


        //*********************************************************
        //Question 6 (Find kye word)

        System.out.println("Please enter String");
        String str2 = input.nextLine();
        System.out.println("Please enter key word");
        String keyWord = input.nextLine();

        System.out.println(str2.contains(keyWord));

        //*********************************************************
        //Question 7 (Replace)


        System.out.println("Please enter String");
        String str3 = input.nextLine();
        System.out.println("Please enter a word to replace");
        String word = input.nextLine();

        System.out.println("Please enter a replacement word ");
        String replacment_Word = input.nextLine();
        System.out.println(str3.replaceAll(word,replacment_Word ));

        //*********************************************************
        //Question 8 (Is the tow strings equals or not )


        System.out.println("Please enter first String");
        String string1 = input.nextLine();
        System.out.println("Please enter second string");
        String string2 = input.nextLine();

        System.out.println(string1.equalsIgnoreCase(string2) ? "The strings are equal (ignoring case)" : "The strings are not equal");

    }
    }

