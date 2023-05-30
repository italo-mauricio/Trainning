/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing.funcionarios;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author italo
 */
public class ModelFuncionarios extends AbstractTableModel{    
    
    ArrayList<Funcionario> funcionarios = new ArrayList();
    
    String[] colunas = {"Nome", "CPF", "Salario", "Função"};

    @Override
    public int getRowCount() {
        return funcionarios.size();
    }

    @Override
    public int getColumnCount() {
      
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
     
    }
    
}
