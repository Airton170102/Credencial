/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author airto
 */
public class CredencialArreglo {
    private Credencial[] credenciales;

    public CredencialArreglo(int tamaño) {
        credenciales = new Credencial[tamaño];
    }

    public void agregarCredencial(int indice, Credencial credencial) {
        credenciales[indice] = credencial;
    }

    public Credencial obtenerCredencial(int indice) {
        return credenciales[indice];
    }

    public int obtenerTamaño() {
        return credenciales.length;
    }
}
