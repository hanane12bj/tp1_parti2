package presen;
import dao.DaoImpl;
import metier.MetierImpl;


public class presentation {

    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(d);
        System.out.println("Res="+metier.calcul());
    }
}
