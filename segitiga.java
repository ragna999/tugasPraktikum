public class segitiga extends bangunndatar{
    
    private int alas, tinggi;

    public segitiga(int alas, int tinggi){
        this.alas= alas;
        this.tinggi= tinggi;

    }

    public float luas(){
        return this.alas*tinggi*1/2;
    }
}
