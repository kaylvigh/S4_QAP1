import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

//      Adding URLs to the list to start:
        linkedList.addUrl("https://en.wikipedia.org/wiki/Netherland_Dwarf_rabbit");
        linkedList.addUrl("https://en.wikipedia.org/wiki/Holland_Lop");

        int choice = 0;
        Scanner input = new Scanner(System.in);

        while (choice < 5) {
//      Main Menu
        System.out.println(" ");
        System.out.println("Welcome to our Linked List!");
        System.out.println("----------");
        System.out.println("Main Menu:");
        System.out.println("1) Display URLs");
        System.out.println("2) Forward");
        System.out.println("3) Backward");
        System.out.println("4) Add");
        System.out.println("5) Exit");

        choice = input.nextInt();
        input.nextLine();

            switch (choice) {
//      - Current -
                case 1:
                    linkedList.displayCurrent();
                    break;
//      - Forward -
                case 2:
                    linkedList.currentNext();
                    break;
//      - Backward -
                case 3:
                    linkedList.currentPrev();
                    break;
//      - Add -
                case 4:
                    System.out.println("Add a URL: ");

                    String urlInput = input.nextLine();
                    if (urlInput.indexOf(' ') == -1) {
                        linkedList.addUrl(urlInput);
                    }
                    else {System.out.println("Unable to add, please enter a valid URL.");}
                    break;

//      - Exit -
                case 5:
                    System.out.println("Thank you for using our Linked List!");
                    break;
//      - Default Case-
                default:
                    System.out.println("This option does not exist.");
                    break;
            }
        }
    }
}