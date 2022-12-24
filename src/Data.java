public class Data {
    private static final String VALID_CHARACTER = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"
    public static boolean validate(String login,
                                   String password,
                                   String confirmPassword) {
        try {
            check(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;


    }

    private static void check(String login,
                              String password,
                              String confirmPassword) throws WrongLoginException, WrongPasswordException {

    }
}
