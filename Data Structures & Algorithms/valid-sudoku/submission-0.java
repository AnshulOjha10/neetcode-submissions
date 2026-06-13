class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;

        for (int i = 0; i < n; i++) {
            HashSet<Character> rowSet = new HashSet<>();
            HashSet<Character> colSet = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if (board[i][j] != '.') {
                    if (rowSet.contains(board[i][j])) {
                        return false;
                    } else {
                        rowSet.add(board[i][j]);
                    }
                }

                // now for column
                if (board[j][i] != '.') {
                    if (colSet.contains(board[j][i])) {
                        return false;
                    } else {
                        colSet.add(board[j][i]);
                    }
                }

                
            }
        }

// for 3x3 boxes
        for (int row = 0; row < n; row += 3) {
            for (int col = 0; col < n; col += 3) {
                HashSet<Character> boxSet = new HashSet<>();

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char c = board[row + i][col + j];

                        if (c == '.') {
                            continue;
                        }

                        if (boxSet.contains(c)) {
                            return false;
                        } else {
                            boxSet.add(c);
                        }
                    }
                }
            }
        }

        return true;
    }
}
