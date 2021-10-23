public class Cal extends Animal{
    public Cal() throws Exception{
        super();
        super.setGreutate(200);
        super.setTipAnimal("Domestic");
        super.setTipHrana("Iarba/Fan");
        super.setSalbatic(false);
        super.setCuloare("Maro/Cafeniu");
        super.setVarsta(7.9f);
    }
    public void setGreutate(double greutate){
    }
    public void kg(){
        System.out.println("Sunt in Cal kg -override!");
    }
    public void kg(String domestic){
        System.out.println("Din clasa Cal + String -override!");
        kg(2000);
    }

}
