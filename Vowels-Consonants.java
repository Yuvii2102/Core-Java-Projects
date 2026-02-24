import java.util.Scanner;
public class VowelsConsonants 
{

    public static void main(String[] args) 
  {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of strings in the array: ");
        int n = sc.nextInt();
        sc.nextLine();  // consume newline

        String[] arr = new String[n];

        int totalVowels = 0;
        int totalConsonants = 0;

        System.out.println("Enter the strings:");

        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextLine();

            for (int j = 0; j < arr[i].length(); j++) 
            {
                char ch = Character.toLowerCase(arr[i].charAt(j));

                if (ch >= 'a' && ch <= 'z') 
                {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
                    {
                        totalVowels++;
                    } 
                    
                    else 
                    
                    {
                        totalConsonants++;
                    }
                }
            }
        }

        System.out.println("Total Vowels across all strings: " + totalVowels);
        System.out.println("Total Consonants across all strings: " + totalConsonants);

        sc.close();
    }
}
