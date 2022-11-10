public class Encapsulation {
    private int X;
    private int Y;
    private float ans;

    public void set_XY(int x,int y){
        X=x;
        Y=y;
    }

    public void divide(){
        ans = (X/Y);
    }
    public float getAns(){
        return ans;
    }
}
