public class ForEach {
    public static void main(String[] args) {
        int [] ranks = {1, 34, 5, 6 ,78};
        //for loop

        for(int i = 0;i < ranks.length;i++){
            System.out.println("Rank: " + ranks[i]);
        }

        for(int j: ranks){
            System.out.println("Rank: " + j);
        }
    }
}
