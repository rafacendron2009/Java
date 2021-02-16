package edu.ifsc.Daos;

import edu.ifsc.DB.DBController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

public class Marca {

    private String nome;
    private int id;

    public Marca() {

    }

    public Marca(String nome) {
        super();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void cadastrarMarca(Marca m) throws SQLException, Exception {

        DBController db = new DBController();
        Map<String, String> dados = new HashMap<>();
        dados.put("nome", nome);
        db.conectar();
        db.insert("marca", dados);
        db.desconectar();
    }
    
      public void atualizar() throws Exception {
        DBController db = new DBController();
        Map<String,String> dados = new HashMap<>();
        Map<String,String> where = new HashMap<>();
        
        where.put("idmarca", String.valueOf(id));
        dados.put("nome", this.nome);
        db.conectar();
        db.update("marca", dados, where);
        db.desconectar();
    }
      
       public void delete() throws Exception {
        DBController db = new DBController();
        Map<String,String> where = new HashMap<>();
        where.put("idmarca", String.valueOf(id));
        db.conectar();
        db.delete("marca", where);
        db.desconectar();
    }

    public List<Marca> buscarTodos() throws SQLException, Exception {
        DBController db = new DBController();
        ResultSet rset;
        List<Marca> marcas = new ArrayList<>();

        db.conectar();
        rset = db.executeQuery("SELECT * FROM marca");

        try {
            while (rset.next()) {
                Marca m = new Marca();
                m.id = rset.getInt("idmarca");
                m.nome = rset.getString("nome");
                marcas.add(m);
            }
        } catch (SQLException ex) {
            throw new Exception("Erro ao percorrer resultados!");
        }
        db.desconectar();
        return marcas;
    }
    
    public Marca buscarMarca() throws SQLException, Exception {
        DBController db = new DBController();
        ResultSet rset;
        Marca marcas = new Marca();
        db.conectar();
        System.out.println(this.nome);
        rset = db.executeQuery("SELECT * FROM marca where nome like '"+ this.getNome() +"'");

        try {
            while (rset.next()) {
                Marca m = new Marca();
                m.id = rset.getInt("idmarca");
                m.nome = rset.getString("nome");
            }
        } catch (SQLException ex) {
            throw new Exception("Erro ao percorrer resultados!");
        }
        db.desconectar();
        return marcas;
    }

}
