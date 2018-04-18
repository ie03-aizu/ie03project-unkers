import java.util.Scanner;

class Users{
    public int id;
    public double[] eval = new double[100];
    public int num;
    public Users(double[][] A, int i,int num){
      this.id=i;
      this.num=num;
      for(int j=0;j<num;j++){
        if(A[id][j]== -1.0) this.eval[j]=0;
        else this.eval[j]=A[id][j];
      }
    }
    public int getID(){
      return this.id;
    }

    public double[] getEval(){
      return this.eval;
    }

    public double getEval2(int number_book){
      return this.eval[number_book-1];
    }

    public int getNum(){
      return this.num;
    }


}

public  class Ex01{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();  //nは人数
    int m = sc.nextInt();   //mは本の数
    double[][] A = new double[n][m];
    double[][] Eval = new double[n][m];
    Users user[] = new Users[n];
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        A[i][j]=sc.nextDouble();
      }
    }
    for(int i=0;i<n;i++)
      user[i]=new Users(A,i,m);

    for(int i=0;i<n;i++)
      Eval[i]=user[i].getEval();
    System.out.println();
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
      System.out.print(Eval[i][j]+" ");
      }
    System.out.println();
   }
  }
}
