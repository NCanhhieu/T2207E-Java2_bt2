/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt2java2;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Admin
 */
public class contacttablemodel extends AbstractTableModel{
    ArrayList<phone> data = new ArrayList<phone>();
    public contacttablemodel(){
        super();
    }
       public void setData(  ArrayList<phone> data) {
    	this.data = data;	
    }
  @Override
    public int getRowCount(){
        return data.size();
    }
   @Override
  public int getColumnCount(){
      return 4;
  }
  @Override
  public Object getValueAt(int row, int column){
      	switch (column) {
        		case 0: return row + 1;
            case 1: return data.get(row).getHoten();
            case 2: return data.get(row).getSdt();
            case 3: return data.get(row).getEmai();
        }return data;
  }
  
}
