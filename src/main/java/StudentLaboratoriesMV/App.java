package StudentLaboratoriesMV;

import java.io.IOException;

import StudentLaboratoriesMV.ui.*;

public class App {

    public static void main(String[] args) {
    	LaboratoriesUI view  = new LaboratoriesUI();

        try {
            view.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}