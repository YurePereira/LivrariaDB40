package testebdoo.model;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;

public final class Conexao {

    public static ObjectContainer db;
    
    public Conexao() {
        this.conectar();
    }

    public void conectar() {
        db = Db4o.openFile("livraria.yap");
    }

    public static void desconectar() {
        db.close();
    }
    
    public static ObjectContainer getConexao() {
        return db;
    }

}
