/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estancias.servicios;

import estancias.entidades.Casas;
import estancias.persistencia.CasasDAO;
import java.util.ArrayList;

/**
 *
 * @author CELINA
 */
public class CasasService {
    //Hacemos el llamado a FamiliaDAO
    private CasasDAO dao;

    //constructor para inicializarlo
    public CasasService() {
        this.dao = new CasasDAO();
    }

//    
    
//    public ArrayList<Casas> listarCasas(String sql) throws Exception {
//        try {
//
//            ArrayList<Casas> casas = listarCasas(sql);
//
//            return casas;
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            throw new Exception();
//        }
//    }
//    
//    public void imprimirCasas(String sql) throws Exception {
//        try {
//            ArrayList<Casas> casa = listarCasas(sql);
//            if (casa.isEmpty()) {
//                throw new Exception("La lista esta vacia!");
//            } else {
//                System.out.println("Casas: ");
//                for (Casas i : casa){
//                    System.out.println(i.getId() + ", ");
//                    System.out.println(i.getCalle() + ", ");
//                    System.out.println(i.getNumero() + ", ");
//                    System.out.println(i.getCodigopostal() + ", ");
//                    System.out.println(i.getTiempo_minimo() + ", ");
//                    System.out.println(i.getTiempo_maximo() + ", ");
//                    System.out.println(i.getPrecio_habitacion() + ", ");
//                    System.out.println(i.getTipo_vivienda() + ", ");
//                }
//            }
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}
    
    
    
    public ArrayList<Casas> listarCasas() throws Exception {
        try {

            ArrayList<Casas> casas = dao.listarCasas();

            return casas;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception();
        }
    }

    public void imprimirCasas() throws Exception {
        try {
            ArrayList<Casas> casa = listarCasas();
            if (casa.isEmpty()) {
                throw new Exception("La lista esta vacia!");
            } else {
                System.out.println("Casas: ");
                for (Casas i : casa){
                    System.out.println(i.getId() + ", ");
                    System.out.println(i.getCalle() + ", ");
                    System.out.println(i.getNumero() + ", ");
                    System.out.println(i.getCodigopostal() + ", ");
                    System.out.println(i.getCiudad() + ", ");
                    System.out.println(i.getPais() + ", ");
                    System.out.println(i.getFecha_desde() + ", ");
                    System.out.println(i.getFecha_hasta() + ", ");
                    System.out.println(i.getTiempo_minimo() + ", ");
                    System.out.println(i.getTiempo_maximo() + ", ");
                    System.out.println(i.getPrecio_habitacion() + ", ");
                    System.out.println(i.getTipo_vivienda() + ", ");
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public ArrayList<Casas> listarNumCasas() throws Exception {
        try {

            ArrayList<Casas> casas = dao.listarNumCasas();

            return casas;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception();
        }
    }

    public void imprimirNumCasas() throws Exception {
        try {
            ArrayList<Casas> casa = listarNumCasas();
            if (casa.isEmpty()) {
                throw new Exception("La lista esta vacia!");
            } else {
                System.out.println("Casas: ");
                for (Casas i : casa){
                    System.out.println(i.getId() + ", ");
                    System.out.println(i.getCalle() + ", ");
                    System.out.println(i.getNumero() + ", ");
                    System.out.println(i.getCodigopostal() + ", ");
                    System.out.println(i.getCiudad() + ", ");
                    System.out.println(i.getPais() + ", ");
                    System.out.println(i.getFecha_desde() + ", ");
                    System.out.println(i.getFecha_hasta() + ", ");
                    System.out.println(i.getTiempo_minimo() + ", ");
                    System.out.println(i.getTiempo_maximo() + ", ");
                    System.out.println(i.getPrecio_habitacion() + ", ");
                    System.out.println(i.getTipo_vivienda() + ", ");
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public ArrayList<Casas> listarCasasDisp() throws Exception {
        try {

            ArrayList<Casas> casas = dao.listarCasasDisponibles();

            return casas;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception();
        }
    }

    public void imprimirCasasDisp() throws Exception {
        try {
            ArrayList<Casas> casa = listarCasasDisp();
            if (casa.isEmpty()) {
                throw new Exception("La lista esta vacia!");
            } else {
                System.out.println("Casas: ");
                for (Casas i : casa){
                    System.out.println(i.getId() + ", ");
                    System.out.println(i.getCalle() + ", ");
                    System.out.println(i.getNumero() + ", ");
                    System.out.println(i.getCodigopostal() + ", ");
                    System.out.println(i.getCiudad() + ", ");
                    System.out.println(i.getPais() + ", ");
                    System.out.println(i.getFecha_desde() + ", ");
                    System.out.println(i.getFecha_hasta() + ", ");
                    System.out.println(i.getTiempo_minimo() + ", ");
                    System.out.println(i.getTiempo_maximo() + ", ");
                    System.out.println(i.getPrecio_habitacion() + ", ");
                    System.out.println(i.getTipo_vivienda() + ", ");
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
