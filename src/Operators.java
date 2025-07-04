class Operators {

    public static void main(String[] args) {

        // ASSIGNMENT OPERATORS
        //      Evaluated right to left

        // Simple Assignment Operator (=)
        //      Assigns value on the right to the operand on the left
        int simpleAssignment = 5;
        System.out.println("The simplesAssignment value is: " + simpleAssignment);

        // ARITHMETIC OPERATORS
        // MULTIPLICATIVE OPERATORS
        // Multiplication Operator (*)
        int operand = 6;
        int multiplication = operand * 3;
        System.out.println("From multiplication, 6*3 we have: " + multiplication);

        // Division Operator (/)
        int divide = operand / 2;
        System.out.println("From division, 6/2 we have: " + divide);

        // Remainder Operator (%)
        int remainder = operand % 5;
        System.out.println("From remainder, 6%5 we have: " + remainder);

        // ADDITIVE OPERATOR
        // Additive Operator (+)
        //      Also used for String concatenation
        int additive = operand + 4;
        System.out.println("From additive, 6+4 we have: " + additive);

        // Concatenation
        String firstPart = "This is 1st concatenated ";
        String secondPart = "with 2nd.";
        String allParts = firstPart+secondPart;
        System.out.println(allParts);

        // Subtraction Operator (-)
        int subtraction = operand - 5;
        System.out.println("From subtraction, 6-5 we have: " + subtraction);

        // Compound Assignment
        //      Works with Arithmetic Operators
        //      Examples: += -= *= /= %= &= ^= |= <<= >>= >>>=
        simpleAssignment+=1; // Same as: simpleAssignment = simpleAssignment + 1;
        System.out.println("The updated simpleAssignment value is: " + simpleAssignment);

        // UNARY OPERATORS
        //      Requires only one operand

        // Unary Plus Operator (+expr)
        //      Numbers are positive without this, so it is redundant

        // Unary Minus Operator (-expr)
        //      Negates and expression
        System.out.println(-subtraction);

        // Logical Operator (!)
        //      Inverts value
        boolean positive = true;
        System.out.println("This is currently: " + positive);
        System.out.println("It is now inverted to: " + !positive);

    }
}