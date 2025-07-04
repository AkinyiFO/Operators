// Source - https://docs.oracle.com/javase/tutorial/java/nutsandbolts/examples/ComparisonDemo.java
//          https://docs.oracle.com/javase/tutorial/java/nutsandbolts/examples/ConditionalDemo1.java
//          https://docs.oracle.com/javase/tutorial/java/nutsandbolts/examples/InstanceofDemo.java

class Operators1 {

    public static void main(String[] args) {

        int value1 = 1;
        int value2 = 2;

        // EQUALITY AND RELATIONAL OPERATORS
        // ==      equal to
        // !=      not equal to
        // >       greater than
        // >=      greater than or equal to
        // <       less than
        // <=      less than or equal to
        if(value1 == value2)
            System.out.println("value1 == value2");
        if(value1 != value2)
            System.out.println("value1 != value2");
        if(value1 > value2)
            System.out.println("value1 > value2");
        if(value1 < value2)
            System.out.println("value1 < value2");
        if(value1 <= value2)
            System.out.println("value1 <= value2");

        // CONDITIONAL OPERATORS aka LOGICAL OPERATORS
        // logical AND (&&)
        // logical OR (||)
        if((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2");
        if((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1");

        // TERNARY OPERATOR (?:)
        //      Uses 3 operands
        //      Shorthand for an if-then-else statement for compact programming
        int result;
        boolean someCondition = true;
        result = someCondition ? value1 : value2;
        System.out.println(result);

        // TYPE COMPARISON OPERATOR (instanceof)
        Operators1 obj1 = new Operators1();
        Operators1 obj2 = new Child();

        System.out.println("obj1 instanceof Parent: "
                + (obj1 instanceof Operators1));
        System.out.println("obj1 instanceof Child: "
                + (obj1 instanceof Child));
        System.out.println("obj1 instanceof MyInterface: "
                + (obj1 instanceof MyInterface));
        System.out.println("obj2 instanceof Parent: "
                + (obj2 instanceof Operators1));
        System.out.println("obj2 instanceof Child: "
                + (obj2 instanceof Child));
        System.out.println("obj2 instanceof MyInterface: "
                + (obj2 instanceof MyInterface));
    }
}

class Child extends Operators1 implements MyInterface {}
interface MyInterface {}
