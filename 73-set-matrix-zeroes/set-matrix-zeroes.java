class Solution {
    public void setZeroes(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

// first Row and Colmun madye 0 aahe ka check karnysathi
        boolean firstRowZero = false;
         boolean firstColZero = false;

// first column madye 0 aahe ka check karto 
      for(int i = 0; i < n; i++){
        if(matrix[i][0] == 0){
            firstColZero = true;
        }
      }

 // first Row madye 0 aahe ka check karto 
       for(int j = 0; j < m; j++){
        if(matrix[0][j] == 0){
            firstRowZero = true;

        }
       }
       
       // matrix chya baki bhgat 0 shodhato first Row and First Column sodun 
       for(int i = 1; i < n; i++){
        for(int j = 1;j < m; j++ ){

            if(matrix[i][j] == 0){
              
              // tya Row la mark karoto
              matrix[i][0] =0;
              // tya Column la mark karto 
              matrix[0][j] = 0;

            }
        }
     }

     for(int i = 1; i < n; i++){
        for(int j = 1; j < m; j++){
            if(matrix[i][0] ==0 || matrix[0][j] == 0){
                matrix[i][j] = 0;
            }

            
        }
     }
     
  

  if(firstRowZero){
    for(int j = 0; j < m; j++){
        matrix[0][j] = 0;
    }
  }

  if(firstColZero){
    for(int i = 0; i < n; i++){
        matrix[i][0] = 0;
    }
  }
}
}


 