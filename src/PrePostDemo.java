// Source - https://docs.oracle.com/javase/tutorial/java/nutsandbolts/examples/PrePostDemo.java

class PrePostDemo {

    public static void main(String[] args) {
        int i = 3;

        // POSTFIX OPERATORS
        // Increment Operator
        //      Increments by 1
        // Postfix Operator (expr++ , expr--)
        //      Applied after operand (postfix)
        i++;
        // prints 4
        System.out.println(i);

        // Prefix Operator (++expr)
        //      Applied before operand (prefix)
        ++i;
        // prints 5
        System.out.println(i);

        // Prefix Operator (++expr)
        // prints 6
        System.out.println(++i); // ++expr evaluates to the incremented value

        // Postfix Operator (expr++ , expr--)
        // prints 6
        System.out.println(i++); // expr++ evaluates to the original value

        // prints 7
        System.out.println(i);

        // Notes -  it doesn't really matter which version you choose.
        // But if you use this operator in part of a larger expression,
        //  the one that you choose may make a significant difference.

        // Decrement Operator (--)
        //      Decrements by 1
        // Practice with decrement Postfix (expr--) and Prefix (--expr) Operators
    }
}
