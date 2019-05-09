package Excutors;

import java.util.Random;

   class DiskMemory {

    private int totalSize ;


    int getSize(){
        return (new Random().nextInt(5) +1 )* 100;
    }


    void setSize(int size){
        totalSize += size;
    }

    int getTotalSize(){
        return  totalSize;
    }
}
