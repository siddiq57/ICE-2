package midtermreviewcodeforpartc;

/**
 *
 * @author ahmad
 */
public class PasswordValidator {

    public boolean passwordValidator(String password) {

        boolean validPassword;
        int specialCharecter = 0;
        //iterate over each character to see if it is a special character
        for (int i = 0; i < password.length(); i++) {
            if (!(Character.isLetterOrDigit(password.charAt(i)))) {
                //now we know there is at least one special character
                specialCharecter++;
            }
        }
        if (specialCharecter > 0 && password.length() > 7) {
            validPassword = true;
        } else {
            validPassword = false;
        }
        return validPassword;
    }

}
