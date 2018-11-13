
import java.util.List;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class TabelPegawai extends AbstractTableModel{
    private List <Pegawai> listPegawai;
    private String [] columns = {"Id" , "Nama", "tes", "tes","tes","tes","tes","tes"};
    
    
    

    public TabelPegawai(List<Pegawai> listPegawai) {
        this.listPegawai = listPegawai;
    }

    @Override
    public int getRowCount() {
        return listPegawai.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 : return listPegawai.get (rowIndex).getTxtId();
            case 1 : return listPegawai.get (rowIndex).getTxtNama();
            case 2 : return listPegawai.get (rowIndex).getTxtGender();
            case 3 : return listPegawai.get (rowIndex).getTxtTpt_lahir();
            case 4 : return listPegawai.get (rowIndex).getTxtTgl_lahir();
            case 5 : return listPegawai.get (rowIndex).getTxtAlamat();
            case 6 : return listPegawai.get (rowIndex).getTxtTelepon();
            default: return null;
            
            
        }
    }
    
    public String getColumnName (int column) {
        return columns [column];
    }
}
