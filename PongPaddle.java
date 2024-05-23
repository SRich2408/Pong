public class PongPaddle {
    private int x, y, width, height;
    public PongPaddle(int top, int left, int w, int h){
        x = left;
        y = top;
        width = w;
        height = h;

    }
    public int getBottomY(){
        return y+height-1;
        
    }
    public int getLeftX(){
        return x;
    }
    public int getRightX(){
        return x + width-1;
    }
    public int getTopY(){
        return y;
    }
    public void moveDown(int d ){
        y = y+d;

    }
    public void moveUp(int d ){
        y = y-d;

    }
}
