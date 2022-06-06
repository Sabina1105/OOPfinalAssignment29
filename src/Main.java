import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    class Main {
  public static void main(String[] args) throws FileNotFoundException {

System.out.println("******************** DUOTECH BANK ACCOUNT MANAGEMENT APPLICATION ********************");
System.out.println("-------------------------------------------------------------------------------------");
String answer = "";
Scanner sc = new Scanner(System.in);
System.out.println("Please enter the name of the file to load: ");

System.out.println("-------------------------------------------------------------------");


String fileName = sc.nextLine();

System.out.println("-------------------------------------------------------------------");

System.out.println("All the information has been loaded and accounts are being generated...");
System.out.println("------------------------------------------------------------------");

System.out.println("Here is the list of bank accounts that have been created: ");
System.out.println("------------------------------------------------------------------");

do {

List<String[]> list = Utility.readFromCSV(fileName);

List<Account> ac = new ArrayList<>();

for (String[] st : list) {

if (st[2].equals("Checking")) {
Checking account = new Checking(st[0], st[1], Double.parseDouble(st[3]));

ac.add(account);
System.out.println(account.showInfo());
System.out.println("***********************************");

} else if (st[2].equals("Savings")) {
Savings account = new Savings(st[0], st[1], Double.parseDouble(st[3])) {
    @Override
    public void setInterestRate() {

    }
};
ac.add(account);
System.out.println(account.showInfo());
System.out.println("***********************************");
}
}
System.out.println("Would you like to add another file(y/n)");

answer = sc.next();

if (answer.equals("y")) {
System.out.println("Please enter the name of the file to load: ");
fileName = sc.next();
}
}
while (!answer.equals("n"));

System.out.println("THANK YOU FOR USING DUOTECH BMA! GOODBYE!");
  }
    }

