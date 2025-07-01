package com.itheima.seach;

public class A03_BlockSearchDemo2 {
    public static void main(String[] args) {
        int[] arr = {27, 22, 30, 40, 36,
                13, 19, 16, 20,
                7, 10,
                43, 50, 48};
        Block block1 = new Block(40, 0, 4, 22);
        Block block2 = new Block(20, 5, 8, 13);
        Block block3 = new Block(10, 9, 10, 7);
        Block block4 = new Block(50, 11, 13, 43);

        Block[] blocks = {block1, block2, block3, block4};
        int target = 10;

        Block block = searchBlock(blocks, target);
        System.out.println(searchIndex(block, target, arr));

    }

    public static Block searchBlock(Block[] blocks, int target){
        Block result = new Block();
        for(Block block : blocks){
            if(target >= block.getMin() && target <= block.getMax())
                result = block;
        }
        return result;
    }

    public static int searchIndex(Block block, int target, int[] arr){
        int index = -1;
        for(int i = block.getMin(); i <= block.getMax(); i++){
            if(target == arr[i])
                index = i;
        }
        return index;
    }
}