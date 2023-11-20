public class Rectangle {

    public int longueur;
    public int largeur;

    public Rectangle(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Rectangle() {
        this.longueur = 0;
        this.largeur = 0;
    }

    public Rectangle(Rectangle rectangle1) {
        this.longueur = rectangle1.longueur;
        this.largeur = rectangle1.largeur;
    }

    public int Perimetre() {
        return 2 * (this.longueur + this.largeur);
    }

    public int Aire() {
        return this.longueur * this.largeur;
    }

    public boolean isCarre() {
        return this.longueur == this.largeur;
    }

    public void afficherRectangle() {
        System.out.println("La longueur est : " + this.longueur + "\nLa largeur est : " + this.largeur);
        System.out.println("Le périmètre est : " + Perimetre() + "\nL'aire est : " + Aire());
        if (isCarre()) {
            System.out.println("Il s'agit d'un carre");
        } else {
            System.out.println("Il ne s'agit pas d'un carre");
        }
    }

}
