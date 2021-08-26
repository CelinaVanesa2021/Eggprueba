package estancias.persistencia;

import estancias.entidades.Casas;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class CasasDAO extends DAO {

    public ArrayList<Casas> listarCasas() throws Exception {
        try {
            //armo la query
            //EJERCICIO C)
            //String sql = "SELECT idfamilia,nombre,edadminima,edadmaxima,numhijos,email"
            //            + " FROM Familias";
            //Consulto la base de datos!
            String sql= "select * from casas\n" 
            + " where pais = 'Reino Unido' and fecha_desde <= '2020-08-01' and fecha_hasta >= '2020-08-31';";
            
            consultarBase(sql);

            //recorrer el resultado!
            Casas casa = null;
            ArrayList<Casas> casas = new ArrayList<>();

            while (resultado.next()) {
                casa = new Casas();

                casa.setId(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigopostal(resultado.getInt(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFecha_desde(resultado.getInt(7));
                casa.setFecha_hasta(resultado.getInt(8));
                casa.setTiempo_minimo(resultado.getInt(9));
                casa.setTiempo_maximo(resultado.getInt(10));
                casa.setPrecio_habitacion(resultado.getInt(11));
                casa.setTipo_vivienda(resultado.getString(12));
                
                casas.add(casa);
            }
            
            return casas;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error listar casas! (DAO)");
            
        }finally{
            desconectarBase();
        }
    }
    
    public ArrayList<Casas> listarNumCasas() throws Exception {
        try {
            //Ejercicio G)
            
            String sql= "select * from casas";
//                        + " group by pais;";
            
            consultarBase(sql);

            //recorrer el resultado!
            Casas casa = null;
            ArrayList<Casas> casas = new ArrayList<>();

            while (resultado.next()) {
                casa = new Casas();
                casa.setId(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigopostal(resultado.getInt(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFecha_desde(resultado.getInt(7));
                casa.setFecha_hasta(resultado.getInt(8));
                casa.setTiempo_minimo(resultado.getInt(9));
                casa.setTiempo_maximo(resultado.getInt(10));
                casa.setPrecio_habitacion(resultado.getInt(11));
                casa.setTipo_vivienda(resultado.getString(12));
               
                
                casas.add(casa);
            }
            
            return casas;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error enumerar casas! (DAO)");
            
        }finally{
            desconectarBase();
        }
    }
    
     public ArrayList<Casas> listarCasasDisponibles() throws Exception {
         
        //EJERCICIO E)
        Scanner sc = new Scanner(System.in).useDelimiter("\n");                
        System.out.println("Ingrese una fecha: (aaaa-mm-dd)");  // inicio ejercicio E
        LocalDate fecha_ingreso = LocalDate.parse(sc.next());
        System.out.println("Ingrese la cantidad de dias que se va a quedar: ");
        LocalDate fecha_salida = fecha_ingreso.plusDays(sc.nextInt());
        String fechaing = String.valueOf(fecha_ingreso);
        String fechasal = String.valueOf(fecha_salida);
        System.out.println("Fecha ingreso: "+fechaing+" Fecha salida: "+fechasal);
         try {
        
        String sql= "select * from casas"
                     + " where fecha_desde <= '" + fechaing + "' and fecha_hasta >= '" + fechasal + "'";
            
            consultarBase(sql);

            //recorrer el resultado!
            Casas casa = null;
            ArrayList<Casas> casas = new ArrayList<>();

            while (resultado.next()) {
                casa = new Casas();

                casa.setId(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigopostal(resultado.getInt(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFecha_desde(resultado.getInt(7));
                casa.setFecha_hasta(resultado.getInt(8));
                casa.setTiempo_minimo(resultado.getInt(9));
                casa.setTiempo_maximo(resultado.getInt(10));
                casa.setPrecio_habitacion(resultado.getInt(11));
                casa.setTipo_vivienda(resultado.getString(12));
                
                casas.add(casa);
            }
            
            return casas;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error enumerar casas! (DAO)");
            
        }finally{
            desconectarBase();
        }
    }
}
