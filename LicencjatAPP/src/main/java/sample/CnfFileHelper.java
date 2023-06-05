package sample;

import java.util.ArrayList;
import java.util.List;

public class CnfFileHelper { //przechowa format do zapisu formuły do pliku
    String name;
    List<String> line;

    List<String> usedVariables; //tablica wyłapująca powtórzenia zmiennych

    List<String> variableCode;

    public CnfFileHelper() {
        this.name="p cnf";
        this.line=new ArrayList<>();
        this.usedVariables=new ArrayList<>();
        this.variableCode=new ArrayList<>();
    }

    public void clear() {
        this.line.clear();
        this.usedVariables.clear();
        this.variableCode.clear();
    }
}

