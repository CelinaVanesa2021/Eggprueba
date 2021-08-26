package estancias.persistencia;

import estancias.entidades.Familia;
import java.util.ArrayList;

public class ClientesDAO extends DAO {

    public ArrayList<Familia> listarFamilia() throws Exception {
        try {
            //armo la query
            String sql = "SELECT idfamilia,nombre,edadminima,edadmaxima,numhijos,email"
                        + " FROM Familias";
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
                familia.setId(resultado.getInt(7));
                
                familias.add(familia);
            }
            
            return familias;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error listar usuarios! (DAO)");
            
        }finally{
            desconectarBase();
        }
    }
    
    
}
