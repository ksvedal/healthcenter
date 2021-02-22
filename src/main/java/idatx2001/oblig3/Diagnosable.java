package idatx2001.oblig3;

import java.util.Scanner;

public interface Diagnosable {
    public default String setDiagnose() {
        Scanner sc = new Scanner(System.in);
        String diagnose = "";

        if (sc.hasNext()) {
            diagnose = sc.next();
        } else {
            System.out.println("You must enter a diagnose");
        } return diagnose;
    }
}
