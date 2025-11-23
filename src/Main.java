void main() {
    Scanner scanner = new Scanner(System.in);
    boolean calculating = true;
    while (calculating) {
        System.out.println("Please enter first number:");
        double a = scanner.nextDouble();
        System.out.println("Please enter second number");
        double b = scanner.nextDouble();
        System.out.println("Choose type of operation");
        System.out.println("{1-Add; 2-Subtract; 3-Multiply; 4-Divide; 5-Cancel operation and close program;}");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println(Calculable.adding(a, b));
        } else if (choice == 2) {
            System.out.println(Calculable.subtracting(a, b));
        } else if (choice == 3) {
            System.out.println(Calculable.multiplying(a, b));
        } else if (choice == 4) {
            System.out.println(Calculable.diving(a, b));
        } else if (choice == 5) {
            calculating = false;
        } else {
            System.out.println("Invalid operations");
        }
    }
}