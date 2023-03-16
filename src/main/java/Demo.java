
import com.khalil.tp55.dao.ProduitDaoImpl;
import entities.Produits;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        ProduitDaoImpl produitDao = new ProduitDaoImpl();

        List<Produits> produitsList = produitDao.produitsParMC("Iphone");
        produitsList.forEach(System.out::println);
    }
}
