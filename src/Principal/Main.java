/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Principal;


import estancias.servicios.CasasService;
import estancias.servicios.FamiliaService;


/**
 *
 * @author CELINA
 */
public class Main {
    public static void main(String[] args) {
        FamiliaService serv = new FamiliaService();
        System.out.println("Ingrese la lista de casas");
//        try {
////            serv.listarFamilia();
////            serv.imprimirFamilia();
////            serv.listarFamiliaConHijos();
////            serv.imprimirFamiliaconHijos();
////            serv.listarFamiliaConY();
////            serv.imprimirFamiliaconY();
////            serv.FamiliaHotmail();
////            serv.imprimirFamiliaHotmail();
//            
//            
//        } catch (Exception e) {
//            System.out.println("---ERROR---");
//        }
//        
//    }
    CasasService servicio = new CasasService ();
    try{
//        
//        servicio.listarCasas();
//        servicio.imprimirCasas();
          servicio.listarNumCasas();
          servicio.imprimirNumCasas();
//        servicio.listarCasasDisp();
//        servicio.imprimirCasasDisp();
                
    
    }catch(Exception e){
       System.out.println("---ERROR---");
        }
    }
}

