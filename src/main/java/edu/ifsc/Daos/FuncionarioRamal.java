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
public class FuncionarioRamal {

    private int idfuncionario_ramal;
    private int idusuario;
    private int idramal;

    public FuncionarioRamal() {

    }

    public FuncionarioRamal(int idfuncionario_ramal, int idusuario, int idramal) {
        super();
        this.idfuncionario_ramal = idfuncionario_ramal;
        this.idusuario = idusuario;
        this.idramal = idramal;
    }

    public int getIdfuncionario_ramal() {
        return idfuncionario_ramal;
    }

    public void setIdfuncionario_ramal(int idfuncionario_ramal) {
        this.idfuncionario_ramal = idfuncionario_ramal;
    }

    public int getIdramal() {
        return idramal;
    }

    public void setIdramal(int idramal) {
        this.idramal = idramal;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
}
