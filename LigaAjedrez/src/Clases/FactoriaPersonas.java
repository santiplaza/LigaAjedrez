package Clases;

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
    Persona CrearPersona(tipoPersona t){
        
        if(t == tipoPersona.USUARIO){
            Persona u = new Usuario();
            return u;
        }
        else if(t == tipoPersona.GERENTE){
            Persona g = new Gerente();
            return g;
        }
        else{
            Persona e = new Entrenador();
            return e;
        }
    }
}
