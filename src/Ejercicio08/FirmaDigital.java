/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio08;

import java.time.LocalDate;

/**
 *
 * @author gauta
 */
public class FirmaDigital {
    
    private String codigoHash;
    private LocalDate fecha;
    private Usuario usuario;

    public FirmaDigital(String codigoHash, LocalDate fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }
    
}
