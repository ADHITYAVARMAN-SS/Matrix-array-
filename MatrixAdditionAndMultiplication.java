# Matrix-array

public class MatrixAddition{
public static void main(String args[]){
  int a[][]={{2,2,3},{2,4,3},{1,2,3}};  
  int b[][]={{2,2,3},{2,4,3},{5,6,4}};  
  
  int c[][]=new int[3][3];  
  
  for(int i=0;i<3;i++){  
    for(int j=0;j<3;j++){  
        c[i][j]=a[i][j]+b[i][j];  
        System.out.print(c[i][j]+" ");  
    }  
    System.out.println();//new line  
  }  
}
}

// multiplication

public class MatrixMultiplication{
public static void main(String args[]){

  int a[][]={{2,3,4},{5,6,7},{8,9,7}};  
  int b[][]={{2,3,4},{5,6,7},{8,9,7}};  
  
  int c[][]=new int[3][3];  
  
  for(int i=0;i<3;i++){  
     for(int j=0;j<3;j++){  
          c[i][j]=0;    
          for(int k=0;k<3;k++){    
              c[i][j]+=a[i][k]*b[k][j];    
          }
          System.out.print(c[i][j]+" ");  
     }
     System.out.println();  
  }  
}
}
