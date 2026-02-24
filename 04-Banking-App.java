import java.util.Scanner;

class BankDetails 
{

    private String accno;
    private String name;
    private String acc_type;
    private long balance;

    Scanner sc = new Scanner(System.in);

    public void openAccount() 
	{
        System.out.print("Enter Account No: ");
        accno = sc.next();

        System.out.print("Enter Account Type: ");
        acc_type = sc.next();

        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Balance: ");
        balance = sc.nextLong();
    }

    public void showAccount() 
	{
        System.out.println("\nName: " + name);
        System.out.println("Account No: " + accno);
        System.out.println("Account Type: " + acc_type);
        System.out.println("Balance: " + balance);
    }

    public void deposit() 
	{
        System.out.print("Enter amount to deposit: ");
        long amt = sc.nextLong();
        balance += amt;
        System.out.println("Updated Balance: " + balance);
    }

    public void withdrawal() 
	{
        System.out.print("Enter amount to withdraw: ");
        long amt = sc.nextLong();

        if (balance >= amt) 
		{
            balance -= amt;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public boolean search(String ac_no) 
	{
        if (accno.equals(ac_no)) 
		{
            showAccount();
            return true;
        }
        return false;
    }
}

public class Main 
{

    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);

        System.out.print("How many customers? ");
        int n = sc.nextInt();

        BankDetails[] C = new BankDetails[n];

        for (int i = 0; i < C.length; i++)
			{
            C[i] = new BankDetails();
            C[i].openAccount();
            }

        int ch;

        do 
		{
            System.out.println("\n1.Display\n2.Search\n3.Deposit\n4.Withdraw\n5.Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) 
			{

                case 1:
                    for (BankDetails account : C)
                        account.showAccount();
                    break;

                case 2:
                    System.out.print("Enter account no: ");
                    String ac_no = sc.next();
                    boolean found = false;

                    for (BankDetails account : C) {
                        if (account.search(ac_no)) {
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Account not found!");
                    break;

                case 3:
                    System.out.print("Enter account no: ");
                    ac_no = sc.next();
                    found = false;

                    for (BankDetails account : C)
						{
                        if (account.search(ac_no)) 
						{
                            account.deposit();
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Account not found!");
                    break;

                case 4:
                    System.out.print("Enter account no: ");
                    ac_no = sc.next();
                    found = false;

                    for (BankDetails account : C)
						{
                        if (account.search(ac_no)) 
						{
                            account.withdrawal();
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Account not found!");
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (ch != 5);
    }
}
