package Exception;
class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String msg) {
        super(msg);
    }
}

class Login {
    private String validUser = "admin";
    private String validPass = "1234";

    public void validate(String user, String pass) throws InvalidCredentialsException {
        if (!user.equals(validUser) || !pass.equals(validPass)) {
            throw new InvalidCredentialsException("Wrong username or password!");
        }
        System.out.println("Login Successful!");
    }
}

public class LoginMain {
    public static void main(String[] args) {
        Login obj = new Login();

        try {
            obj.validate("admin", "1111");
        } catch (InvalidCredentialsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
