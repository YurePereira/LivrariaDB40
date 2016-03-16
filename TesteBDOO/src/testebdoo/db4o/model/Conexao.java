package testebdoo.db4o.model;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;

public final class Conexao {

    private static ObjectContainer db;
    
    public static void conectar() {
        db = Db4o.openFile("livraria.yap");
    }

    public static void desconectar() {
        db.close();
    }
    
    public static ObjectContainer getConexao() {
        return db;
    }

}
