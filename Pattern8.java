public class Pattern8 {
    public static void main(String[]args){
        int n = 4;
    for (int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
            if(j==i||j==5-i+1){
            System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
}

