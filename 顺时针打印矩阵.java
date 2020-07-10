public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res=new ArrayList<>();
        int row=matrix.length; //行数
        if(row==0)   return res;
        int col=matrix[0].length;//列数
        for(int i=0;col>2*i&&row>2*i;i++){ //圈数，从外向内,循环结束条件需要注意
            //打印一圈
            int endY=col-1-i;
            int endX=row-1-i;
            
            //从左到右,第i行
            for(int j=i;j<=endY;j++)
                res.add(matrix[i][j]);
            //从上到下，第endY列
            for(int j=i+1;j<=endX;j++)
                res.add(matrix[j][endY]);
            //从右向左，第endX行
            if(endX>i)
                for(int j=endY-1;j>=i;j--)
                    res.add(matrix[endX][j]);
            //从下到上，第i列
            if(endY>i)
                for(int j=endX-1;j>i;j--)
                    res.add(matrix[j][i]);
        }
        return res;
    }