import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        EcuatieGrad1 ec1=new EcuatieGrad1(5,6);
        float rezultat=ec1.rezolva();
        System.out.printf(ec1.toString()+"Solutia ecuatiei:"+rezultat);
        Punct p1=new Punct();
        Punct p2=new Punct(2,0);
        System.out.print("\ndistanta:"+p1.distanta(p2)+"\n");
        String caleFisier="text.txt";
        try (Scanner scan=new Scanner(new File(caleFisier))){
            if (scan.hasNextLine()) {
                int nrlaturi = scan.nextInt();
                String caracterLN=scan.nextLine();
                System.out.print(nrlaturi);
                Poligon poligon1=new Poligon ();
                for (int i=0;i<nrlaturi;i++)
                {
                    String coord=scan.nextLine();
                    int x=Integer.parseInt(coord.split(" ")[0]);
                    int y=Integer.parseInt(coord.split(" ")[1]);
                    Punct linie=new Punct(x,y);
                    poligon1.adaugaVarf(linie);
                }
                System.out.print(poligon1.calculeazaPerimetrul());
                poligon1.afisareVarfuri();
            }
        }
        catch (FileNotFoundException e) {
        System.out.print("Fisierul nu exista.");
        }
    }
}

