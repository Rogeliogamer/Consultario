package Complementos;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.StringJoiner;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Funciones {

    PreparedStatement pst = null; // variable Pst
    ResultSet rs = null; // variable rs
    Statement s = null; // variable s

    public Funciones() { // al llamar a esta clase haremos una conexion con la base de datos
        try { // atrapar el error
            VariablesGlobales.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Consultorio", "root", "supers30264");
        } catch (SQLException e) { // en caso de error
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // METODO PARA VERIFICAR LA CONEXION DE LA BASE DE DATOS.
    public boolean verificarConexion(String sql) { // recibimos sentencia SQL 
        int a = 0; // variable que decidira la existencia de registros
        try {
            s = VariablesGlobales.conexion.createStatement(); // asignamos la conexion a s
            rs = s.executeQuery(sql); // asignamos s a rs
            if (rs.next()) { // recorremos las respuestas de la consulta
                a = 1; // si existe un recorrido a obtiene el valor de 1
            }
        } catch (Exception ex) { // si la ejecucion es erronea mandamos un exception
            JOptionPane.showMessageDialog(null, ex);
        }
        if (a == 1) { // si a contiene un valor se indica que existe un registro
            return true; // retornamos true
        } else { // si a conserva el valor de 0 se indica que no existe registros
            return false;  // retornamos false
        }
    }

    // METODO PARA MOSTRAR LA TABLA DE LA BASE DE DATOS
    public DefaultTableModel mostrarTablas(String sql) { // recibimos sentencia SQL y devolvemos un modelo
        DefaultTableModel modelo = new DefaultTableModel(); // establecemos una tabla
        try {
            s = VariablesGlobales.conexion.createStatement(); // asignamos la conexion a s
            rs = s.executeQuery(sql); // asignamos s a rs
            ResultSetMetaData rsMd = rs.getMetaData(); // pasamos los resultados guardados en rs a rsMd
            int cantidadColumnas = rsMd.getColumnCount(); // contamos las columnas y asignamos como cantidad de columnas
            for (int i = 1; i <= rsMd.getColumnCount(); i++) { // recorremos con un for
                modelo.addColumn(rsMd.getColumnLabel(i)); // agregamos cada resultado al modelo con addColumn
            }

            while (rs.next()) { // recorremos los resultados de rs
                Object[] fila = new Object[cantidadColumnas]; // creamos un objeto fila y asignamos tamaño 
                for (int i = 0; i < cantidadColumnas; i++) { // recorremos las columnas
                    fila[i] = rs.getObject(i + 1); // tomamos los objetos de rs en fila
                }
                modelo.addRow(fila); // añadimos los resultados con addRow
            }
        } catch (Exception ex) { // si el preceso es erroneo damos una Exception
            JOptionPane.showMessageDialog(null, ex);
        }
        return modelo; // retornamos el modelo
    }

    // METODO PARA REALIZAR UN MANDATO EN SQL 
    public void realizarSentencia(String sql) { // recibimos sentencia SQL
        try {
            s = VariablesGlobales.conexion.createStatement(); // asignamos conexion a s 
            rs = s.executeQuery(sql); // asignamos s a rs
        } catch (Exception ex) { // si el proceso es erroneo damos una Exception
            JOptionPane.showMessageDialog(null, "No se pudo realizar la accion, verifique sus datos" + ex);
        }
    }

    public boolean verificarExistencia(String sql) {
        int a = 0; // variable que decidira la existencia de registros
        try {
            s = VariablesGlobales.conexion.createStatement(); // asignamos la conexion a s
            rs = s.executeQuery(sql); // asignamos s a rs
            if (rs.next()) { // recorremos las respuestas de la consulta
                a = 1; // si existe un recorrido a obtiene el valor de 1
            }
        } catch (Exception ex) { // si la ejecucion es erronea mandamos un exception
            JOptionPane.showMessageDialog(null, ex);
        }
        if (a == 1) { // si a contiene un valor se indica que existe un registro
            return true; // retornamos true
        } else { // si a conserva el valor de 0 se indica que no existe registros
            return false;  // retornamos false
        }
    }

    public void ejecutarSentencia(String sql) {
        try {
            s = VariablesGlobales.conexion.createStatement();
            int rowCount = s.executeUpdate(sql); // Utiliza executeUpdate para sentencias que no devuelven resultados
            s.close();

            // Aquí puedes manejar el resultado si es necesario
            if (rowCount > 0) {
                
            } else {
                JOptionPane.showMessageDialog(null, "La acción no afectó a ningún registro.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(); // Registra la excepción o maneja de manera segura según tus necesidades
            JOptionPane.showMessageDialog(null, "No se pudo realizar la acción. Verifique sus datos.");
        }
    }

    public JComboBox llenarCombobox(String sql, String dato, JComboBox comboBox) { // recibimos la sentencia, y el dato que ocupara el nombre en el combobox, ademas del combobox   
        try {
            s = VariablesGlobales.conexion.createStatement(); // asignamos la conexion a s
            rs = s.executeQuery(sql); // asignamos s a rs
            comboBox.addItem("Seleccione una opcion"); // añadimos una opcion default
            while (rs.next()) { // recorremos los resultados
                comboBox.addItem(rs.getString(dato)); // añadimos las opciones al combobox
            }
        } catch (Exception ex) { // si el proceso es erroneo pasamos un Exception
            JOptionPane.showMessageDialog(null, "No se pudo llenar combobox de " + dato);
        }

        return comboBox; // retornamos combobox

    }

    // Método para ejecutar una sentencia SQL y obtener resultados como una cadena de texto
    public String obtenerResultado(String sentencia) {
        ResultSet rs = null;
        Statement s = null;
        
        try {
            s = VariablesGlobales.conexion.createStatement();
            rs = s.executeQuery(sentencia);

            // Utilizamos un StringJoiner para concatenar los resultados en una cadena
            StringJoiner joiner = new StringJoiner("\n");
            
            // Iteramos a través de las filas del ResultSet
            while (rs.next()) {
                // Supongamos que quieres concatenar todos los valores de la fila
                StringJoiner rowJoiner = new StringJoiner(", ");
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    rowJoiner.add(rs.getString(i));
                }
                joiner.add(rowJoiner.toString());
            }

            // Devolvemos los resultados como una cadena de texto
            return joiner.toString();
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de excepciones
            return "Error al ejecutar la sentencia: " + e.getMessage();
        } finally {
            // Cerramos el ResultSet y el Statement en el bloque finally
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (s != null) {
                try {
                    s.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
}
