public class Ras extends Animal implements Blanos{
    public Ras() throws Exception{
        super.setTipHrana("Bancuri");
        System.out.println("Animalul Ras mananca: " + getTipHrana());
    }
    public void blana(){
    }
    public boolean getSalbatic(){
        return true;
    }
    public void setTipHrana(String tipHrana)throws Exception{
        throw  new Exception("Nu este adevarat!");
    }

}
