
public class strToInt {
    public static int convertToInt(String str) throws customException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new customException("Custom exception: Not able to convert given input '" + str + "' to an integer.");
        }
    }
    public static void main(String[] args) {
        String[] inputs = {"23", "45.67", "test", "123f"};

        for (String str : inputs) {
            try {
                int result = convertToInt(str);
                System.out.println("Given Input: " + str + ", Result: " + result);
            } catch (customException ce) {
                System.out.println(ce.getMessage());
            }
        }
    }
}
