package model;

public class Video {
    
    private final int id;
    private final int size;
    
    public Video(int id, int size){
        this.id = id;
        this.size = size;
    }
    
    public int getId(){
        return this.id;
    }
    
    public int getSize(){
        return this.size;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", size=" + size +
                '}';
    }
}
