package edu.ifsc.Daos;

import edu.ifsc.DB.DBController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aparelho {

    private String nome;
    private int idmarca;
    private int id;

    public Aparelho() {

    }

    public Aparelho(String nome) {
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

    public int getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(int idmarca) {
        this.idmarca = idmarca;
    }

    public void cadastrarAparelho(Aparelho m) throws SQLException, Exception {

        DBController db = new DBController();
        Map<String, String> dados = new HashMap<>();
        dados.put("nome", nome);
        dados.put("idmarca", String.valueOf(idmarca));
        db.conectar();
        db.insert("aparelho", dados);
        db.desconectar();
    }
    
      public List<Aparelho> buscarTodos() throws SQLException, Exception {
        DBController db = new DBController();
        ResultSet rset;
        List<Aparelho> aparelho = new ArrayList<>();

        db.conectar();
        rset = db.executeQuery("SELECT * FROM aparelho");

        try {
            while (rset.next()) {
                Aparelho m = new Aparelho();
                m.id = rset.getInt("idaparelho");
                m.nome = rset.getString("nome");
                m.idmarca = rset.getInt("idmarca");
                aparelho.add(m);
            }
        } catch (SQLException ex) {
            throw new Exception("Erro ao percorrer resultados!");
        }
        db.desconectar();
        return aparelho;
    }

}
