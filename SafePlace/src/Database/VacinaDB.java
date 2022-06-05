/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;
import Models.VacinaModel;
/**
 *
 * @author 822158274
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class VacinaDB {
    
    VacinaModel vac = new VacinaModel();
    
    public void inserirInquilinoVacina(VacinaModel vacina) throws Exception {


        String sql = "INSERT INTO Vacina(tipo,qtdDose) VALUES (?,?);";
        try (Connection conn = Conexao.obterConexao();
                PreparedStatement ps
                = conn.prepareStatement(
                        sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);) {
            
            ps.setString(1, vacina.getTipo());
            ps.setInt(2, vacina.getQtdDose());
            
            ps.execute();
        }
    }

    public VacinaModel[] buscarInquilino() throws Exception {
    
        String sql = "SELECT * FROM INQUILINO";
        
        try (Connection conn = Conexao.obterConexao();
                PreparedStatement ps
                = conn.prepareStatement(sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = ps.executeQuery()) {

            int totalVacinas = rs.last() ? rs.getRow() : 0;
            
            VacinaModel[] vacinas = new VacinaModel[totalVacinas];
            rs.beforeFirst();
            
            int contador = 0;
            
            while (rs.next()) {
            
                int id = rs.getInt("idVacina");
                String tipo = rs.getString("tipo");
                int qntDose = rs.getInt("aprtNumero");
                
                vacinas[contador++] = new VacinaModel();
            }
            return vacinas;
        }
    }
   
    public void updateInquilino() throws Exception {

        String sql = "UPDATE Vacina SET     tipo = ?, qtdDose= ? WHERE   idVacina = ?;";
        
        try (Connection conn = Conexao.obterConexao();
                PreparedStatement ps
                = conn.prepareStatement(
                        sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);) {
            
            ps.setString(1,vac.getTipo());
            ps.setInt(2, vac.getQtdDose());
            ps.setInt(3, vac.getIdVacina());
     
            
            ResultSet rs = ps.executeQuery();
        }
    }
    
    public void deleteInquilino() throws Exception {

        String sql = "DELETE FROM   Vacina WHERE  idVacina = ?;";

        try (Connection conn = Conexao.obterConexao();
                PreparedStatement ps
                = conn.prepareStatement(
                        sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);) {
           
            ps.setInt(1, vac.getIdVacina());       
            
            ResultSet rs = ps.executeQuery();
        }
    }
}