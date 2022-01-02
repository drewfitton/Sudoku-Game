import java.util.Random;

public class Solutions {

    private int[][] ans;

    public Solutions() {
        this.ans = new int[9][9];
    }

    public void generateAns() {
        this.createDiagonals();
        this.fillRemaining(0, 3);
    }

    public void createDiagonals() {
        for (int i = 0; i < 9; i = i + 3) {
            fillBox(i, i);
        }
    }

    public void fillBox(int row, int col) {
        int num = randomNum();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                while (!notInBox(row, col, num)) {
                    num = randomNum();
                }
                this.ans[row+i][col+j] = num;
            }
        }
    }

    public int randomNum() {
        Random ran = new Random();
        return ran.nextInt(9) + 1;
    }

    public boolean checkNum(int i, int j, int num) {
        return (notInCol(j, num) &&
                notInRow(i, num) &&
                notInBox(i - (i % 3), j - (j % 3), num));
    }

    boolean notInRow(int i,int num)
    {
        for (int j = 0; j < 9; j++)
            if (ans[i][j] == num)
                return false;
        return true;
    }

    boolean notInCol(int j,int num)
    {
        for (int i = 0; i < 9; i++)
            if (ans[i][j] == num)
                return false;
        return true;
    }

    public boolean fillRemaining(int i, int j) {
        if (j >= 9 && i < 9 - 1) {
            i = i + 1;
            j = 0;
        }
        if (i >= 9 && j >= 9)
            return true;

        if (i < 3) {
            if (j < 3)
                j = 3;
        } else if (i < 9 - 3) {
            if (j==(int) (i / 3) * 3)
                j =  j + 3;
        } else {
            if (j == 9 - 3) {
                i = i + 1;
                j = 0;
                if (i >= 9)
                    return true;
            }
        }

        for (int num = 1; num <= 9; num++) {
            if (checkNum(i, j, num)) {
                ans[i][j] = num;
                if (fillRemaining(i, j + 1))
                    return true;

                ans[i][j] = 0;
            }
        }
        return false;
    }

    public boolean notInBox(int firstRow, int firstCol, int num) {
        for (int i =0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (ans[firstRow + i][firstCol + j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    public int[][] getGrid() {
        return this.ans;
    }
}
