/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author gauta
 */
public class CodigoQR {
    
    private String valor;
    private Usuario usuario;

    public CodigoQR(String valor) {
        this.valor = valor;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Valor: " + valor + ", Usuario=" + usuario;
    }
    
}
