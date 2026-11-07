package datos;
import java.io.*; import java.util.ArrayList; import java.util.List;
public class archivoUtil {
    public static <T> void guardarDatos(String nombreArchivo,List<T> lista){
        try { File f=new File(nombreArchivo); File parent=f.getParentFile(); if(parent!=null)parent.mkdirs();
            try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(f))){oos.writeObject(lista);}
        } catch(IOException e){throw new RuntimeException("No se pudieron guardar los datos: "+e.getMessage(),e);}
    }
    @SuppressWarnings("unchecked") public static <T> List<T> leerDatos(String nombreArchivo){
        File f=new File(nombreArchivo); if(!f.exists())return new ArrayList<>();
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f))){return (List<T>)ois.readObject();}
        catch(IOException|ClassNotFoundException e){throw new RuntimeException("No se pudieron leer los datos: "+e.getMessage(),e);}
    }
}
