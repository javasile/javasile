import exceptions.InvalidAgeNumber;

public abstract class Animal {
        private String tipAnimal;
        private String tipHrana;
        private double greutate;
        private float varsta;
        private String culoare;
        private boolean salbatic;

        @Override
        public String toString() {
                return "Animal{" +
                        "tipAnimal='" + tipAnimal + '\'' +
                        ", tipHrana='" + tipHrana + '\'' +
                        ", greutate=" + greutate +
                        ", varsta=" + varsta +
                        ", culoare='" + culoare + '\'' +
                        ", salbatic=" + salbatic +
                        '}';
        }

        public Animal() {
                super();
                System.out.println("Clasa animal a fost apelata");
        }


        public String getTipAnimal() {
                return tipAnimal;
        }

        public void setTipAnimal(String tipAnimal) {
                this.tipAnimal = tipAnimal;
        }

        public String getTipHrana() {
                return tipHrana;
        }

        public void setTipHrana(String tipHrana) throws Exception {

                this.tipHrana = tipHrana;
        }

        public double getGreutate() {
                return greutate;
        }

        public void setGreutate(double greutate) {
                this.greutate = greutate;
        }

        public float getVarsta() {
                return varsta;
        }

        public void setVarsta(float varsta) throws InvalidAgeNumber {
               InvalidAgeNumber e = new InvalidAgeNumber();
                if (varsta > 0) {
                        this.varsta = varsta;
                } else
                        throw e;
        }

        public String getCuloare() {
                return culoare;
        }

        public void setCuloare(String culoare) {
                this.culoare = culoare;
        }

        public boolean getSalbatic() {
                return salbatic;
        }

        public void setSalbatic(boolean salbatic) {
                this.salbatic = salbatic;
        }



public void kg(){
        System.out.println("Din clasa Animal override");
}
public void kg(int kilo){
        System.out.println("Direct din clasa Animal overload! "+greutate + " killo" );
}
public void descriere(String calut){
        System.out.println("Calul este un animal cu urmatoarele caracteristici: "+"\n"+"Un animan de tip: "+tipAnimal+ " pe langa casa omului" +
              "\n"+"Mananca: "+tipHrana+ " In functie de sezon"+"\n"+ "Cu greutatea de: "+greutate + " killo" +
              "\n"+"O varsta de: "+varsta+ " ani"+ "\n"+"De culoare "+culoare+"\n"+"Este un animal salbatic? " + salbatic);
}
}