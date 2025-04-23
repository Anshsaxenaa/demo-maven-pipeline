public class AdditionSubtraction {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java AdditionSubtraction <addition|subtraction> <num1> <num2>");
            return;
        }

        String operation = args[0];
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);

        switch (operation.toLowerCase()) {
            case "addition":
                System.out.println("Result: " + (num1 + num2));
                break;
            case "subtraction":
                System.out.println("Result: " + (num1 - num2));
                break;
            default:
                System.out.println("Unknown operation. Use 'addition' or 'subtraction'.");
        }
    }
}
