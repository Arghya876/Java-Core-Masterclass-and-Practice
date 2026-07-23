/**
 * 06-methods-and-scope: PassByValueDemo.java
 * ===========================================
 * Core Concepts Demonstrated:
 * 1. Java is ALWAYS Pass-by-Value!
 * 2. Primitives: Copies of actual values are passed. Original values remain unchanged.
 * 3. Object References: Copies of the reference addresses are passed. Modifying object state inside method affects caller object, but reassigning reference does not affect caller reference.
 */
public class PassByValueDemo {

    // Helper class to demonstrate object reference behavior
    static class NumberHolder {
        int value;
        NumberHolder(int val) {
            this.value = val;
        }
    }

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("      Java Pass-by-Value Demystified     ");
        System.out.println("=========================================");

        // --- 1. Primitive Pass-by-Value ---
        int number = 100;
        System.out.println("Before modifyPrimitive(): number = " + number);
        modifyPrimitive(number);
        System.out.println("After modifyPrimitive() : number = " + number + " (Unchanged!)");

        // --- 2. Object Reference Pass-by-Value ---
        System.out.println("\n--- Object Reference State Modification ---");
        NumberHolder obj = new NumberHolder(50);
        System.out.println("Before modifyObjectState(): obj.value = " + obj.value);
        modifyObjectState(obj);
        System.out.println("After modifyObjectState() : obj.value = " + obj.value + " (Mutated via copied reference!)");

        System.out.println("\n--- Object Reference Reassignment ---");
        System.out.println("Before reassignReference(): obj.value = " + obj.value);
        reassignReference(obj);
        System.out.println("After reassignReference() : obj.value = " + obj.value + " (Caller reference still points to original object!)");

        System.out.println("=========================================");
    }

    // Attempting to modify primitive argument
    public static void modifyPrimitive(int val) {
        val = 999; // Only modifies local copy 'val' on stack frame
    }

    // Modifying state inside passed object reference
    public static void modifyObjectState(NumberHolder holder) {
        holder.value = 500; // Modifies state of object pointed by copied memory address
    }

    // Attempting to reassign copied reference address
    public static void reassignReference(NumberHolder holder) {
        holder = new NumberHolder(8888); // Local reference copy points to new memory address
    }
}
