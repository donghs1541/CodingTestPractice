import java.util.Queue;
import java.util.LinkedList;

class Solution {
    private int[] dx = {1,0,-1,0};
    private int[] dy = {0,1,0,-1};
    private int mapSizeX;
    private int mapSizeY;
    private int[][] visit = new int[100][100];
    private int[][] check = new int[100][100];

    private int findEnemy(int x,int y,int[][] maps){
        Queue<Integer> pointX = new LinkedList<>();
        Queue<Integer> pointY = new LinkedList<>();

        visit[x][y] = 1;
        pointX.offer(x);
        pointY.offer(y);

        while(pointX.isEmpty() == false){
            x = pointX.poll();
            y = pointY.poll();

            for(int i =0;i < 4; i++){
                int next_x = x + dx[i];
                int next_y = y + dy[i];

                if(next_x >= 0 && next_y >= 0 && next_x < mapSizeX && next_y < mapSizeY){
                    if(maps[next_x][next_y] == 1 && visit[next_x][next_y] == 0){
                        check[next_x][next_y] = check[x][y] + 1;
                        visit[next_x][next_y] = 1;
                        pointX.offer(next_x);
                        pointY.offer(next_y);
                    }
                }
            }
        }
        if(check[mapSizeX-1][mapSizeY-1] == 0)
            return -1;
        return check[mapSizeX-1][mapSizeY-1]+1;
    }

    public int solution(int[][] maps) {
        mapSizeX = maps.length;
        mapSizeY = maps[0].length;

        return findEnemy(0,0,maps);
    }
}