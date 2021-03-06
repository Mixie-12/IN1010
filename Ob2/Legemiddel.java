class Legemiddel{
  protected static int id; // static id som skal oke hvor hver ny objekt av Legemiddel
  protected String legemNavn; // navn til legemiddel
  protected double legemPris, legemVirkestoff; // pris paa legemiddel  // virkestoff styrke for legemiddel
  protected int ownId; // egen (ikke statisk) id for hver legemiddel objekt

  // konstruktor for Legemiddel
  public Legemiddel(String navn, double pris, double virkestoff){
    ownId = id;
    legemNavn = navn;
    legemPris = pris;
    legemVirkestoff = virkestoff;
    id += 1; // oker static id med 1
  }

  protected int hentId(){return ownId;} // returnerer ID til legemiddel
  protected String hentNavn(){return legemNavn;} // returnerer legemiddel navn
  protected double hentPris(){return legemPris;} // returnere legemiddel pris
  protected double hentVirkestoff(){return legemVirkestoff;} // returnerer legemiddel Virkestoff styrke

  protected void settNyPris(double pris){ // endrer pris
    legemPris = pris;
  }

  public String toString(){ // Skriver ut informasjon om PreparatA objekt
    return "|Navn: "+legemNavn+"|Preparat ID: "+ownId+"|Pris: "+legemPris+"|Virkestoff: "+legemVirkestoff+"|";
  }
}
