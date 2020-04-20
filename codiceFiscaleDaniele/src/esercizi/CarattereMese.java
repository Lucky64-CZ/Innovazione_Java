package esercizi;

public class CarattereMese {
    public static char mese (int a)    {
        String mesi= "ABCDEHLMPRST";
        char mesereturn='a';
        int numero=a;
        for (int i=0; i<mesi.length(); i++) {
            if ((numero-1)==i)  {
                mesereturn=mesi.charAt(i);
            }
        }
return mesereturn;

    }
}
