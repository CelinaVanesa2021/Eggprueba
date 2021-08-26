package estancias.persistencia;

import estancias.entidades.Familia;
import java.util.ArrayList;

public class FamiliaDAO extends DAO {

    public ArrayList<Familia> listarFamilia() throws Exception {
        try {
            //armo la query
//            String sql = "SELECT idfamilia,nombre,edadminima,edadmaxima,numhijos,email"
//                        + " FROM Familias";
            String sql = "SELECT * FROM estancias_exterior.familias;";
                        
            //Consulto la base de datos!
            consultarBase(sql);

            //recorrer el resultado!
            Familia familia = null;
            ArrayList<Familia> familias = new ArrayList<>();

            while (resultado.next()) {
                familia = new Familia();

                familia.setId(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdad_minima(resultado.getInt(3));
                familia.setEdad_maxima(resultado.getInt(4));
                familia.setNum_hijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
                
                
                familias.add(familia);
            }
            
            return familias;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error listar familia! (DAO)");
            
        }finally{
            desconectarBase();
        }
    }
    
    public ArrayList<Familia> listarFamiliaConHijos() throws Exception {
        try {
            //armo la query
//            String sql = "SELECT idfamilia,nombre,edadminima,edadmaxima,numhijos,email"
//                        + " FROM Familias";
            String sql = "Select * from estancias_exterior.familias"
                    + " where num_hijos>2 AND edad_maxima<10;";
                        
            //Consulto la base de datos!
            consultarBase(sql);

            //recorrer el resultado!
            Familia familia = null;
            ArrayList<Familia> familias = new ArrayList<>();

            while (resultado.next()) {
                familia = new Familia();

                familia.setId(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdad_minima(resultado.getInt(3));
                familia.setEdad_maxima(resultado.getInt(4));
                familia.setNum_hijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
                
                
                familias.add(familia);
            }
            
            return familias;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error listar familia con 3 hijos! (DAO)");
            
        }finally{
            desconectarBase();
        }
    }
    
  public ArrayList<Familia> listarFamiliaConY() throws Exception {
        try {
            //armo la query
//            String sql = "SELECT idfamilia,nombre,edadminima,edadmaxima,numhijos,email"
//                        + " FROM Familias";
            String sql = "Select * from estancias_exterior.familias"
                    + " where nombre like '%y';";
                        
            //Consulto la base de datos!
            consultarBase(sql);

            //recorrer el resultado!
            Familia familia = null;
            ArrayList<Familia> familias = new ArrayList<>();

            while (resultado.next()) {
                familia = new Familia();

                familia.setId(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdad_minima(resultado.getInt(3));
                familia.setEdad_maxima(resultado.getInt(4));
                familia.setNum_hijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
                
                
                familias.add(familia);
            }
            
            return familias;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error listar familia con Y! (DAO)");
            
        }finally{
            desconectarBase();
        }
    }  
    
   public ArrayList<Familia> FamiliaHotmail() throws Exception {
        try {
            //armo la query
//            String sql = "SELECT idfamilia,nombre,edadminima,edadmaxima,numhijos,email"
//                        + " FROM Familias";
            String sql = "Select * from estancias_exterior.familias"
                    + " where email like '%hotmail%';";
                        
            //Consulto la base de datos!
            consultarBase(sql);

            //recorrer el resultado!
            Familia familia = null;
            ArrayList<Familia> familias = new ArrayList<>();

            while (resultado.next()) {
                familia = new Familia();

                familia.setId(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdad_minima(resultado.getInt(3));
                familia.setEdad_maxima(resultado.getInt(4));
                familia.setNum_hijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
                
                
                familias.add(familia);
            }
            
            return familias;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error listar familia con Y! (DAO)");
            
        }finally{
            desconectarBase();
        }
    }  
     
}
