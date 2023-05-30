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
    
    public void cadastrarFuncionario(Funcionario f){
        funcionarios.add(f);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return funcionarios.size();
    }

    @Override
    public int getColumnCount() {
      return colunas.length;
    }
    
    @Override
    public String getColumnName(int column){
        return colunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
       if(columnIndex == 0){
           return funcionarios.get(rowIndex).getNome();
       } else if (columnIndex == 1){
           return funcionarios.get(rowIndex).getCpf();
       } else if (columnIndex == 2){
           return funcionarios.get(rowIndex).getSalario();
       } else if (columnIndex == 3){
           return funcionarios.get(rowIndex).getFuncao();
       } else{
           return null;
       }   
    }
}
