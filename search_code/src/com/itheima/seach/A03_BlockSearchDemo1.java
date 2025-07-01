package com.itheima.seach;

public class A03_BlockSearchDemo1 {
    public static void main(String[] args) {
        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};
        Block block1 = new Block(21, 0, 5);
        Block block2 = new Block(45, 6, 11);
        Block block3 = new Block(73, 12, 17);

        Block[] blocks = {block1, block2, block3};
        int target = 50;

        Block block = searchBlock(blocks, target);
        System.out.println(searchIndex(block, target, arr));

    }
    public static Block searchBlock(Block[] blocks, int target){
        Block result = new Block();
        for(Block block : blocks){
            if(target <= block.getMax()){
                result = block;
                break;
            }
        }
        return result;
    }

    public static int searchIndex(Block block, int target, int[] arr){
        int index = -1;
        for(int i = block.getStartIndex(); i <= block.getEndIndex(); i++){
            if(target == arr[i]) index = i;
        }
        return index;
    }
}

class Block{
    private int max;
    private int startIndex;
    private int endIndex;
    private int min;

    public Block(){}

    public Block(int max, int startIndex, int endIndex){
        this.max = max;
        this.startIndex =startIndex;
        this.endIndex = endIndex;
    }

    public Block(int max, int startIndex, int endIndex, int min){
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max){
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
