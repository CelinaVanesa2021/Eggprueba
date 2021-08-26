/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estancias.servicios;

import estancias.entidades.Familia;
import estancias.persistencia.FamiliaDAO;
import java.util.ArrayList;

/**
 *
 * @author CELINA
 */
public class FamiliaService {
    //Hacemos el llamado a FamiliaDAO
    private FamiliaDAO dao;

    //constructor para inicializarlo
    public FamiliaService() {
        this.dao = new FamiliaDAO();
    }

    public ArrayList<Familia> listarFamilia() throws Exception {
        try {

            ArrayList<Familia> familia = dao.listarFamilia();

            return familia;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception();
        }
    }

    public void imprimirFamilia() throws Exception {
        try {
            ArrayList<Familia> familia = listarFamilia();
            if (familia.isEmpty()) {
                throw new Exception("La lista esta vacia!");
            } else {
                System.out.println("Familias: ");
                for (Familia u : familia) {
                    System.out.println(u.getId() + ", ");
                    System.out.println(u.getNombre() + ", ");
                    System.out.println(u.getEdad_minima() + ", ");
                    System.out.println(u.getEdad_maxima() + ", ");
                    System.out.println(u.getNum_hijos()+ ", ");
                    System.out.println(u.getEmail() + ", ");
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public ArrayList<Familia> listarFamiliaConHijos() throws Exception {
        try {

            ArrayList<Familia> familia = dao.listarFamiliaConHijos();

            return familia;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception();
        }
    }
    public void imprimirFamiliaconHijos() throws Exception {
        try {
            ArrayList<Familia> familia = listarFamiliaConHijos();
            if (familia.isEmpty()) {
                throw new Exception("La lista esta vacia!");
            } else {
                System.out.println("Familias: ");
                for (Familia u : familia) {
                    System.out.println(u.getId() + ", ");
                    System.out.println(u.getNombre() + ", ");
                    System.out.println(u.getEdad_minima() + ", ");
                    System.out.println(u.getEdad_maxima() + ", ");
                    System.out.println(u.getNum_hijos()+ ", ");
                    System.out.println(u.getEmail() + ", ");
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public ArrayList<Familia> listarFamiliaConY() throws Exception {
        try {

            ArrayList<Familia> familia = dao.listarFamiliaConY();

            return familia;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception();
        }
    }
    public void imprimirFamiliaconY() throws Exception {
        try {
            ArrayList<Familia> familia = listarFamiliaConY();
            if (familia.isEmpty()) {
                throw new Exception("La lista esta vacia!");
            } else {
                System.out.println("Familias: ");
                for (Familia u : familia) {
                    System.out.println(u.getId() + ", ");
                    System.out.println(u.getNombre() + ", ");
                    System.out.println(u.getEdad_minima() + ", ");
                    System.out.println(u.getEdad_maxima() + ", ");
                    System.out.println(u.getNum_hijos()+ ", ");
                    System.out.println(u.getEmail() + ", ");
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public ArrayList<Familia> FamiliaHotmail() throws Exception {
        try {

            ArrayList<Familia> familia = dao.FamiliaHotmail();

            return familia;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception();
        }
    }
    public void imprimirFamiliaHotmail() throws Exception {
        try {
            ArrayList<Familia> familia = FamiliaHotmail();
            if (familia.isEmpty()) {
                throw new Exception("La lista esta vacia!");
            } else {
                System.out.println("Familias: ");
                for (Familia u : familia) {
                    System.out.println(u.getId() + ", ");
                    System.out.println(u.getNombre() + ", ");
                    System.out.println(u.getEdad_minima() + ", ");
                    System.out.println(u.getEdad_maxima() + ", ");
                    System.out.println(u.getNum_hijos()+ ", ");
                    System.out.println(u.getEmail() + ", ");
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


