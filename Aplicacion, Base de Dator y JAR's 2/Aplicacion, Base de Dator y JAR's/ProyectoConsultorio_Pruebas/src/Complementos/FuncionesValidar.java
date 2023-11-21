package Complementos;

import java.awt.Toolkit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class FuncionesValidar {

    public boolean validarPasswordRegex(String password) {
        String regexPassword = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";
        Pattern patronPassword = Pattern.compile(regexPassword);
        /* 1. Debe contener al menos una letra minúscula (a-z).
           2. Debe contener al menos una letra mayúscula (A-Z).
           3. Debe contener al menos un dígito (0-9).
           4. Debe contener al menos un carácter especial (por ejemplo, @, #, $, %, ^, &, +, =, !).
           5. Debe tener una longitud mínima de 8 caracteres.
           6. No debe contener espacios en blanco.
         */
        Matcher matcher = patronPassword.matcher(password);
        return matcher.matches();
    }

    public boolean validarFormatoCorreoElectronico(String correoElectronico) {
        // Expresión regular para validar el formato de direcciones de correo electrónico
        String regexCorreoElectronico = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern patronCorreoElectronico = Pattern.compile(regexCorreoElectronico);
        Matcher matcher = patronCorreoElectronico.matcher(correoElectronico);
        return matcher.matches();
    }

    public void validarNControlRegex(JTextField textField) {
        String regexNControl = "^[0-9]{0,9}$";
        Pattern patronNControl = Pattern.compile(regexNControl);
        AbstractDocument document = (AbstractDocument) textField.getDocument();

        document.setDocumentFilter(new DocumentFilter() {
            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                    throws BadLocationException {
                String currentText = fb.getDocument().getText(0, fb.getDocument().getLength());
                currentText += text;
                Matcher matcher = patronNControl.matcher(currentText);

                if (matcher.matches()) {
                    super.replace(fb, offset, length, text, attrs);
                } else {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        });
    }

    public void validarTelefonoRegex(JTextField textField) {
        String regexTelefono = "^[0-9]*$"; // Permite solo números, sin restricción de longitud
        Pattern patronTelefono = Pattern.compile(regexTelefono);
        AbstractDocument document = (AbstractDocument) textField.getDocument();

        document.setDocumentFilter(new DocumentFilter() {
            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                    throws BadLocationException {
                String currentText = fb.getDocument().getText(0, fb.getDocument().getLength());
                currentText += text;
                Matcher matcher = patronTelefono.matcher(currentText);

                if (matcher.matches() && currentText.length() <= 10) {
                    super.replace(fb, offset, length, text, attrs);
                } else {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        });
    }

    public void validarNombreApellidoRegex(JTextField textField) {
        String regexNombreApellido = "^[a-zA-Z\\s]*$"; // Acepta letras y espacios en blanco
        Pattern patronNombreApellido = Pattern.compile(regexNombreApellido);
        AbstractDocument document = (AbstractDocument) textField.getDocument();

        document.setDocumentFilter(new DocumentFilter() {
            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                    throws BadLocationException {
                String currentText = fb.getDocument().getText(0, fb.getDocument().getLength());
                currentText += text;
                Matcher matcher = patronNombreApellido.matcher(currentText);

                if (currentText.length() <= 50 && matcher.matches()) {
                    super.replace(fb, offset, length, text, attrs);
                } else {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        });
    }

    public void validarCorreoElectronico(JTextField textField) {
        AbstractDocument document = (AbstractDocument) textField.getDocument();

        document.setDocumentFilter(new DocumentFilter() {
            private final Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.com$");

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                    throws BadLocationException {
                String currentText = fb.getDocument().getText(0, fb.getDocument().getLength());
                currentText += text;

                if (validarCorreo(currentText)) {
                    super.replace(fb, offset, length, text, attrs);
                } else {
                    Toolkit.getDefaultToolkit().beep();
                }
            }

            private boolean validarCorreo(String correo) {
                Matcher matcher = pattern.matcher(correo);
                return matcher.matches();
            }
        });
    }
    
    public void validarCorreoElectronicoEnTiempoReal(JTextField textField, JButton botonGuardar) {
        // Expresión regular para validar una dirección de correo electrónico básica
        String regexCorreoElectronico = "^[A-Za-z0-9+_.-]+@([A-Za-z0-9.-]+\\.[A-Za-z]{2,})$";

        Pattern patronCorreoElectronico = Pattern.compile(regexCorreoElectronico);

        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                verificarCorreoYActualizarBoton();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                verificarCorreoYActualizarBoton();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                verificarCorreoYActualizarBoton();
            }

            private void verificarCorreoYActualizarBoton() {
                String correo = textField.getText();
                Matcher matcher = patronCorreoElectronico.matcher(correo);

                // Si el correo está vacío o cumple con la estructura, activar el botón
                botonGuardar.setEnabled(correo.isEmpty() || matcher.matches());
            }
        });
    }

}
