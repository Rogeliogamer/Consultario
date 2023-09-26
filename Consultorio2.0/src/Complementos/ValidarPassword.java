package Complementos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarPassword {

    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";
    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    public ValidarPassword() {
        /* 
        Debe contener al menos una letra minúscula (a-z).
        Debe contener al menos una letra mayúscula (A-Z).
        Debe contener al menos un dígito (0-9).
        Debe contener al menos un carácter especial (por ejemplo, @, #, $, %, ^, &, +, =, !).
        Debe tener una longitud mínima de 8 caracteres.
        No debe contener espacios en blanco.
         */
    }

    public boolean validarPassword(String password) {
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
