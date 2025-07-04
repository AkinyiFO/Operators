public class BitwiseAndBitShiftOperators {

    public static void main(String[] args) {

        int operand1 = 11;

        // Operators that perform bitwise and bit shift operations on integral types
        // Bit Shift Operators
        // Signed Left Shift (<<)
        System.out.println("\nBinary before shifting bits of 11: " + Integer.toBinaryString(operand1));
        System.out.println("Binary after shifting bits 2 positions to the left: " + Integer.toBinaryString(operand1 << 2));
        System.out.println("Decimal value after shifting 11 2 positions to the left: " + (operand1 << 2));

        // Signed Right Shift (>>)
        System.out.println("Binary after shifting bits 2 positions to the right: " + Integer.toBinaryString(operand1 >> 2));
        System.out.println("Decimal value after shifting 11 2 positions to the right: " + (operand1 >> 2));

        // Unsigned Right Shift Operator (>>>)
        System.out.println("Binary after shifting bits 2 positions to the right with >>> " +
                "is similar to >> for positive numbers as shown above: " + Integer.toBinaryString(operand1 >>> 2));
        System.out.println("Decimal value after shifting 11 2 positions to the right with >>> " +
                "is similar to >> for positive numbers as shown above: " + (operand1 >>> 2));

        // Addendum: Shifting a negative number, >> vs >>>.
        System.out.println("\nFor negative values like: Binary before shifting bits of -10 : " + Integer.toBinaryString(-10));
        System.out.println("After shifting 2 positions to the right with >>: " + Integer.toBinaryString(-10 >> 2));
        System.out.println("Is different from after shifting 2 positions to the right with >>>: " + Integer.toBinaryString(-10 >>> 2));
        System.out.println("In the sense that, the decimal value after shifting -10 2 positions to the right with >> is: " + (-10 >> 2));
        System.out.println("while that of >>> is: " + (-10 >>> 2));

        // Addendum: Shifting by a number >32.
        System.out.println("\nWe have 32 bits for int and 64 bits for long. " +
                "\nShifting by a number greater >= bit width results in shifting by (theNumber % 32) or (theNumber % 64). "
                + "\nFor example, shifting left by 33 (33 % 32 = 1): " + Integer.toBinaryString(operand1 << 33)
                + " is the same as shifting left by 1: " + Integer.toBinaryString(operand1 << 1));
        System.out.println(("And the decimal value " + (operand1 << 33)
                + " of (operand1 << 33), is similar to that of (operand1 << 1): " + (operand1 << 1)));

        System.out.println("Same applies to right shift, where (operand1 >> 33): " + (operand1 >> 33)
                + " is similar to (operand1 >> 1): " + (operand1 >> 1)
                + "\nAnd (operand1 >>> 33): " + (-operand1 >>> 33) + " is similar to (operand1 >>> 1): " + (-operand1 >>> 1));

        // Addendum: Shifting by a large number.
        System.out.println("\nShifting by some large numbers result into bits overflowing and shifting out, " +
                "which causes some inconsistent behaviour."
                + "\nFor example, shifting 11: " + Integer.toBinaryString(11) + " by 31, results in: "
                + Integer.toBinaryString(11 << 31));

        // Shifting by a negative number.
        System.out.println("\nShifting by a negative value is the same as shifting by (-theNumber + 32)."
                + "\nSo: Shifting by -2, " + (operand1 << -2)
                + " is the same as shifting by 30 (-2 + 32 = 30): " + (operand1 << 30));
        System.out.println("Also, shifting by -33: " + (operand1 << -33)
                + " is the same as shifting by 31. That is, (-33 + 32 = -1), "
                + "but -1 is still a negative number, so (-1 + 32 = 31): " + (operand1 << 31));

        // Bitwise Operators
        // They work on integral types (byte, short, int, long)
        // Bitwise AND (&)
        System.out.println("\nFor &, if the bit is a 1 & 1, the result is 1. Otherwise, it is 0.");
        System.out.println("Binary of 12 is: " + Integer.toBinaryString(12));
        System.out.println("Binary of 7 is: " + Integer.toBinaryString(7));
        System.out.println("Therefore, 12 & 7 is: " + (Integer.toBinaryString(12 & 7)));
        System.out.println("Decimal value of 12 & 7 is: " + (12 & 7));

        System.out.println("\nBinary of -12 is: " + Integer.toBinaryString(-12));
        System.out.println("Binary of 7 is: " + Integer.toBinaryString(7));
        System.out.println("Therefore, -12 & 7 is: " + (Integer.toBinaryString(-12 & 7)));
        System.out.println("Decimal value of -12 & 7 is: " + (-12 & 7));

        System.out.println("\nBinary of 12 is: " + Integer.toBinaryString(12));
        System.out.println("Binary of -7 is: " + Integer.toBinaryString(-7));
        System.out.println("Therefore, 12 & -7 is: " + (Integer.toBinaryString(12 & -7)));
        System.out.println("Decimal value of 12 & -7 is: " + (12 & -7));

        System.out.println("\nBinary of -12 is: " + Integer.toBinaryString(-12));
        System.out.println("Binary of -7 is: " + Integer.toBinaryString(-7));
        System.out.println("Therefore, -12 & -7 is: " + (Integer.toBinaryString(-12 & -7)));
        System.out.println("Decimal value of -12 & -7 is: " + (-12 & -7));

        // Bitwise exclusive OR/XOR (^)
        System.out.println("\nFor ^, if the bit is a 1 ^ 0, the result is 1. Otherwise, it is 0.");
        System.out.println("Binary of 12 is: " + Integer.toBinaryString(12));
        System.out.println("Binary of 7 is: " + Integer.toBinaryString(7));
        System.out.println("Therefore, 12 ^ 7 is: " + (Integer.toBinaryString(12 ^ 7)));
        System.out.println("Decimal value of 12 ^ 7 is: " + (12 ^ 7));

        System.out.println("\nBinary of -12 is: " + Integer.toBinaryString(-12));
        System.out.println("Binary of 7 is: " + Integer.toBinaryString(7));
        System.out.println("Therefore, -12 ^ 7 is: " + (Integer.toBinaryString(-12 ^ 7)));
        System.out.println("Decimal value of -12 ^ 7 is: " + (-12 ^ 7));

        System.out.println("\nBinary of 12 is: " + Integer.toBinaryString(12));
        System.out.println("Binary of -7 is: " + Integer.toBinaryString(-7));
        System.out.println("Therefore, 12 ^ -7 is: " + (Integer.toBinaryString(12 ^ -7)));
        System.out.println("Decimal value of 12 ^ -7 is: " + (12 ^ -7));

        System.out.println("\nBinary of -12 is: " + Integer.toBinaryString(-12));
        System.out.println("Binary of -7 is: " + Integer.toBinaryString(-7));
        System.out.println("Therefore, -12 ^ -7 is: " + (Integer.toBinaryString(-12 ^ -7)));
        System.out.println("Decimal value of -12 ^ -7 is: " + (-12 ^ -7));

        // Bitwise inclusive OR (|)
        System.out.println("\nFor ^, if the bit is a 1 | 0 or 1 | 1, the result is 1. Otherwise, it is 0.");
        System.out.println("Binary of 12 is: " + Integer.toBinaryString(12));
        System.out.println("Binary of 7 is: " + Integer.toBinaryString(7));
        System.out.println("Therefore, 12 | 7 is: " + (Integer.toBinaryString(12 | 7)));
        System.out.println("Decimal value of 12 | 7 is: " + (12 | 7));

        System.out.println("\nBinary of -12 is: " + Integer.toBinaryString(-12));
        System.out.println("Binary of 7 is: " + Integer.toBinaryString(7));
        System.out.println("Therefore, -12 | 7 is: " + (Integer.toBinaryString(-12 | 7)));
        System.out.println("Decimal value of -12 | 7 is: " + (-12 | 7));

        System.out.println("\nBinary of 12 is: " + Integer.toBinaryString(12));
        System.out.println("Binary of -7 is: " + Integer.toBinaryString(-7));
        System.out.println("Therefore, 12 | -7 is: " + (Integer.toBinaryString(12 | -7)));
        System.out.println("Decimal value of 12 | -7 is: " + (12 | -7));

        System.out.println("\nBinary of -12 is: " + Integer.toBinaryString(-12));
        System.out.println("Binary of -7 is: " + Integer.toBinaryString(-7));
        System.out.println("Therefore, -12 | -7 is: " + (Integer.toBinaryString(-12 | -7)));
        System.out.println("Decimal value of -12 | -7 is: " + (-12 | -7));
    }
}
