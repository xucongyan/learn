package Excutors;

import java.util.Random;

public class DiskMemory {

    private int totalSize ;


    public int getSize(){
        return (new Random().nextInt(5) +1 )* 100;
    }


    public  void setSize(int size){
        totalSize += size;
    }

    public int getTotalSize(){
        return  totalSize;
    }
}
