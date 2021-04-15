import java.util.*;
public class exam_04_15 {
    public static void main(String[] args) {
        int[][] board={{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves={1,5,3,5,1,2,1,4};
        int answer=solution(board,moves);
        System.out.printf("correct : "+  String.valueOf(answer));
    }
    public static int solution(int[][] board, int[] moves) {

        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<moves.length; i++)System.out.print(moves[i] +"\t");
        System.out.println();

        for(int j=0; j<board.length; j++){
            for(int k=0; k<board.length;k++){
                System.out.print(board[j][k]+"\t");
            }
            System.out.println();
        }

        int count=0;

        for(int i=0; i<moves.length; i++){
            boolean isok=false;
            boolean iscon=false;
            for(int j=0; j<board.length; j++){
                if(j+1==moves[i]){
                    for(int k=0; k<board.length;k++){

                        if(board[k][j]!=0){
                            list.add(board[k][j]);
                            System.out.println(board[k][j]);
                            board[k][j]=0;
                            isok=true;

                            if(list.size()>1){

                                if(list.get(count)==list.get(count-1)){
                                    System.out.println("fddf");
                                    list.remove(count);
                                    list.remove(count-1);
                                    answer+=2;
                                    count--;
                                    iscon=true;}

                            }
                            if(!iscon)  count++;
                            break;
                        }


                    }
                    if(isok)break;
                }
            }



        }
        return answer;
    }

}


