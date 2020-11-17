package Factoria;

import Clases.Entrenador;
import Clases.Gerente;
import Clases.Persona;
import Clases.Usuario;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author santi
 */
public class FactoriaPersonas {
    
    public enum tipoPersona {
    USUARIO,
    ENTRENADOR,
    GERENTE;
    }
    tipoPersona usu = tipoPersona.USUARIO;
    tipoPersona ent = tipoPersona.ENTRENADOR;
    tipoPersona gen = tipoPersona.GERENTE;
    
    public Persona CrearPersona(tipoPersona tipo){
        
        if(tipo == usu)
        {  
            Usuario u = new Usuario();
            return u;
        }
        else if(tipo == gen)
        {
            Gerente g = new Gerente();
            return g;
        }
        else{
            Entrenador e = new Entrenador();
            return e;
        }
    }
    
}
