class ageException extends Exception {
    ageException(String msg) { super(msg); }
}

public class M5_Q4_AgeCheck {
    static void checkAge(int age) throws ageException {
        if (age < 18) throw new ageException("Age " + age + " is below 18, access denied");
    }

    public static void main(String[] a) {
        try {
            checkAge(15);
        } catch (ageException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            checkAge(20);
            System.out.println("Access granted");
        } catch (ageException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
