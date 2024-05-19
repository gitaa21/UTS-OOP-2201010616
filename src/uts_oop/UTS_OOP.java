package uts_oop;

/**
 *
 * @author 
 * Nama : I Gusti Ayu Nyoman Puteri Gita Suyoga 
 * NIM : 2201010616
 * Kelas : TI-MTI/L
 * TGL : 2024-05-16
 */

public class UTS_OOP {

    public static void main(String[] args) {
        sewaKostum SKostum = new sewaKostum();
        String ul = "YA";
        do{
            System.out.println("==================");
            System.out.println("A.View Data");
            System.out.println("B.Add Data");
            System.out.println("C.Edit Data");
            System.out.println("D.Delete Data");
            System.out.println("E.Exit");
            System.out.println("==================");
            System.out.print("Choose Option (A/B/C/D/E): ");
            String mPIL = SKostum.dtIN.nextLine();
            switch (mPIL) {
                case "A":
                    SKostum.Viewdata();
                    break;
                case "B":
                    SKostum.Storedata();
                    break;
                case "C":
                    SKostum.Update(0);
                    break;
                case "D":
                    SKostum.Destroy(0);
                    break;
                case "E":
                    ul = "tidak";
                    break;
                default:
                    System.out.println("type A/B/C/D/E");
                    break;
            }
        }while (ul.equals("YA"));
    }
    
}
