class Main{
    public static void main(String[] args) {
        int col,num=0; 
        for (int row = 1; row <= 5; row++) { 
            if (row % 2 != 0) { 
                for (col = num + 1; col < num + row; col++) 
                    System.out.print(col + " "); 
                System.out.println(col++); 
                num = col; 
            } 
            else {  
                num = num + row - 1; 
                for (col = num; col > num - row + 1; col--) 
                    System.out.print(col + " "); 
                System.out.println(col); 
            } 
    }
}
}