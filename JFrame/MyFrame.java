package tryit;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class MyFrame extends JFrame implements TableModelListener {
    private MyTableModel myTableModel;
    private JTable myTable;
    MyFrame (String winTitle){
        super(winTitle);
        myTableModel = new MyTableModel();
        myTable = new JTable(myTableModel );

        add(new JScrollPane( myTable));

        myTableModel.addTableModelListener(this);
    }
    public void tableChanged(TableModelEvent e) {

    }
    public static void main(String args[]){
        MyFrame myFrame = new MyFrame( "My Test Window" );
        myFrame.pack();
        myFrame.setVisible( true );
    }
    class MyTableModel extends AbstractTableModel {
     List<Order> myData= new ArrayList<>();
     String[] orderColNames = { "Order ID",   "Symbol", "Quantity", "Price"};
     MyTableModel(){
         myData= OrderData.getOrderData();
     }
     public String getColumnName(int col) {
            return orderColNames[col];
     }
     public int getColumnCount(){
         return 4;
     }
     public int getRowCount(){
         return myData.size();
     }
        public Object getValueAt(int row, int col) {
            switch (col) {
                case 0:

                    return myData.get(row).orderID;
                case 1:

                    return myData.get(row).stockSymbol;
                case 2:

                    return myData.get(row).quantity;
                case 3:

                    return myData.get(row).price;
                default:
                    return "";
            }
        }

    public boolean isCellEditable(int row, int col) {

        if (col ==2){
            return true;
        } else {
            return false;
        }
    }

    public void setValueAt(Object value, int row, int col){

        if (col== 2){
            myData.get(row).quantity=(Integer.valueOf(value.toString()));
        }

        TableModelEvent event = new TableModelEvent(this, row, row, col);
        fireTableChanged(event);
    }
}

}
