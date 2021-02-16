package edu.ifsc.Daos;

import edu.ifsc.DB.DBController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Funcionarios {

    private String nome;
    private String cpf;
    private String data_nascimento;
    private String sexo;
    private int id;
    private int idSetor;

    public Funcionarios() {

    }

    public Funcionarios(String nome, String cpf, String data_nascimento, String sexo, int id) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.sexo = sexo;
        this.id = id;
    }

    public int getIdSetor() {
        return idSetor;
    }

    public void setIdSetor(int idSetor) {
        this.idSetor = idSetor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void cadastrarFuncionario(Funcionarios m) throws SQLException, Exception {

        DBController db = new DBController();
        Map<String, String> dados = new HashMap<>();
        dados.put("nome", nome);
        dados.put("idsetor", "1");
        dados.put("cpf", cpf);
        dados.put("data_nascimento", "1998-12-21");
        dados.put("sexo", sexo);
        
        db.conectar();
        db.insert("funcionario", dados);
        db.desconectar();
    }
    
     public List<Funcionarios> buscarTodos() throws SQLException, Exception {
        DBController db = new DBController();
        ResultSet rset;
        List<Funcionarios> marcas = new ArrayList<>();

        db.conectar();
        rset = db.executeQuery("SELECT * FROM funcionario");
            
        try {
            while (rset.next()) {
                Funcionarios m = new Funcionarios();
                m.id = rset.getInt("idusuario");
                m.nome = rset.getString("nome");
                m.cpf = rset.getString("cpf");
                m.data_nascimento = rset.getString("data_nascimento");
                m.sexo = rset.getString("sexo");
                marcas.add(m);
                System.out.println(marcas);
            }
        } catch (SQLException ex) {
            throw new Exception("Erro ao percorrer resultados!");
        }
        db.desconectar();
        return marcas;
    }
}
