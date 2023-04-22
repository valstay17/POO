package herenciamultiple;

public class Driver {
    public static void main(String[] args) {
        AlumnoDeportistaArtista ada = new AlumnoDeportistaArtista();
        ada.setNombre("Valeria");
        ada.setCarrera("ICO");
        ada.setArte("Pintura");
        ada.setDeporte("Basketball");
        System.out.println(ada);
        ada.ensayar("Oleo");
        ada.entrenar();
        ada.presentarObra();
        ada.presentarCompetencia("CDMX");


    }
}
