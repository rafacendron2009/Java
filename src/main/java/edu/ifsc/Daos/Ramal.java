/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifsc.Daos;

/**
 *
 * @author rafac
 */
public class Ramal {

    private int id;
    private String name;//numero
    private String context;
    private String secret;
    private int port;
    private String type;
    private String allow;
    private String disallow;
    private String callgroup;
    private int idaparelho;
    private int idusuario;

    public Ramal() {

    }

    public Ramal(int id, String name, String context, String secret, int port, String type, String allow,
            String disallow, String callgroup) {
        super();
        this.id = id;
        this.name = name;
        this.context = context;
        this.secret = secret;
        this.port = port;
        this.type = type;
        this.allow = allow;
        this.disallow = disallow;
        this.callgroup = callgroup;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdaparelho() {
        return idaparelho;
    }

    public void setIdaparelho(int idaparelho) {
        this.idaparelho = idaparelho;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAllow() {
        return allow;
    }

    public void setAllow(String allow) {
        this.allow = allow;
    }

    public String getDisallow() {
        return disallow;
    }

    public void setDisallow(String disallow) {
        this.disallow = disallow;
    }

    public String getCallgroup() {
        return callgroup;
    }

    public void setCallgroup(String callgroup) {
        this.callgroup = callgroup;
    }
}
