package da.mvc.Contador;

import java.util.ArrayList;
import java.util.List;

public class Respuesta {
    private String id;
    private Object parametro;

    public Respuesta() {
    }

    public Respuesta(String id, Object parametro) {
        this.id = id;
        this.parametro = parametro;
    }

    public String getID() {
        return id;
    }

    public Object getParametro() {
        return parametro;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void setParametro(Object parametro) {
        this.parametro = parametro;
    }

    public static List<Respuesta> lista(Respuesta... respuestas) {
        List<Respuesta> retorno = new ArrayList();

        for (Respuesta r : respuestas) {
            retorno.add(r);
        }

        return retorno;
    }

}
