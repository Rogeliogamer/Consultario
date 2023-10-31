package Complementos;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.StringJoiner;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Funciones {

    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement s = null;

    public Funciones() {
        try {

            VariablesGlobales.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Consultorio", "root", "supers30264");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    // Método para verificar la conexión de la base de datos.
    public boolean verificarConexion(String sql) {
        int a = 0; // Variable que determinará la existencia de registros.
        try {
            s = VariablesGlobales.conexion.createStatement();
            rs = s.executeQuery(sql);
            if (rs.next()) { // Recorremos las respuestas de la consulta.
                a = 1; // Si existe un recorrido, se obtiene el valor de 1
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        // Si 'a' contiene un valor, se indica que existe un registro.
        // Retornamos true.
        // Si 'a' conserva el valor de 0, se indica que no existen registros.
        // Retornamos false.
        return a == 1;
    }

    // Método para verificar la existencia de un registro en una base de datos (Obtener Datos).
    public boolean verificarExistencia(String sql) {
        int a = 0; // Variable que determinará la existencia de registros.
        try {
            s = VariablesGlobales.conexion.createStatement();
            rs = s.executeQuery(sql);
            if (rs.next()) { // Recorremos las respuestas de la consulta.
                a = 1; // Si existe un recorrido, se obtiene el valor de 1
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        // Si 'a' contiene un valor, se indica que existe un registro.
        // Retornamos true.
        // Si 'a' conserva el valor de 0, se indica que no existen registros.
        // Retornamos false.
        return a == 1;
    }

    // Método para ejecutar una instrucción SQL (Obtener Datos).
    public void realizarSentencia(String sql) {
        try {
            s = VariablesGlobales.conexion.createStatement();
            rs = s.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "(Obtener Datos) No se pudo realizar la acción, verifique sus datos" + ex);
        }
    }

    // Método para ejecutar una sentencia SQL y obtener los resultados como una cadena de texto (Obtener Datos).
    // Este método puede obtener tanto un solo resultado como varios resultados de una sola fila o varios resultados de varias filas.
    // Los resultados de una misma fila se diferenciarán por comas (",") y los de diferentes filas por saltos de línea ("\n").
    public String obtenerResultado(String sentencia) {
        ResultSet rs = null;
        Statement s = null;

        try {
            s = VariablesGlobales.conexion.createStatement();
            rs = s.executeQuery(sentencia);

            StringJoiner joiner = new StringJoiner("\n");

            while (rs.next()) {
                StringJoiner rowJoiner = new StringJoiner(", ");
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    rowJoiner.add(rs.getString(i));
                }
                joiner.add(rowJoiner.toString());
            }
            return joiner.toString();
        } catch (SQLException e) {
            e.printStackTrace();
            return "(obtenerResultado) Error al ejecutar la sentencia: " + e.getMessage();
        } finally {
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

    // Método para ejecutar una instrucción SQL (Modificar Datos).
    public void ejecutarSentencia(String sql, boolean mensaje) {
        try {
            s = VariablesGlobales.conexion.createStatement();
            int rowCount = s.executeUpdate(sql); // Utiliza executeUpdate para sentencias que modifican registros.
            s.close();

            if (rowCount > 0) {
                if (mensaje == true) {
                    JOptionPane.showMessageDialog(null, "La operación se realizó con éxito");
                }
            } else {
                if (mensaje == true) {
                    JOptionPane.showMessageDialog(null, "La acción no afectó a ningún registro.");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "(Modificar Datos) No se pudo realizar la acción. Verifique sus datos.");
        }
    }

    // Método para mostrar cualquier tabla de una base de datos.
    public DefaultTableModel mostrarTablas(String sql) {
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            s = VariablesGlobales.conexion.createStatement();
            rs = s.executeQuery(sql);
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            for (int i = 1; i <= rsMd.getColumnCount(); i++) {
                modelo.addColumn(rsMd.getColumnLabel(i));
            }

            while (rs.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return modelo;
    }

    // Método para poblar un ComboBox utilizando una sentencia SQL (Obtener Datos).
    public JComboBox llenarCombobox(String sql, String dato, JComboBox comboBox) {
        try {
            s = VariablesGlobales.conexion.createStatement();
            rs = s.executeQuery(sql);
            comboBox.addItem("Seleccione una opcion");
            while (rs.next()) {
                comboBox.addItem(rs.getString(dato));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo llenar el combobox de " + dato);
        }
        return comboBox;
    }

    public ArrayList<String[]> obtenerResultados(String sentencia) {
        ArrayList<String[]> resultados = new ArrayList<>();

        try {
            s = VariablesGlobales.conexion.createStatement();
            rs = s.executeQuery(sentencia);

            while (rs.next()) {
                String[] fila = new String[rs.getMetaData().getColumnCount()];
                for (int i = 1; i <= fila.length; i++) {
                    fila[i - 1] = rs.getString(i);
                }
                resultados.add(fila);
            }

            return resultados;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
        }
    }
    
    public JComboBox llenarComboboxEyM(String sql, String dato, JComboBox comboBox) {
        try {
            s = VariablesGlobales.conexion.createStatement();
            rs = s.executeQuery(sql);
            if (dato.equals("estado")) {
                comboBox.addItem("Estado");
            } else {
                comboBox.addItem("Municipio");
            }
            while (rs.next()) {
                comboBox.addItem(rs.getString(dato));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo llenar el combobox de " + dato);
        }
        return comboBox;
    }

}
